package com.example.dindinn.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class IncredientCategory{

    @JsonProperty("id")
    var id: Int? = 0

    var category: String? = null

    @JsonProperty("items")
    var items: ArrayList<IncredientItem>? = null

}
