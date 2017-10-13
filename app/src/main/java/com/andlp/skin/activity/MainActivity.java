package com.andlp.skin.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.andlp.skin.R;

import solid.ren.skinlibrary.base.SkinBaseActivity;
import solid.ren.skinlibrary.loader.SkinManager;

public class MainActivity extends SkinBaseActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {


        if (Build.VERSION.SDK_INT >= 21) {
                final Window window = getWindow();
                // Method and constants not available on all SDKs but we want to be able to compile this code with any SDK
                //SDK19:WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                window.clearFlags(0x04000000);      //SDK21:WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.addFlags(0x80000000);
                try {
                    // Using reflection makes sure any 5.0+ device will work without having to compile with SDK level 21
                    window.getClass().getDeclaredMethod("setStatusBarColor", int.class).invoke(window, Color.parseColor("#00000000"));
                } catch (IllegalArgumentException ignore) {
                    Log.e("skin", "Invalid hexString argument, use f.i. '#999999'");
                } catch (Exception ignore) {
                    // this should not happen, only in case Android removes this method in a version > 21
                    Log.w("skin", "Method window.setStatusBarColor not found for SDK level " + Build.VERSION.SDK_INT);
                }
        }


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
