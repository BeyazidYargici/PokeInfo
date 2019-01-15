package com.beyazidyargici.pokeinfo.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beyazidyargici.pokeinfo.data.db.entity.ALL_POKE_ID
import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity

/**
 *  Created by beyazid on 12.01.2019.
 */
@Dao
interface AllPokemonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(allPokemonEntity: AllPokemonEntity)

    @Query("select * from pokemon_table where id = $ALL_POKE_ID")
    fun getAll() : LiveData<AllPokemonEntity>

}