package com.andlp.skin;

import com.andlp.skin.skin.Attr_Toolbar;
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
        SkinConfig.setCanChangeFont(true);
        SkinConfig.setDebug(true);
        SkinConfig.addSupportAttr("titleTextColor", new Attr_Toolbar());//toolbar的字体颜色换色

//        SkinConfig.addSupportAttr("tabLayoutIndicator", new TabLayoutIndicatorAttr());
//        SkinConfig.addSupportAttr("button", new RadioButtonAttr());//支持换肤的属性
        SkinConfig.enableGlobalSkinApply();

    }
}