package com.bryce.lib_ext.view

import android.graphics.drawable.Drawable
import android.widget.TextView

/**
 *
 * @Description TextView 扩展类
 * @date 3/4/21 10:33 AM
 * @author BryceCui
 * @Version 1.0
 */


/**
 * 设置图片左边
 *
 * @param drawable
 */
fun TextView?.setDrawableLeft(drawable: Drawable?) {
    setCompoundDrawables(this, drawable, null, null, null)
}

/**
 * 设置图片右边
 *
 * @param drawable
 */
fun TextView?.setDrawableRight(drawable: Drawable?) {
    setCompoundDrawables(this, null, null, drawable, null)
}

/**
 * 设置图片上边
 *
 * @param drawable
 */
fun TextView?.setDrawableTop(drawable: Drawable?) {
    setCompoundDrawables(this, null, drawable, null, null)
}

/**
 * 设置图片底部
 *
 * @param drawable
 */
fun TextView?.setDrawableBottom(drawable: Drawable?) {
    setCompoundDrawables(this, null, null, null, drawable)
}

/**
 *
 * textView设置图片
 * @param textView
 * @param left 左
 * @param top  上
 * @param right 右
 * @param bottom 底
 */
private fun setCompoundDrawables(
    textView: TextView?,
    left: Drawable?, top: Drawable?,
    right: Drawable?, bottom: Drawable?
) {
    textView?.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom)
}