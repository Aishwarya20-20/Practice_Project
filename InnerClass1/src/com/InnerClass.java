package com;

public class InnerClass {
             private String msg="Welcome to Java"; 
	         class Inner{  
	         void hello(){System.out.println(msg+", Let us start learning Inner Classes");
	         }  
	 }  

    public static void main(String[] args) {
        InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}

    class InnerClass1 {
      private String msg="Inner Classes";
      void display(){  
	 
    	  class Inner{  
		     void msg(){
			 System.out.println(msg);
		 }  
 }  
            Inner l=new Inner();  
            l.msg();  
}  
            public static void main(String[] args) {
	        InnerClass1 ob=new InnerClass1();  
	        ob.display();  
	}
}
            abstract class AnonymousInnerClass {
	        public abstract void display();
	}

            class InnerClass3 {

	        public static void main(String[] args) {
	        AnonymousInnerClass i = new AnonymousInnerClass() {
	        	public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}

