package com.sonix.fill_blank_app.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sonix.fill_blank_app.Event
import kotlinx.coroutines.delay

class SplashViewModel : ViewModel() {
    data class AlphaAnimation(val alpha: Float, val duration: Long)

    private val _navigateToTopScreen = MutableLiveData<Event<Unit>>()
    val navigateToTopScreen: LiveData<Event<Unit>>
        get() = _navigateToTopScreen

    private val _logoAlphaAnimation = MutableLiveData<AlphaAnimation>()
    val logoAlphaAnimation: LiveData<AlphaAnimation>
        get() = _logoAlphaAnimation

    private val _textAlphaAnimation = MutableLiveData<AlphaAnimation>()
    val textAlphaAnimation: LiveData<AlphaAnimation>
        get() = _textAlphaAnimation

    /**
     * Start splash animation
     */
    suspend fun animationStart() {
        _logoAlphaAnimation.value = AlphaAnimation(1f, 2500)
        delay(2500)
        _logoAlphaAnimation.value = AlphaAnimation(0f, 2500)
        delay(2500)
        _textAlphaAnimation.value = AlphaAnimation(1f, 2500)
        delay(2500)
        _textAlphaAnimation.value = AlphaAnimation(0f, 1500)
        delay(1500)

        _navigateToTopScreen.value = Event(Unit)
    }
}