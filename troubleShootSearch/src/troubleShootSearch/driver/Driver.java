
package troubleShootSearch.driver;

import troubleShootSearch.util.FileProcessor;
import troubleShootSearch.util.Results;
import java.util.ArrayList;
import troubleShootSearch.*;
import java.util.Arrays;
    
/**
 * @author Riya Lotlikar
 *
 */
    
    public class Driver{
	
			public ArrayList<String> input_1;
			public ArrayList<String> input_2;
			public ArrayList<String> input_3;
			public ArrayList<String> input_4;
			public ArrayList<String> user;
			public ArrayList<String> arr;

	public static void main(String[] args) {


		//String s="";
		

			String userinput=args[0];
	   		String inputFile1=args[1];
	   		String inputFile2=args[2];
	   		String inputFile3=args[3];
	   		String inputFile4=args[4];
	   		String outputFile=args[5];

	   		
			String line="";
			

	   		FileProcessor fp1=new FileProcessor(inputFile1);
	   		while((line=fp1.readLine()) !=null)
	   		{
	   			input_1=new ArrayList<>(Arrays.asList(line.split(".")));
	   		}

	   		FileProcessor fp2=new FileProcessor(inputFile2);
	   		while((line=fp2.readLine()) !=null)
	   		{
	   			input_2=new ArrayList<>(Arrays.asList(line.split(".")));
	   		}

	   		FileProcessor fp3=new FileProcessor(inputFile3);
	   		while((line=fp3.readLine()) !=null)
	   		{
	   			input_3=new ArrayList<>(Arrays.asList(line.split(".")));
	   		}

	   		FileProcessor fp4=new FileProcessor(inputFile4);
	   		while((line=fp4.readLine()) !=null)
	   		{
	   			input_4=new ArrayList<>(Arrays.asList(line.split(".")));
	   		}

	   		

	   		FileProcessor fp=new FileProcessor(userinput);
	   		while((line=fp.readLine()) !=null)
	   		{
	   			user=new ArrayList<>(Arrays.asList(line.split("\n")));
	   		}

	   		AlgorithmVisitor e=new ExactMatchVisitor();
	   		Product p1=new Product_1();
	   		Product p2=new Product_2();
	   		Product p3=new Product_3();
	   		Product p4=new Product_4();

	   		p1.accept(e);
	   		p2.accept(e);
	   		p3.accept(e);
	   		p4.accept(e);

	   		AlgorithmVisitor e1=new SemanticMatchVisitor();
	   		Product p12=new Product_1();
	   		Product p22=new Product_2();
	   		Product p32=new Product_3();
	   		Product p42=new Product_4();

	   		p12.accept(e1);
	   		p22.accept(e1);
	   		p32.accept(e1);
	   		p42.accept(e1);

	   		AlgorithmVisitor e2=new NaiveStemmingMatchVisitor();
	   		Product p13=new Product_1();
	   		Product p23=new Product_2();
	   		Product p33=new Product_3();
	   		Product p43=new Product_4();

	   		p13.accept(e2);
	   		p23.accept(e2);
	   		p33.accept(e2);
	   		p43.accept(e2);
		
		
			for(String str:arrr)
			{
				System.out.println(str);
			}




	}  // end public static void main
    }  // end public class Driver
