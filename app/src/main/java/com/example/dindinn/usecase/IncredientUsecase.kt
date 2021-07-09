package com.example.dindinn.usecase

import com.example.dindinn.model.response.IncredientsResponseModel
import com.example.dindinn.model.response.OrderResponseModel
import com.example.dindinn.network.Resource
import com.example.dindinn.network.Response
import com.example.dindinn.network.ResponseHandler
import com.example.dindinn.repository.IncredientRepository
import com.example.dindinn.utils.AppConstants

class IncredientUsecase (private val responseHandler: ResponseHandler,
                         private val repository: IncredientRepository){

    suspend fun getIncredients(): Resource<IncredientsResponseModel?> {
        return try {
            val response = repository.getIncredients()
            when(response){
                is Response.Success ->{
                    return responseHandler.handleSuccess(response.data)
                }

                is Response.Failure ->{
                    return responseHandler.handleFail(response.msg, response.data)
                }
            }
        }catch (e: Exception){
            responseHandler.handleFail(AppConstants.defaultErrorMessage, null)
        }
    }
}