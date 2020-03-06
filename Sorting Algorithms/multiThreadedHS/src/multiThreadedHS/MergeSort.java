package multiThreadedHS;

import java.util.ArrayList;
import multiThreadedHS.*;

public class MergeSort
{

	ArrayList<Integer> arr;

	public MergeSort()
	{	
		arr=new ArrayList<Integer>();

	}
	
	public void sorting(ArrayList<Integer> list)
	{
		int middle;
		ArrayList<Integer> left =new ArrayList<>();
		ArrayList<Integer> right =new ArrayList<>();

		if(list.size()>1)
		{
			middle=list.size()/2;

			for(int i=0;i<middle;i++)
			{
				left.add(list.get(i));
			}

			for(int j=middle;j<list.size();j++)
			{
				right.add(list.get(j));
			}

			sorting(left);
			sorting(right);

			merge(list,left,right);


		}
	}

	private static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right)
	{
		 ArrayList<Integer> temp = new ArrayList<Integer>();

		 int listindex=0;
		 int leftindex=0;
		 int rightindex=0;

		 while(leftindex<left.size() && rightindex< right.size())
		 {
		 	if(left.get(leftindex) < right.get(rightindex))
		 	{
		 		list.set(listindex,left.get(leftindex));
		 		leftindex++;
		 	}
		 	else
		 	{
		 		list.set(listindex,right.get(rightindex));
		 		rightindex++;
		 	}

		 	listindex++;

		 }

	    int tempindex = 0;
	    
	    if (leftindex >= left.size()) {
	        temp = right;
	        tempindex = rightindex;
	    } 
	    else {
	        temp = left;
	        tempindex = leftindex;
	    }
	 
	    for (int i = tempindex; i < temp.size(); i++) {
	        list.set(listindex, temp.get(i));
	        listindex++;
	    } 

	}
}
