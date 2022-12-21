package com.baharudin.climateapp.data.dto.weather

data class WeatherDto(
    val weather: Weather,
    val message: Any,
    val success: Boolean
)