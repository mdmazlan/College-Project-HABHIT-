package com.www.habhit.edu.bd;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class maps extends AppCompatActivity {

    WebView webView;
    ProgressDialog progressDialog = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        webView = findViewById(R.id.maps);

        webView.loadUrl("https://goo.gl/maps/2jPv8uqAa762");

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebViewClient(new WebViewClient(){


            @Override

            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                progressDialog = new ProgressDialog(maps.this);
                progressDialog.setTitle("Please Wait...");
                progressDialog.setMessage("Loading...");
                progressDialog.show();
                progressDialog.setCancelable(true);
                super.onPageStarted(view, url, favicon); }


            @Override

            public void onPageFinished(WebView view, String url) {
                progressDialog.cancel();
                super.onPageFinished(view, url);
            }
        });
    }
}
