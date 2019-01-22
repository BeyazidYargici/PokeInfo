package com.beyazidyargici.pokeinfo.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_my_pokemons.view.*
import java.lang.Exception

/**
 *  Created by beyazid on 22.01.2019.
 */


class MyPokeAdapter(
    @get:JvmName("getContext_") private val context: Context, private val resource: Int,
    private val list: List<*>
) : RecyclerView.Adapter<MyPokeAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(resource, parent, false)
        return MyViewHolder(v)
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.row_my_poke_tv_name!!
        val imageView = view.row_my_poke_iv!!
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = list[position]

    }

    override fun getItemCount() = list.size

}
