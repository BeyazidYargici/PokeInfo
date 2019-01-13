package com.beyazidyargici.pokeinfo.data.network

import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity
import kotlinx.coroutines.Deferred
import retrofit2.http.GET


const val BASE_URL = "https://pokeapi.co/api/v2/"

/**
 *  Created by beyazid on 1.01.2019.
 */
interface ApiService {

    @GET("pokemon")
    fun getAllPokemons() : Deferred<AllPokemonEntity>
}