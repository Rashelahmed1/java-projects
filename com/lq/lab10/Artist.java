package com.lq.lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Artist {

	private String name;
	private SortedSet<String> memberName  ;
	private Map<String, SortedSet<String>>  memberInstruments ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Artist() {
		super();
		this.memberName =  new TreeSet<String>();
		this.memberInstruments = new HashMap<String, SortedSet<String>>();
	}
	
	public Artist(String name) {
		this();
		setName(name);
		}

	

	

	
	 
    
	
	





















}
