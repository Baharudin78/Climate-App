package com.baharudin.climateapp.data.dto.weather

import com.baharudin.climateapp.domain.model.weather.IssueModel

data class Issue(
    val day: String,
    val hour: String,
    val minute: String,
    val month: String,
    val second: String,
    val timestamp: String,
    val year: String
)

fun Issue.toIssueModel() : IssueModel{
    return IssueModel(
        day,
        hour,
        minute,
        month,
        second,
        timestamp,
        year
    )
}