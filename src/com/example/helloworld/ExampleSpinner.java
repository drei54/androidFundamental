package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ExampleSpinner extends Activity{

	Spinner spinner1, spinner2;
	Button btnSubmit;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_spinner);
		
		addItemOnSpinner2();
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();
		
	}


	public void addItemOnSpinner2() {
		
		// TODO Auto-generated method stub
				spinner2 = (Spinner) findViewById(R.id.spinner2);
				List<String> list = new ArrayList<String>();
				list.add("list 1");
				list.add("list 2");
				list.add("list 3");
				ArrayAdapter<String> dataAdapter  = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
				spinner2.setAdapter(dataAdapter);
	}
	
	public void addListenerOnSpinnerItemSelection(){
	
		// TODO Auto-generated method stub
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}
	
	public void addListenerOnButton() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
	 
		btnSubmit.setOnClickListener(new OnClickListener() {
	 
		  @Override
		  public void onClick(View v) {
	 
		    Toast.makeText(ExampleSpinner.this,
			"OnClickListener : " + 
	                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) + 
	                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()),
				Toast.LENGTH_SHORT).show();
		  }
	 
		});
	}

}
