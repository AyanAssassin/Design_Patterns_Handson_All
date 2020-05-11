package com.cognizant;

public class LeaveRequest {
private String employeeName;
private int noOfDays;
public LeaveRequest(String employeeName, int noOfDays) {
	
	this.employeeName = employeeName;
	this.noOfDays = noOfDays;
}
public int getNoOfDays() {
	return noOfDays;
}
@Override
public String toString() {
	return "\nEmployee Name: " + employeeName + "\n No Of Days: " + noOfDays ;
}

}
