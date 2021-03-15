import java.util.Scanner;
import Classes.*;
import interfaces.*;


public class Main{
    
	Scanner sc = new Scanner(System.in);
	Student[] student1 = new Student[500];
	Faculty ob = new Faculty("Mr.Rahim", "201", "12345");
	Student ob1 = new Student("Ahasanul", "19-40396-1");
	Courses ob2 = new Courses("java", "120");
	
	boolean check = true;
	
        Admin a = new Admin("admin", "2222");
	
	public void displayMainMenu() {
    
                System.out.println(".....Please Select a option.....");
                System.out.println("1.Admin  Panel Login");
                System.out.println("2.Faculty Panel Login");
                System.out.println("3.Student panel Login");
                int input = sc.nextInt();
                sc.nextLine();

                switch (input) {
                case 1:
                                displayAdminLoginMenu();
                                break;
                case 2:
                                displayFacultyLoginMenu();
                                break;
                case 3:
                                displayStudentLoginMenu();
                                break;
                default:
                               
                                displayMainMenu();
                                break;
                }
} 

	private void displayAdminLoginMenu() {

              
	Scanner ac = new Scanner(System.in);
			System.out.println("Welcome to Admin panel");
        
			System.out.println("Please enter the userName: ");
			String user = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String password = sc.nextLine();
			
        
			do{
                if("admin".equals(user) && "2222".equals(password)){
                displayAdminOptionsMenu();
				
			}else{
                System.out.println("Login Failed");
				check = false;
				break;
			}
				
			}while(true);
        
    
}
private void displayAdminOptionsMenu() {
                System.out.println("1.Add students");
                System.out.println("2.Remove students ");
                
                System.out.println("3.Return to main menu ");
                System.out.println("4.Exit from system");
	         
                int input = sc.nextInt();

    
                switch (input) {
                case 1:
                               
        addNewStudent();
                                break;
                case 2:
                               
        removeStudent();
                                break;
              
                               
               case 3:
                               displayMainMenu();
                                break;
                case 4:
                                exitApplication();
                                break;
                default:
                                break;
                }
}

private void displayFacultyLoginMenu() {
	System.out.println("Welcome to Faculty panel");
        
			System.out.println("Please enter the userName: ");
			String facultyUser = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String facultyPassword = sc.nextLine();
			do{
                if("faculty".equals(facultyUser) && "2222".equals(facultyPassword)){
                displayFacultyOptionsMenu();
				
			}else{
                System.out.println("Login Failed");
				check = false;
				break;
			}
				
			}while(true);

}

private void displayFacultyOptionsMenu(){
	           System.out.println("1. See your information");
               System.out.println("2. See your courses ");
                System.out.println("3. SetResult");
                System.out.println("4. Go to the main menu");
                System.out.println("5. Exit from system");
	            
    
                int input = sc.nextInt();

    
                switch (input) {
                case 1:
                                
					facultyInformation();
                     break;
                case 2:
                               
					seeCourses();
                                break;
                case 3:
                           
                setResults();
                                break;
               case 4:
                                displayMainMenu();
                                break;
                case 5:
                                exitApplication();
                                break;
                default:
                                break;
                }
}
private void facultyInformation() {
	
	ob.showInfo();
	
}
private void seeCourses() {
	
	Courses c1 = new Courses("java", "120");
	ob.SetCourse(c1);
	ob.showCourseInfo();
}
private void setResults() {
	ob2.result(4);
	
	
}


private void displayStudentLoginMenu() {
	System.out.println("Welcome to Student panel");
        
			System.out.println("Please enter the userName: ");
			String studentUser = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String studentPassword = sc.nextLine();
			do{
                if("student".equals(studentUser) && "2222".equals(studentPassword)){
                displayStudentOptionsMenu();
				
			}else{
                System.out.println("Login Failed");
				check = false;
				break;
			}
				
			}while(true);

}

private void displayStudentOptionsMenu(){
	            System.out.println("1.See your information");
                System.out.println("2.See your Courses");
                System.out.println("3.Display Main Menu");
                System.out.println("4.exit the system");
               
				
	           
    
                int input = sc.nextInt();

    
                switch (input) {
                case 1:
                               
					studentInformation();
                     break;
               case 2:
                               
					studentCourses();
                                break;
               
                
                case 3:
                                displayMainMenu();
                                break;
                case 4:
                                exitApplication();
                                break;
                default:
                                break;
                }
}

private void studentInformation() {

	ob1.addNewCourses(ob2);
	ob1.showInfo();
	ob1.massage("Results");
	
}
private void studentCourses(){
	Courses s3 = new Courses("Algorithm", "210");
	ob1.addNewCourses(s3);
	ob1.AllCourseInfo();
	
}


private void addNewStudent(){
	System.out.println("Enter the number of student you want to add: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<num; i++) {
                                                                                                                if (student1[i] == null) {
       
        System.out.println("Enter the totalCredit: ");
        int totalCredit = sc.nextInt();
        sc.nextLine();
		
        
        Scanner mc = new Scanner(System.in);
        
	    System.out.println("Enter the StudentName: ");
            
        String StudentName = mc.nextLine();
		
        System.out.println("Enter the StudentId: ");
        String StudentId = mc.nextLine();
		
	   
		
        Student s1 = new Student(StudentName,StudentId);
                student1[i] = s1;
                a.addNewRegister(student1[i]);
                                                                                   
																											   }
																												
    
}
}
private void removeStudent() {
	
	
	Scanner stdSc = new Scanner(System.in);
	boolean flag1 = true;
	System.out.println("Please Enter the Id you want to remove");
	String Id = stdSc.nextLine();
	for(int i=0; i<student1.length;i++){
		if(student1[i]== null){
		break;
		}
		if(student1[i]!=null && student1[i].getId().equals(Id)){
				System.out.println("student found");
				student1[i] = null;
					flag1 = true;
					
					System.out.println("Student removed");
					studentInformation();
					
				
			}
			if(!flag1){
				System.out.println("student doesn't exist");
				
			}
		}
	} 
	
private void showALlInfo() {
	for(int i=0; i<1; i++){
                a.showRegisteredInfo();
            
			} 
} 
private void exitApplication() {
                System.exit(0);
}
		
}

