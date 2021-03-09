package ro.ase.csie.cts.lecture2.models;

public class Student {

	Personal personalData;
	Faculty faculty;

	
	int[] grades;
	
	public int getMinGrade() {
		int minimum = this.grades[0];
		for(int grade : this.grades) {
			if(minimum > grade) {
				minimum = grade;
			}
		}
		return minimum;
	}
	
	public int getNoMinimumGrades() {

		int minimum = this.getMinGrade();
		
		int noGrades = 0;
		for(int grade : this.grades) {
			if(grade == minimum) {
				noGrades += 1;
			}
		}
		
		return noGrades;
	}
}