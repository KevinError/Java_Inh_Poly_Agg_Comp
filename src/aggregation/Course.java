package aggregation;

import polymorphism.Ship;

public class Course {
    private String nameOfCourse;
    private Instructor[] instructor;
    private Textbook[] textbook;

    public Course(String nameOfCourse, Instructor[] instructor, Textbook[] textbook) {
        this.nameOfCourse = nameOfCourse;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public Instructor[] getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor[] instructor) {
        this.instructor = instructor;
    }

    public Textbook[] getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook[] textbook) {
        this.textbook = textbook;
    }

    @Override
    public String toString() {
        String professors ="";
        String textbooks ="";
        for (Instructor professor: instructor){
            professors += professor.getFirstName() + " " + professor.getLastName() + ", ";
        }
        for (Textbook book: textbook){
            textbooks += ", Textbook Title: " + book.getTitle() + ", Textbook Author: " + book.getAuthor() + "\n";
        }
        return "Course Name: " + this.nameOfCourse +
                ", Instructor Name: " + professors + "\n" + textbooks;
    }
}
