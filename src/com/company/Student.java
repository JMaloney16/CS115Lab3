package com.company;


public class Student implements Comparable<Student> {
    private String firstName;
    private String surname;
    private int id;
    private int courseworkMark1;
    private int courseworkMark2;
    private int examMark;
    private double finalMark;

    public Student(int id, String firstName, String surname, int courseworkMark1, int courseworkMark2, int examMark) {
        this.firstName = firstName;
        this.surname = surname;
        this.id = id;
        this.courseworkMark1 = courseworkMark1;
        this.courseworkMark2 = courseworkMark2;
        this.examMark = examMark;
        this.finalMark = calculateFinalMark(this.courseworkMark1,this.courseworkMark2,this.examMark);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseworkMark1() {
        return courseworkMark1;
    }

    public void setCourseworkMark1(int courseworkMark1) {
        this.courseworkMark1 = courseworkMark1;
        this.finalMark = calculateFinalMark(this.courseworkMark1,this.courseworkMark2,this.examMark);
    }

    public int getCourseworkMark2() {
        return courseworkMark2;
    }

    public void setCourseworkMark2(int courseworkMark2) {
        this.courseworkMark2 = courseworkMark2;
        this.finalMark = calculateFinalMark(this.courseworkMark1,this.courseworkMark2,this.examMark);
    }

    public int getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
        this.finalMark = calculateFinalMark(this.courseworkMark1,this.courseworkMark2,this.examMark);
    }

    public double getFinalMark() {
        return finalMark;
    }

    @Override
    public String toString() {
        this.surname = String.format("%1$-" + 11 + "s", surname); /* Format the names to have padding of up to 11 spaces
        on the right */
        this.firstName = String.format("%1$-" + 11 + "s", firstName);
        return String.format(this.firstName + this.surname + this.id + ": " + "%.1f", this.finalMark);
    }

    //This method is called whenever one of the mark values is changed to update the final mark
    private double calculateFinalMark(int cw1, int cw2, int exam){
        return ((cw1*0.1) + (cw2*0.1) + (exam*0.8)); //CW1 and CW2 are worth 10% of final mark, exam is worth 80%
    }

    @Override
    public int compareTo(Student compareStudent) {
        // If the value of finalMark is higher than the comparison student return 1, if less return 0, if equal return 0
        if (this.finalMark > compareStudent.getFinalMark()) return 1;
        if (this.finalMark < compareStudent.getFinalMark()) return -1;
        return 0;
    }
}
