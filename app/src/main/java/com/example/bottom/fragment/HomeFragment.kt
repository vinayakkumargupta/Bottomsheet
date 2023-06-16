package com.example.bottom.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebSettings.PluginState
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.bottom.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewsw = inflater.inflate(R.layout.fragment_home, container, false)
        BottomSheetDialogFragment.STYLE_NORMAL
        val tvf = viewsw.findViewById<WebView>(R.id.web)
        tvf.settings.javaScriptEnabled = true
        tvf.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    val bundle = Bundle()
                    bundle.putString("url", url)

                    val bottomDialogFragment = WebviewFragment()
                    bottomDialogFragment.arguments = bundle

                    bottomDialogFragment.show(childFragmentManager, "WebviewFragment")


                    return true
                }
                return false
            }

        }

        tvf.getSettings().setJavaScriptEnabled(true)
        tvf.getSettings().setLoadsImagesAutomatically(true)
        tvf.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY)

        tvf.getSettings().setPluginState(PluginState.ON)
        tvf.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        tvf.settings.cacheMode = WebSettings.LOAD_DEFAULT
        tvf.settings.allowContentAccess = true
        tvf.settings.domStorageEnabled = true
        tvf.settings.userAgentString = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3"


        tvf.loadUrl("https://m.redbus.in/ryde/?referrer=apna/")


        return viewsw
    }

}









//        tvf.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                // Open links in new activity
//                val bundle = Bundle()
//                bundle.putString("url", url)
//
//                val bottomDialogFragment = WebviewFragment()
//                bottomDialogFragment.arguments = bundle
//
//                bottomDialogFragment.show(childFragmentManager, "WebviewFragment")
//                return true
//            }
//        }
//        tvf.loadUrl("https://google.com/")
//        return viewsw














//        tvf.loadUrl("https://google.com/")
//
//        tvf.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//
//                // Open links in new activity
//                val bundle = Bundle()
//                bundle.putString("url", url)
//
//                val bottomDialogFragment = WebviewFragment()
//                bottomDialogFragment.arguments = bundle
//                return true
//            }
//        }
//        return viewsw
//    }



