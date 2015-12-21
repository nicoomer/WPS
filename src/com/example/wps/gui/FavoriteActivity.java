package com.example.wps.gui;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wps.R;
import com.example.wps.db.Account;
import com.example.wps.db.AccountDatabase;

public class FavoriteActivity extends ListOfAccountsActivity {

	@Override
	protected ArrayList<Account> getSortedAccounts() {
		ArrayList<Account> accounts = AccountDatabase.getInstance().getAllFavoriteAccounts();
		return accounts;
	}
	
}