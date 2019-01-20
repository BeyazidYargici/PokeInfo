package com.beyazidyargici.pokeinfo.ui.battle_arena

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.beyazidyargici.pokeinfo.data.repository.PokeRepo
import com.beyazidyargici.pokeinfo.ui.my_pokemons.MyPokemonsViewModel
import javax.inject.Inject

/**
 *  Created by beyazid on 20.01.2019.
 */
class BattleArenaVMFactory @Inject constructor(
    private val pokeRepo: PokeRepo
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BattleArenaViewModel(pokeRepo) as T
    }
}