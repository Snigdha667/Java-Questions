//Question 4: Design an application in java that contains a class Student having properties.......
public class Student1 {
    String name;
    double percentage;
    Student1(String n, double p) {
        name = n;
        percentage = p;
    }
}
class Test{
    public static void print() {
        Student1 obj = new Student1("Siya", 67.90);
        Student1 obj1 = new Student1("Riya", 89.40);
        Student1 obj2 = new Student1("Diya", 96.67);
        double top = Math.max(Math.max(obj.percentage,obj1.percentage),obj2.percentage);
        if (top == obj.percentage){
            System.out.println(obj.name);
            System.out.println(obj.percentage);
        }
        else if (top == obj1.percentage){
            System.out.println(obj1.name);
            System.out.println(obj1.percentage);
        }
        else {
            System.out.println(obj2.name);
            System.out.println(obj2.percentage);
        }
    }

    public static void main(String[] args) {
        Test.print();
    }
    }
