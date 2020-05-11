package com.cognizant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First connection
		DBConn connection1=DBConn.getInstance();
		System.out.println("First established connection:: "+connection1);
		//Second connection
		DBConn connection2=DBConn.getInstance();
		System.out.println("Second established connection:: "+connection2);

	}

}
