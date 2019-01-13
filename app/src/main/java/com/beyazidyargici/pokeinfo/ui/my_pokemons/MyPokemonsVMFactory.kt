package com.beyazidyargici.pokeinfo.ui.my_pokemons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.beyazidyargici.pokeinfo.data.repository.PokeRepo
import javax.inject.Inject

/**
 *  Created by beyazid on 12.01.2019.
 */
@Suppress("UNCHECKED_CAST")
class MyPokemonsVMFactory @Inject constructor(
    private val pokeRepo: PokeRepo
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MyPokemonsViewModel(pokeRepo) as T
    }
}