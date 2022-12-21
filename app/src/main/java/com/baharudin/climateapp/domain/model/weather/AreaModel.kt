package com.baharudin.climateapp.domain.model.weather

import com.baharudin.climateapp.data.dto.weather.Param

data class AreaModel(
    val coordinate: String,
    val description: String,
    val domain: String,
    val id: String,
    val latitude: String,
    val level: String,
    val longitude: String,
    val params: List<Param>,
    val region: String,
    val tags: String,
    val type: String
)
