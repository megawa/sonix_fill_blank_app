package com.sonix.fill_blank_app.ui.top

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.sonix.fill_blank_app.R
import com.sonix.fill_blank_app.databinding.FragmentTopBinding

class TopFragment : Fragment() {
    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_top, container, false)
        binding = FragmentTopBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecycler()
    }

    private fun setUpRecycler() {
        binding.recycler.let {
            it.adapter = TopListAdapter(::onItemClicked)
            it.layoutManager = LinearLayoutManager(requireActivity())
        }
    }

    private fun onItemClicked(type: TopListItem) {
        when (type) {
            // Sentence2: 各画面の画面遷移を完成させよう
            // マップ・ウェブ・天気画面に遷移しよう
            TopListItem.MAP -> {
            }
            TopListItem.WEB -> {
            }
            TopListItem.WEATHER -> {
            }
        }
    }
}