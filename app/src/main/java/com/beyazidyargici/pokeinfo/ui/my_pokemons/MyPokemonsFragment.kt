package com.beyazidyargici.pokeinfo.ui.my_pokemons

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer

import com.beyazidyargici.pokeinfo.R
import com.beyazidyargici.pokeinfo.base.ScopedFragment
import dagger.android.support.AndroidSupportInjection
import kotlinx.coroutines.launch
import javax.inject.Inject

class MyPokemonsFragment : ScopedFragment() {

    @Inject
    internal lateinit var myPokemonsVMFactory: MyPokemonsVMFactory

    private lateinit var viewModel: MyPokemonsViewModel

    companion object {
        fun newInstance() = MyPokemonsFragment()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        viewModel = ViewModelProviders.of(this, this.myPokemonsVMFactory)
            .get(MyPokemonsViewModel::class.java)

        bindUI()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fr_my_pokemons, container, false)
    }


    // Global.launch is not good option because fragment has a lifecycle.
    // We create ScopedFragment and this fragment extended from ScopedFragment for this reason.
    private fun bindUI() = launch {
        //all pokemons type of LiveData<AllPokemonEntity> and observer
        val allPokemons = viewModel.pokes.await()
        allPokemons.observe(this@MyPokemonsFragment, Observer { it ->
            if (it == null) {
                return@Observer
            }
            Log.e("firstPoke", it.results[0].name)
        })
    }







}
