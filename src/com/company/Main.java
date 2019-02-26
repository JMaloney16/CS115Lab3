package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("student_data.txt");
        ArrayList<Student> studentArrayList = new ArrayList<>();

        //       double finalMark;

        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }

        while(in.hasNextLine()){
            //The format of the student_data file is ID firstName surname cw1 cw2 examMark
            studentArrayList.add(
                    new Student(in.nextInt(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt()));
//            studentArrayList.add(new Student(id, firstName, surname, cw1, cw2, examMark));
        }


        Collections.sort(studentArrayList); //Sorting the arraylist based on final mark
        studentArrayList.forEach((student -> System.out.println(student.toString()))); /* Printing each element of the
        array on a new line */
//        while (in.hasNextLine()){
//            id = in.nextInt();
//            firstName = in.next();
//            surname = in.next();
//            finalMark = (calculateFinalMark(in.nextInt(), in.nextInt(), in.nextInt())); /* Coursework mark 1, 2 and the
//            exam mark */
//            System.out.println(outputStudent(surname, firstName, id, finalMark));
//
//        }

    }

//    public static double calculateFinalMark(int cw1, int cw2, int exam){
//        return ((cw1*0.1) + (cw2*0.1) + (exam*0.8));
//    }
//
//    public static String outputStudent(String surname, String firstName, int id, double finalMark){
//        surname = String.format("%1$-" + 11 + "s", surname);
//        firstName = String.format("%1$-" + 11 + "s", firstName);
//        return String.format(firstName + surname + id + ": " + "%.1f", finalMark);
//    }

}
