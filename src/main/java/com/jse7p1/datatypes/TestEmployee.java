package com.jse7p1.datatypes;

/**
 * Created by sandeep on 27/01/2016.
 *  * Exam Object: Working With Java Data Types
 *
 *   This class should Test the following
 *   a) Declare and initialize variables
 *   b) Differentiate between object reference variables and primitive variables
 *   c) Read or write to object fields
 */


/*
     Testing Topic 1: Declare and initialize variables
    Q1. What will be the output of the code below?

    Answers:

    a)Employee Salary is : 5000
    b)Employee Salary is : 5000.0
    c)Compile Time Error
    d)Run time Error


    Correct Answer:
    c) Java Variable Salary has not been initialized

*/

/*public class TestEmployee {
    public void salary(){
      double salary;
      salary = salary + 5000;
      System.out.println("Employee Salary is : " + salary);
   }

   public static void main(String args[]){
       TestEmployee emp = new TestEmployee();
       emp.salary();
   }
}*/





/*

    Q2.What will be the output of the code below?

    Answers:

    a)100
    b)Compile time Error
    c)Run time Error


    Correct Answer:
    b) transient is reserved word in java, so we can not use it as a variable name.

*/

/*public class TestEmployee {
    static int transient = 100;
    public static void main(String args[]){
        System.out.println(transient);
    }
}*/





/*
    Q3. What will be the output of the code below?

    Answers:

    a)13000
    b)Compile time Error
    c)Run time Error
    d)10000


    Correct Answer:
    a) Salary will be 13000.

*/

/*public class TestEmployee {
    static int performance = 7;
    static double bonus = 3000;
    static double salary = 10000;
    public static void main(String args[]){
        if(performance>5){
            salary = salary + bonus;
        }
        System.out.println("Salary Now is :" + salary);
    }
}*/





/*
    Q4. What will be the output of the code below?

    Answers:

    a)13000
    b)Compile time Error.
    c)Run time Error
    d)10000


    Correct Answer:
    b) We can not assign a value to final variable salary.

*/

/*public class TestEmployee {
    static int performance = 7;
    static double bonus = 3000;
    final static double salary = 10000;
    public static void main(String args[]){
        if(performance>5){
            salary = salary + bonus;
        }
        System.out.println("Salary Now is :" + salary);
    }
}*/





/*
    Q5. What will be the output of the code below?

    Answers:

    a)c is :2
    b)c is :2.0
    c)c is :2.25
    d)Run time Error


    Correct Answer:
    b) Because int/int gives 2 and storage variable is of data type double, so it will become 2.0

*/

/*public class TestEmployee {
    static int a = 9;
    static int b = 4;
    static double c = a/b;
    public static  void  main(String atrgs[]){
        System.out.println("c is :" + c);
    }
}*/





/*
    Q6. Identify the correct pattern of variable in order of their declaration in following class?

    Answers:

    a)InstanceVariable, StaticVariable, MethodLocalVariable, BlockVariable
    b)InstanceVariable, StaticVariable, BlockVariable, MethodLocalVariable
    c)StaticVariable, InstanceVariable, MethodLocalVariable, BlockVariable
    d)StaticVariable, InstanceVariable, BlockVariable, MethodLocalVariable


    Correct Answer:
    c)

*/

/*public class TestEmployee {
    static int employee_id = 10;
    int employee_salary = 20000;

    public void methodName(int methodParameter) {
        int employee_bonus = 5000;

        if (true) {
            int employee_PF = 40000;
        }

    }
}*/





/*
    Q7. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run time Error
    c)No Output
    d)True


    Correct Answer:
    c) a will be initialized to false, so no output

*/

/*
public class TestEmployee {
    public static void main(String args[]){
        boolean a = true;
        boolean b = false;
        if(a = b){
            System.out.print("a is : " +a );
        }
    }
}*/





/*
    Q8. The name of a variable is called as?

    Answers:

    a)DataType
    b)Literal
    c)Keyword
    d)Identifier


    Correct Answer:
    d)

*/


/*
    Q9. A Integer Variable which is only declared, but not initialized, contains what value?

    Answers:

    a)Nothing
    b)Zero
    c)Blank Space
    d)garbage value


    Correct Answer:
    b)

*/


/*

    Q10. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)50
    d)None of these


    Correct Answer:
    c)

*/

/*class TestEmployee {
    public static void main(String args[]){
        for(int i=1,j=50;i<10;){
            i=j;
            System.out.println("Value of i will be : " + i);
            i++;
            j--;
        }
    }
}*/




/*
    Testing Topic 3: Read or write to Object Fields
    Q11. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run time Error
    c)Employee Id is : 102	Employee Name is : Peter	Employee Salary is : 34000.0


    Correct Answer:
    a) Private Variables are not visible to other class.

*/

/*class Employee {
    private int id;
    public String name;
    private double salary;
}
public class TestEmployee {
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.id = 102;
        emp.name = "Peter";
        emp.salary = 34000;
        System.out.print("Employee Id is : " +  emp.id + "\t");
        System.out.print("Employee Name is : "+ emp.name + "\t");
        System.out.print("Employee Salary is : "+ emp.salary);
    }
}*/




/*

    Q12. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run time Error
    c)Employee Id is : 101	Employee Name is : Wilson
    d)Employee Id is : 0	Employee Name is : null


    Correct Answer:
    d) Because method arguments (formal parameters) and instance variables are same

*/

/*public class TestEmployee {
    int id;
    String name;

    void insert(int id, String name){
        id = id;
        name = name;
    }

    void display(){
        System.out.print("Employee Id is : " +  id + "\t");
        System.out.print("Employee Name is : "+ name);
    }

    public static void main(String args[]){
        TestEmployee emp = new TestEmployee();
        emp.insert(101, "Wilson");
        emp.display();
    }
}*/




/*

    Q13. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run time Error
    c)Employee Name is : Wilson	Employee salary is : 10000
    d)Employee Name is : null	Employee salary is : 0


    Correct Answer:
    c) this keyword can be used to refer current class instance variable

*/

/*public class TestEmployee {
    int salary;
    String name;

    void insert(int salary, String name){
        this.salary = salary;
        this.name = name;
    }

    void display(){
        System.out.print("Employee Name is : "+ name + "\t");
        System.out.print("Employee salary is : " +  salary);
    }

    public static void main(String args[]){
        TestEmployee emp = new TestEmployee();
        emp.insert(10000, "Wilson");
        emp.display();
    }
}*/




/*

    Q14. What is default value of an object variable?

    Answers:

    a)0
    b)null
    c)undefined
    d)None of These


    Correct Answer:
    b) null is default value of an object variable

*/


/*

    Q15. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)First Salary Method called
    d)Second Salary Method called


    Correct Answer:
    a) Reference to Salary is ambiguous

*/

/*class TestEmployee{
    void salary(int basic,long hra){System.out.println("First Salary Method called");}
    void salary(long basic,int hra){System.out.println("Second Salary Method called");}

    public static void main(String args[]){
        TestEmployee emp = new TestEmployee();
        emp.salary(15000,6000);
    }
}*/





/*

    Q16. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)21000


    Correct Answer:
    c) As da instance variable is not initialized, so its 0 value will be added to salary

*/

/*class Employee{
    int basic;
    int hra;
    int da;
    int salary;
    void get(int basic, int hra){
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }
    void display(){
        salary = basic + hra + da;
        System.out.println("Salary is : " + salary);
    }
}
class TestEmployee{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.get(15000,6000);
        emp.display();
    }
}*/




/*

    Q17. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)21000


    Correct Answer:
    a) We can not assign a value to final instance variable salary.

*/

/*class Employee{
    int basic = 0;
    int hra = 0;
    int da = 0;
    final int salary = 100000;
    void get(int basic, int hra){
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }
    void display(){
        salary = basic + hra + da;
        System.out.println("Salary is : " + salary);
    }
}
class TestEmployee{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.get(15000,6000);
        emp.display();
    }
}*/





/*

    Q18. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)20000	8000	2000
    d)30000	10000	5000


    Correct Answer:
    c)

*/

/*class Employee{
    int basic;
    int hra;
    int da;

    Employee(){
        basic = 20000; hra = 8000; da = 2000;
    }
}
class TestEmployee extends Employee {
    int basic;
    int hra;
    int da;
     TestEmployee(){
         basic = 30000; hra = 10000; da = 5000;
     }

    public static void main(String args[]){
        Employee emp = new TestEmployee();
        System.out.println(emp.basic +  "\t" + emp.hra + "\t" + emp.da );
    }
}*/




/*

    Q19. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)20000	8000	2000
    d)30000	10000	5000


    Correct Answer:
    a) can not find method display()

*/

/*
class Employee{
    int basic;
    int hra;
    int da;

    void insert(){
        basic = 20000; hra = 8000; da = 2000;
    }
}
class TestEmployee extends Employee {
    int basic;
    int hra;
    int da;
    void insert(){
        basic = 30000; hra = 10000; da = 5000;
    }
    void display(){
        System.out.println(basic +  "\t" + hra + "\t" + da );
    }
    public static void main(String args[]){
        Employee emp = new TestEmployee();
        emp.insert();
        emp.display();
    }
}
*/




/*

    Q20. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c)Employee Class Called
    d)TestEmployee Class Called


    Correct Answer:
    d) TestEmployee Class Method display() will override the display() method of Employee Class.

*/


/*
class Employee{
    void display(){
        System.out.println("Employee Class Called");
    }
}
class TestEmployee extends Employee {
    void display(){
        System.out.println("TestEmployee Class Called");
    }
    public static void main(String args[]){
        Employee emp = new TestEmployee();
        emp.display();
    }
}
*/

/*

    Q21. What will be the output of the code below?

    Answers:

    a)40000	30000	20000
    b)20000	30000	40000
    c)30000	20000	40000
    d)40000	20000	30000


    Correct Answer:
    b)

*/

/*class Employee{
    int getSalary(){
        return 0;
    }
}
class Employee1 extends Employee{
    int getSalary(){
        return 20000;
    }
}
class Employee2 extends Employee{
    int getSalary(){
        return 30000;
    }
}
class Employee3 extends Employee{
    int getSalary(){
        return 40000;
    }
}
class TestEmployee extends Employee {
    public static void main(String args[]){
        Employee1 e1 = new Employee1();
        Employee2 e2 = new Employee2();
        Employee3 e3 = new Employee3();
        e1.getSalary();
        System.out.println(e1.getSalary() + "\t" + e2.getSalary() + "\t" + e3.getSalary());
    }
}*/




/*
    Testing Topic 2: Differentiate between object reference variables and primitive variables
    Q22. What will be the output of the code below?

    Answers:

    a)Compile Time Error
    b)Run time Error
    c)3


    Correct Answer:
    a) Because Arithmetic Operators can only be applied on Primitive Variables, not on Object reference variables.

*/

/*
class Employee{
    Employee(){
        System.out.println("Employee Object Created");
    }
}
public class TestEmployee {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        System.out.println("Sum of Primitive Variables is : "+ (a+b));
        System.out.println("Sum of Object Reference Variables is  : "+ (emp1+emp2));
    }
}*/




/*

    Q23. Primitive variables which are defined as part of an instance of a class are stored in which memory?

    Answers:

    a)Heap Memory
    b)Stack Memory
    c)None of these


    Correct Answer:
    b) Stored in Stack Memory

*/


/*

    Q24. Primitive variables and Object Reference variables are both stored in which memory?

    Answers:

    a)Heap Memory
    b)Stack Memory
    c)None of these


    Correct Answer:
    b) Stored in Stack Memory

*/




/*

    Q25. How many variables, objects and reference variables are created by the following lines of code?

    Answers:

    a)Compile Time Error
    b)Run Time Error
    c) 2 Variables, 2 Objects and 3 Reference Variables


    Correct Answer:
    c) 2 Variables, 2 Objects and 3 Reference Variables

*/

/*class Employee {
    Employee() {
        System.out.println("Employee Object Created");
    }
}

class TestEmployee {
    public static void main(String args[]){
        int a, b;
        Employee emp1, emp2;
        emp1 = new Employee();
        Employee emp3 = new Employee();
    }
}*/




/*

    Q26. Which of the following types are used defined in Java?

    Answers:

    a)Primitive Types
    b)Object Reference Types
    c)Both
    d)None of these


    Correct Answer:
    b) Object Reference Types

*/


/*

    Q27. How many Object Reference Types are there in Java?

    Answers:

    a)8
    b)Not Defined
    c)User Defined
    d)None of these


    Correct Answer:
    b) Object Reference Types are user defined in Java

*/