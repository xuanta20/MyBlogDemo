package com.lovejjfg.blogdemo.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lovejjfg.blogdemo.R;
import com.lovejjfg.blogdemo.base.BaseSlideFinishActivity;

/**
 * Created by 张俊 on 2016/1/17.
 */
public class BrowserActivity2 extends BaseSlideFinishActivity {
    // TODO: 2016-05-25 如何优美的展示具体内容
    @Override
    public View initView(Bundle savedInstanceState) {
        View v = LayoutInflater.from(this).inflate(R.layout.activity_browser2, null);
        final String host = getIntent().getStringExtra("HOST");
        final WebView mWeb = (WebView) v.findViewById(R.id.web);
        mWeb.getSettings().setJavaScriptEnabled(true);
        mWeb.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        mWeb.post(new Runnable() {
            @Override
            public void run() {
//                mWeb.loadDataWithBaseURL(Constants.BASE_URL, host, Constants.MIME_TYPE, Constants.ENCODING, Constants.FAIL_URL);
                mWeb.loadUrl("http://svpano.oss-cn-hangzhou.aliyuncs.com/test/pinan/20066_20160527090324857/index.html?from=singlemessage&isappinstalled=0");

            }
        });

        return v;
    }


    @Override
    protected void performViewClick(View v) {

    }
}
