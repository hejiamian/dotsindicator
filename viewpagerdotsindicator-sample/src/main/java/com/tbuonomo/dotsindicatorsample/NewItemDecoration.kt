package com.tbuonomo.dotsindicatorsample

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewItemDecoration : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val context = parent.context
//        val dp24 = context.dpToPx(24).toInt()
        val dp16 = context.dpToPx(16).toInt()
        val layoutManager = parent.layoutManager as LinearLayoutManager
        val marginRight = context.getWindowWidth() - layoutManager.getChildAt(0)!!.width
        val adapter = parent.adapter!!
        val firstPosition = layoutManager.findFirstVisibleItemPosition()
        if (firstPosition == (adapter.itemCount -1)){
            outRect.set(0, 0, dp16, 0)
        } else{
            outRect.set(0, 0, dp16, 0)
        }
    }
}