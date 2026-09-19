public class Task2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentId = "BAI-001";
        s1.name = "Zainab Haroon";
        s1.completedCredits = 30;

        s2.studentId = "BAI-002";
        s2.name = "Fatima Ansar";
        s2.completedCredits = 45;

        System.out.println("Before addCredits:");

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        // Prediction: s1 completed credits become 45
        s1.addCredits(10);

        // Prediction: s2 completed credits become 55
        s2.addCredits(10);

        System.out.println("\nAfter addCredits:");

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        // Prediction: 170 - 35 = 135
        int s1Remaining = s1.remainingCredits(170);

        // Prediction: 170 - 50 = 120
        int s2Remaining = s2.remainingCredits(170);

        System.out.println("\nRemaining credits:");

        System.out.println(s1.name + ": " + s1Remaining);
        System.out.println(s2.name + ": " + s2Remaining);

        System.out.println("Summary:");

        System.out.println(s1.summary());
        System.out.println(s2.summary());
    }
}
class Student {
    String studentId;
    String name;
    int completedCredits;

    void addCredits(int credits) {
        completedCredits = completedCredits + credits;
    }

    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    String summary() {
        return "ID: " + studentId
                + ", Name: " + name
                + ", Completed Credits: " + completedCredits;
    }
}