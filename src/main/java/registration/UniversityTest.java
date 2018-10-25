package registration;

import college.*;
import college.Module;
import org.joda.time.LocalDate;

import java.util.ArrayList;


public class UniversityTest {


    public static void main(String [ ] args) {
        Student jim = new Student("Jim Ryan",
                new LocalDate("1996-2-12"), 15480402);
        Student bob = new Student("Bob Mulligan",
                new LocalDate("1995-3-23"), 15480403);
        Student dale = new Student("Dale Daleson",
                new LocalDate("1994-8-24"), 15480404);
        Student martha = new Student("Martha Kent",
                new LocalDate("1998-7-18"), 15480405);
        Student carl = new Student("Cal Carlson",
                new LocalDate("1999-11-1"), 15480406);

        Module maths = new Module("Maths",
                "Maths-1");
        Module science = new Module("Science",
                "Sc-1");
        Module geog = new Module("Geography",
                "Gg-1");
        Module hist = new Module("History",
                "Hs-1");
        Module comps = new Module("Computer Science",
                "CS-1");
        // I use programme here for course
        Programme teaching = new Programme("Teaching",
                new LocalDate("2019-9-1"), new LocalDate("2020-5-6"));
        Programme engineering = new Programme("Teaching",
                new LocalDate("2019-9-2"), new LocalDate("2020-5-5"));
        Programme arts = new Programme("Teaching",
                new LocalDate("2019-9-3"), new LocalDate("2020-5-4"));


        maths.addStudent(jim);
        science.addStudent(jim);
        comps.addStudent(jim);

        maths.addStudent(bob);
        science.addStudent(bob);
        comps.addStudent(bob);

        science.addStudent(dale);
        comps.addStudent(dale);
        geog.addStudent(dale);

        science.addStudent(martha);
        comps.addStudent(martha);
        geog.addStudent(martha);

        science.addStudent(carl);
        hist.addStudent(carl);
        geog.addStudent(carl);

        teaching.addModules(science);
        teaching.addModules(comps);
        teaching.addModules(geog);

        engineering.addModules(science);
        engineering.addModules(maths);
        engineering.addModules(comps);

        arts.addModules(hist);
        arts.addModules(geog);
        arts.addModules(science);

        engineering.addStudent(jim);
        engineering.addStudent(bob);
        teaching.addStudent(dale);
        teaching.addStudent(martha);
        arts.addStudent(carl);

        System.out.println("Students in engineering: ");
        ArrayList<Student> engineeringStudents = engineering.getStudent();

        for(int i = 0; i < engineeringStudents.size(); i++) {
            Student student = engineeringStudents.get(i);
            System.out.println(student.getUsername());
        }
        System.out.println("Modules in engineering: ");
        ArrayList<Module> engineeringModules = engineering.getModules();
        for(int i = 0; i < engineeringModules.size(); i++) {
            Module module = engineeringModules.get(i);
            System.out.println(module.getModulename());
        }

        System.out.println("Students in teaching: ");
        ArrayList<Student> teachingStudents = teaching.getStudent();

        for(int i = 0; i < teachingStudents.size(); i++) {
            Student student = teachingStudents.get(i);
            System.out.println(student.getUsername());
        }
        System.out.println("Modules in teaching: ");
        ArrayList<Module> teachingModules = teaching.getModules();
        for(int i = 0; i < teachingModules.size(); i++) {
            Module module = teachingModules.get(i);
            System.out.println(module.getModulename());
        }

        System.out.println("Students in arts: ");
        ArrayList<Student> artsStudents = arts.getStudent();

        for(int i = 0; i < artsStudents.size(); i++) {
            Student student = artsStudents.get(i);
            System.out.println(student.getUsername());
        }
        System.out.println("Modules in arts: ");
        ArrayList<Module> artsModules = arts.getModules();
        for(int i = 0; i < artsModules.size(); i++) {
            Module module = artsModules.get(i);
            System.out.println(module.getModulename());
        }

    }

}

