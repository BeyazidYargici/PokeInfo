package com.beyazidyargici.pokeinfo.data.data_source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity
import com.beyazidyargici.pokeinfo.data.network.ApiService
import java.lang.Exception
import javax.inject.Inject

/**
 *  Created by beyazid on 12.01.2019.
 */
//inject api service for access directly to getAllPokemons method
class PokemonDataSourceImp @Inject constructor(private val apiService: ApiService) : PokemonDataSource {

    // its used for pass fetched data to fetchedAllPoke
    private val mFetchedAllPoke = MutableLiveData<AllPokemonEntity>()

    override suspend fun fetchCurrentAllPoke() {
        try {
            val fetchedData = apiService.getAllPokemons().await()
            mFetchedAllPoke.postValue(fetchedData)
        } catch (e: Exception) {
            Log.e("connectivity", "No internet connection" + e.toString())
        }
    }

    override val fetchedAllPoke: LiveData<AllPokemonEntity>
        get() = mFetchedAllPoke
}