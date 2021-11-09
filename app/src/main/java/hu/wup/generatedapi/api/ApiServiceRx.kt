package hu.wup.generatedapi.api

import hu.wup.generatedapi.model.CardEntityResponse
import retrofit2.http.GET
import rx.Single

interface ApiServiceRx {

    @GET("cards.json")
    fun getCardData(): Single<ArrayList<CardEntityResponse>>
}