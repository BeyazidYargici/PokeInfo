package com.beyazidyargici.pokeinfo.di.module

import androidx.room.Room
import com.beyazidyargici.pokeinfo.PokeApp
import com.beyazidyargici.pokeinfo.data.dao.AllPokemonDao
import com.beyazidyargici.pokeinfo.data.db.PokeDB
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
        return Room.databaseBuilder(application, PokeDB::class.java, "pokemon.db").build()
    }

    /*
 * We need the CurrentWeather module.
 * For this, We need the AppDatabase object
 * So we will define the providers for this here in this module.
 * */
    @Provides
    @Singleton
    fun provideAllPokeDao(appDatabase: PokeDB): AllPokemonDao{
        return appDatabase.currentAllPokemons()
    }

}