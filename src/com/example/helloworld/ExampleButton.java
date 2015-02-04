package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class ExampleButton extends Activity{
	Button button1;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_button);
	
		addListenerOnButton();
	}

	public void addListenerOnButton() {
		// TODO Auto-generated method stub
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent browserIntent = 
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
		    startActivity(browserIntent);
			}
			
		});
	}

}
