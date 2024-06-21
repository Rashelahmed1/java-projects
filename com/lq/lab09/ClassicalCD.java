package com.lq.lab09;

import java.util.Date;

public class ClassicalCD extends Item{

	private String composer;
	private String recordingLocation;
	private Date releseDate;
	String performers [] = new String [5];

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
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
	
	public void showPerformers() {
		for(int x = 0 ; x <= i ; x++) {
			System.out.println(performers[x]);
		}	
	}
	
	














}
