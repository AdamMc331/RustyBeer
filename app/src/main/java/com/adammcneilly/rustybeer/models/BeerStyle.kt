package com.adammcneilly.rustybeer.models

data class BeerStyle(
    val abvMax: Double? = null,
    val abvMin: Double? = null,
    val colorSrmMax: Int? = null,
    val colorSrmMin: Int? = null,
    val description: String? = null,
    val finalGravityMax: Double? = null,
    val finalGravityMin: Double? = null,
    val ibuMax: Int? = null,
    val ibuMin: Int? = null,
    val name: String? = null,
    val originalGravityMax: Double? = null,
    val originalGravityMin: Double? = null
)
