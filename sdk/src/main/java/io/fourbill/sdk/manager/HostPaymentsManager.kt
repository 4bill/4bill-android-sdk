package io.fourbill.sdk.manager

import io.fourbill.sdk.data.model.PayTransaction
import io.fourbill.sdk.data.model.UpdateTransaction
import io.fourbill.sdk.data.network.api.ApiFourBill
import io.fourbill.sdk.data.network.api.RetrofitBuilder

internal class HostPaymentsManager {

    private var apiHelper: ApiFourBill = RetrofitBuilder.apiService

    suspend fun createHostToHostTransaction(payTransaction: PayTransaction) = apiHelper.createHostToHostTransaction(payTransaction)
    suspend fun createUpdateLookupTransaction(updateTransaction: UpdateTransaction) = apiHelper.createUpdateLookupTransaction(updateTransaction)
    suspend fun createUpdateOtpTransaction(updateTransaction: UpdateTransaction) = apiHelper.createUpdateOtpTransaction(updateTransaction)
    suspend fun createUpdate3DSTransaction(updateTransaction: UpdateTransaction) = apiHelper.createUpdate3DSTransaction(updateTransaction)
}