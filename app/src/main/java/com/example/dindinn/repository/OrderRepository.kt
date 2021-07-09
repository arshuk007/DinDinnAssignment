package com.example.dindinn.repository

import android.content.Context
import com.example.dindinn.model.response.OrderResponseModel
import com.example.dindinn.network.ApiService
import com.example.dindinn.network.Response
import com.example.dindinn.utils.AppConstants
import com.example.dindinn.utils.JsonSerializer
import com.example.dindinn.utils.AppUtils


class OrderRepository(private val apiService: ApiService, private val context: Context) {

    suspend fun getOrderData(): Response<OrderResponseModel?> {
        return try {
            //val result = apiService.getData()
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

    private fun getMockResponse(): OrderResponseModel?{
        val jsonData = context.assets.open("order.json").bufferedReader().use {
            it.readText()
        }

        val data = JsonSerializer.toJsonObject(jsonData, OrderResponseModel::class.java)

        val response: OrderResponseModel? = data as OrderResponseModel?

        return response
    }

}