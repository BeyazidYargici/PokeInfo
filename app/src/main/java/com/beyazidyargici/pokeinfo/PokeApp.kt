package com.beyazidyargici.pokeinfo

import android.app.Activity
import android.app.Application
import com.beyazidyargici.pokeinfo.di.component.DaggerApplicationComponent
import com.beyazidyargici.pokeinfo.di.module.DatabaseModule
import com.beyazidyargici.pokeinfo.di.module.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 *  Created by beyazid on 31.12.2018.
 */
class PokeApp : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder()
            .application(this)
            .databaseModule(DatabaseModule())
            .networkModule(NetworkModule())
            .build()
            .inject(this)
    }
}