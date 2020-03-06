package myArrayList.test;

import myArrayList.MyArrayList;
import java.util.Random;
import myArrayList.util.Results;


public class MyArrayListTest
{

	Random random;

	public MyArrayListTest() 
	{

		random = new Random();
	}
    
    public void testMe(MyArrayList myArrayList, Results result)
    {

    	result.storeresult(correctSize(myArrayList));
    	result.storeresult(isElementRemoved(myArrayList));
    	result.storeresult(isIndexCorrect(myArrayList));
    	result.storeresult(sizeExtended(myArrayList));
    	result.storeresult(isIndexValid(myArrayList));
    	result.storeresult(validSum(myArrayList));
        result.storeresult(CorrectSum(myArrayList));
        result.storeresult(CorrectSortedOrder(myArrayList));
        result.storeresult(isArraySortedAfterRemoval(myArrayList));
        result.storeresult(checktoString(myArrayList));
    }


	public String correctSize(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		int initial_size =myArrayList.size();

		for(int i=0;i<5;i++)
		{
			myArrayList.insertSorted(random.nextInt(10000));
		}

		int final_size=myArrayList.size();

		if(final_size==initial_size+5)
		{
			status="Pass";
		}
		else
		{
			status="Fail";
		}
		//result.writeToFile(status);
		//result.writeToStdout(status);
		return status;
    }
	

    public String isElementRemoved(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		int initial_size =myArrayList.size();

		myArrayList.insertSorted(140);
		myArrayList.insertSorted(25);

		myArrayList.removeValue(25);

		int final_size=myArrayList.size();

		if(final_size==initial_size+1)
		{
			status="Pass";
		}
		else
		{
			status="Fail";
		}

		return status;
    }

    public String isIndexCorrect(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		myArrayList.insertSorted(140);
		myArrayList.insertSorted(25);
		myArrayList.insertSorted(25);
		myArrayList.insertSorted(90);
		myArrayList.insertSorted(1400);

		if (myArrayList.indexOf(25)==0) {
			
			status="Pass";			
		}
		else
		{
			status="Fail";
		}

		return status;
	}

	public String sizeExtended(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		myArrayList.insertSorted(140);
		myArrayList.insertSorted(25);
		myArrayList.insertSorted(1);
		myArrayList.insertSorted(90);
		myArrayList.insertSorted(1400);

		if (myArrayList.indexOf(140)>0) {
			
			status="Pass";			
		}
		else
		{
			status="Fail";
		}

		return status;
	}
	
	public String isIndexValid(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		for(int i=0;i<52;i++)
		{
			myArrayList.insertSorted(random.nextInt(10000));
		}

		if(myArrayList.size()==52)
		{
			status="Pass";
		}
		else
		{
			status="Fail";
		}

		return status;

	}

	public String validSum(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		for(int i=0;i<5;i++)
		{
			myArrayList.insertSorted(random.nextInt(10000));
		}

		if(myArrayList.sum()>0)
		{
			status="Pass";
		}
		else
		{
			status="Fail";
		}

		return status;
    }

    public String CorrectSum(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

		myArrayList.insertSorted(30);
		myArrayList.insertSorted(20);

		if(myArrayList.sum()==50)
		{
			status="Pass";
		}
		else
		{
			status="Fail";
		}

		return status;
    }

    public String CorrectSortedOrder(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

        myArrayList.insertSorted(300);
		myArrayList.insertSorted(210);
		myArrayList.insertSorted(180);
		myArrayList.insertSorted(2500);

		if(myArrayList.toString().trim().equals("->180->210->300->2500")) 
		{
			status="Pass";
		} 
		else 
		{
			status="Fail";
		}
		return status;
    }

       
    public String isArraySortedAfterRemoval(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

                myArrayList.insertSorted(300);
		myArrayList.insertSorted(210);
		myArrayList.insertSorted(180);
		myArrayList.insertSorted(2500);

		myArrayList.removeValue(210);

		if(myArrayList.toString().trim().equals("->180->300->2500")) 
		{
			status="Pass";
		} 
		else 
		{
			status="Fail";
		}
		return status;
    }

    public String checktoString(MyArrayList myArrayList)
	{
		String status="";
		myArrayList=new MyArrayList();

                myArrayList.insertSorted(300);
		myArrayList.insertSorted(210);
		myArrayList.insertSorted(180);
		myArrayList.insertSorted(2500);

		if(myArrayList.toString().trim().equals("->180->210->300->2500")) 
		{
			status="Pass";
		} 
		else 
		{
			status="Fail";
		}
		return status;
    }


      
}
       
 
        
	