package com.example.bottom.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.fragment.app.Fragment

import com.example.bottom.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class WebviewFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val views = inflater.inflate(R.layout.fragment_webview, container, false)



        val tvf = views.findViewById<WebView>(R.id.web2)

        tvf.webViewClient = WebViewClient()


        val url = arguments?.getString("url")
        println("shhhss"+url)
        if (url != null) {
            tvf.loadUrl(url)
        }
        tvf.getSettings().setJavaScriptEnabled(true)
        tvf.getSettings().setLoadsImagesAutomatically(true)
        tvf.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY)

        tvf.getSettings().setPluginState(WebSettings.PluginState.ON)
        tvf.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        tvf.settings.cacheMode = WebSettings.LOAD_DEFAULT
        tvf.settings.allowContentAccess = true
        tvf.settings.domStorageEnabled = true
        tvf.settings.userAgentString = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3"

//




        return views
    }


}