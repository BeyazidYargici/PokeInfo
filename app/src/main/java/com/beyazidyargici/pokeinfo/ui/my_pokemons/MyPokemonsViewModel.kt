package com.beyazidyargici.pokeinfo.ui.my_pokemons

import androidx.lifecycle.ViewModel;
import com.beyazidyargici.pokeinfo.data.repository.PokeRepo
import com.beyazidyargici.pokeinfo.util.lazyDeferred
import javax.inject.Inject

class MyPokemonsViewModel @Inject constructor(pokeRepo: PokeRepo) : ViewModel() {

    val pokes by lazyDeferred {
        pokeRepo.getAllPoke()
    }

}
