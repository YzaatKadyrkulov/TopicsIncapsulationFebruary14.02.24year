import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Rectangle rectangle = new Rectangle();
//         rectangle.setLength(4);
//         rectangle.setObject(6);
//         System.out.println("rectangle = " + rectangle.getLength());
//         System.out.println("rectangle = " + rectangle.getObject());
//         System.out.println("Area of Triangle:"+rectangle.getArea());
//

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name:");
        student.setName(scanner.nextLine());
        System.out.println("Write your surName:");
        student.setSurName(scanner.nextLine());
        System.out.println("Write your age:");
        student.setAge(scanner.nextInt());
        System.out.println("Write your courses:");




        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getSurName() = " + student.getSurName());
        System.out.println("student.getAge() = " + student.getAge());
        for (String course : courses) {
            student.getCourses(course);
//            System.out.println("student.getCourses() = " + Arrays.toString(student.getCourses()));

//        for (String course : student.getCourses()) {
//            System.out.println("student.getCourses() = " + Arrays.toString(course.toCharArray()));
        }
    }
}




//    public static String GetScannerSurname() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write LessonsOfStudents: ");
//        return scanner.nextLine();
//    }
//
//    public static String[] GetScannerSurname() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write LessonsOfStudents: ");
//        return new String[]{scanner.nextLine()};


