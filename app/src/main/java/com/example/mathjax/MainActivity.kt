package com.example.mathjax

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.*
import android.webkit.WebSettings.LOAD_NO_CACHE
import com.example.mathjax.databinding.ActivityMainBinding
import com.google.gson.Gson

class MainActivity : AppCompatActivity(), CommonAndroidAPI.AndroidAPIOnCallListener {
    private lateinit var binding: ActivityMainBinding
    val gson = Gson()
    private lateinit var jsonStr: String
    private var index = 0

    @SuppressLint("SetJavaScriptEnabled", "JavascriptInterface")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initWebView(binding.wvQuestion)
        initWebView(binding.wvOption1)
        initWebView(binding.wvOption2)
        initWebView(binding.wvOption3)
        initWebView(binding.wvOption4)

        binding.btnNext.setOnClickListener {
            loadQuestion()
            index++
            if(index > 4) index = 0
        }

        binding.btnPrev.setOnClickListener {
            loadQuestion()
            index--
            if(index < 0) index = 0
        }
    }

    private fun initWebView(wv: WebView) {
        wv.webChromeClient = object: WebChromeClient() {}
        wv.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                //loadQuestion()
            }

            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                super.onReceivedError(view, request, error)
                Log.i("TAG", "Error in loading")
            }
        }

        wv.settings.allowFileAccess = true
        wv.isLongClickable = false
        wv.settings.javaScriptEnabled = true
        wv.settings.cacheMode = LOAD_NO_CACHE
        wv.addJavascriptInterface(CommonAndroidAPI(this), "CommonAndroidAPI")
        if (Build.VERSION.SDK_INT > 21) {
            wv.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        } else {
            wv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
        wv.loadUrl("file:///android_asset/templates/test.html")
    }

    private fun loadQuestion() {
        Log.i("TAG", "json string")

        binding.wvQuestion.loadUrl("javascript:setData(${gson.toJson(sampleJson[index].body)}, 1)")
        binding.wvOption1.loadUrl("javascript:setData(${gson.toJson(sampleJson[index].answers[0].body)}, 1)")
        binding.wvOption2.loadUrl("javascript:setData(${gson.toJson(sampleJson[index].answers[1].body)}, 1)")
        binding.wvOption3.loadUrl("javascript:setData(${gson.toJson(sampleJson[index].answers[2].body)}, 1)")
        binding.wvOption4.loadUrl("javascript:setData(${gson.toJson(sampleJson[index].answers[3].body)}, 1)")
    }

    override fun getAnswer(): String {
        return "EM0318288-d"
    }

    override fun getIsAttempted(): Boolean {
        return false
    }
}