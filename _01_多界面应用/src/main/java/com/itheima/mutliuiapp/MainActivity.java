package com.itheima.mutliuiapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //��ת��02����
    public void click(View view){
    	Intent intent = new Intent();//��ͼ����
    	intent.setClass(this, SecondActivity.class);
    	startActivity(intent);
    }
}
