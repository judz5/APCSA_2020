//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package GradeBook;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class Class
{
	private String name;
	private Student[] studentList;

	public Class(String Name, int stuCount)
	{
		name = Name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum]=s;
	}
	
	public String getClassName()
	{
	   return name;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int k = 0;
		for(int i = 0; i<studentList.length;i++){
			if(studentList[i].getName().equals(stuName)){
				k = i;
			}
		}
		return getStudentAverage(k);
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}
		
	public double getClassAverage()
	{
		double k = 0;
		for(int i = 0; i<studentList.length; i++){
			k+=studentList[i].getAverage();
		}
		return k/studentList.length;
	}

	public String getStudentWithHighestAverage()
	{
		double k = studentList[0].getAverage();
		int v = 0;
		for(int i = 0; i<studentList.length ;i++){
			if(studentList[i].getAverage()>k){
				k = studentList[i].getAverage();
				v = i;
			}
		}
		return studentList[v].getName();
	}

	public String getStudentWithLowestAverage()
	{
		double k = studentList[0].getAverage();
		int v = 0;
		for(int i = 0; i<studentList.length ;i++){
			if(studentList[i].getAverage()<k){
				k = studentList[i].getAverage();
				v = i;
			}
		}
		return studentList[v].getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String failures = "";
		for(int i = 0; i<studentList.length; i++){
			if(studentList[i].getAverage()<failingGrade){
				failures = failures+studentList[i].getName()+" ";
			}
		}
		return failures;
	}
	
	public String toString() {
		System.out.println("\n"+name);
		for(int i = 0 ; i<studentList.length; i++){
			System.out.println(studentList[i]+"\t"+studentList[i].getAverage());
		}
		return " ";
	}
}