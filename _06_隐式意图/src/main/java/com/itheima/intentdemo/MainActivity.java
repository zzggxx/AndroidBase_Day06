package com.itheima.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Intent intent = new Intent();
        //action 动作
        //泡茶 泡妞
        intent.setAction("com.itheima.intentdemo.XXXX");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
//		intent.setData(Uri.parse("itheima://afaf"));
//		intent.setType("text/plain");
        intent.setDataAndType(Uri.parse("itheima://afaf"), "text/plain");
        intent.putExtra("body", "我是隐式意图携带过来的数据");

        PackageManager packageManager = getPackageManager();
        ResolveInfo resolveInfo = packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
        if (null != resolveInfo) {
            startActivity(intent);
        }

    }

}
