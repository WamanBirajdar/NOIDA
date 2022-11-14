package day10_cmdLine_annonumous_collection;

//wap to demonstrate command line argument 
//command line argument are argument passed to main
//to compile java code from command prompt 
//first go to folder location  
//--> javac filename.java
//to execute program from commandline 
//--> java filename 
//--> java filename ritu 22 
public class CommandLineExample {

    // from IDE 	 
	//run--> run configuration --> select your file name --> click on argument tab
	//pass some arguments that will stored in args array 
	public static void main(String[] args) 
	{
		
		
		//if user passes any data to command line argument then line 19 
		//will print that data 
		 for(int i=0;i<args.length;i++)
		 {
			 System.out.println(args[i]);
		 }
    
	}

}
