/* ����� �������Ʈ����
 * 20052512 �����
 */
package com.example.buttoncallback;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonActivity extends Activity {

	TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button);

		Button btn1 = (Button)findViewById(R.id.button1);
		Button btn2 = (Button)findViewById(R.id.button2);
		Button btn3 = (Button)findViewById(R.id.button3);
		text = (TextView)findViewById(R.id.textView);

		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(listener);
		btn3.setOnClickListener(listener);
		//	������ ��ư�� ���� ������  listener�� ȣ��ȴ�.
	}

	Button.OnClickListener listener = new Button.OnClickListener(){
		//	listner�� ����� ��ư�� Ŭ������ �� ����Ǵ� �ݹ� �޼ҵ��̴�.
		@Override
		public void onClick(View v) {
			String btnClick = null;
			
			//	v�κ��� Ŭ���� ��ư�� ������ �о�� ��, ȭ�鿡 ������ ������ ������ btnClick������ �ִ´�.
			switch (v.getId()) {
			case R.id.button1:
				btnClick = "Button 1 ���õǾ����ϴ�.";
				break;
			case R.id.button2:
				btnClick = "Button 2 ���õǾ����ϴ�.";
				break;
			case R.id.button3:
				btnClick = "Button 3 ���õǾ����ϴ�.";
				break;
			}	
			text.setText(btnClick);					
			//	btnClick�� ��� ������ TextView�� �Ἥ ȭ�鿡 �����ش�.
		}
	};
}
