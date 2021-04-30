package io.fourbill.sdk.manager

import io.fourbill.sdk.data.model.CancelTransaction
import io.fourbill.sdk.data.model.CreateTransaction
import io.fourbill.sdk.data.model.FindTransaction
import io.fourbill.sdk.data.network.api.ApiFourBill
import io.fourbill.sdk.data.network.api.RetrofitBuilder

internal class WebPaymentsManager {

    private var apiHelper: ApiFourBill = RetrofitBuilder.apiService

    suspend fun createTransaction(createTransaction: CreateTransaction) = apiHelper.createTransaction(createTransaction)
    suspend fun createTransactionCardToCard(createTransaction: CreateTransaction) = apiHelper.createTransactionCardToCard(createTransaction)
    suspend fun createTokenCard(createTransaction: CreateTransaction) = apiHelper.createTokenCard(createTransaction)
    suspend fun findTransaction(findTransaction: FindTransaction) = apiHelper.findTransaction(findTransaction)
    suspend fun cancelTransaction(cancelTransaction: CancelTransaction) = apiHelper.cancelTransaction(cancelTransaction)
}