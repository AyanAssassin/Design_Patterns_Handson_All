package com.cognizant;

public class MessageSubscriberTwo implements Observer {

	private State observerState;
	public MessageSubscriberTwo(String state){
		observerState=new State(state);
	}
	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberTwo (state:"+observerState.getState()+" ) :: " + m.getMessageContent());
	}

}
