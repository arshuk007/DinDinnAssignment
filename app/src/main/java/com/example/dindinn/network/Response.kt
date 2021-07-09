package com.example.dindinn.network

sealed class Response <out R> {

    data class Success<out T>(val data: T): Response<T>()
    data class Failure<out T>(val msg: String?, val data: T? = null): Response<T>()
}