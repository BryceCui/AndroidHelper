package com.bryce.lib_ext

/**
 *
 * @Description String  扩展类
 * @date 3/4/21 10:34 AM
 * @author BryceCui
 * @Version 1.0
 */

/**
 * String 为空默认返回 无
 *
 * @return
 */
fun String?.mNone(): String {
    return mNone("无")
}

/**
 * String 为空默认返回 string
 *
 * @param string  默认值
 * @return
 */
fun String?.mNone(string: String?): String {
    return if (this.isNullOrEmpty()) string ?: "" else this
}