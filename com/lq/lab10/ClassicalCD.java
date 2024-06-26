package com.lq.lab10;

import java.util.Date;

public class ClassicalCD extends Item{

	
	

	private String compuser;
	
	
	private String recordingLocation;
	
	private Date releseDate;

	public ClassicalCD(String title, double price, int qty,String recordingLocation,Date releseDate) {
		super(title, price, qty);
		setRecordingLocation(recordingLocation);
		setReleseDate(releseDate);
		
	}
	
	public String getCompuser() {
		return compuser;
	}

	public void setCompuser(String compuser) {
		this.compuser = compuser;
	}

	public String getRecordingLocation() {
		return recordingLocation;
	}

	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}

	public Date getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(Date releseDate) {
		this.releseDate = releseDate;
	}
	
	
	














}
