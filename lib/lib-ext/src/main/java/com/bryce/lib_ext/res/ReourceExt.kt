package com.bryce.lib_ext.res

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat

/**
 *
 * @Description Resoure扩展类
 * @date 3/4/21 10:36 AM
 * @author BryceCui
 * @Version 1.0
 */


/**
 * 获取Drawable
 *
 * @param context 上线文
 * @param res  资源id
 * @return Drawable
 */
fun getDrawable(context: Context?, @DrawableRes res: Int): Drawable? {
    if (null == context) {
        return null
    }
    return ContextCompat.getDrawable(context, res)
}