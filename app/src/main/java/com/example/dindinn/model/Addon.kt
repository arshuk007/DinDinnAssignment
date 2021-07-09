package com.example.dindinn.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class Addon{

    @JsonProperty("id")
    var id: Int? = 0

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("quantity")
    var quantity: Int = 0
}
