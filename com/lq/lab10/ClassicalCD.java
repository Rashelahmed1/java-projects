package com.lq.lab10;

import java.util.Date;

public class ClassicalCD extends Item{

	
	

	private String compuser;
	
	String performers [] = new String [5];
	
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
	
	private int i = 0;

	public void addPerformer(String performer) {
		if(i < performers.length) {
			performers[i] = performer;
			i ++ ;
		}
		else {
			System.out.println("no more room int the performersArray");
		}
	
	
	
	}
	
	
	














}
