package com.andlp.skin.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.andlp.skin.R;

import solid.ren.skinlibrary.base.SkinBaseActivity;
import solid.ren.skinlibrary.loader.SkinManager;

public class MainActivity extends SkinBaseActivity {
    private Toolbar toolbar;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("我是Toolbar");
//        setSupportActionBar(toolbar);
//        dynamicAddView(toolbar,  "background"   , R.color.colorPrimaryDark);//背景
        dynamicAddView(toolbar,  "titleTextColor" , R.color.textcolor);              //字体颜色


        Button btn_neght =(Button)findViewById(R.id.btn_neght);
        btn_neght.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                SkinManager.getInstance().NightMode();//夜间
            }
        });

        Button btn_default=(Button)findViewById(R.id.btn_default);
        btn_default.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                SkinManager.getInstance().restoreDefaultTheme();//恢复默认
            }
        });



    }
}
