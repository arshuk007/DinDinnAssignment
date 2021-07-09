package com.example.dindinn.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.dindinn.model.response.OrderResponseModel
import com.example.dindinn.network.Resource
import com.example.dindinn.usecase.OrderUsecase

class OrderViewModel(private val usecase: OrderUsecase) : ViewModel() {

    fun getOrderData(): LiveData<Resource<OrderResponseModel?>> = liveData {
        emit(usecase.getOrderData())
    }
}