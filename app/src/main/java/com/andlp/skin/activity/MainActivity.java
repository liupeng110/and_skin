package com.andlp.skin.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andlp.skin.R;

import solid.ren.skinlibrary.base.SkinBaseActivity;
import solid.ren.skinlibrary.loader.SkinManager;

public class MainActivity extends SkinBaseActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        map.put("时尚细黑", "SSXHZT.ttf");
//        map.put("大梁体", "DLTZT.ttf");
//        map.put("微软雅黑", "WRYHZT.ttf");

        Button btn_neght =(Button)findViewById(R.id.btn_neght);
        btn_neght.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                SkinManager.getInstance().NightMode();//夜间
//                SkinManager.getInstance().loadFont("DLTZT.ttf");
            }
        });

        Button btn_default=(Button)findViewById(R.id.btn_default);
        btn_default.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                SkinManager.getInstance().restoreDefaultTheme();//恢复默认
                SkinManager.getInstance().loadFont(null);
            }
        });





    }
}
