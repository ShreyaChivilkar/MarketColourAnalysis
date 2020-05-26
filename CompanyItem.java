package io.project;

public class CompanyItem {

private double open,close,low,high,volume,uOpen,uClose,uLow,uHigh,uVolume,change,changePercent,changeOverTime;
private String date,label;	
	
public CompanyItem() {}

public CompanyItem(double open, double close, double low, double high, double volume, double uOpen, double uClose,
		double uLow, double uHigh, double uVolume, double change, double changePercent, double changeOverTime,
		String date, String label) {
	this.open = open;
	this.close = close;
	this.low = low;
	this.high = high;
	this.volume = volume;
	this.uOpen = uOpen;
	this.uClose = uClose;
	this.uLow = uLow;
	this.uHigh = uHigh;
	this.uVolume = uVolume;
	this.change = change;
	this.changePercent = changePercent;
	this.changeOverTime = changeOverTime;
	this.date = date;
	this.label = label;
}

public double getOpen() {
	return open;
}

public double getClose() {
	return close;
}

public double getLow() {
	return low;
}

public double getHigh() {
	return high;
}

public double getVolume() {
	return volume;
}

public double getuOpen() {
	return uOpen;
}

public double getuClose() {
	return uClose;
}

public double getuLow() {
	return uLow;
}

public double getuHigh() {
	return uHigh;
}

public double getuVolume() {
	return uVolume;
}

public double getChange() {
	return change;
}

public double getChangePercent() {
	return changePercent;
}

public double getChangeOverTime() {
	return changeOverTime;
}

public String getDate() {
	return date;
}

public String getLabel() {
	return label;
}

public void setOpen(double open) {
	this.open = open;
}

public void setClose(double close) {
	this.close = close;
}

public void setLow(double low) {
	this.low = low;
}

public void setHigh(double high) {
	this.high = high;
}

public void setVolume(double volume) {
	this.volume = volume;
}

public void setuOpen(double uOpen) {
	this.uOpen = uOpen;
}

public void setuClose(double uClose) {
	this.uClose = uClose;
}

public void setuLow(double uLow) {
	this.uLow = uLow;
}

public void setuHigh(double uHigh) {
	this.uHigh = uHigh;
}

public void setuVolume(double uVolume) {
	this.uVolume = uVolume;
}

public void setChange(double change) {
	this.change = change;
}

public void setChangePercent(double changePercent) {
	this.changePercent = changePercent;
}

public void setChangeOverTime(double changeOverTime) {
	this.changeOverTime = changeOverTime;
}

public void setDate(String date) {
	this.date = date;
}

public void setLabel(String label) {
	this.label = label;
}


	
}