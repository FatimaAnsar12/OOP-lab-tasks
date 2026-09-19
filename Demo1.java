class Student{
String studentId;
String name;
int completedCredits;
}
public class Demo1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "BAI-001";
        s1.name = "zainab haroon ";
        s1.completedCredits = 20;

        s2.studentId = "BAI-002";
        s2.name = "fatima Ansar";
        s2.completedCredits = 25;

        s3.studentId = "BAI-003";
        s3.name = "atika meharban";
        s3.completedCredits = 18;

        System.out.println("Before changing:");

        System.out.println(s1.studentId + " " + s1.name + " "
                + s1.completedCredits);

        System.out.println(s2.studentId + " " + s2.name + " "
                + s2.completedCredits);

        System.out.println(s3.studentId + " " + s3.name + " "
                + s3.completedCredits);

        // Change only s2
        s2.completedCredits = s2.completedCredits + 10;

        System.out.println("\nAfter changing s2:");

        System.out.println(s1.studentId + " " + s1.name + " "
                + s1.completedCredits);

        System.out.println(s2.studentId + " " + s2.name + " "
                + s2.completedCredits);

        System.out.println(s3.studentId + " " + s3.name + " "
                + s3.completedCredits);

        // s1, s2 and s3 are separate Student objects.
        // Therefore, changing s2 does not change s1 or s3.
    }
}