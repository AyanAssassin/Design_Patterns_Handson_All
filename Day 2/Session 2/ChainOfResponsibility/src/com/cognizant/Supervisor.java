package com.cognizant;

public class Supervisor implements ILeaveRequestHandler {
private ILeaveRequestHandler nextHandler;
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int days=leaveRequest.getNoOfDays();
		if(days>=1&&days<=3){
			System.out.println("Leave Approved from the Supervisor");
			System.out.println("Leave Details: "+leaveRequest);
		}
		else if(days>3){
			System.out.println("Your leave is more than 3 days so it is transferring to the project manager");
			setNextHandler();
			nextHandler.handleRequest(leaveRequest);
		}
		else{
			System.out.println("Wrong Input of number of days");
		}

	}
	public void setNextHandler() {
		nextHandler = new ProjectManager();
	}

}
