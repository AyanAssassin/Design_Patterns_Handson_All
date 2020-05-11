package com.cognizant;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private static List<IUser> users=new ArrayList<>();
	@Override
	public void addUser(IUser user) {
		// TODO Auto-generated method stub
		users.add(user);

	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		for(IUser u:users){
			u.ReceiveMessage(msg);
		}

	}

}
