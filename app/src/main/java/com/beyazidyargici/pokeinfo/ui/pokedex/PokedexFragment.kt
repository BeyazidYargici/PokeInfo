package com.beyazidyargici.pokeinfo.ui.pokedex

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.beyazidyargici.pokeinfo.R

class PokedexFragment : Fragment() {

    companion object {
        fun newInstance() = PokedexFragment()
    }

    private lateinit var viewModel: PokedexViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fr_pokedex, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PokedexViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
