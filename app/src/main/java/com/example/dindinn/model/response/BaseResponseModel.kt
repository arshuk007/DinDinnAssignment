package com.example.dindinn.model.response

import com.example.dindinn.model.Status
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
open class BaseResponseModel {

    var status: Status? = null
}