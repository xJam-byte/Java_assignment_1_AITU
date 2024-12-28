import models.School;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/students.txt");
        File file2 = new File("src/teachers.txt");

        Scanner sc1 = new Scanner(file1);
        School school = new School();
        while (sc1.hasNext()) {
            String[] parts  = sc1.nextLine().split(" ");
            ArrayList<Integer> grades = new ArrayList<>();
            for (int i = 4; i < parts.length; i++) {
                grades.add(Integer.parseInt(parts[i]));
            }
            Boolean g = parts[3].equals("Male");
            Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), g, grades);
            school.addMember(student);
        }
        sc1.close();
        sc1 = new Scanner(file2);
        while (sc1.hasNext()) {
            String[] parts  = sc1.nextLine().split(" ");
            Boolean g = parts[3].equals("Male");
            Teacher teacher = new Teacher(parts[0], parts[1], Integer.parseInt(parts[2]), g, parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
            school.addMember(teacher);
        }

        sc1.close();
        school.getMembers().forEach(System.out::println);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(78);
        grades.add(89);
        grades.add(99);
        grades.add(51);
        Student student = new Student("Harry", "Potter", 21, true, grades);
        System.out.println(student.calculateGPA());


        school.giveRaiseToExperiencedTeachers(10, 60);
        school.getMembers().forEach(System.out::println);

    }
}
