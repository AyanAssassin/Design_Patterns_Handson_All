package com.cognizant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageSubscriberOne s1 = new MessageSubscriberOne("Active");
		MessageSubscriberTwo s2 = new MessageSubscriberTwo("Busy");
		MessageSubscriberThree s3 = new MessageSubscriberThree("Active");
		MessagePublisher p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
		p.notifyUpdate(new Message("First Message")); //s1 and s2 will receive the update
		p.detach(s1);
		p.attach(s3);
		p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
		p.detach(s1);
		p.attach(s2);
		p.notifyUpdate(new Message("Third Message")); //s2 and s3 will receive the update
	}

}
