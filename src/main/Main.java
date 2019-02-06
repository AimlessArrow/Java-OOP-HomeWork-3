package main;

public class Main {

	public static void main(String[] args) {
		Group myGroup = new Group();
		Student firstStudent = new Student("John", "Johnson", "John", "male", 23);
		Student secondStudent = new Student("Fred", "Fredericson", "Frank", "male", 40);
		Student thirdStudent = new Student("Helen", "Smith", "Veronica", "female", 35);
		Student tempStudent = null;
		int tempIndex = 0;
		
		/* Populating student group */
		try {
			myGroup.addStudent(firstStudent);
			myGroup.addStudent(secondStudent);
			myGroup.addStudent(thirdStudent);
			myGroup.addStudent(new Student("Summer", "Times", "Victoria", "female", 33));
		} catch(overflowException e) {
			System.out.println("OverflowException caught");
		}
		System.out.println(myGroup);
		/* Removing a student from the group*/
		myGroup.removeStudent("Fredericson");
		System.out.println(myGroup);
		/* Searching for a student in the group */
		tempIndex = myGroup.searchStudent("Times");
		tempStudent = myGroup.getStudent(tempIndex);
		System.out.println(tempStudent);
	}

}
