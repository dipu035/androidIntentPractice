package com.example.intentpractice;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		init();
	}

	private void init() {
		
		String message = getIntent().getStringExtra("message");
		if(!message.isEmpty())
			( (TextView) findViewById(R.id.tvSecondActivity) ).setText(message);
	}
}
