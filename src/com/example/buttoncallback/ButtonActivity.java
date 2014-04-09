/* 모바일 응용소프트웨어
 * 20052512 김재곤
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
		//	각각의 버튼을 누를 때마다  listener가 호출된다.
	}

	Button.OnClickListener listener = new Button.OnClickListener(){
		//	listner를 등록한 버튼을 클릭했을 때 실행되는 콜백 메소드이다.
		@Override
		public void onClick(View v) {
			String btnClick = null;
			
			//	v로부터 클릭된 버튼의 정보를 읽어온 후, 화면에 보여줄 각각의 문장을 btnClick변수에 넣는다.
			switch (v.getId()) {
			case R.id.button1:
				btnClick = "Button 1 선택되었습니다.";
				break;
			case R.id.button2:
				btnClick = "Button 2 선택되었습니다.";
				break;
			case R.id.button3:
				btnClick = "Button 3 선택되었습니다.";
				break;
			}	
			text.setText(btnClick);					
			//	btnClick에 담긴 문장을 TextView에 써서 화면에 보여준다.
		}
	};
}
