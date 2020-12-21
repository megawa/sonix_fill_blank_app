package com.sonix.fill_blank_app.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.sonix.fill_blank_app.MainActivity
import com.sonix.fill_blank_app.R
import com.sonix.fill_blank_app.databinding.FragmentSplashBinding
import kotlinx.coroutines.launch

class SplashFragment: Fragment() {
    private val viewModel: SplashViewModel by viewModels()
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        binding = FragmentSplashBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycleScope.launch {
            // Sentence1: スプラッシュ画面を完成させよう
            // スプラッシュ画面のアニメーションを実行しましょう
        }
        setupObservers()
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)?.supportActionBar?.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as MainActivity?)?.supportActionBar?.show()
    }

    private fun setupObservers() {
        viewModel.logoAlphaAnimation.observe(viewLifecycleOwner, {
            binding.imageLogo.animate().alpha(it.alpha).setDuration(it.duration).setListener(null)
        })

        viewModel.textAlphaAnimation.observe(viewLifecycleOwner, {
            binding.textTraining.animate().alpha(it.alpha).setDuration(it.duration).setListener(null)
        })

        viewModel.navigateToTopScreen.observe(viewLifecycleOwner, { event ->
            event.getContentIfNotHandled()?.let {
                // Sentence2: 各画面の画面遷移を完成させよう
                // トップ画面に遷移しよう
            }
        })
    }
}