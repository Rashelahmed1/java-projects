package com.lq.lab17;

import java.util.ArrayList;

import com.lq.lab05.BasicCalculator;
 	
	@SuppressWarnings(value = { "unused","unchecked","rawtypes" })
	//@SuppressWarnings(value = { "rawtypes" })
	// @SuppressWarnings("all")
	// @SuppressWarnings(value = { "unused" })
	@MyAnnotation(id = 1, name = "rashel")
public class AnnotationExamples extends Object{

	ArrayList arraylist = new ArrayList();
	
	int k = 0 ;
	//@SuppressWarnings(value = { "unused" })
	public void myMethod1() {
		arraylist.add(new String());
		
		int j = 0;
		int i = 0;
	}
	//@SuppressWarnings(value = { "unused" })
	
	public String toString() {
		@SuppressWarnings(value = { "unused" })
		int i = 0;
		return super.toString();
	}









}
