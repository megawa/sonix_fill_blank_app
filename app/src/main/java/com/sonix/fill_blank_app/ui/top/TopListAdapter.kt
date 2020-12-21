package com.sonix.fill_blank_app.ui.top

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sonix.fill_blank_app.databinding.ItemTopListBinding
import kotlinx.android.synthetic.main.item_top_list.view.*

class TopListAdapter(
    private val onItemClicked: (TopListItem) -> Unit
) :  RecyclerView.Adapter<TopListAdapter.BindingHolder>() {
    private val items: Array<TopListItem> = TopListItem.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTopListBinding.inflate(inflater, parent, false)
        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        holder.itemView.let {
            val item = items[position]
            it.text_title.text = item.title
            it.setOnClickListener {
                onItemClicked(item)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class BindingHolder(binding: ItemTopListBinding) : RecyclerView.ViewHolder(binding.root)
}