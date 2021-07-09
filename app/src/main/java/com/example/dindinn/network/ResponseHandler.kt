package com.example.dindinn.network

open class ResponseHandler {

    fun <T: Any> handleSuccess(data: T?): Resource<T>{
        return Resource.success(data)
    }

    fun <T: Any> handleFail(msg: String?, data: T?): Resource<T>{
        return Resource.fail(msg, data)
    }
}