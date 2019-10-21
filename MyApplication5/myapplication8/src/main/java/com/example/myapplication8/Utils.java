package com.example.myapplication8;

import android.content.Context;
import android.net.wifi.aware.WifiAwareManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Utils {
    public static int dip2Px(Context context,double dpValue){

        float scale=context.getResources().getDisplayMetrics().density;
        int t= (int) (dpValue*scale+0.5);
        return t;
    }

    public static int px2Dip(Context context,double pxValue){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int) (pxValue/scale+0.5);
    }

    public static int getScreenWidth(Context context){
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.widthPixels;
    }
    public static int getScreenHeight(Context context){
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.heightPixels;
    }
    public static float getScreenDensity(Context context){
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.density;
    }

}
