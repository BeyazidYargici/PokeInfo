package com.beyazidyargici.pokeinfo.di.module

import androidx.room.Room
import com.beyazidyargici.pokeinfo.PokeApp
import com.beyazidyargici.pokeinfo.data.PokeDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  Created by beyazid on 31.12.2018.
 */
@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(application: PokeApp): PokeDB {
        return Room.databaseBuilder(application, PokeDB::class.java, "forecast1.db").build()
    }

}