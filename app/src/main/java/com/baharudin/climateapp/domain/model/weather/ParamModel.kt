package com.baharudin.climateapp.domain.model.weather

import com.baharudin.climateapp.data.dto.weather.Time

data class ParamModel(
    val description: String,
    val id: String,
    val times: List<Time>,
    val type: String
)
