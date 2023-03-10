package com.example.core.utils

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.Locale

fun LocalDateTime.formattedDate(): String {
    val month = this.month.name.lowercase().replaceFirstChar { it.uppercase() }
    val day = if(this.dayOfMonth < 10) "0${this.dayOfMonth}" else this.dayOfMonth
    val year = this.year

    return "$day $month $year"
}