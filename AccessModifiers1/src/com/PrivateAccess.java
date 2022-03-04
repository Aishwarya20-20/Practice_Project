package com;

public class PrivateAccess {
	   void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	 class AccessSpecifiers2 {

		public static void main(String[] args) {
			System.out.println("Private Access Specifier");
			PrivateAccess  obj = new PrivateAccess(); 
	        obj.display();

		}
	}
