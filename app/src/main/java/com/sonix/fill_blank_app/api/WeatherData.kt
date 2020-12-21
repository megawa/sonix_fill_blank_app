package com.sonix.fill_blank_app.api

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Weather(
    val main: @RawValue Main,
) : Parcelable {

    class Main(
        val temp: Double,
        val tempMin: Double,
        val tempMax: Double
    )

    val celsiusTemp: String
        get() {
            val celsius = main.temp - 273.15
            return String.format("%.1f", celsius)
    }
}