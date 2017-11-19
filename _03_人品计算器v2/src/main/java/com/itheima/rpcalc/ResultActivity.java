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
		setContentView(R.layout.activity_result);			//ע��˴����ļ���õ���layout
		tv_result = (TextView) findViewById(R.id.tv_result);
		
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		Bitmap bitmap = intent.getParcelableExtra("bitmap");
		ImageView iv = (ImageView) findViewById(R.id.iv);
		iv.setImageBitmap(bitmap);
		int rb_id = intent.getIntExtra("sex", R.id.rb_male);
		
		byte[] result = null;
		try {
			switch (rb_id) {									//����gen�µ�R.out�н���Ѱ�ҵ�.
			case R.id.rb_male://����
				result = name.getBytes();
				break;

			case R.id.rb_female://Ů��
				result = name.getBytes("gb2312");
				break;
				
			case R.id.rb_unknow://δ֪�Ա�:
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
			info = ("����:"+name+"\n��ƷΪ:"+rp+"\n����:������Ʒ�ܺ�,���ð����");
		}else if(rp>60){
			info = ("����:"+name+"\n��ƷΪ:"+rp+"\n����:������Ʒ������,��������");
		}else if(rp>30){
			info = ("����:"+name+"\n��ƷΪ:"+rp+"\n����:������ƷΪ��...");
		}else{
			info = ("����:"+name+"\n��ƷΪ:"+rp+"\n����:�ҵĴ�,���ø�������Ʒ.");
		}
		
		
		tv_result.setText(info);
	}
}
