package com.example.dindinn.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.dindinn.model.response.IncredientsResponseModel
import com.example.dindinn.model.response.OrderResponseModel
import com.example.dindinn.network.Resource
import com.example.dindinn.usecase.IncredientUsecase

class IncredientViewModel(private val usecase: IncredientUsecase) : ViewModel() {

    fun getIncredients(): LiveData<Resource<IncredientsResponseModel?>> = liveData {
        emit(usecase.getIncredients())
    }
}