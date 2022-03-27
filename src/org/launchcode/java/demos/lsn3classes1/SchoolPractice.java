package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn4classes2.Student;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

    }

    private class Course {
        private String courseName;
        private String teacherName;
        private ArrayList<Student> enrolledStudents;

        //must make a course Object out of the Class fields
        public Course(String courseName, String teacherName, ArrayList<Student> enrolledStudents) {
            this.courseName = courseName;
            //I want to retrieve the teacher name from the Teacher Class
            this.teacherName = teacherName;
            //not sure how to fetch the student list from the Student file

        }

        private class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;

            //must make a teacher Object out of the Class fields
            public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.subject = subject;
                this.yearsTeaching = yearsTeaching;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public int getYearsTeaching() {
                return yearsTeaching;
            }

            public void setYearsTeaching(int yearsTeaching) {
                this.yearsTeaching = yearsTeaching;
            }
        }
    }
}