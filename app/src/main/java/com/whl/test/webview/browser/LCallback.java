package com.whl.test.webview.browser;


import org.json.JSONObject;

/**
 * JS 回调
 * Created by 1 on 2015/9/28.
 */
public interface LCallback {
    /**
     * 分发结果
     */
    void confirm(JSONObject result);
}
