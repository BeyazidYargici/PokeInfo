package com.beyazidyargici.pokeinfo.data.response

import com.google.gson.annotations.SerializedName

data class AllPokemonResponse(

	@field:SerializedName("next")
	val next: Any? = null,

	@field:SerializedName("previous")
	val previous: Any? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("results")
	val results: List<PokemonResult?>? = null
)