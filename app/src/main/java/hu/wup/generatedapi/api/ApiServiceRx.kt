package hu.wup.generatedapi.api

import hu.wup.generatedapi.model.CardEntityResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiServiceRx {

    @GET("cards.json")
    fun getCardData(): Single<List<CardEntityResponse>>
}