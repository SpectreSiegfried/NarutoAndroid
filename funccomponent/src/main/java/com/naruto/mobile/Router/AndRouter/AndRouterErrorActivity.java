package com.naruto.mobile.Router.AndRouter;

import android.app.Activity;
import android.os.Bundle;

import com.naruto.mobile.R;
import com.naruto.mobile.RouterMap;


/**
 */
@RouterMap("activity://error")
public class AndRouterErrorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.and_router_activity_error);

    }
}
