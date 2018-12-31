package com.beyazidyargici.pokeinfo.di.component

import com.beyazidyargici.pokeinfo.PokeApp
import com.beyazidyargici.pokeinfo.di.module.DatabaseModule
import com.beyazidyargici.pokeinfo.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Inject

/**
 *  Created by beyazid on 31.12.2018.
 */
@Component(
    modules = [
        NetworkModule::class,
        DatabaseModule::class,
        AndroidSupportInjectionModule::class]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: PokeApp): Builder

        @BindsInstance
        fun networkModule(networkModule: NetworkModule): Builder
//
        @BindsInstance
        fun databaseModule(databaseModule: DatabaseModule): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: PokeApp)

}