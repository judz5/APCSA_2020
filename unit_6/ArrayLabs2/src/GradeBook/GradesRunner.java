//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package GradeBook;
public class GradesRunner
{
   public static void main( String args[] )
   {
   	double[] vals = {90, 85, 95.5, 77.5, 88};
		Grades test = new Grades( vals );
		System.out.println(test);
		System.out.println("sum = " + test.getSum());	
		System.out.println("num grades = "+test.getNumGrades());											
		System.out.println("low grade = "+test.getLowGrade());		
		System.out.println("high grade = "+test.getHighGrade());

		System.out.print("\n");
		//add more test cases
	double[] val = {10, 70, 90, 92.5, 85, 95.5, 77.5, 88.0, 100.0};
	   Grades testt = new Grades( val );
	   System.out.println(testt);
	   System.out.println("sum = " + testt.getSum());
	   System.out.println("num grades = "+testt.getNumGrades());
	   System.out.println("low grade = "+testt.getLowGrade());
	   System.out.println("high grade = "+testt.getHighGrade());
	}		
}