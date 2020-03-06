package studentCoursesBackup.util;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Results implements FileDisplayInterface, StdoutDisplayInterface 
{

	public ArrayList<String> s;
	public String msg;
	ArrayList<String> list =new ArrayList<>();
        BufferedWriter bw;
        FileWriter fw;

	public Results(){
		s= new ArrayList<String>();
		
	}
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

        public void storeResult(String msg){
		this.msg=msg;
    }

    
}