package com.gc.math;

import android.content.Intent;

import org.apache.cordova.*;
import org.json.JSONArray;

import android.util.Log;

import com.gc.math.Math;


/**
 * Created by Navas on 11/3/18.
 */

public class PluginMATH extends CordovaPlugin {

    CallbackContext callbackContext;

    @Override
    public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        this.callbackContext = callbackContext;

        String result = "";

        switch (action) {
            case "+":
                result = Math.add(args.getInt(0),args.getInt(1)) + "";
                break;
            case "-":
                result = Math.substract(args.getInt(0),args.getInt(1)) + "";
                break;
            case "*":
                result = Math.multiply(args.getInt(0),args.getInt(1)) + "";
                break;
            case "/":
                result = Math.divide(args.getInt(0),args.getInt(1)) + "";
                break;
            default:
                PluginResult pluginResult = new PluginResult(PluginResult.Status.ERROR, "WRONG OPERATION");
                pluginResult.setKeepCallback(true);
                callbackContext.sendPluginResult(pluginResult);
                return true;
        }

        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, result);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);

        return true;
    }

}
