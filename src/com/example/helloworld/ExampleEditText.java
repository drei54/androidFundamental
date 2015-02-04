package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;

public class ExampleEditText extends Activity{

	private EditText editText;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_edit_text);
		
		addKeyListener();
	}

	private void addKeyListener() {
		// TODO Auto-generated method stub
		editText = (EditText) findViewById(R.id.edittext1);
		editText.setOnKeyListener(new OnKeyListener(){

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				
				//if keydown enter is press
				if((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
					Toast.makeText(ExampleEditText.this, editText.getText(), Toast.LENGTH_LONG).show();
					return true;
				}else if((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_9)){
					Toast.makeText(ExampleEditText.this, "Number 9 is Pressed", Toast.LENGTH_LONG).show();
				}
				
				return false;
				
			}
			
		});
	}
}
