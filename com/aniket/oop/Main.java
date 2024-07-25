package com.aniket.oop;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] std = new Student[5];
        System.out.println("1--"+"  "+Arrays.toString(std));

        Student Aniket = new Student(17,"Aniyket Chopade", 93.26F);
        System.out.println(Aniket.rno+" "+ Aniket.marks+" " +Aniket.name);

        Student aniket = new Student();
        aniket.rno = 46;
        aniket.name = "Aniket Chopade";
        aniket.marks=91.2f;
        System.out.println(aniket.rno+" "+ aniket.marks+" " +aniket.name);

        Student snehank = new Student(25,"Shrikant",94.60f);
        System.out.println(snehank.rno+" "+snehank.marks+" "+ snehank.name);

        Student swarup = new Student(snehank);
        System.out.println(swarup.rno+" "+ swarup.marks+" "+swarup.name);

        Student onkar = new Student();
        System.out.println(onkar.rno+" "+ onkar.marks+" "+onkar.name);

        swarup.greeting();
        aniket.changeName("Aniy");
        System.out.println(aniket.name);
    }
     static
     class Student{
    int rno;
    String name;
    float marks;

        void greeting() {                                               // we have to define a function within a class itself
            System.out.println("Hey , my name is " + this.name);//  along with the constructors ...
        }
        void changeName(String name){
            this.name = name;
            }


        public Student(int rno, String name, float marks) {        // general constructor
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        public Student() {                                        // basic that gives null values

        }
        public Student(Student other) {                             // copying from another constructor
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
//        Student(){                                                //  for manual default value
//            this (00,"Add your name ",00.0f);
//            }

    }


}

