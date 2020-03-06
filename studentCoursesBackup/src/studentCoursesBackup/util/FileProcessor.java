package studentCoursesBackup.util;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;

public class FileProcessor 
{

        FileReader fr;
        BufferedReader br;

	public FileProcessor(String file) 
	{

		try
		{
		
			fr=new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.err.println("File not found");
			System.exit(1);
		}

		br=new BufferedReader(fr);
	}

	public String readLine() 
	{

		
        String line = null;
        try 
        {
           		line= br.readLine();
         }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        return line;
    }

}

