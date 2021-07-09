package com.example.dindinn.model

import android.os.Parcel
import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class IncredientItem(): Parcelable{

    @JsonProperty("id")
    var id: Int? = 0

    var image: String? = null
    var title: String? = null

    @JsonProperty("quantity")
    var quantity: Int = 0

    @JsonProperty("is_active")
    var isActive: Boolean = false

    constructor(parcel: Parcel) : this() {
        id = parcel.readValue(Int::class.java.classLoader) as? Int
        image = parcel.readString()
        title = parcel.readString()
        quantity = parcel.readInt()
        isActive = parcel.readByte() != 0.toByte()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(image)
        parcel.writeString(title)
        parcel.writeInt(quantity)
        parcel.writeByte(if (isActive) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<IncredientItem> {
        override fun createFromParcel(parcel: Parcel): IncredientItem {
            return IncredientItem(parcel)
        }

        override fun newArray(size: Int): Array<IncredientItem?> {
            return arrayOfNulls(size)
        }
    }

}
