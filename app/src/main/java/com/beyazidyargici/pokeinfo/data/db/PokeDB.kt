package com.beyazidyargici.pokeinfo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.beyazidyargici.pokeinfo.data.dao.AllPokemonDao
import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity
import com.beyazidyargici.pokeinfo.util.Converter

/**
 *  Created by beyazid on 12.01.2019.
 */
@Database(entities = [AllPokemonEntity::class], version = 1)
@TypeConverters(Converter::class)
abstract class PokeDB : RoomDatabase() {
    abstract fun currentAllPokemons(): AllPokemonDao

}