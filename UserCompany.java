package io.project;

import java.util.List;

public class UserCompany {
	
	
	public List<CompanySpecific> userCompany;

	
	public List<CompanySpecific> getUserCompany(){
		return userCompany;	
		
	}
	
	public void setUserCompany(List<CompanySpecific>userCompany) {
		this.userCompany = userCompany;
	}
}
