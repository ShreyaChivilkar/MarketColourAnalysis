package io.project;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PreCovid")
public class CompanySpecific {
	
	@Id
	private String id;
	private String label;
	private double open,close;
	
	public CompanySpecific () {}
	
	
	public CompanySpecific(String label,double open, double close) {
		this.label = label;
		this.open = open;
		this.close = close;
	}
 
	public String getLabel() {
		return label;
	}
	
	public String getId() {
		return id;
	}

	public double getOpen() {
		return open;
	}


	public double getClose() {
		return close;
	}


	public void setOpen(double open) {
		this.open = open;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setClose(double close) {
		this.close = close;
	}

	
	
	

}
