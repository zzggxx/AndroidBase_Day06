package com.itheima.kof;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	private ImageView iv_people;
	private ProgressBar pb;
	private int blood = 100;
	private ImageView iv_boss;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("oncreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv_people = (ImageView) findViewById(R.id.iv_people);
		iv_boss = (ImageView) findViewById(R.id.iv_boss);
		pb = (ProgressBar) findViewById(R.id.progressBar1);
		pb.setProgress(100);
	}
	@Override
	protected void onDestroy() {
		System.out.println("ondestory");
		super.onDestroy();
	}
	@Override
	protected void onStart() {
		System.out.println("onStart");
		super.onStart();
	}
	@Override
	protected void onStop() {
		System.out.println("onStop");
		super.onStop();
	}
	@Override
	protected void onResume() {
		System.out.println("onResume");
		super.onResume();
	}
	@Override
	protected void onPause() {
		System.out.println("onPause");
		super.onPause();
	}

	public void qq(View view){
		iv_people.setImageResource(R.drawable.qq);
		blood-=5;
		pb.setProgress(blood);
		if(blood<=0){
			iv_boss.setImageResource(R.drawable.die);
		}
	}
	
	public void zj(View view){
		iv_people.setImageResource(R.drawable.zj);
		blood-=8;
		pb.setProgress(blood);
		if(blood<=0){
			iv_boss.setImageResource(R.drawable.die);
		}
	}
	
	public void zq(View view){
		iv_people.setImageResource(R.drawable.zq);
		blood-=7;
		pb.setProgress(blood);
		if(blood<=0){
			iv_boss.setImageResource(R.drawable.die);
		}
	}
}
