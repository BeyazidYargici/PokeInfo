package com.beyazidyargici.pokeinfo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import java.util.*

/**
 *  Created by beyazid on 12.01.2019.
 */
@Database(entities = [DummyEntity::class], version = 1)
abstract class PokeDB : RoomDatabase() {
}