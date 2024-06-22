package com.lq.lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Artist {

	private String name;
	private SortedSet<String> memberName  ;
	private Map<String, SortedSet<String>>  memberInstruments ;
	
	public Artist() {
		super();
		this.memberName =  new TreeSet<String>();
		this.memberInstruments = new HashMap<String, SortedSet<String>>();
	}
	
	public Artist(String name) {
		this();
		setName(name);
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMember(String name,SortedSet<String> memberName) {
		memberName.add(name);
		memberInstruments.put(name, memberName);
	}

	public SortedSet<String> getMemberName() {
		return memberName;
	}

	public void setMemberName(SortedSet<String> memberName) {
		this.memberName = memberName;
	}

	public  SortedSet<String> getMemberInstruments(String name) {
		return memberInstruments.get(name);
	}

	

	

	
	 
    
	
	





















}
