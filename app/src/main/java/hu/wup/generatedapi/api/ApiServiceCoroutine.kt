package hu.wup.generatedapi.api

import hu.wup.generatedapi.model.CardEntityResponse
import retrofit2.http.GET

interface ApiServiceCoroutine {

    @GET("cards.json")
    suspend fun getCardData(): ArrayList<CardEntityResponse>
}