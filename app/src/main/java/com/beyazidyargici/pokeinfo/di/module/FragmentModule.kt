package com.beyazidyargici.pokeinfo.di.module

import com.beyazidyargici.pokeinfo.ui.battle_arena.BattleArenaFragment
import com.beyazidyargici.pokeinfo.ui.my_pokemons.MyPokemonsFragment
import com.beyazidyargici.pokeinfo.ui.pokedex.PokedexFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *  Created by beyazid on 12.01.2019.
 */
@Module
abstract class FragmentModule {
    /*
     * We define the name of the Fragment we are going
    * to inject the ViewModelFactory into. i.e. in our case
    * The name of the fragment: MovieListFragment
    */
    @ContributesAndroidInjector
    abstract fun contributeMyPokemonsFragment(): MyPokemonsFragment

    @ContributesAndroidInjector
    abstract fun contributePokedexFragment(): PokedexFragment

    @ContributesAndroidInjector
    abstract fun contributeBattleArenaFragment(): BattleArenaFragment

}