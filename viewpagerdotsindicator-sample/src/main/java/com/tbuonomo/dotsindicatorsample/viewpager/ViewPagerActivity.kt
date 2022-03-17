package com.tbuonomo.dotsindicatorsample.viewpager

import android.os.Bundle
import androidx.core.view.WindowCompat
import com.tbuonomo.dotsindicatorsample.BaseActivity
import com.tbuonomo.dotsindicatorsample.R
import com.tbuonomo.dotsindicatorsample.databinding.ActivityViewPagerBinding

class ViewPagerActivity : BaseActivity<ActivityViewPagerBinding>() {

    override fun getViewBinding(): ActivityViewPagerBinding {
        return ActivityViewPagerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_view_pager)

        with(binding.viewPager) {
            adapter = DotIndicatorPagerAdapter()
            setPageTransformer(true, ZoomOutPageTransformer())

            binding.dotsIndicator.setViewPager(this)
            binding.springDotsIndicator.setViewPager(this)
            binding.wormDotsIndicator.setViewPager(this)
        }
    }
}
