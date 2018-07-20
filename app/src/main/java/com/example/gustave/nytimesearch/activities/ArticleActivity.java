package com.example.gustave.nytimesearch.activities;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toolbar;

import com.example.gustave.nytimesearch.R;

public class ArticleActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String url = getIntent().getStringExtra("url");

        WebView webView = (WebView) findViewById(R.id.wvArticle);
        webView.loadUrl(url);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
