package com.tbuonomo.dotsindicatorsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tbuonomo.dotsindicatorsample.databinding.ItemIndicatorBinding

class IndicatorAdapter(private val list: List<Int>) : RecyclerView.Adapter<IndicatorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(ItemIndicatorBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
        binding.text.setText(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(val binding: ItemIndicatorBinding) : RecyclerView.ViewHolder(binding.root){

    }
}