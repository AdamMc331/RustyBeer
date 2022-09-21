package com.adammcneilly.rustybeer.remote


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkBeerStyle(
    @Json(name = "abv_max")
    val abvMax: Double? = null,
    @Json(name = "abv_min")
    val abvMin: Double? = null,
    @Json(name = "color_srm_max")
    val colorSrmMax: Int? = null,
    @Json(name = "color_srm_min")
    val colorSrmMin: Int? = null,
    @Json(name = "description")
    val description: String? = null,
    @Json(name = "final_gravity_max")
    val finalGravityMax: Double? = null,
    @Json(name = "final_gravity_min")
    val finalGravityMin: Double? = null,
    @Json(name = "ibu_max")
    val ibuMax: Int? = null,
    @Json(name = "ibu_min")
    val ibuMin: Int? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "original_gravity_max")
    val originalGravityMax: Double? = null,
    @Json(name = "original_gravity_min")
    val originalGravityMin: Double? = null
)
