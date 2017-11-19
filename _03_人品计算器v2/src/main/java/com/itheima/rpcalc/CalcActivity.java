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
			Toast.makeText(this, "姓名不能为空", 0).show();
			return;
		}
		
		//把字符串的数据传递给第三个界面
		Intent intent = new Intent(this, ResultActivity.class);
		intent.putExtra("name", name);//在意图对象里面携带要传递的字符串数据
		intent.putExtra("sex", rg_sex.getCheckedRadioButtonId());
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.logo);
        intent.putExtra("bitmap", bitmap);
		startActivity(intent);
	}
}
