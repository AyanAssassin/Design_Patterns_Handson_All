package com.cognizant;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IChatMediator chatMediator=new ChatMediator();
		IUser basicUser=new BasicUser(chatMediator, "Ankana");
		IUser premiumUser=new PremiumUser(chatMediator, "Debashis");
		chatMediator.addUser(basicUser);
		chatMediator.addUser(premiumUser);
		premiumUser.SendMessage("Hi all");
		basicUser.SendMessage("Hi sir");
		
	}

}
