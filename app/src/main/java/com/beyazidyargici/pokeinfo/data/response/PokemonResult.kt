package com.beyazidyargici.pokeinfo.data.response

import com.google.gson.annotations.SerializedName

data class PokemonResult(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)