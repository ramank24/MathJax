package com.example.mathjax

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class CommonAndroidAPI(private val context: Context) {
    lateinit var listener: AndroidAPIOnCallListener

    @JavascriptInterface
    fun getAnswer(): String {
        return "EM0318288-d"
    }

    @JavascriptInterface
    fun getIsAttempted(): Boolean {
        return false
    }
    @JavascriptInterface
    fun showToast(toast: String) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
    }

    public interface AndroidAPIOnCallListener {
        fun getAnswer(): String
        fun getIsAttempted(): Boolean
    }
}
