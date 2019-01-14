package com.beyazidyargici.pokeinfo.di.module

import com.beyazidyargici.pokeinfo.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *  Created by beyazid on 12.01.2019.
 */
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivity() : MainActivity
}