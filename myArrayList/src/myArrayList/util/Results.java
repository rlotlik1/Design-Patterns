package myArrayList.util;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Results implements FileDisplayInterface, StdoutDisplayInterface 
{

	public ArrayList<String> s;
        BufferedWriter bw;
        FileWriter fw;
	public Results(String outfile)
	{
		s=new ArrayList<String>();

		try{
			fw=new FileWriter(outfile);

		}

		catch (IOException e)
		{
			System.err.println("Error in output file");
			System.exit(1);
		}

		bw=new BufferedWriter(fw);
	}


	public void writeToFile(String res) {
		try {
			bw.write(res);
			bw.close();
		} catch (IOException e) {
			System.out.println("Error to write result to file");
		}
	}
	
	public void writeToStdout(String res) {
		System.out.println(res);
	}

        public void storeresult(String answer){
		s.add(answer);
    }
}