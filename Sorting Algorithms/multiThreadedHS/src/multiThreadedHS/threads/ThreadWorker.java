package multiThreadedHS.threads;

//import multiThreadedHS.driver;
import java.util.ArrayList;
import multiThreadedHS.util.FileProcessor;
import multiThreadedHS.*;
import multiThreadedHS.util.Results;


public class ThreadWorker implements Runnable
{

	public ArrayList<Integer> lines=new ArrayList<Integer>();
	public ArrayList<Integer> result=new ArrayList<Integer>();
	String line="";
	Thread thread1;
	String s="";
	
	public ThreadWorker(String input)
	{
		FileProcessor fp=new FileProcessor(input);
	    	
	   		while((line=fp.readLine()) !=null)
	   		{
	   					
	   			lines.add(Integer.parseInt(line));
	   		}


	}
	
	@Override

	public void run()
	{
		if(thread1==null)
		{
			//System.out.println("Running");
			//thread1.run();


			MergeSort mt=new MergeSort();

	   		mt.sorting(lines);

	   		/*for(int i=0;i<lines.size();i++)
	   		{
	   			System.out.println(lines.get(i));
	   		}

	   		

	   		Results rs=new Results("output.txt");


	   		for(int i=0;i<lines.size();i++)
	   		{
	   			s=lines.get(i) + "\n"; 
	   		}
	   		
	   		rs.writeToFile(s);*/
	
		}	

		

		
		
        
	}

	


}