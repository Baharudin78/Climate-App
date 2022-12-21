package com.baharudin.climateapp.data.dto.weather

import com.baharudin.climateapp.domain.model.weather.TimeModel

data class Time(
    val card: String,
    val celcius: String,
    val code: String,
    val datetime: String,
    val day: String,
    val deg: String,
    val fahrenheit: String,
    val h: String,
    val kph: String,
    val kt: String,
    val mph: String,
    val ms: String,
    val name: String,
    val sexa: String,
    val type: String,
    val value: String
)

fun Time.toTimeModel() : TimeModel{
    return TimeModel(
        card,
        celcius,
        code,
        datetime,
        day,
        deg,
        fahrenheit,
        h,
        kph,
        kt,
        mph,
        ms,
        name,
        sexa,
        type,
        value
    )
}