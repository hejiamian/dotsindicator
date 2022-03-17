package com.tbuonomo.dotsindicatorsample

import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HorizontalItemDecoration(private val right: Int = 0) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State,
    ) {
        val height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
            24f, parent.context.resources.displayMetrics).toInt()
        parent.adapter?.let {
            outRect.set(0, 0, if (right == 0) height else right, 0)
        }
    }
}