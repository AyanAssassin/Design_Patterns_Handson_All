package com.cognizant;

public class Program {
public static void main(String[] args) {
	LeaveRequest request=new LeaveRequest("Ankana", 4);
	ILeaveRequestHandler handler=new Supervisor();
	System.out.println("Applying leave to the supervisor");
	handler.handleRequest(request);
}
}
