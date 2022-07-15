

//DAY 1: Simple hello program:

class simple
{
	public static void main(String args[])  //main method
	 
	 {

		System.out.println("Hello World");
		
	 }
	
}	
	
//DAY 2
//Note: Main method is required for a program?
//Answer:No its not necessary as a syntcally but its required as logically.

// why we declare class as public?
//Answer: If we write a class with public then that is visible from anywhere but if it is written written without using the word public then it means the class is accesible within its package. The public access modifier is accessible everywhere. It has the widest scope among all other modifiers. Its not mandatory to start a class from public.

	public class A1 {
		//System.out.println("a");
		//System.out.println("Default value of Int ="+ a);

		}

		class A2{
			
			//System.out.println("aa");
		}
		class A3
		{
			//System.out.println("A3");
		}

		class A4{
			//System.out.println("A4");
		}

//OUTPUT:PROGRAM COMPLIED BUT NOT RUNNING AS A IN JAVA PROGRAM DOES NOT START WITH MAIN METHOD.
		//MAIN METHOD ITS A SPECIAL METHOD LIKE SOME ANOTHER.
		
		
//DAY 3:INTERFACE AND ABSTRACTION:		
		

interface car{
		
    void start();
    void stop();
    
	}

public class maruticar implements car {
	 public void start()
	 {
		System.out.println("start car in MARUTICAR"); 
	 }
   public void stop()
   {
	   System.out.println("stop in MARUTICAR");  
   }
}
   
   class Inovacar implements car
   {
	   public void start()
	   {
		   System.out.println("start in INOVA");   
	   }

	
	public void stop() {
       
		 System.out.println("stop in INOVA");  
		
	}
   }
   
   

public class B1 {
	
	public void drive()
	{
		
	}

	public static void main(String[] args) {
		maruticar m = new maruticar();
	    m.start();
	    m.stop();
	    
	    Inovacar i = new Inovacar();
	    i.start();
	    i.stop();
		

	}

}


//DAY 4: PRIMITIVE DATA TYPE IN JAVA AND THEIR DEFAULT VALUE:

class simple
{
  
 static int a;
 static float b;
 static char c;
 static double d;
 static boolean bs;
 static short s;
 static byte by;
 static long l;

public static void main(String args[])  //main method
 
 {
	
 System.out.println("Defalut value of Int ="+ a);
 System.out.println("Defalut value of Float ="+ b);
 System.out.println("Defalut value of Char ="+ c);
 System.out.println("Defalut value of Double ="+ d);
 System.out.println("Defalut value of Boolean ="+ bs);
 System.out.println("Defalut value of Short ="+ s);
 System.out.println("Defalut value of Byte ="+ by);
 System.out.println("Defalut value of Long ="+ l);


 }

}


//DAY 4:

		
		
		
		
		
		

		
