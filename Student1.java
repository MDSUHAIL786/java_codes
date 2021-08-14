package placement;

public class Student1 {

	public static void main(String[] args) throws Exception {
		System.out.println(Student.MAX_Std);  //no need to make object
		 
		Student std[]=new Student[10];
		for(int i=0;i<std.length;i++) {
			std[i]=new Student(i+"th");
			//if(i==0) std[i].setname("");
			std[i].setname(i+"ye naam hai samjhe ji");
			System.out.println(Student.getNoOfStd());
			//System.out.println(std[i].MAX_Std);   give same output as statement 2 give
		}
		int a=Student.MAX_Std;   // statement 2  this is best practice as MAX_Std is static variable
		System.out.println(a);
		
//		std[7].rollNo=90; we cannot change rollNo as this is final set only once and we set this
		
		
	}

}
