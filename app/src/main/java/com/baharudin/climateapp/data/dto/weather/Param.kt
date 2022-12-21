package com.baharudin.climateapp.data.dto.weather

data class Param(
    val description: String,
    val id: String,
    val times: List<Time>,
    val type: String
)