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

        Student Sakib = new Student("Sakib ", 37, 3.60f);
        Student Judan = new Student("Judan ", 67, 3.16f);
        Student Safi = new Student("Ruhi ", 37, 3.30f);
        Student Shawon = new Student("Shawon ", 47, 3.00f);
        Student Sadia = new Student("Sadia Sultana", 37, 3.65f);
        Student Joya = new Student("Joya ", 33, 3.50f);

        Sakib.showInfo();
        Judan.showInfo();
        Safi.showInfo();
        Shawon.showInfo();
        Sadia.showInfo();
        Joya.showInfo();
    }
}