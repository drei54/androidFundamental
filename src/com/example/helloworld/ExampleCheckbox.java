package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ExampleCheckbox extends Activity{
	CheckBox chkIos, chkAndroid, chkWindows;
	Button btnDisplay;
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_checkbox);

		addListenerOnCkhIos();
		addListenerOnButton();
	}

	private void addListenerOnCkhIos() {
		// TODO Auto-generated method stub
		chkIos = (CheckBox) findViewById(R.id.chkIos);
		chkIos.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((CheckBox) v).isChecked()){
					Toast.makeText(ExampleCheckbox.this, "You Check Iphone", Toast.LENGTH_LONG).show();
					
				}
			}
			
		});
	}

	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		chkIos = (CheckBox) findViewById(R.id.chkIos);
		chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
		chkWindows = (CheckBox) findViewById(R.id.chkWindows);
		
		btnDisplay = (Button) findViewById(R.id.btnDisplay);
		btnDisplay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append("Iphone check : ").append(chkIos.isChecked());
				stringBuffer.append("\nAndroid check : ").append(chkAndroid.isChecked());
				stringBuffer.append("\nAndroid check : ").append(chkWindows.isChecked());
				Toast.makeText(ExampleCheckbox.this, stringBuffer.toString(), Toast.LENGTH_LONG).show();
			}
		});
	}


}
