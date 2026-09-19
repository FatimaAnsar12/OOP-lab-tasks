public class OverloadDemo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course "
                + courseCode + ", section " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course "
                + numericCourseCode);
    }

    /*
    INVALID OVERLOAD:

    This cannot be used because it has the same
    name and parameter type as enroll(String).

    int enroll(String courseCode) {
        return 1;
    }
    */

    public static void main(String[] args) {

        OverloadDemo demo = new OverloadDemo();

        // Valid calls
        demo.enroll("CSC241");

        demo.enroll("CSC241", 2);

        demo.enroll(241);

        /*
        Invalid calls:

        demo.enroll();

        demo.enroll("241", "2");
        */
    }
}