package com.adammcneilly.rustybeer.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.adammcneilly.rustybeer.models.BeerStyle

@Entity
data class LocalBeerStyle(
    @PrimaryKey
    val name: String,
    val abvMax: Double? = null,
    val abvMin: Double? = null,
    val colorSrmMax: Int? = null,
    val colorSrmMin: Int? = null,
    val description: String? = null,
    val finalGravityMax: Double? = null,
    val finalGravityMin: Double? = null,
    val ibuMax: Int? = null,
    val ibuMin: Int? = null,
    val originalGravityMax: Double? = null,
    val originalGravityMin: Double? = null,
)

fun LocalBeerStyle.toBeerStyle(): BeerStyle {
    return BeerStyle(
        name = this.name,
        abvMax = this.abvMax,
        abvMin = this.abvMin,
        colorSrmMax = this.colorSrmMax,
        colorSrmMin = this.colorSrmMin,
        description = this.description,
        finalGravityMax = this.finalGravityMax,
        finalGravityMin = this.finalGravityMin,
        ibuMax = this.ibuMax,
        ibuMin = this.ibuMin,
        originalGravityMax = this.originalGravityMax,
        originalGravityMin = this.originalGravityMin,
    )
}
