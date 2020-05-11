package com.cognizant;

public class MessageSubscriberThree implements Observer{

	private State observerState;
	public MessageSubscriberThree(String state){
		observerState=new State(state);
	}
	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberThree (state:"+observerState.getState()+" ) :: " + m.getMessageContent());
	}

}
