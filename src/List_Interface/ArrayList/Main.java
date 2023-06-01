package List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    String name;int roll;int age;
    Student(String name,int roll,int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student student1 = new Student("robert",22,13);
        Student student2 = new Student("andrew",12,32);
        Student student3 = new Student("jacob",32,12);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        Iterator it = list.iterator();
      /*  while (it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.age + " " +s.roll + " " +s.name);
        } */

        for (Student s : list) {
            System.out.println(s.age + " " +s.roll + " " +s.name);
        }
    }
}
