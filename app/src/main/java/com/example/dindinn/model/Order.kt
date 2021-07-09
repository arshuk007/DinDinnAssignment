package com.example.dindinn.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class Order{

    @JsonProperty("id")
    var id: Int? = 0

    @JsonProperty("order_no")
    var orderNo: String? = null

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("quantity")
    var quantity: Int = 0

    @JsonProperty("created_at")
    var createdAt: String? = null

    @JsonProperty("alerted_at")
    var alertedAt: String? = null

    @JsonProperty("expired_at")
    var expiredAt: String? = null

    @JsonProperty("items")
    var items: ArrayList<Item>? = null

    var expired: Boolean = false
}
