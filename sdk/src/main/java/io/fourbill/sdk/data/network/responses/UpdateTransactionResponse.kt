package io.fourbill.sdk.data.network.responses

import com.google.gson.annotations.SerializedName
import io.fourbill.sdk.data.model.Status

data class UpdateTransactionResponse(
        @SerializedName("error")
        val status: Status,

        @SerializedName("response")
        val response: UpdateResponse
){
        data class UpdateResponse(
                @SerializedName("id")
                val id: Int,

                @SerializedName("is_test")
                val isTest: Boolean,

                @SerializedName("status")
                val status: Int,

                @SerializedName("status_description")
                val statusDescription: String,

                @SerializedName("failure_reason_code")
                val failureReasonCode: Int?,

                @SerializedName("failure_reason_message")
                val failureReasonMessage: String?,

                @SerializedName("result")
                val result: Boolean?
        )
}