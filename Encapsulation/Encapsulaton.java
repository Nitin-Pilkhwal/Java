public class Encapsulaton {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("John Doe", 20);
    
        // Get and print the student's name and age
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    
        // Set and print new name and age
        student.setName("Jane Doe");
        student.setAge(22);
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
    
}

class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}