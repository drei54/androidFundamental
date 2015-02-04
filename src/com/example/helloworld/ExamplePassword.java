package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExamplePassword extends Activity{
	Button button;
	EditText editText;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_password);
		addListenerOnButton();
	}

	 public void addListenerOnButton() {
		 
			editText = (EditText) findViewById(R.id.txtPassword);	
			button = (Button) findViewById(R.id.btnSubmit);
		 
			button.setOnClickListener(new OnClickListener() {
		 
				@Override
				public void onClick(View v) {
		 
				  Toast.makeText(ExamplePassword.this, editText.getText(),Toast.LENGTH_SHORT).show();
		 
				}
		 
			});
		 
		  }

}
