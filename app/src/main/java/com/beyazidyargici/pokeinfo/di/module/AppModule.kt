package com.beyazidyargici.pokeinfo.di.module

import android.app.Application
import com.beyazidyargici.pokeinfo.PokeApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  Created by beyazid on 12.01.2019.
 */
@Module
class AppModule {
    var mApplication =  PokeApp()

    fun AppModule(application: PokeApp){
        mApplication = application
    }

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return mApplication
    }

}