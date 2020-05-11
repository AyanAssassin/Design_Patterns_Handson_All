package com.cognizant;

public class BasicUser implements IUser {

	private IChatMediator chatMediator;
	private String name;

	public BasicUser(IChatMediator chatMediator, String name) {
	
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
		System.out.println("Basic Customer: "+name+"/nYou have recieved a message;");
		System.out.println("Messege:: "+msg);
		
	}

}
