package com.vincenzomariacalandra.provaFinale.BachecaUniCollege.model;

public class StudentCredits {
	
	AppUser user;
	
	double approvedCredits;
	
	double notApprovedCredits;

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}
	
	public double getApprovedCredits() {
		return approvedCredits;
	}

	public void setApprovedCredits(double approvedCredits) {
		this.approvedCredits = approvedCredits;
	}

	public double getNotApprovedCredits() {
		return notApprovedCredits;
	}

	public void setNotApprovedCredits(double notApprovedCredits) {
		this.notApprovedCredits = notApprovedCredits;
	}

	public StudentCredits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}