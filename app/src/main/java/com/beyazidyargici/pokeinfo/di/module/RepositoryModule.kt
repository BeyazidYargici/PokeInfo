package com.beyazidyargici.pokeinfo.di.module

import com.beyazidyargici.pokeinfo.data.dao.AllPokemonDao
import com.beyazidyargici.pokeinfo.data.data_source.PokemonDataSource
import com.beyazidyargici.pokeinfo.data.repository.PokeRepo
import com.beyazidyargici.pokeinfo.data.repository.PokeRepoImp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  Created by beyazid on 12.01.2019.
 */
@Module(includes = [DatabaseModule::class,DataSourceModule::class])
class RepositoryModule {
    @Provides
    @Singleton
    internal fun provideRepository(allPokemonDao: AllPokemonDao, pokemonDataSource: PokemonDataSource): PokeRepo{
        return PokeRepoImp(allPokemonDao,pokemonDataSource)
    }

}