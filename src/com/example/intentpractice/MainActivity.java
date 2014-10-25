package com.example.intentpractice;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }


    private void init() {
		btnSecond = (Button) findViewById(R.id.btnSecond);
		btnSecond.setOnClickListener(this);
	}


	@Override
	public void onClick(View arg0) {
		/*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
		intent.putExtra("message", "Hello second activity");
		startActivity(intent);*/
		
		// Implicit Intent
		/*Intent viewIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
		startActivity(viewIntent);*/
		
		Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:555-2345"));
		startActivity(callIntent);
	}


}
