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
			"���ڵĻ����ѷֿ���",
			"����ĸ�������Ʈ",
			"����Ԥ������ҹ����������",
			"��������ţ�",
			"���굽Խ��Խ���á�",
			"���굽�ˣ�����ף���㡣ף������Բ���������������",
			"���ʸ߷岻�¡����ܶ���ʤ�죬��ҵ��!"
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smslist);
		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(new ArrayAdapter<String>(this, R.layout.item, smsMessages));
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			//��listview����Ŀ�������ʱ����õķ���
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				System.out.println("position:"+position);
				String message = smsMessages[position];
				//�ѵ�ǰ���������,���ظ������ҵĽ���.
				Intent data = new Intent();
				data.putExtra("message", message);
				setResult(0, data);
				//�ѵ�ǰ����ر�
				finish();
			}
		});
	}
}
