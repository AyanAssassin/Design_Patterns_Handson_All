package com.cognizant;

public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int days=leaveRequest.getNoOfDays();
		if(days>3&&days<=5){
			System.out.println("Leave Approved from the Project Manager");
			System.out.println("Leave Details: "+leaveRequest);
		}
		else if(days>3){
			System.out.println("Your leave is more than 5 days so it is transferring to the HR");
			setNextHandler();
			nextHandler.handleRequest(leaveRequest);
		}

	}
	private void setNextHandler() {
		// TODO Auto-generated method stub
		nextHandler=new HR();
	}

}
