package com.example.helloworld;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AppActivity extends Activity{
	Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		addListenerOnButton();	
	}

	public void addListenerOnButton() {
		 
		final Context context = this;
 
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() { 
			@Override
			public void onClick(View arg0) {
				Log.d("LOGGER", "Button 1 Intent");
			    Intent intent = new Intent(context, App2Activity.class);
                            startActivity(intent);   
			}
		});
 
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() { 
			@Override
			public void onClick(View arg0) {
				Log.d("LOGGER", "Button 2 Wrap Content");
			    Intent intent = new Intent(context, WrapContent.class);
                            startActivity(intent);   
			}
		});
		
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() { 
			@Override
			public void onClick(View arg0) {
				Log.d("LOGGER", "Button 3 Fill Parente");
			    Intent intent = new Intent(context, FillParent.class);
                            startActivity(intent);   
			}
		});
		
		button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, ExampleButton.class);
				startActivity(intent);
			}
		});
		
		button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, ExampleEditText.class);
				startActivity(intent);
			}
		});
		
		button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, ExamplePassword.class);
				startActivity(intent);
			}
		});
		
		button7 = (Button) findViewById(R.id.button7);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, ExampleCheckbox.class);
				startActivity(intent);
			}
		});
		
		button8 = (Button) findViewById(R.id.button8);
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, ExampleRadio.class);
				startActivity(intent);
			}
		});
		
		button9 = (Button) findViewById(R.id.button9);
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, ExampleSpinner.class);
				startActivity(intent);
			}
		});
	}
}
