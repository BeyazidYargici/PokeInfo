package com.beyazidyargici.pokeinfo.di.module

import com.beyazidyargici.pokeinfo.data.data_source.PokemonDataSource
import com.beyazidyargici.pokeinfo.data.data_source.PokemonDataSourceImp
import com.beyazidyargici.pokeinfo.data.network.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  Created by beyazid on 12.01.2019.
 */
@Module
class DataSourceModule {
    @Provides
    @Singleton
    internal fun provideDataSource(apiService: ApiService): PokemonDataSource{
        return PokemonDataSourceImp(apiService)
    }

}