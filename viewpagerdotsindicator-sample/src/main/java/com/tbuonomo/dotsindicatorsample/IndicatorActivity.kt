package com.tbuonomo.dotsindicatorsample

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tbuonomo.dotsindicatorsample.databinding.ActivityIndicatorBinding

class IndicatorActivity : BaseActivity<ActivityIndicatorBinding>() {
    override fun getViewBinding(): ActivityIndicatorBinding {
        return ActivityIndicatorBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = listOf(
            R.string.home,
            R.string.assets,
            R.string.trade,
            R.string.news
        )
        val listAdapter = IndicatorAdapter(list)
        binding.list.run {
            this.adapter = listAdapter
            this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//            this.addItemDecoration(NewItemDecoration())
        }

        binding.indicator.setRecyclerView(binding.list, binding.scrollView)


//        binding.layoutIndicator.addDots(5)
//        binding.layoutIndicator.setupRecyclerView(binding.list)
    }
}