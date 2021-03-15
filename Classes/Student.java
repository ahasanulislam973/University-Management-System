package Classes;
import interfaces.*;
public class Student implements Notice, Notes,Result {
	
	public String name;
	private String id;
	
	Admin admin;

	//Department department;
	Courses[] courses;
	
	Faculty[] faculties;
	
	int totalCourseCount;
	int totalFacultyCount;
	
	
	public Student(){
		courses = new Courses[200];
		
		//this.department = department;
		totalCourseCount = 0;
		
		totalFacultyCount = 0;
		
		
	}
	public Student(String name, String id) {
		
		
		
		
		//this.department = department;
		this.name = name;
		this.id = id;
		
		courses = new Courses[200];
		totalCourseCount = 0;
		
		totalFacultyCount = 0;
	}
	
	
	
	
	
	
	
	
	
	public void SetName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void SetId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	/*public void SetDeparment(Department department){
		this.department = department;
	} 
	public Department GetDeparment(){
		return department;
	} */
	
	public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	
	public void addNewFaculty(Faculty fcs){
		faculties[totalFacultyCount++] = fcs;
		
	}
	
	
	
	
	
	public void addNewCourses(Courses crc){
		courses[totalCourseCount++] = crc;
		
	}
	
	
	
			
	public void AllCourseInfo(){
		for(int i=0; i<totalCourseCount; i++){
			courses[i].showInfo();
		}
		
	} 
	
	public void showInfo(){
		//department.showInfo();
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " + id);
		
		
	}
	
	public void showResult(){
		for(int i=0; i<totalCourseCount; i++){
			courses[i].result(3);
		}
	}
	
	
	public void massage(String s){
		
		if(s == "Notes"){
			System.out.println("New Notes  posted by Faculty");
			
		}
		else if (s == "Notice"){
			System.out.println("New Notice posted by Faculty");
			
		}
		else if (s == "Results"){
			System.out.println("Result is posted by Faculty");
	}
	
	}
	}
	