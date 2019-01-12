package com.beyazidyargici.pokeinfo.data.network

import com.beyazidyargici.pokeinfo.data.response.AllPokemonResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query


const val BASE_URL = "https://pokeapi.co/api/v2/"

/**
 *  Created by beyazid on 1.01.2019.
 */
interface ApiService {

    @GET("pokemon")
    fun getAllPokemons() : Deferred<AllPokemonResponse>
}