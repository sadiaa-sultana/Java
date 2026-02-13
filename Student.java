public class Student {

    String name;
    int id;
    float gpa;

    // Constructor
    Student(String name, int id, float gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Method to show student information
    void showInfo() {
        System.out.println("Name of Student: " + name);
        System.out.println("ID of Student: " + id);
        System.out.println("GPA of Student: " + gpa);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {

        student Sakib = new Student("Sakib Mal", 37, 3.00f);
        student Judan = new Student("Judan Sheikh", 67, 2.11f);
        student Safi = new Student("safi Mal", 37, 3.00f);
        student Shawon = new Student("Shawon Sheikh", 47, 4.00f);
        student Sadia = new Student("Sadia Sheikh", 37, 3.67f);
        student Joya = new Student("Joya Henna", 33, 3.67f);

        Sakib.showInfo();
        Judan.showInfo();
        Safi.showInfo();
        Shawon.showInfo();
        Sadia.showInfo();
        Joya.showInfo();
    }
}