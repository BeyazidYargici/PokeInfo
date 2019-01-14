package com.beyazidyargici.pokeinfo.di.component

import com.beyazidyargici.pokeinfo.PokeApp
import com.beyazidyargici.pokeinfo.di.module.*
import com.beyazidyargici.pokeinfo.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 *  Created by beyazid on 31.12.2018.
 */
@Singleton
@Component(
    modules = [
        ActivityModule::class,
        FragmentModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        ViewModelModule::class,
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