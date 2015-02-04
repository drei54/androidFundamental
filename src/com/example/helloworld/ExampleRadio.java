package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class ExampleRadio extends Activity{
	Button btnDisplay;
	RadioButton radioMale, radioFemale;
	RadioGroup radioSex;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_radio);
		
		addListenerOnButton();
	}

	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		radioSex = (RadioGroup) findViewById(R.id.radioSex);
		btnDisplay = (Button) findViewById(R.id.btnDisplay);
	
		btnDisplay.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int seledtedId = radioSex.getCheckedRadioButtonId();
				RadioButton radioMale = (RadioButton) findViewById(seledtedId);
				Toast.makeText(ExampleRadio.this, radioMale.getText(), Toast.LENGTH_LONG).show();
			}
		});
	}

}
