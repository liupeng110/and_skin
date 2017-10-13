package com.andlp.skin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.andlp.skin.util.CrashUtil;

import solid.ren.skinlibrary.SkinConfig;
import solid.ren.skinlibrary.base.SkinBaseApplication;

/**
 * 717219917@qq.com  2017/10/13 14:50
 */

public class App extends SkinBaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashUtil.getInstance().init(this);
        SkinConfig.setCanChangeStatusColor(true);
//        SkinConfig.setCanChangeFont(true);
//        SkinConfig.setDebug(true);
//        SkinConfig.addSupportAttr("tabLayoutIndicator", new TabLayoutIndicatorAttr());
        SkinConfig.enableGlobalSkinApply();

        this.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
//                if (SkinConfig.isDefaultSkin(activity)){
//                    activity.setTheme(R.style.AppTheme2);
//                }else {
//                    activity.setTheme(R.style.AppTheme);
//                }
//                SkinConfig.isInNightMode(activity);


            }
            @Override public void onActivityStarted(Activity activity) {  }
            @Override  public void onActivityResumed(Activity activity) {  }
            @Override public void onActivityPaused(Activity activity) { }
            @Override public void onActivityStopped(Activity activity) { }
            @Override public void onActivitySaveInstanceState(Activity activity, Bundle outState) { }
            @Override  public void onActivityDestroyed(Activity activity) {  }
        });
    }



}