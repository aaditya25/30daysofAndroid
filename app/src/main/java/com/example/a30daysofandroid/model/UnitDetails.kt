package com.example.a30daysofandroid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class UnitDetails(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
