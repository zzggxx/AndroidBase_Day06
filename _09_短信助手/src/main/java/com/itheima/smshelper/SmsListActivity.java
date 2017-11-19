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
			"���ڵĻ����ѷֿ������������ѽ�Զ�����Ա��������أ������־�ӽ��ɡ�ͬ�¼��������꣬ף���Ļ���˵���ꡣ���˵������ڶ��ϣ��ڷܹ���Ī���ӡ�Ը���������ã���ҵ����һ��¥��",
			"����ĸ�������Ʈ����ů�Ĵ���ů�ĳ�����ǧ��ϲ�������֣����������Ҫ���������������ʸ��ã���Դ��������ա�����˳������Ц�������Ҹ�����ң��",
			"����Ԥ������ҹ���������㣬Ԥ������תΪ�����㣬�ܴ�����Ӱ�죬����תΪ���룬��������������������Ϊֹ��",
			"�������æµ�����ĵ��˾ͻ��Ҹ�;����������������ů;������죬Ц�ݸ��Ų��ã���������ĵ��������������Ҫ����˵����������֣�",
			"���굽���������Ҫ��Ӧ��ܲ������ٺȾƶ�Բˣ���ʾ���������;ףԸ�ϰ�����ã�Խ��Խ���ģ��Ƹ�������������Խ��Խ���á�",
			"���굽�ˣ�����ף���㡣ף������Բ�����⣬��������˳�ģ�����ϲ�����ǣ�ʱʱ���˻�ϲ���̳̿���������",
			"���ʸ߷岻���գ������¾����Ի͡��ڷܴ�ҵ���µ���ѧ������Ҵ��ء�����Ҫ�����ص����ų����Ѵ�ҵ·�����ܶ���ʤ�죬�Ҹ�����������Ը������������ҵ��!"
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
