package com.beyazidyargici.pokeinfo.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.beyazidyargici.pokeinfo.di.ViewModelKey
import com.beyazidyargici.pokeinfo.ui.my_pokemons.MyPokemonsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 *  Created by beyazid on 28.12.2018.
 */
@Module
internal abstract class ViewModelModule {

    /*
     * This method basically says
     * inject this object into a Map using the @IntoMap annotation,
     * with the  MovieListViewModel.class as key,
     * and a Provider that will build a MovieListViewModel
     * object.
     *
     * */
    @Binds
    @IntoMap
    @ViewModelKey(MyPokemonsViewModel::class)
    protected abstract fun bindMyPokemonsViewModel(myPokemonsViewModel: MyPokemonsViewModel): ViewModel
}
