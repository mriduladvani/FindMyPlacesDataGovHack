package com.crypticducs000webhost.datagovhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main3Activity extends AppCompatActivity {

    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mywebview = (WebView)findViewById(R.id.webview1);
        WebSettings websettings =mywebview.getSettings();
        websettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("http://crypticducs.000webhostapp.com");
        mywebview.setWebViewClient(new WebViewClient());

    }

    public void onBackPressed(){
        if(mywebview.canGoBack()){
            mywebview.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
