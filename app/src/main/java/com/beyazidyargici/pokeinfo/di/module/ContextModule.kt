package com.beyazidyargici.pokeinfo.di.module

import android.content.Context
import com.beyazidyargici.pokeinfo.PokeApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  Created by beyazid on 12.01.2019.
 */
@Module
class ContextModule {

    @Provides
    @Singleton
    fun providesContext(): Context {
        return PokeApp()
    }

}