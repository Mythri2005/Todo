package Oop_intro;

import javax.sql.rowset.serial.SerialStruct;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Store 5 roll nos
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        //data of 5 students: contains{roll no,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
//just declaring
        Student Mythri;
        //This consists of 3 properties
        //System.out.println(Mythri.rno);//shows error
       // Mythri = new Student();

        Student mythri = new Student(15,"mythri",13.5f);
        Student adi = new Student(17,"adi");

        //mythri.rno = 13;
        //mythri.name = "mythri";
        //mythri.marks = 12.5f;
        //java is static type

       // mythri.changeName("Watch lover");
       // mythri.greeting();
        System.out.println(mythri.rno);
        System.out.println(mythri.name);
        System.out.println(mythri.marks);
        System.out.println(adi.rno);
        System.out.println(adi.name);
        System.out.println(adi.marks);
       // System.out.println(Arrays.toString(students));
        Student random = new Student(mythri);
        Student random2 = new Student();
        System.out.println(random.name);
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "smthing smthing";
        System.out.println(two.name);
    }
}
    //create a class
//for every single student
    class Student{
        int rno ;
        String name;
        float marks;
        //we need a way  ti add the values of the above
        //properties object by object

        //we need one more word to access every object

       // void greeting(){
         //   System.out.println("Hello!" + this.name);
        //}

        void changeName(String newName){
            this.name = newName;
        }
        Student(Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student(){
//this is how u call a constructor from another constructor
            //internally: new Student(13, "deffault mem",13.4f);
            this(13,"default mem",13.4f);
        }

        Student(int rno, String name) {
            this.rno = rno;
            this.name = name;
            //this.marks = 12.5f;
        }

        //Student arpit = new Student(12,"Arpit",23.4f)
        //here, this will be replaces with arpit
        Student(int roll, String naam, float marks){
            this.rno = roll;
            this.name = naam;
            this.marks = 13.2f;
        }
}

