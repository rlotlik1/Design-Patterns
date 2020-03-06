package troubleShootSearch;

import troubleShootSearch.*;
import java.util.ArrayList;

public class NaiveStemmingMatchVisitor implements AlgorithmVisitor
{

	String s;
	String t;
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
			s=user.get(i);
			int m=s.length();

			for(int j=0;j<input_1.size();j++)
			{
				t=input_1.get(i);
				int n=t.length();

				for(int x=0;x<n-m+1;x++)
				{
					int k=0;
					for(int y=0;y<m;y++)
					{
						if(s.charAt(y)==t.charAt(x+y))
						{
							k++;
						}
						else
						{
							break;
						}
					}

					if(k==m)
					{
						arr.add("Satisfies Naive Stemming in Product 1");
					}
				}
			}


		}

	}

	public void visitProduct_2(Product_2 prodtwo)
	{
		for(int i=0;i<user.size();i++)
		{
			s=user.get(i);
			int m=s.length();

			for(int j=0;j<input_2.size();j++)
			{
				t=input_2.get(i);
				int n=t.length();

				for(int x=0;x<n-m+1;x++)
				{
					int k=0;
					for(int y=0;y<m;y++)
					{
						if(s.charAt(y)==t.charAt(x+y))
						{
							k++;
						}
						else
						{
							break;
						}
					}

					if(k==m)
					{
						arr.add("Satisfies Naive Stemming in Product 2");
					}
				}
			}


		}
	}

	public void visitProduct_3(Product_3 prodthree)
	{
		for(int i=0;i<user.size();i++)
		{
			s=user.get(i);
			int m=s.length();

			for(int j=0;j<input_3.size();j++)
			{
				t=input_3.get(i);
				int n=t.length();

				for(int x=0;x<n-m+1;x++)
				{
					int k=0;
					for(int y=0;y<m;y++)
					{
						if(s.charAt(y)==t.charAt(x+y))
						{
							k++;
						}
						else
						{
							break;
						}
					}

					if(k==m)
					{
						arr.add("Satisfies Naive Stemming in Product 3");
					}
				}
			}


		}
	}

	public void visitProduct_4(Product_4 prodfour)
	{
		for(int i=0;i<user.size();i++)
		{
			s=user.get(i);
			int m=s.length();

			for(int j=0;j<input_4.size();j++)
			{
				t=input_4.get(i);
				int n=t.length();

				for(int x=0;x<n-m+1;x++)
				{
					int k=0;
					for(int y=0;y<m;y++)
					{
						if(s.charAt(y)==t.charAt(x+y))
						{
							k++;
						}
						else
						{
							break;
						}
					}

					if(k==m)
					{
						arr.add("Satisfies Naive Stemming in Product 4");
					}
				}
			}


		}
	}



}