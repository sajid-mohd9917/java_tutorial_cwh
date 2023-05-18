import java.util.Scanner;

class Employee {
    Employee() {
        System.out.printf("\n it's the Defaul constructo in class emplopyee\n\n");
    }

    Employee(String str) {
        System.out.println(str+"\n");
    }

    Employee(int id, String str) {
        System.out.println("employeee id is = " + id + "\nName is = " + str + "\n");
    }

    Employee(int i, String str, int s) {
        System.out.println("Employee id =" + i + "\nName is= " + str + "\nSalary is = " + s+"\n");
    }
}

public class C_42Construtor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee obj = new Employee();
        Employee obj1 = new Employee("Harry");
        Employee obj2 = new Employee(345, "Harry");
        Employee obj3 = new Employee(345, "Harry", 70000);

    }
}




// class Employee {
// // First constructor
// Employee(String s, int i){
// System.out.println("The name of the first employee is : " + s);
// System.out.println("The id of the first employee is : " + i);
// }
//
// // Constructor overloaded
// Employee(String s, int i, int salary){
// System.out.println("The name of the second employee is : " + s);
// System.out.println("The id of the second employee is : " + i);
// System.out.println("The salary of second employee is : " + salary);
// }

// }
// public class C_42Construtor {
// public static void main(String[] args) {
    
// Employee shubham = new Employee("Shubham",1);
// Employee harry = new Employee("Harry",2,70000);

// }
// }
