package com.example.dindinn.di

import android.content.Context
import com.example.dindinn.BuildConfig
import com.example.dindinn.network.ApiService
import com.example.dindinn.network.ResponseHandler
import com.example.dindinn.repository.*
import com.example.dindinn.usecase.*
import com.example.dindinn.utils.AppConstants
import com.example.dindinn.viewmodel.*
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit

val dinDinnModule = module {

    //view model dependency
    viewModel { OrderViewModel(get()) }
    viewModel { IncredientViewModel(get()) }

    //usecase dependency
    factory { OrderUsecase(get(), get()) }
    factory { IncredientUsecase(get(), get()) }

    //repository dependency
    single { OrderRepository(get(), get()) }
    single { IncredientRepository(get(), get()) }

    //network dependency
    single { provideRetrofit(get()) }
    factory { provideOkHttpClient(get(), androidApplication()) }
    factory { provideLoggingInterceptor() }
    factory { provideApiService(get()) }
    factory { ResponseHandler() }

}


fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit{
    return Retrofit.Builder().baseUrl(AppConstants.BASE_URL).client(okHttpClient)
            .addConverterFactory(JacksonConverterFactory.create()).build()
}

fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor, context: Context): OkHttpClient{

    val headerInterceptor = Interceptor { chain ->
        val requestBuilder = chain.request().newBuilder()
            .addHeader("Content-Type", "Application/json")

        chain.proceed(requestBuilder.build())
    }

    return OkHttpClient.Builder()
            .addInterceptor(headerInterceptor)
            .addInterceptor(loggingInterceptor)
            .readTimeout(2, TimeUnit.MINUTES)
            .writeTimeout(2, TimeUnit.MINUTES)
            .build()
}

fun provideLoggingInterceptor(): HttpLoggingInterceptor{
    val loggingInterceptor = HttpLoggingInterceptor()
    if (BuildConfig.DEBUG) {
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    } else {
        loggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
    }
    return loggingInterceptor
}

fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)