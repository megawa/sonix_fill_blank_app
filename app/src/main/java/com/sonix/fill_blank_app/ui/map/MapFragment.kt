package com.sonix.fill_blank_app.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.sonix.fill_blank_app.R
import com.sonix.fill_blank_app.databinding.FragmentMapBinding

class MapFragment : Fragment() {
    private val viewModel: MapViewModel by viewModels()
    private lateinit var binding: FragmentMapBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        binding = FragmentMapBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onCreate()
        setUpObservers()
    }

    private fun setUpObservers() {
        viewModel.googleMapCallback.observe(viewLifecycleOwner, Observer {
            setUpGoogleMapCallback(it)
        })
    }

    private fun setUpGoogleMapCallback(callback: OnMapReadyCallback) {
        val mapFragment =
            childFragmentManager.findFragmentById(R.id.container_google_map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}