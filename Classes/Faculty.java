package Classes;

public class Faculty{
	
	protected String name;
	protected String id;
	protected String password;
	 Courses course;
	Student[] students; 
	int totalStudentsCount;
	
	public Faculty(){
		students = new Student[200];
		totalStudentsCount = 0;
	}
	
	public Faculty(String name, String id, String password){
		
		this.name = name;
		this.id = id;
		this.password = password;
		totalStudentsCount = 0;
		
		students = new Student[200];
		totalStudentsCount = 0;
		
	}
	
	public void SetCourse(Courses course){
		this.course = course;
	}
	
	public Courses GetCourse(){
		return course;
	} 
	public void addNewStudent(Student std){
		students[totalStudentsCount++] = std;
	}
	
	
	public void SetcourseResult(int gpa){
	
	
		
		
	} 
	
	public void showInfo(){
		System.out.println("Faculty Name: " + name);
		System.out.println("Faculty Id: " + id);
		
		
	}
	
	public void showCourseInfo(){
		course.showInfo();
	} 
	
}