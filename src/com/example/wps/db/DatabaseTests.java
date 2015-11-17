package com.example.wps.db;

import java.util.Arrays;
import java.util.List;

import com.example.wps.db.Account;
import com.example.wps.db.AccountDatabase;

public class DatabaseTests {

//	/* Launch the basic tests. */
//	public void runTests(String xmlSD) {
//
//		Account testAccount1 = new Account("Facebook",
//				"facebookUser@hotmail.com", "facebook",
//				"https://www.facebook.com", "2015-09-12 22:00:00",
//				"Less useful than Linkedin", "Social Network", true);
//
//		Account testAccount1Bis = new Account("FacebookBis",
//				"facebookUser@gmail.com", "facebook",
//				"https://www.facebook.com", "2009-06-01 18:45:00",
//				"Less useful than Linkedin", "Social Network", false);
//
//		Account testAccount2 = new Account("Gmail", "gmailUser@hotmail.com",
//				"gmail", "https://www.gmail.com", "2012-02-24 13:42:00",
//				"Avoid Spam please", "E-Mail", false);
//
//		Account testAccount3 = new Account("Youtube", "youtubeUser", "youtube",
//				"https://www.youtube.com", "2010-12-13 12:30:00",
//				"Best Channel Ever", "Entertainment", true);
//
//		Account testAccount4 = new Account("Webmail", "webmailUser@ulb.ac.be",
//				"webmail", "https://webmail.ulb.ac.be/", "2005-08-20 09:30:00",
//				"E-mail delivery system", "E-Mail", false);
//
//		AccountDatabase.initDatabaseHandler(xmlSD);
//
//		testAddAccount(testAccount1);
//		testModifyAccount(testAccount1, testAccount1Bis);
//
//		testAccountExists(testAccount1);
//		testAccountExists(testAccount1Bis);
//
//		testRemoveAccount(testAccount2);
//		testAddAccount(testAccount2);
//		testAccountExists(testAccount2);
//
//		testAddAccount(testAccount3);
//
//		testAddAccount(testAccount4);
//		testRemoveAccount(testAccount4);
//		testAccountExists(testAccount4);
//
//		testGetAllAccounts();
//		testGetAllAccountsInCategory("E-Mail");
//		testLastAccess(testAccount1);
//		testLastAccess(testAccount2);
//		testGetAllFavoriteAccounts();
//		testGetAccountFromName("Youtube");
//	}
//
//	public void testAccountExists(Account account) {
//
//		System.out.println("\nTesting the presence of " + account.getName()
//				+ " account in database.");
//		AccountDatabase.accountExists(account);
//	}
//
//	public void testAddAccount(Account account) {
//
//		System.out.println("\nTrying to add " + account.getName()
//				+ " account in database.");
//		AccountDatabase.addAccount(account);
//	}
//
//	public void testModifyAccount(Account oldAccount, Account newAccount) {
//
//		System.out.println("\nTrying to modify " + oldAccount.getName()
//				+ " account in database.");
//		AccountDatabase.modifyAccount(oldAccount, newAccount);
//	}
//
//	public void testRemoveAccount(Account account) {
//
//		System.out.println("\nTrying to remove " + account.getName()
//				+ " account in database.");
//		AccountDatabase.removeAccount(account);
//	}
//
//	public void testGetAccountFromName(String name) {
//
//		System.out.println("\nTrying to retrieve " + name
//				+ " account in database.");
//		Account account = AccountDatabase.getAccountFromName(name);
//		System.out.println(account.toString());
//	}
//
//	public void testGetAllAccounts() {
//
//		System.out.println("\nRetrieving all accounts from database.\n");
//		List<Account> allAccounts = AccountDatabase.getAllAccounts();
//		System.out.println(Arrays.toString(allAccounts.toArray()));
//	}
//
//	public void testGetAllAccountsInCategory(String category) {
//
//		System.out.println("\nRetrieving accounts in database from the "
//				+ category + " category.\n");
//		List<Account> retrievedAccounts = AccountDatabase
//				.getAllAccountsInCategory(category);
//		System.out.println(Arrays.toString(retrievedAccounts.toArray()));
//	}
//
//	public void testGetAllFavoriteAccounts() {
//
//		System.out.println("\nRetrieving favorite accounts in database.\n");
//		List<Account> retrievedAccounts = AccountDatabase
//				.getAllFavoriteAccounts();
//		System.out.println(Arrays.toString(retrievedAccounts.toArray()));
//	}
//
//	public void testLastAccess(Account account) {
//
//		if (AccountDatabase.accessedLongAgo(account)) {
//			System.out
//					.println("\nIt is a long time you have accessed this account, do you still use it ?");
//		} else {
//			System.out.println("\nThe last access is quite recent, you might want to change your password more often.");
//		}
//	}
}