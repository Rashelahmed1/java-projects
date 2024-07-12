package com.lq.lab15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class BookExerciser {

	public static void main(String[] args) {
		List<Book> books = readBooksFromFile("books.txt");  
		
		
	}
		public static List<Book> readBooksFromFile(String name){
			List<Book> books = new ArrayList<>();
			try 
				(FileInputStream fin  = new FileInputStream(name);
				InputStreamReader in_strm = new InputStreamReader(fin);
				LineNumberReader lnr = new LineNumberReader(in_strm);)
				{
				String line = lnr.readLine();
				while(line != null) {
					String title = line;
					String author = lnr.readLine();
					double price = Double.parseDouble(lnr.readLine());
					Book x = new Book(title,price,author);
					books.add(x);
				}
			}
			
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			} 
			
			
			return books;
			
		}
		
		 
		
		
		
		
		

	

}
