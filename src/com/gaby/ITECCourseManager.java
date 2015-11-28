/*Modify ITECCourseManager so that it adds all of the ITECCourse objects 
are stored in an ArrayList.
Add a method to ITECCourse that returns the number of free spaces
in the class. So if the max number of students in a class is 30, 
and there are 10 students enrolled, this method will return 20.
Back in ITECCourseManager, loop over all of the ITECCourse objects 
and print the name of course and the number of free spaces in each.*/

package com.gaby;

import java.util.ArrayList;
import java.util.Iterator;

public class ITECCourseManager {

	public static void main(String args[]) {

		// add new course
		ITECCourse infoTechConcepts = new ITECCourse("Info Tec Concepts",
				"T3050", 1100, 30);
		// Enroll some students.
		infoTechConcepts.addStudent("Gus");
		infoTechConcepts.addStudent("Harry");
		infoTechConcepts.addStudent("Izzy");
		// add new course
		ITECCourse javaPartyForever = new ITECCourse("Java Party Forever",
				"Caffetto", 1500, 1);
		// add one student
		javaPartyForever.addStudent("Gabe");

		// create arraylist for courses
		ArrayList<ITECCourse> courses = new ArrayList<ITECCourse>();
		// add courses to list
		courses.add(infoTechConcepts);
		courses.add(javaPartyForever);

		// iterate over courses, printing name and spaces remaining
		Iterator<ITECCourse> itr = courses.iterator();
		while (itr.hasNext()) {
			ITECCourse element = itr.next();
			System.out.println(element.getName() + ": "
					+ element.getSpacesRemaining() + " spaces remaining.");
		}

		// infoTechConcepts.writeCourseInfo();
		// javaPartyForever.writeCourseInfo();
	}
}