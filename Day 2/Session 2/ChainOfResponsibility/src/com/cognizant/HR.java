package com.cognizant;

public class HR implements ILeaveRequestHandler {
	@SuppressWarnings("unused")
	private ILeaveRequestHandler nextHandler;
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		System.out.println("Your Leave is approved by the HR.");
		System.out.println("Leave Details: "+leaveRequest);

	}

}
