package com.beyazidyargici.pokeinfo.data.repository

import androidx.lifecycle.LiveData
import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity

/**
 *  Created by beyazid on 12.01.2019.
 */
interface PokeRepo {
    suspend fun getAllPoke() : LiveData<AllPokemonEntity>
}