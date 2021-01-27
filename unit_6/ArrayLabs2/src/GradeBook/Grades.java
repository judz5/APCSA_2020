//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package GradeBook;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
public class Grades
{
	private Grade[] grades;
	
	public Grades( double[] list )
	{
		grades = new Grade[list.length];
		for(int i = 0; i<list.length;i++){
			setGrade(i, list[i]);
		}
	}
	
	public void setGrade(int pos, double grade)
	{
		Grade x = new Grade(grade);
		grades[pos]=x;
	}
	
	public double getSum()
	{
		double hold = 0;
		for(int i = 0; i < grades.length;i++){
			hold = hold + grades[i].getNumericGrade();
		}
		return hold;
	}
	
	public double getLowGrade()
	{
		int k = 0;
		for(int i = 1; i < grades.length; i++){
			if(grades[i].getNumericGrade()<grades[k].getNumericGrade()){
				k = i;
			}
		}
		return grades[k].getNumericGrade();
	}
	
	public double getHighGrade()
	{
		int k = 0;
		for(int i = 1; i < grades.length; i++){
			if(grades[i].getNumericGrade()>grades[k].getNumericGrade()){
				k = i;
			}
		}
		return grades[k].getNumericGrade();
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		return Arrays.toString(grades);
	}	
}