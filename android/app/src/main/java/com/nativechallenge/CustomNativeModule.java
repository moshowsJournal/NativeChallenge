package com.nativechallenge; // replace com.your-app-name with your app’s name
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class CustomNativeModule extends ReactContextBaseJavaModule{
    private static ReactApplicationContext reactContext;
    CustomNativeModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "CustomNativeModule";
    }

    @ReactMethod
    public void createCustomEvent(String name, String location, Promise promise) {
        try {
            WritableMap params = Arguments.createMap();
            params.putString("host_name", "Moshood Oseni");
            promise.resolve(params);
        } catch(Exception e) {
            promise.reject("Create Event Error", e);
        }
    }
}