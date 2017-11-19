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
			"春节的欢聚已分开，鞭炮声声已渐远。各自奔往工作地，踌躇满志加紧干。同事见面问新年，祝福的话语说不完。亲人的嘱托在耳畔，勤奋工作莫迟延。愿你年后心情好，事业更上一层楼！",
			"欢快的歌声尽情飘，温暖的春风暖心潮。万千的喜气多热闹，吉祥的日子要来到。发条短信问个好，财源广进吉星照。万事顺利开怀笑，羊年幸福乐逍遥。",
			"心情预报：今夜到明早想你，预计下午转为很想你，受此情绪影响，傍晚将转为暴想，此类天气将持续到见你为止。",
			"世界如此忙碌，用心的人就会幸福;想你的脸，心里就温暖;想你的嘴，笑容跟着灿烂！随着新年的到来，关心你的人要跟你说声：新年快乐！",
			"羊年到，身体很重要，应酬拒不掉，少喝酒多吃菜，表示心意就算了;祝愿老板身体好，越过越开心，财富滚滚来，生活越来越美好。",
			"新年到了，衷心祝福你。祝你年年圆满如意，月月事事顺心，日日喜悦无忧，时时高兴欢喜，刻刻充满朝气！",
			"勇攀高峰不怕险，开辟新径铸辉煌。勤奋创业走新道，学做银羊敢闯关。羊年要走阳关道，排除万难创业路。艰苦奋斗能胜天，幸福生活如意添。愿你羊年心想事业成!"
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
