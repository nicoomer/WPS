package com.example.wps.gui;

import com.example.wps.R;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Display accounts by category.
 */
public class CategoryActivity extends Activity {
	private TextView gamingTv, internetTv, socialTv, workTv, otherTv;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.linear_layout);

		LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

		Resources res = getResources();
		Drawable drawable = null;

		// Games Category
		gamingTv = new TextView(this);
		gamingTv.setId(0);
		gamingTv.setText("\n" + " Gaming" + "\n");
		gamingTv.setClickable(true);
		gamingTv.setLines(3);
		gamingTv.setBackgroundColor(Color.WHITE);
		drawable = res.getDrawable(R.drawable.ic_games);
		gamingTv.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable,
				null, null, null);
		gamingTv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Clicked on element : " + v.getId());
				gamingTv.setBackgroundColor(Color.LTGRAY);
				Intent listViewIntent = new Intent(CategoryActivity.this,
						AlphabeticActivity.class);
				// Added data to display the accounts of the Gaming category
				listViewIntent.putExtra("WithCategory", "Gaming");
				startActivity(listViewIntent);
			}
		});

		// Internet Category
		internetTv = new TextView(this);
		internetTv.setId(1);
		internetTv.setText("\n" + " Internet Sites" + "\n");
		internetTv.setClickable(true);
		internetTv.setLines(3);
		internetTv.setBackgroundColor(Color.WHITE);
		drawable = res.getDrawable(R.drawable.ic_internet);
		internetTv.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable,
				null, null, null);
		internetTv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Clicked on element : " + v.getId());
				internetTv.setBackgroundColor(Color.LTGRAY);
				Intent listViewIntent = new Intent(CategoryActivity.this,
						AlphabeticActivity.class);
				// Added data to display the accounts of the Internet Sites
				// category
				listViewIntent.putExtra("WithCategory", "Internet Sites");
				startActivity(listViewIntent);
			}
		});

		// Social Category
		socialTv = new TextView(this);
		socialTv.setId(2);
		socialTv.setText("\n" + " Social Network" + "\n");
		socialTv.setClickable(true);
		socialTv.setLines(3);
		socialTv.setBackgroundColor(Color.WHITE);
		drawable = res.getDrawable(R.drawable.ic_fb);
		socialTv.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable,
				null, null, null);
		socialTv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Clicked on element : " + v.getId());
				socialTv.setBackgroundColor(Color.LTGRAY);
				Intent listViewIntent = new Intent(CategoryActivity.this,
						AlphabeticActivity.class);
				// Added data to display the accounts of the Social Network
				// category
				listViewIntent.putExtra("WithCategory", "Social Network");
				startActivity(listViewIntent);
			}
		});

		// Work Category
		workTv = new TextView(this);
		workTv.setId(3);
		workTv.setText("\n" + " Work" + "\n");
		workTv.setClickable(true);
		workTv.setLines(3);
		workTv.setBackgroundColor(Color.WHITE);
		drawable = res.getDrawable(R.drawable.ic_work);
		workTv.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null,
				null, null);
		workTv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Clicked on element : " + v.getId());
				workTv.setBackgroundColor(Color.LTGRAY);
				Intent listViewIntent = new Intent(CategoryActivity.this,
						AlphabeticActivity.class);
				// Added data to display the accounts of the Work category
				listViewIntent.putExtra("WithCategory", "Work");
				startActivity(listViewIntent);
			}
		});

		// Other Category
		otherTv = new TextView(this);
		otherTv.setId(4);
		otherTv.setText("\n" + " Other" + "\n");
		otherTv.setClickable(true);
		otherTv.setLines(3);
		otherTv.setBackgroundColor(Color.WHITE);
		drawable = res.getDrawable(R.drawable.ic_other);
		otherTv.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null,
				null, null);
		otherTv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Clicked on element : " + v.getId());
				otherTv.setBackgroundColor(Color.LTGRAY);
				Intent listViewIntent = new Intent(CategoryActivity.this,
						AlphabeticActivity.class);
				// Added data to display the accounts of the Other category
				listViewIntent.putExtra("WithCategory", "Other");
				startActivity(listViewIntent);
			}
		});

		linearLayout.addView(gamingTv);
		linearLayout.addView(internetTv);
		linearLayout.addView(socialTv);
		linearLayout.addView(workTv);
		linearLayout.addView(otherTv);
	}

	@Override
	public void onResume() {
		// When returning to the Category View, uncheck textviews
		super.onResume(); // Always call the superclass method first
		gamingTv.setBackgroundColor(Color.WHITE);
		internetTv.setBackgroundColor(Color.LTGRAY);
		socialTv.setBackgroundColor(Color.WHITE);
		workTv.setBackgroundColor(Color.LTGRAY);
		otherTv.setBackgroundColor(Color.WHITE);
	}
}