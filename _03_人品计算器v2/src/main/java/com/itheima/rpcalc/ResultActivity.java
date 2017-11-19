package com.itheima.rpcalc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

public class ResultActivity extends Activity {
	TextView tv_result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);			//注意此处的文件获得的是layout
		tv_result = (TextView) findViewById(R.id.tv_result);
		
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		Bitmap bitmap = intent.getParcelableExtra("bitmap");
		ImageView iv = (ImageView) findViewById(R.id.iv);
		iv.setImageBitmap(bitmap);
		int rb_id = intent.getIntExtra("sex", R.id.rb_male);
		
		byte[] result = null;
		try {
			switch (rb_id) {									//是在gen下的R.out中进行寻找的.
			case R.id.rb_male://男性
				result = name.getBytes();
				break;

			case R.id.rb_female://女性
				result = name.getBytes("gb2312");
				break;
				
			case R.id.rb_unknow://未知性别:
				result = name.getBytes("iso-8859-1");
				break;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		int total = 0;
		for(byte b: result){
			int number = b&0xff; //-128~127
			total += Math.abs(number);
		}
		int rp = total%100;
		String info = null;
		if(rp>90){
			info = ("姓名:"+name+"\n人品为:"+rp+"\n评价:您的人品很好,祖坟冒青烟");
		}else if(rp>60){
			info = ("姓名:"+name+"\n人品为:"+rp+"\n评价:您的人品还不错,继续保持");
		}else if(rp>30){
			info = ("姓名:"+name+"\n人品为:"+rp+"\n评价:您的人品为渣...");
		}else{
			info = ("姓名:"+name+"\n人品为:"+rp+"\n评价:我的错,不该跟你提人品.");
		}
		
		
		tv_result.setText(info);
	}
}
