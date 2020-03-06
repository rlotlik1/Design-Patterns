package myArrayList.driver;


import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;
import myArrayList.test.MyArrayListTest;

public class Driver 
{

public static void main(String args[]) 
   {

  if (args.length != 2) 
   {
	System.err.println("No. of arguments not valid");
	System.exit(0);
    }
    
    FileProcessor fp = new FileProcessor(args[0]);
    Results results = new Results(args[1]);
    MyArrayList list=new MyArrayList();
    MyArrayListTest test=new MyArrayListTest();
    MyArrayList testing = new MyArrayList(fp);
  

    String input;

    while((input=fp.readLine()) !=null)
    {
    
    	try
    	{
    		int number=Integer.parseInt(input);  
		if(number < 0 || number > 10000)
		{
			System.err.println("The number should be between 1 to 10000");
			continue;
		}  		
    		

         list.insertSorted(number);
    	}

    	catch(NumberFormatException e)
    	{
    		System.err.println("Invalid value.Next input considered");
    		continue;
    	}
    }
    
   String sum_of_elements= "The sum of all the values in the array list is:" + list.sum() + "\n";
   
results.writeToFile(sum_of_elements);
  
    test.testMe(testing,results);
    for (String str : results.s) 
    {
	sum_of_elements = sum_of_elements + str + "\n";
    }
   
   results.writeToStdout(sum_of_elements);
   }
}
