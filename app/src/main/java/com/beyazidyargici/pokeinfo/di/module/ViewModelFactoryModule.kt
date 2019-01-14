package com.beyazidyargici.pokeinfo.di.module

import androidx.lifecycle.ViewModelProvider
import com.beyazidyargici.pokeinfo.ui.ViewModelFactory
import dagger.Binds
import dagger.Module

/**
 *  Created by beyazid on 28.12.2018.
 */
@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
