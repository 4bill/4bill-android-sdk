package io.fourbill.sdk.data.model

import com.google.gson.annotations.SerializedName

data class Status(

        @SerializedName("code")
        val code: Int,

        @SerializedName("title")
        val title: String
)
