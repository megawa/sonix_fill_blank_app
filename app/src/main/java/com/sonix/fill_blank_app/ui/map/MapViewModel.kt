package com.sonix.fill_blank_app.ui.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapViewModel : ViewModel() {
    private val _googleMapCallback = MutableLiveData<OnMapReadyCallback>()
    val googleMapCallback: LiveData<OnMapReadyCallback>
        get() = _googleMapCallback

    fun onCreate() {
        setUpGoogleMap()
    }

    private fun setUpGoogleMap() {
        val callback = OnMapReadyCallback { googleMap ->
            // Sentence3:マップ画面に位置を設定しよう
            // 東京ドームにピンを指しましょう① ②
            // 地図の表示を変更しましょう① ②
        }
        _googleMapCallback.postValue(callback)
    }
}
