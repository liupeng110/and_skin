package com.andlp.skin.skin;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.andlp.skin.R;

import solid.ren.skinlibrary.attr.base.SkinAttr;
import solid.ren.skinlibrary.utils.SkinResourcesUtils;

/**
 * 717219917@qq.com  2017/10/13 15:54
 */
public class Attr_Toolbar extends SkinAttr {
    @Override
    protected void applySkin(View view) {
        if (view instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) view;
            Log.i("skin","进入applyskin属于toolbar:"+toolbar.getTitle());

            if (isColor()) {
                int color = SkinResourcesUtils.getColor(attrValueRefId);
                Log.i("skin","进入applyskin颜色:"+color);
                toolbar.setTitleTextColor(color);
                Log.i("skin","进入applyskin颜色0:"+attrValueTypeName);
            }


        }
    }
}