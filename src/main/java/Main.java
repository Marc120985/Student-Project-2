import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1234;
        student.name = "Marc";
        Student student1 = new Student();
        student1.id = 56789;
        student1.name = "Christian";
        Student student2 = new Student();
        student2.id = 345678;
        student2.name = "Hans";

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);


        StudentDB studentDBArray = new StudentDB(students);
        try {
            System.out.println(studentDBArray.findById(123490));
        }catch(NoSuchElementException e){
            System.out.println("Sorry, no ID found!");
        }

        ArrayList<String> studentsGenerate = new ArrayList<>(List.of(
                "Student4",
                "Student5",
                "Student6"
                ));

        System.out.println("\n" + studentsGenerate.get(1));

        ArrayList<Student> studentGenerate2 = new ArrayList<>(List.of(
                student1,
                student2,
                student
        ));
        System.out.println("\nPrint a Student from ArrayList<Student> List.of:" + studentGenerate2.get(1));

        System.out.println("\nPrint a random Student:" + studentDBArray.randomStudent());
        System.out.println("\nPrint all Students:" + studentDBArray.getAllStudents());

        ComputerScienceStudentReal nerd = new ComputerScienceStudentReal();
        nerd.id = 7632;
        nerd.name = "Alfons";

        nerd.gender("female");

        System.out.println(nerd);
        System.out.println("Gender: " + nerd.gender("Alien"));

        System.out.println(nerd.getAdress());

        BiologyStudent dennis = new BiologyStudent();
        dennis.id = 88888;
        dennis.name= "Dennis";


        System.out.println(dennis.getIdentityCardNumber(352424));
        System.out.println(dennis.getAdress());

        Citizen frankestein = new BiologyStudent();
        System.out.println(frankestein.getIdentityCardNumber(11111));
        System.out.println(frankestein.getAdress());
       // System.out.println(frankestein);


    }
}
