import java.io.*;

public class Task_3_Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student1 = new Student(1, "Larry", 17);
        Course course1 = new Course("Matehemaics", "math26", "David Johnson");

        Enrolment enrolment1 = new Enrolment(student1, course1, "30.01.2026");


        // Serialize and save the Enrollment instance
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("enrollments.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(enrolment1);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Successfully Serialized & wrote enrollments.ser");
        }
        catch (Exception e) {
            System.out.println("Virhe Serialisoinnissa: " + e.getMessage());
        }

        // Deserialize and print the Enrollment instance
        try {
            FileInputStream fileInputStream = new FileInputStream("enrollments.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Enrolment loadedEnrolment = (Enrolment) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("deserializatoin Successful");

            System.out.println("Student id: " + loadedEnrolment.getStudent().getId() + ", Student: " + loadedEnrolment.getStudent().getName() + ", age: " +  loadedEnrolment.getStudent().getAge());
            System.out.println("Course: " + loadedEnrolment.getCourse().getCourseCode() + ", Course name: " + loadedEnrolment.getCourse().getCourseName() + ", Instructor: " + loadedEnrolment.getCourse().getInstructor());
            System.out.println("Enrollment date: " + loadedEnrolment.getEnrolmentDate());
        }
        catch (Exception e) {
            System.out.println("Virhe deserialisoinnissa: " + e.getMessage());
        }
    }
}