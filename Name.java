//WAP to print the names of students by creating a Student class . If no name is passed while creating object then name 
// should be "unknown" otherwise should be equal to String value passed while creating object of student class.
//CONSTRUCTOR CONCEPT
public class Student {
    String stu;
    Student()
    {
        stu = "Unknown";
    }
    public void abc(){
        Student obj = new Student();
        obj.stu = "Akarsh";
        System.out.println(obj.stu);
    }
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.abc();
    }
}