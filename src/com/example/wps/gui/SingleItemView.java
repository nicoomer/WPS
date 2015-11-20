package com.example.wps.gui;

import com.example.wps.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleItemView extends Activity {
	// Declare Variables
	TextView txtname;
	TextView txtid;
	TextView txtpassword;
	String name;
	String id;
	String password;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singleitemview);
		// Retrieve data from MainActivity on item click event
		Intent i = getIntent();
		// Get the results of name
		name = i.getStringExtra("Name");
		// Get the results of id
		id = i.getStringExtra("Id");
		// Get the results of password
		password = i.getStringExtra("Password");

		// Locate the TextViews in singleitemview.xml
		txtname = (TextView) findViewById(R.id.name);
		txtid = (TextView) findViewById(R.id.id);
		txtpassword = (TextView) findViewById(R.id.password);

		// Load the results into the TextViews
		txtname.setText(name);
		txtid.setText(id);
		txtpassword.setText(password);
	}
}