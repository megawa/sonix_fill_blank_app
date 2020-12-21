package com.sonix.fill_blank_app.ui.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.sonix.fill_blank_app.R
import com.sonix.fill_blank_app.databinding.FragmentWeatherBinding

class WeatherFragment: Fragment() {
    private lateinit var binding: FragmentWeatherBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_weather, container, false)
        binding = FragmentWeatherBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onCreate()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.textTemp.observe(viewLifecycleOwner, Observer {
            binding.textTemperature.text = "${it}C°です"
        })
    }
}