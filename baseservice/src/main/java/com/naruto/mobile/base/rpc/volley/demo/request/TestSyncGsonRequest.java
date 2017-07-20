package com.naruto.mobile.base.rpc.volley.demo.request;

import android.content.Context;

import com.google.gson.Gson;
import com.naruto.mobile.base.rpc.volley.BaseHost;
import com.naruto.mobile.base.rpc.volley.GsonSyncRequest;
import com.naruto.mobile.base.rpc.volley.Task1Host;
import com.naruto.mobile.base.rpc.volley.VolleySingleton;
import com.naruto.mobile.base.rpc.volley.demo.response.TestGsonResponse;

public class TestSyncGsonRequest extends GsonSyncRequest<TestGsonResponse> {


    public TestSyncGsonRequest(Context context) {
        super(context, Method.GET, "api/login/queryTest", TestGsonResponse.class);
    }

    @Override
    protected void putParams() {
        //示例
        putParams("key1", "key1Value").putParams("key2", "key2Value");
    }

    @Override
    protected BaseHost getHost() {
        return new Task1Host();
    }

    @Override
    protected Gson getGson() {
        return new Gson();
    }

    @Override
    protected boolean isSuccess(TestGsonResponse response) {
        return super.isSuccess(response);
    }

    //对外暴露的调起接口
    public void execute() {
        VolleySingleton.getInstance(mContext).addToRequestQueue(this);
    }
}