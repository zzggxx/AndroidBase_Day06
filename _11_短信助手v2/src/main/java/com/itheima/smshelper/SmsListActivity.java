package com.itheima.smshelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SmsListActivity extends Activity {
	private ListView lv;
	private String[] smsMessages={
			"春节的欢聚已分开！",
			"欢快的歌声尽情飘",
			"心情预报：今夜到明早想你",
			"世界如此着！",
			"羊年到越来越美好。",
			"新年到了，衷心祝福你。祝你年年圆满如意充满朝气！",
			"勇攀高峰不怕。艰苦奋斗能胜天，事业成!"
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smslist);
		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(new ArrayAdapter<String>(this, R.layout.item, smsMessages));
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			//当listview的条目被点击的时候调用的方法
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				System.out.println("position:"+position);
				String message = smsMessages[position];
				//把当前界面的数据,返回给开启我的界面.
				Intent data = new Intent();
				data.putExtra("message", message);
				setResult(0, data);
				//把当前界面关闭
				finish();
			}
		});
	}
}
