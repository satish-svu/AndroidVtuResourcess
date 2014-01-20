package com.example.vturesources;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton bqp,bppt,bproj,bpdf,bupload;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bqp = (ImageButton)findViewById(R.id.imageButton1);
		bppt = (ImageButton)findViewById(R.id.imageButton2);
		bproj = (ImageButton)findViewById(R.id.imageButton3);
		bpdf = (ImageButton)findViewById(R.id.imageButton4);
		bupload = (ImageButton)findViewById(R.id.imageButton5);
		
		bqp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				Intent i = new Intent("com.example.vturesources.qp");
				startActivity(i);
				
				
			}
		});
		
		
		bppt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				Intent i = new Intent("com.example.vturesources.ppt");
				startActivity(i);
				
			}
		});
		
		
		bproj.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0)
			{
				Intent i = new Intent("com.example.vturesources.projects");
				startActivity(i);
				
			}
		});
		
		
		
		bpdf.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				Intent i = new Intent("com.example.vturesources.pdf");
				startActivity(i);
				
			}
		});
		
		
		
    bupload.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
				Intent i = new Intent("com.example.vturesources.upload");
				startActivity(i);
				
				
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
