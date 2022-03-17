package com.tbuonomo.dotsindicatorsample

import android.content.Context
import android.util.TypedValue
import androidx.annotation.Dimension

fun Context.getWindowWidth(): Int {
    return resources.displayMetrics.widthPixels
}

fun Context.getWindowHeight(): Int {
    return resources.displayMetrics.heightPixels
}

fun Context.dpToPx(@Dimension(unit = Dimension.DP) dp: Int): Float {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp.toFloat(), resources.displayMetrics
    )
}

fun Context.dpToPx(dp: Float): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics)
}