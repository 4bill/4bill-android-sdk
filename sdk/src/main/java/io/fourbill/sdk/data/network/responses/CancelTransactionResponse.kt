package io.fourbill.sdk.data.network.responses

import com.google.gson.annotations.SerializedName
import io.fourbill.sdk.data.model.Status

data class CancelTransactionResponse(

        @SerializedName("error")
        val status: Status,

        @SerializedName("response")
        val response: CancelResponse
){
        data class CancelResponse(

                @SerializedName("id")
                val id: Int,

                @SerializedName("is_test")
                val isTest: Boolean,

                @SerializedName("status")
                val status: Int
        )
}