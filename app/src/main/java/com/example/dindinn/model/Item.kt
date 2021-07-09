package com.example.dindinn.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class Item{

    @JsonProperty("id")
    var id: Int? = 0

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("quantity")
    var quantity: Int = 0

    @JsonProperty("addon")
    var addons: ArrayList<Addon>? = null
}
