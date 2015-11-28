/*Modify ITECCourse so that ITECCourse objects can store the room that the course meets in.
Add get and set methods for this variable.
Modify ITECCourse's constructor so that you can specify the room when you create an ITECCourse object.
Modify writeCourseInfo so that it also prints the room.
Test your code by creating a ITECCourse object for this class:
Name: Info Tech Concepts, code 1100, max students 30, room T3050.
Enroll Max and Nancy and Orson.*/

package com.gaby;

import java.util.ArrayList;

public class ITECCourse {

	private String name;
	private int code;
	private ArrayList<String> students;
	private int maxStudents;
	private String roomNumber;
	private int freeSpaces;

	public ITECCourse(String courseName, String courseRoomNumber,
			int courseCode, int courseMaxStudents) {
		name = courseName;
		code = courseCode;
		students = new ArrayList<String>();
		maxStudents = courseMaxStudents;
		roomNumber = courseRoomNumber;
	}

	public void addStudent(String studentName) {
		// don't need to check if students is null - the constructor set it up
		// If the number of students is the same as the max allowed, can't add
		// any more
		if (students.size() < maxStudents) {
			students.add(studentName);
			System.out.println(studentName + " was added to " + this.name);
		} else {
			// There is no room for this student
			System.out.println(name + " is full, max number of students is "
					+ maxStudents + ". " + studentName + " not added");
		}
	}

	public void removeStudent(String studentName) {
		if (students.contains(studentName)) {
			students.remove(studentName);
			System.out.println(studentName + " was un-enrolled from "
					+ this.name);
		} else {
			System.out.println(studentName + " was not found in this course");
		}
	}

	public void writeCourseInfo() {
		System.out.println("Course Name: " + this.name);
		System.out.println("Course Code: " + this.code);
		System.out.println("Students enrolled:");
		for (String student : students) {
			System.out.println(student);

		}
		System.out.println("There are " + getNumberOfStudents()
				+ " students enrolled");
		System.out
				.println("The max number of students that can enroll in this course is "
						+ this.maxStudents);
	}

	public int getNumberOfStudents() {
		return this.students.size();
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	// (no need for 'this', as variables are private
	public int getSpacesRemaining() {
		this.freeSpaces = maxStudents - students.size();
		return freeSpaces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}