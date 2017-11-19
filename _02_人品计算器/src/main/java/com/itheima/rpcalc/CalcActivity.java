package com.itheima.rpcalc;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends Activity {
	private EditText et_name;
	private TextView tv_result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		et_name= (EditText) findViewById(R.id.et_name);
		tv_result = (TextView) findViewById(R.id.tv_result);
	}
	
	public void calc(View view){
		String name = et_name.getText().toString().trim();
		if(TextUtils.isEmpty(name)){
			Toast.makeText(this, "��������Ϊ��", 0).show();
			return;
		}
		byte[] result = name.getBytes();
		int total = 0;
		for(byte b: result){
			int number = b&0xff; //-128~127
			total += Math.abs(number);
		}
		int rp = total%100;
		if(rp>90){
			tv_result.setText("����:"+name+"\n��ƷΪ:"+rp+"\n����:������Ʒ�ܺ�,���ð����");
		}else if(rp>60){
			tv_result.setText("����:"+name+"\n��ƷΪ:"+rp+"\n����:������Ʒ������,��������");
		}else if(rp>30){
			tv_result.setText("����:"+name+"\n��ƷΪ:"+rp+"\n����:������ƷΪ��...");
		}else{
			tv_result.setText("����:"+name+"\n��ƷΪ:"+rp+"\n����:�ҵĴ�,���ø�������Ʒ.");
		}
	}
}
