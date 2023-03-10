package com.example.home_presenter.home

import com.example.home_presenter.home.components.Article
import com.example.home_presenter.home.components.HealthFacility

data class HomeState(
    val emergencyContacts: List<String> = emptyList(),
    val healthFacilities: List<HealthFacility> = emptyList(),
    val articles: List<Article> = emptyList()
)