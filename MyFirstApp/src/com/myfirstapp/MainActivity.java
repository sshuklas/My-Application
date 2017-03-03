package com.myfirstapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText edittext;
	Button btn, btn2, btn3;
	TextView tv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //innitialize
        edittext = (EditText) findViewById(R.id.mytext);
        btn = (Button) findViewById(R.id.show);
        btn2 = (Button) findViewById(R.id.show2);
        btn3 = (Button) findViewById(R.id.show3);
        
        tv = (TextView) findViewById(R.id.display);
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String str = edittext.getText().toString();
				tv.setText(str);
			}
		});
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
   			@Override
   			public void onClick(View arg0) {
   				// TODO Auto-generated method stub
   				String str = edittext.getText().toString();
   				new AlertDialog.Builder(MainActivity.this).setTitle("Your text").setMessage("Your Message is: " + str).show();
   			}
   		});
           
        btn3.setOnClickListener(new View.OnClickListener() {
			
   			@Override
   			public void onClick(View arg0) {
   				// TODO Auto-generated method stub
   				String str = edittext.getText().toString();
   				Toast.makeText(MainActivity.this, str, 1000).show();
   			}
   		});
           
       }

    
}
