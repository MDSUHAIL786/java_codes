package placement;
public class Student {
	private String name;
	public String getname() {
		return this.name;
	}
	public void setname(String name) throws Exception {
		if(name==null || name.equals("")) {
			throw new Exception("name cannot be empty invalid name");
		}
		this.name=name;
		
	}
	public final int rollNo;
	private static int NoOfStd=0;
	
	public static int getNoOfStd() {
		return Student.NoOfStd;
	}
	
	private static String UniformColor="white";
	
	public String getUnifColor() {
		return Student.UniformColor;
	}
	public void setUnifCOlor(String color) {
		Student.UniformColor=color;
	}
	
	public static final int MAX_Std=1000;
	
	public Student(String name) throws Exception{   //Constructor
		if(Student.NoOfStd==Student.MAX_Std) {
			throw new Exception("maximum students limit reached cannot add further");
		}
		this.setname(name);
		Student.NoOfStd++;
		this.rollNo=Student.NoOfStd;
	}
	
	
	
}
