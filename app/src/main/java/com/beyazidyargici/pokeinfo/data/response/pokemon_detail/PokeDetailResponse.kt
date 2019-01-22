package com.beyazidyargici.pokeinfo.data.response.pokemon_detail

import com.google.gson.annotations.SerializedName

data class PokeDetailResponse(

	@field:SerializedName("location_area_encounters")
	val locationAreaEncounters: String? = null,

	@field:SerializedName("types")
	val types: List<TypesItem?>? = null,

	@field:SerializedName("base_experience")
	val baseExperience: Int? = null,

	@field:SerializedName("weight")
	val weight: Int? = null,

	@field:SerializedName("is_default")
	val isDefault: Boolean? = null,

	@field:SerializedName("sprites")
	val sprites: Sprites? = null,

	@field:SerializedName("abilities")
	val abilities: List<AbilitiesItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("forms")
	val forms: List<FormsItem?>? = null,

	@field:SerializedName("height")
	val height: Int? = null,

	@field:SerializedName("order")
	val order: Int? = null
)