package troubleShootSearch;

import java.util.ArrayList;
import troubleShootSearch.*;

public class ExactMatchVisitor implements AlgorithmVisitor
{
	

	public ArrayList<String> input_1=new ArrayList<String>();
			public ArrayList<String> input_2=new ArrayList<String>();
			public ArrayList<String> input_3=new ArrayList<String>();
			public ArrayList<String> input_4=new ArrayList<String>();
			public ArrayList<String> user=new ArrayList<String>();
			public ArrayList<String> arr=new ArrayList<String>();
	public void visitProduct_1(Product_1 prodone)
	{
		
		for(int i=0;i<user.size();i++)
		{
			if(input_1.contains(user.get(i)))
			{
				arr.add("Satisfies Exact Match in Product 1");
			}
			else
			{
				arr.add("Does not satisfy Exact Match in Product 1");
			}
		}
	}

	public void visitProduct_2(Product_2 prodtwo)
	{
		for(int i=0;i<user.size();i++)
		{
			if(input_2.contains(user.get(i)))
			{
				arr.add("Satisfies Exact Match in Product 2");
			}
			else
			{
				arr.add("Does not satisfy Exact Match in Product 2");
			}
		}
	}

	public void visitProduct_3(Product_3 prodthree)
	{
		for(int i=0;i<user.size();i++)
		{
			if(input_3.contains(user.get(i)))
			{
				arr.add("Satisfies Exact Match in Product 3");
			}
			else
			{
				arr.add("Does not satisfy Exact Match in Product 3");
			}
		}
	}

	public void visitProduct_4(Product_4 prodfour)
	{

		for(int i=0;i<user.size();i++)
		{
			if(input_4.contains(user.get(i)))
			{
				arr.add("Satisfies Exact Match in Product 4");
			}
			else
			{
				arr.add("Does not satisfy Exact Match in Product 4");
			}
		}
	}



}