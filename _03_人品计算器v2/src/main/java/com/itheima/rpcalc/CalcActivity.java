package com.itheima.rpcalc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends Activity {
	private EditText et_name;
	private RadioGroup rg_sex;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		et_name= (EditText) findViewById(R.id.et_name);
		rg_sex = (RadioGroup) findViewById(R.id.rg_sex);
	}
	
	public void calc(View view){
		String name = et_name.getText().toString().trim();
		if(TextUtils.isEmpty(name)){
			Toast.makeText(this, "��������Ϊ��", 0).show();
			return;
		}
		
		//���ַ��������ݴ��ݸ�����������
		Intent intent = new Intent(this, ResultActivity.class);
		intent.putExtra("name", name);//����ͼ��������Я��Ҫ���ݵ��ַ�������
		intent.putExtra("sex", rg_sex.getCheckedRadioButtonId());
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.logo);
        intent.putExtra("bitmap", bitmap);
		startActivity(intent);
	}
}
