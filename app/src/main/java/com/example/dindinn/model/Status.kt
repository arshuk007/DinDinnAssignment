package com.example.dindinn.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class Status{

    var success: Boolean = false

    var statusCode: Int = 0

    var message: String? = null

}
