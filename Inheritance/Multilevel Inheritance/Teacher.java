package Inherit;

public class Teacher {
	String designation = "Teacher";
	String university = "National University";
	
	void does() {
		System.out.println("Teach");
		
	}
	public class teacherTest{
		public static void main(String[] args) {
			ProgrammingTeacher obj = new ProgrammingTeacher();
			TeacherProfile bio = new TeacherProfile();
			
			System.out.println(obj.teachername);
			System.out.println(obj.designation);
			System.out.println(obj.subject);
			System.out.println(obj.department);
			System.out.println(obj.university);
			System.out.println(bio.gender);
			System.out.println(bio.age);
			
			
			obj.does();
			obj.action();
			bio.talk();

	}

}
}
