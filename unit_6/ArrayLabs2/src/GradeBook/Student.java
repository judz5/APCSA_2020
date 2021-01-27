//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package GradeBook;
public class Student
{
	private String myName;
	private Grades myGrades;
	
	public Student(String name, double[] gradeList)
	{
		myName = name;
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (getSum()-getLowGrade())/(getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();
	}
	
	public String toString()
	{
		return myName+" = "+myGrades;
	}	
}