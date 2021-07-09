package com.example.dindinn.repository

import android.content.Context
import com.example.dindinn.model.response.IncredientsResponseModel
import com.example.dindinn.network.ApiService
import com.example.dindinn.network.Response
import com.example.dindinn.utils.AppConstants
import com.example.dindinn.utils.JsonSerializer
import com.example.dindinn.utils.AppUtils


class IncredientRepository(private val apiService: ApiService, private val context: Context) {

    suspend fun getIncredients(): Response<IncredientsResponseModel?> {
        return try {
            //val result = apiService.getIncredients()
            val result = getMockResponse()
            with(result) {
                when (this?.status?.success) {
                    true -> Response.Success(this)
                    false -> Response.Failure(this.status?.message, this)
                    else -> Response.Failure(AppConstants.defaultErrorMessage, this)
                }
            }
        } catch (e: Exception) {
            AppUtils.getException(e)
        }
    }

    private fun getMockResponse(): IncredientsResponseModel?{
        val jsonData = context.assets.open("incredients.json").bufferedReader().use {
            it.readText()
        }

        val data = JsonSerializer.toJsonObject(jsonData, IncredientsResponseModel::class.java)

        val response: IncredientsResponseModel? = data as IncredientsResponseModel?

        return response
    }

}