package com.lq.lab16;

public enum TirePressures {

	 LF(30,"Left front"),RF(30,"Right front"),LR(32,"Left rare"),RR(32,"Right rare");
	
	private String name;
	private int presure;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPresure() {
		return presure;
	}
	public void setPresure(int presure) {
		this.presure = presure;
	}
	private  TirePressures( int presure, String name) {
		
		this.setName(name);
		this.setPresure(presure);
	}
	
	



}
