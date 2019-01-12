package com.beyazidyargici.pokeinfo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beyazidyargici.pokeinfo.data.DummyEntity

/**
 *  Created by beyazid on 12.01.2019.
 */
@Database(entities = [DummyEntity::class], version = 1)
abstract class PokeDB : RoomDatabase() {

}