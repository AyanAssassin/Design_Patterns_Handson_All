package com.cognizant;

public class PremiumUser implements IUser {

	private IChatMediator chatMediator;
	private String name;
	public PremiumUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void SendMessage(String msg) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(msg);
	}

	@Override
	public void ReceiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Premium Customer: "+name+"/nYou have recieved a message;");
		System.out.println("Messege:: "+msg);
		
	}

}
