package com.example.dindinn.model.response

import com.example.dindinn.model.Order
import com.example.dindinn.model.Status
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class OrderResponseModel: BaseResponseModel(){

    var data: ArrayList<Order>? = null
}