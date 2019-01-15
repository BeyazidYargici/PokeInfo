package com.beyazidyargici.pokeinfo.data.data_source

import androidx.lifecycle.LiveData
import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity

/**
 *  Created by beyazid on 12.01.2019.
 */
interface PokemonDataSource {
    val fetchedAllPoke: LiveData<AllPokemonEntity>

    suspend fun fetchCurrentAllPoke()

}