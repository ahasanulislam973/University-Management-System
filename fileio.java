import java.lang.*;
import java.io.*;

class fileio
{
				
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;		

			
	public void writeInFile(String s, String sdetail)
	{
		
		try
		{
			File file = new File(sdetail);	
			file.createNewFile();					
			writer = new FileWriter(file,true);	
			writer.write(s+"\r\n");				
			writer.flush();						
			writer.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile(String sdetail) 
	{
		
		
		try
		{
			File file = new File(sdetail);
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String fullText="", singleLine;					
			
			while((singleLine=bfr.readLine())!=null)		
			{
				 String sp[] = singleLine.split(";");
				 System.out.println(sp[0]);
			
				 System.out.println(sp[2]);
				
				fullText=fullText+singleLine+"\n\r";			
			}
			
			
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
}