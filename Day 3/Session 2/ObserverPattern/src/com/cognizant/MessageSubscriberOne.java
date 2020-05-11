package com.cognizant;

public class MessageSubscriberOne implements Observer {

	private State observerState;
	public MessageSubscriberOne(String state){
		observerState=new State(state);
	}
	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberOne (state:"+observerState.getState()+" ):: " + m.getMessageContent());
	}

}
