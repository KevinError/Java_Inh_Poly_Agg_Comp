package aggregation;

public class Course {
    private String nameOfCourse;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String nameOfCourse, Instructor instructor, Textbook textbook) {
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

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    @Override
    public String toString() {
        return "Course Name: " + this.nameOfCourse +
                ", Instructor Name: " + this.instructor.getFirstName() +
                " " + this.instructor.getLastName() +
                ", Textbook Title: " + this.textbook.getTitle() +
                ", Textbook Author: " + this.textbook.getAuthor();
    }
}
