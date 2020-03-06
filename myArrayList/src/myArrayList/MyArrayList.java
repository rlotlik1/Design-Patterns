package myArrayList;

import java.util.Arrays;
import myArrayList.util.FileProcessor;

public class MyArrayList 
{

	private int[] arr_list;
	private int count;

	public MyArrayList()
	{
		arr_list=new int[50];
		count=0;
                
	}

        public MyArrayList(FileProcessor fp)
        {
		arr_list=new int[50];
		count=0;

        }

	public void insertSorted(int newValue) {

		int arrayLength=arr_list.length;
		int i=0;
        if(count>=arrayLength)
        {
        	arrayLength=arrayLength + ((int)(arrayLength/2));
        	int [] new_array=new int[arrayLength];
        	while(i<count)
        	{
        		new_array[i]=arr_list[i];
        		i++;
        	}

        	arr_list=new_array;
        }

        arr_list[count]=newValue;
        count+=1;
        Arrays.sort(arr_list,0,count);
	}

    public void printInsertionorder() {

    	

    }

    public void removeValue(int value) {

    	     int j=0;
    	     int diff=0;
    	     int index=0;
    
      	     int len=arr_list.length;
      	     for(int i=0;i<len;i++)
      	     {
      	     	if(arr_list[i]==value)
      	     	{
                  index=i;
                  break;
      	     	}
      	     }

		for(int i=0;i<len;i++)  
		{
			if(arr_list[i]==value)
			{
				diff++;
			}
		}           
         for(int i=index;i<count-diff+1;i++)
         {
            arr_list[i]=arr_list[i+diff];
         }

            //int[] temp_array=new int[len];
	    //int new=temp_array.length;

             //int diff= len-new;
	    
	      //for (int i=0;i<len;i++)
	      //{
	      	//if(arr_list[i]!=value)
	      	//{
                    
	      	  //  temp_array[j++]=arr_list[i];
                                
	      	//}
	      count=count-diff;

     }

        /*int temp=len-diff;

            for(int i=0;i<temp;i++)
		{
			arr_list[i]=temp_array[i];
		}

		
         
         count=temp;  

        
    }*/

    public void compact() {

    	

    }

    public int indexOf(int value) {

        int index=-1;
        
    	for(int i=0;i<arr_list.length;i++)
    	{
    		if(arr_list[i]==value)
    		{
    			index=i;
    			break;
    		}
    	}

    	return index;

    }

    public int size() {

    	return count;

    }

    public int sum() {
        

        int sum_of_elements=0;
         for(int i=0;i<arr_list.length;i++)
         {
         	sum_of_elements+=arr_list[i];
         } 

         return sum_of_elements;

    }

    public String toString() {


        String pattern=" ";
        for(int i=0;i<count;i++)
        {
            pattern=pattern+"->"+arr_list[i];
        }
        return pattern;
    }

    

 }

