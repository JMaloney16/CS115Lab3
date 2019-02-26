package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("student_data.txt");
        ArrayList<Student> studentArrayList = new ArrayList<>();

        String surname;
        String firstName;
        int id;
        double finalMark;


        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }

        while(in.hasNextLine()){
            id = in.nextInt();
            firstName = in.next();
            surname = in.next();
            studentArrayList.add(new Student(firstName, surname, id, in.nextInt(), in.nextInt(), in.nextInt()));
        }


        Collections.sort(studentArrayList);
        studentArrayList.forEach((student -> System.out.println(student.toString())));
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

    public static double calculateFinalMark(int cw1, int cw2, int exam){
        return ((cw1*0.1) + (cw2*0.1) + (exam*0.8));
    }

    public static String outputStudent(String surname, String firstName, int id, double finalMark){
        surname = String.format("%1$-" + 11 + "s", surname);
        firstName = String.format("%1$-" + 11 + "s", firstName);
        return String.format(firstName + surname + id + ": " + "%.1f", finalMark);
    }

}
