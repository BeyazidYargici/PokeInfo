package com.beyazidyargici.pokeinfo.ui.pokedex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.beyazidyargici.pokeinfo.R
import com.beyazidyargici.pokeinfo.base.ScopedFragment
import javax.inject.Inject

class PokedexFragment : ScopedFragment() {

    companion object {
        fun newInstance() = PokedexFragment()
    }

    @Inject
    internal lateinit var pokedexVMFactory: PokedexVMFactory
    private lateinit var viewModel: PokedexViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fr_pokedex, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this,this.pokedexVMFactory).get(PokedexViewModel::class.java)
    }

}
