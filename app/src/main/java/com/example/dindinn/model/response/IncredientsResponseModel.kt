package com.example.dindinn.model.response

import com.example.dindinn.model.IncredientCategory
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class IncredientsResponseModel: BaseResponseModel(){

    var data: ArrayList<IncredientCategory>? = null
}