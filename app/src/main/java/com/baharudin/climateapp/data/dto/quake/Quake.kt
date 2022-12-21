package com.baharudin.climateapp.data.dto.quake

import com.baharudin.climateapp.domain.model.quake.QuakeModel

data class Quake(
    val bujur: String? = null,
    val coordinates: String? = null,
    val datetime: String? = null,
    val dirasakan: String? = null,
    val jam: String? = null,
    val kedalaman: String? = null,
    val lintang: String? = null,
    val magnitude: String? = null,
    val potensi: String? = null,
    val shakemap: String? = null,
    val tanggal: String? = null,
    val wilayah: String? = null
)

fun Quake.toQuakeModel(): QuakeModel {
    return QuakeModel(
        bujur,
        coordinates,
        datetime,
        dirasakan,
        jam,
        kedalaman,
        lintang,
        magnitude,
        potensi,
        shakemap,
        tanggal,
        wilayah
    )
}