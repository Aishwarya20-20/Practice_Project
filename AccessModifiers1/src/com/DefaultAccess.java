package com;

public class DefaultAccess {
	void display() 
		     { 
		         System.out.println("You are using default access specifier"); 
		     } 
		} 
           class accessSpecifiers1 {

			    public static void main(String[] args) {
			
				System.out.println("Default Access Specifier");
				DefaultAccess obj = new DefaultAccess(); 		  
		        obj.display(); 

			}
		}

