
package multiThreadedHS.driver;

import multiThreadedHS.util.FileProcessor;
import multiThreadedHS.util.Results;
import multiThreadedHS.threads.ThreadWorker;
import java.util.ArrayList;
import multiThreadedHS.*;
    
/**
 * @author Riya Lotlikar
 *
 */
    
    public class Driver{
	
	public static void main(String[] args) {


		ArrayList<Integer> res=new ArrayList<Integer>();
		String s="";
	   
	   		int num_of_threads=Integer.parseInt(args[0]);

	   			
	   			
	   			String inputFile1=args[1];
	   			String inputFile2=args[2];
	   			String inputFile3=args[3];
	   			String outputFile1=args[4];

	   		if(num_of_threads>=1)
	   		{
	   		ThreadWorker tw1=new ThreadWorker(inputFile1);
	   		Thread t1=new Thread(tw1);
	   		t1.start();

			try 
			{
			    t1.join();
			} 
			catch(InterruptedException e)
			{
				System.exit(0);
			    
			}
			

	       res.addAll(tw1.lines);

	   		
	   		ThreadWorker tw2=new ThreadWorker(inputFile2);
	   		Thread t2=new Thread(tw2);
	   		t2.start();
		    try
				   		{
			t2.join();
			} 
			catch(InterruptedException e)
			{
				System.exit(0);
			     
			}

			

	       res.addAll(tw2.lines);
	   		
	   		ThreadWorker tw3=new ThreadWorker(inputFile3);
	   		Thread t3=new Thread(tw3);
	   		t3.start();
	   		
			try
			{
			    t3.join();
			} 
			catch(InterruptedException e)
			{
				System.exit(0);
			     
			}

			

	       res.addAll(tw3.lines);
	   		
	   		}




	   		

	       MergeSort merging=new MergeSort();
	       merging.sorting(res);

	       for(int i=0;i<res.size();i++)
	       {
	       	System.out.println(res.get(i));
	       }


	       Results rs=new Results(outputFile1);


	       for(int i=0;i<res.size();i++)
	   		{
	   			s=res.get(i) + "\n"; 
	   		}
	   		
	   		rs.writeToFile(s);

	   

	   		


	}  // end public static void main
    }  // end public class Driver
