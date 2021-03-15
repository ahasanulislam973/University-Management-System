import java.lang.*;

public class Start
{
public static void main(String args[]){
      
		fileio file = new fileio();
		file.writeInFile("Name:ISLAM,MD.AHASANUL;Id:19-40396-1;Department:Cse","Detail/StudentDetails.txt");
		file.writeInFile("Name:RAHMAN,MOHAMMED MOFIZUR;Id:19-40120-1;Department:Cse","Detail/StudentDetails.txt");
		
		
		
		//file.readFromFile("files/History.txt");
	  Main a1 = new Main();
       a1.displayMainMenu();
	}		
	
}