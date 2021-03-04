package com.bryce.lib_ext.view

import android.view.View

/**
 *
 * @Description   View 扩展类
 * @date 3/3/21 10:38 AM
 * @author BryceCui
 * @Version 1.0
 */


/**
 * 隐藏View
 *
 */
fun View.gone() {
    this.visibility = View.GONE
}

/**
 * 显示View
 *
 */
fun View.visible() {
    this.visibility = View.VISIBLE
}

/**
 * 占位View
 *
 */
fun View.inVisible() {
    this.visibility = View.INVISIBLE
}

/**
 * 是否显示View
 *
 * @param gone   true 显示  false 隐藏
 */
fun View.hasVisible(gone: Boolean) {
    this.visibility = if (gone) View.VISIBLE else View.GONE
}


