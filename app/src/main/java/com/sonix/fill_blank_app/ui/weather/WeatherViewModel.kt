package com.sonix.fill_blank_app.ui.weather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sonix.fill_blank_app.api.ApiClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WeatherViewModel : ViewModel() {
    private val _textTemp = MutableLiveData<String>()
    val textTemp: LiveData<String>
        get() = _textTemp

    fun onCreate() {
        CoroutineScope(Dispatchers.Default).launch(Dispatchers.IO) {
            // Sentence5:現在の気温を取得して表示しよう
            // Weather APIにリクエストを投げてみよう
        }
    }

    // Sentence5:現在の気温を取得して表示しよう
    // Weather APIのレスポンスを受け取ろう
    // 現在の気温を画面に表示しよう
}