package com.jse7p1.javabasics;

/**
 * Created by sandeep on 21/01/2016.
 *
 * Exam Object 1.1,1.2,1.3
 *
 *   This class should Test the following
 *   a) Rules related to class declaration,structure,modifiers.
 *   b) Rules related to scope of variables
 *   c) Rules on main method declaration,method signature etc.
 *
 */


/*TODO Ramesh
    Begin preparing questions here. The format should be as follows.
       a) First declare the question. Just above the question write a small summary of whats being tested.
       b) Then declare the answers.
       c) Then write small code to verify the Q and answer.
       d) The first Testing Topic example is given below and has 2 questions .You can uncomment any one questions code to test.
       e) Aim to write about 5 questions/programs for each of the topics I have set below.
       f) For names. I suggest you use names of classes, methods, variables that are normally used such as from the below list
            {Company,Employee,Employer} {Car,Manufacturer,Driver} {House,Room,Door} ..etc dont use any specific names of persons etc.
       g) You should also make questions that dont have code and test specific knowledge of the topic but no more than 2 per topic and should test important aspect of the question. These should be in addition to 5 code related questions.
 */

/*
    Testing Topic 1: Testing abstract classes

    Q1.What will be the output of the code below?

    Answers:

    a)Jack01/06/1977
    b)Compile time Error.
    c)Run time Error


    Correct Answer:
    b) Employee class does not implement method getEmployeeId and is not declared abstract.

*/

/*
public class TestEmployee {
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        System.out.println(employee.getEmployeeName() + employee.getEmployeeDOB());
    }
}


class Employee
{
    String employeeName = "Jack";
    String employeeDOB = "01/06/1977";
    String employeeId = "EMP1789234";

    Employee(){}

    String getEmployeeName()
    {
        return this.employeeName;
    }
    String getEmployeeDOB()
    {
        return this.employeeDOB;
    }
    String getEmployeeId();

}

 */
/*
    Q2 What will be the output of the code below?


    Answers:
    a)Jack01/06/1977EMP1789234
    b)Compile time Error.
    c)Run time Error

    Correct Answer:

    b) Employee class is  abstract and therefore cannot be instantiated.

 */
/*
public class TestEmployee {
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        System.out.println(employee.getEmployeeName() + employee.getEmployeeDOB());
    }
}


abstract class Employee
{
    String employeeName = "Jack";
    String employeeDOB = "01/06/1977";
    String employeeId = "EMP1789234";

    Employee(){}

    String getEmployeeName()
    {
        return this.employeeName;
    }
    String getEmployeeDOB()
    {
        return this.employeeDOB;
    }
    String getEmployeeId();

}
*/
/*
    Q3 What will be the output of the code below?


    Answers:
    a) Have a nice day!
    b)Compile time Error.
    c)Run time Error

    Correct Answer:

    b) Class must be abstract if any one method of class is abstract.

 */
/*
 class employee
{
    abstract void employer();
}
class TestEmployee extends employee
{
    void employer()
    {
        System.out.println("Have a nice day!");
    }
    public static void main(String[] args)
    {
        TestEmployee te = new TestEmployee();
        te.employer();
    }
}

*/


/*
    Q4 What will be the output of the code below?


    Answers:
    a) Have a nice day!
    b)Compile time Error.
    c)Run time Error

    Correct Answer:

    b) Invalid method declaration, return type required

 */
/*
 abstract class employee
{
      employer();
}
class TestEmployee extends employee
{
    void employer()
    {
        System.out.println("Have a nice day!");
    }
    public static void main(String[] args)
    {
        TestEmployee te = new TestEmployee();
        te.employer();
    }
}
*/

/*
    Q5 What will be the output of the code below?


    Answers:
    a) Have a nice day!
    b)Compile time Error.
    c)Run time Error

    Correct Answer:

    b) Abstract methods cannot have a body

 */
/*
 abstract class employee{abstract void employer(){System.out.println("Have a nice day!");}}

class TestEmployee extends employee
{

    public static void main(String[] args)
    {
        TestEmployee te = new TestEmployee();
        te.employer();
    }
}
*/


/*
    Q6 What will be the output of the code below?


    Answers:
    a) drawing circle
    b) drawing rectangle
    c)compile time error

    Correct Answer:

    a) drawing circle

 */
/*
abstract class Shape{abstract void draw();}

class Rectangle extends Shape{void draw(){System.out.println("drawing rectangle");}}

class Circle extends Shape{void draw(){System.out.println("drawing circle");}}

class TestEmployee{public static void main(String args[]){Shape s=new Circle();s.draw();}}

*/

/*
    Q7 What will be the output of the code below?


    Answers:
    a)  drawing circle
        drawing rectangle
    b) drawing rectangle
    c)compile time error

    Correct Answer:

    a)  drawing circle
        drawing rectangle

 */
/*
abstract class Shape{abstract void draw();}

class Rectangle extends Shape{void draw(){System.out.println("drawing rectangle");}}

class Circle extends Shape{void draw(){System.out.println("drawing circle");}}

class TestEmployee{public static void main(String args[]){Shape s=new Circle();Shape s1=new Rectangle();s.draw();s1.draw();}}

*/


/*
    Q8 What will be the output of the code below?


    Answers:
    a) drawing rectangle
    b) drawing circle
    c)compile time error

    Correct Answer:

    a) drawing rectangle


 */
/*
abstract class Shape{abstract void draw();}

class Rectangle extends Shape{void draw(){System.out.println("drawing rectangle");}}

class Circle extends Shape{void draw(){System.out.println("drawing circle");}}

class TestEmployee{public static void main(String args[]){Shape s=new Circle();Shape s1=new Rectangle();s1.draw();}}
*/


/*
    Q9 What will be the output of the code below?


    Answers:
    a) drawing rectangle,drawing circle,drawing circle
    b) Run time error
    c)compile time error

    Correct Answer:

    c) all abstract methods of abstract class must be implemented


 */
/*
abstract class Shape{abstract void draw();abstract void paint();}

class Rectangle extends Shape{void draw(){System.out.println("drawing rectangle");}}

class Circle extends Shape{void draw(){System.out.println("drawing circle");}void paint(){System.out.println("drawing circle");}}

class TestEmployee{public static void main(String args[]){Shape s=new Circle();Shape s1=new Rectangle();s1.draw();s1.paint();s.draw();s.paint();}}

*/

/*
    Q10 What will be the output of the code below?


    Answers:
    a) 21, 27
    b) Run time error
    c)compile time error

    Correct Answer:

    a) 21,27


 */
/*
 abstract class Multiply{

    public abstract int multiplyTwo(int n1, int n2);

    public int multiplyThree(int num1, int num2, int num3){
        return num1*num2*num3;
    }

}

class TestEmployee extends Multiply{
    public int multiplyTwo(int num1, int num2){
        return num1*num2;
    }

    public static void main(String args[]){
        TestEmployee obj = new TestEmployee();
        System.out.println(obj.multiplyTwo(3, 7));
        System.out.println(obj.multiplyThree(1, 9, 3));
    }
}

*/


/*
    Q11 What will be the output of the code below?


    Answers:
    a) 21, 27
    b) Run time error
    c)compile time error

    Correct Answer:

    c) body must be there if a method is not abstract in abstract class.


 */
/*
 abstract class Multiply{

    public abstract int multiplyTwo(int n1, int n2);
    public  int multiplyThree(int n1, int n2);


}

class TestEmployee extends Multiply{
    public int multiplyTwo(int num1, int num2){
        return num1*num2;
    }
    public int multiplyThree(int num1, int num2, int num3){
        return num1*num2*num3;
    }

    public static void main(String args[]){
        TestEmployee obj = new TestEmployee();
        System.out.println(obj.multiplyTwo(3, 7));
        System.out.println(obj.multiplyThree(1, 9, 3));
    }
}

*/

/*
    Q12 if a class have at least one abstract method?


    Answers:
    a) class may or may not be declared abstract
    b) class must be declared abstract
    c)class must not be declared abstract

    Correct Answer:

    b) class must be declared abstract


 */

/*
    Q13 Which of the following declares an abstract method in an abstract Java class?


    Answers:
    a) public abstract void method() {}
    b) public abstract method();
    c)public void abstract Method();

    Correct Answer:

    c) public void abstract Method();

 */

/*
    Q14 Can we declare abstract variable?

    Answers:
    a) No
    b) yes

    Correct Answer:

    a) only classes and methods can be declared as abstract.

 */

/*
    Q15 Can a abstract class be declared final?

    Answers:
    a) No
    b) yes

    Correct Answer:

    a) An abstract class without being inherited is of no use and hence will result in compile time error.

 */


/*
Testing Topic 2: Testing variable scope

    Q16 What will be the output of the code below?


    Answers:
    a) x=0 will be printed 6 times.
    b)Compile time Error.
    c)Run time Error
    d) x=0 will be printed 5 times.

    Correct Answer:

    a) x=0 will be printed 6 times.

 */
/*
public class TestEmployee {

    public static void main(String[] args) {
        int x;
        for (x=0;x<=5;x++)
        {
            int y=0;
            System.out.println("x = "+y);
        }

    }

}
*/

/*
    Q17 What will be the output of the code below?


    Answers:
    a) employye = 1, employe = 3
    b)Compile time Error.
    c)Run time Error


    Correct Answer:

    b) employe cannot be resolved a variable.

 */
/*
public class TestEmployee {
    public static void main(String[] args) {
        int employee = 1;

        {
            int employe = 2;
            System.out.println("employye = " + employee);
        }

        int employye = 3;
        System.out.println("employe = " + employe);
    }
}
*/

/*
Q18 What will be the output of the code below?


        Answers:
        a) age:20
        b)Compile time Error.
        c)Run time Error


        Correct Answer:

        b) age cannot be resolved to a variable

        // System.out.println("Age: " + age); should be written in Employeeage().

 */

/*
public class TestEmployee {
    public void Employeeage() {
        int age = 0;
        age = age + 20;

    }

    public static void main(String args[]) {
        TestEmployee te = new TestEmployee();
        te.Employeeage();
        System.out.println("Age: " + age);
    }
}

*/
/*
Q19 What will be the output of the code below?


        Answers:
        a) Obj1: count is=2,Obj2: count is=3
        b)Compile time Error.
        c)Run time Error
        d) Obj1: count is=2,Obj2: count is=2



        Correct Answer:

        d) Static variable shared by multiple objects

 */

/*
public class TestEmployee
{
    static int count=0;
    public void increment()
    {
        count++;
    }
    public static void main(String args[])
    {
        TestEmployee obj1=new TestEmployee();
        TestEmployee obj2=new TestEmployee();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
    }
}
*/

/*
Q20 What will be the output of the code below?


        Answers:
        a) I'm a static variable
        b)Compile time Error.
        c)Run time Error
        d) Obj1: count is=2, Obj2: count is=2



        Correct Answer:

        b) name cannot be resolved or is not a field

 */

/*
public class TestEmployee {
    public static void main(String[] args) {
        System.out.println(Employee.name);
    }


    public class Employee {
        public static final String NAME = "I'm a static variable";
    }
}

*/

/*
Q21 If you are declaring class variable as public static final, then variable(constant) should be:


        Answers:
        a) in lower case
        b) in upper case
        c)does not matter

        Correct Answer:

        b) variable(constant) should be in upper case.

 */

/*
Q22 Static variable’s value is same for all the objects(or instances) of the class:


        Answers:
        a) yes
        b) no
        c) none of above

        Correct Answer:

        a) yes, instances(objects) of the same class share a single copy of static variables.

 */

/*
Q23 What will be the output of the code below?


        Answers:
        a)  x=9
        b)Compile time Error.
        c) x=10




        Correct Answer:

        b) Local variables can not be static allowed

 */

/*
class TestEmployee {

              static int Employee()
             {
                 static int x= 10;
                 return --x;
             }
    public static void main(String args[]) {
        System.out.println(Employee());
    }
}
*/


/*
Q24 What will be the output of the code below?


        Answers:
        a)  x=21
        b)Compile time Error.
        c) x=22




        Correct Answer:

        c) x=22

 */

/*
class TestEmployee {
    static int x= 10;

              static int Employee()
             {

                 return x = ++x + x++;
             }
    public static void main(String args[]) {
        System.out.println(Employee());
    }
}

*/


/*
Q25 What will be the output of the code below?


        Answers:
        a)  x=21
        b)Compile time Error.
        c) x=22




        Correct Answer:

        b) non-static variable cannot be referenced from a static method

 */

/*
class TestEmployee {
     int x= 10;

              static int Employee()
             {

                 return x = ++x + --x;
             }
    public static void main(String args[]) {
        System.out.println(Employee());
    }
}

*/

/*
Q26 What will be the output of the code below?


        Answers:
        a)  x=12
        b) x=10
        c) Compile time Error.




        Correct Answer:

        c) non-static method cannot be referenced from a static method

 */

/*
class TestEmployee {
     int x= 10;

              int Employee()
             {
                  int x= 12;
                 return x;
             }
    public static void main(String args[]) {
        System.out.println(Employee());
    }
}
*/

/*
Q27 What will be the output of the code below?


        Answers:
        a)  x=12
        b) x=10
        c) Compile time Error.
        d) Run time error.




        Correct Answer:

        c) main method should be static

 */

/*
class TestEmployee {
     int x= 10;

               int Employee()
             {
                  int x= 12;
                 return x;
             }
    public void main(String args[]) {
        System.out.println(Employee());
    }
}

*/

/*
Q28 What will be the output of the code below?


        Answers:
        a)  Total 2 cars manufactured
        b) Total 2 cars manufactured
        c) Compile time Error.
        d) Total 0 cars manufactured




        Correct Answer:

        d) Total 0 cars manufactured

 */

/*
class Company {
        static int count = 2;

    Company() {
            count--;
        }
        public static void main(String arr[]) {
            Company t1 = new Company();
            Company t2 = new Company();
            System.out.println("Total " + count + " cars manufactured");
        }
    }

*/

/*
Q29 A static method can access :


        Answers:
        a) Static data
        b) Non-static data
        c) Both static and non-static data



        Correct Answer:

        b)static data
*/

/*
Q30 A static method can access instance variable?


        Answers:
        a) yes
        b) No
        c) none



        Correct Answer:

        b) No
*/

/*
Q31 What will be the output of the code below?


        Answers:
        a) -1
        b) -2
        c) -3
        d)Compile time Error.


        Correct Answer:

        c) -3

 */

/*
class TestEmployee {

    static int Employee()
    {

        return x = x-- + x++;
    }
    public static void main(String args[]) {
        System.out.println(Employee());
    }
    static int x= -1;
}
*/


//Testing Topic 3: Testing Class Modifier

/*
Q32 What will be the output of the code below?


        Answers:
        a) Compile time Error.
        b) Good Luck
        c) Run time error

        Correct Answer:

        b) Good Luck

 */
/*
class Employee{
    public Employee(){}
    void msg(){System.out.println("Good luck");}
}
public class TestEmployee{
    public static void main(String args[]){Employee ep = new Employee();ep.msg();}}

*/


/*
Q33 What will be the output of the code below?


        Answers:
        a) Compile time Error.
        b) Good Luck
        c) Run time error

        Correct Answer:

        a) private access can not be accessed in another class

 */
/*
class Employee{
     private Employee(){}
    void msg(){System.out.println("Good luck");}
}
public class TestEmployee{
    public static void main(String args[]){Employee ep = new Employee();ep.msg();}}

*/
/*
Q34 What will be the output of the code below?


        Answers:
        a) Compile time Error.
        b) Good Luck
        c) Run time error

        Correct Answer:

        b) protected access modifier is accessible within package

*/
/*
class Employee{
     protected Employee(){}
    void msg(){System.out.println("Good luck");}
}
public class TestEmployee{
    public static void main(String args[]){Employee ep = new Employee();ep.msg();}}
*/


/*
Q35 What will be the output of the code below?


        Answers:
        a) Have a good day.
        b) Congrats
        c) Compile time error

        Correct Answer:

        b) Congrats

 */
/*
class Test{
     void msg(){System.out.println("Have a good day");}
}

public class TestEmployee extends Test{
    void msg(){System.out.println("Congrats");}
    public static void main(String args[]){
        TestEmployee obj=new TestEmployee();
        obj.msg();
    }
}
*/

/*
Q36 What will be the output of the code below?


        Answers:
        a) Have a good day.
        b) Congrats
        c) Compile time error

        Correct Answer:

        c) Attempting to assign weaker access privileges

 */
/*
class Test{
    protected void msg(){System.out.println("Have a good day");}
}

public class TestEmployee extends Test{
    void msg(){System.out.println("Congrats");}
    public static void main(String args[]){
        TestEmployee obj=new TestEmployee();
        obj.msg();
    }
}
*/


/*
Q37 What will be the output of the code below?


        Answers:
        a) Compile time error
        b) Run time error
        c) public,private,protected

        Correct Answer:

        a) Compile time error

 */
/*
public class TestEmployee {

    public static String PublicMethod() {return "public";}

    private static String PrivateMethod() {return "private";}

    protected static String ProtectedMethod() {return "protected";}

}
    public class Employee extends TestEmployee {
        public static void main(String[] args) {

            System.out.println(PublicMethod());
            System.out.println(PrivateMethod());
            System.out.println(ProtectedMethod());
        }
    }

*/

/*
Q38 What will be the output of the code below?


        Answers:
        a) Compile time error
        b) Run time error
        c) ABC's salary is 10000

        Correct Answer:

        c) ABC's salary is 10000

 */

/*
class TestEmployee
{
    final String EMPLOYEE_NAME = "ABC";
    final int MAX_SALARY = 10000;
    final void display()
    {
        System.out.println(EMPLOYEE_NAME +"'s salary is " + MAX_SALARY );
    }
    public static void main(String arr[])
    {
        TestEmployee te = new TestEmployee();
        te.display();
    }
}
*/

/*
Q39 What will be the output of the code below?


        Answers:
        a) Compile time error
        b) Run time error
        c) Employee name is ABC

        Correct Answer:

        a) final variable value must be initialized.

        */

/*
class TestEmployee
{
    final String EMPLOYEE_NAME = "ABC";
    final int MAX_SALARY;
    final void display()
    {
        System.out.println("Employee name is "+EMPLOYEE_NAME);
    }
    public static void main(String arr[])
    {
        TestEmployee te = new TestEmployee();
        te.display();
    }
}
*/

/*
Q40 What will be the output of the code below?


        Answers:
        a) Compile time error
        b) Congrats
        c) Run time error

        Correct Answer:

        a) final class can not be inherited

        */

/*
final class Test{
     void msg(){System.out.println("Have a good day");}
}

public class TestEmployee extends Test{
    void msg(){System.out.println("Congrats");}
    public static void main(String args[]){
        TestEmployee obj=new TestEmployee();
        obj.msg();
    }
}

*/

/*
Q41 What will be the output of the code below?


        Answers:
        a) congrats
        b)Compile time error
        c) Run time error

        Correct Answer:

        b) method declared private can not be inherited

        */

/*
 class Test{
     private void msg(){System.out.println("Have a good day");}
}

public class TestEmployee extends Test{
    public static void main(String args[]){
        TestEmployee obj=new TestEmployee();
        obj.msg();
    }
}
*/

/*
Q42 Is access modifier and access specifier same?


        Answers:
        a) yes
        b)No


        Correct Answer:

        b) access specifier is used synonymously in the Java API doc

 */

/*
Q43 Is it must to initialize final field when it is declared?


        Answers:
        a) yes
        b)No


        Correct Answer:

        a) Final field must be initialized when it is declared.

 */

/*
Q44 Can we inherit private methods?


        Answers:
        a) yes
        b)No


        Correct Answer:

        b) Methods declared private are not inherited at all, so there is no rule for them.

 */


/*
Q45 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) 5000 ABC

        Correct Answer:

        b) value can not be assigned to final variable.

*/
/*
class TestEmployee{
   final int esalary=5000;
    String ename = "ABC";

    TestEmployee(int sal,String name){
        esalary = sal;
        ename = name;
    }
    void display(){System.out.println(esalary+" "+ename);}

    public static void main(String args[]){
        TestEmployee s1 = new TestEmployee(5000,"ABC");
        s1.display();
    }
}
*/

// Testing Topic 4: class constructor

/*
Q46 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) Good Morning

        Correct Answer:

        c) Good Morning

*/

/*
class TestEmployee{
    TestEmployee(){System.out.println("Good Morning");}
    public static void main(String args[]){TestEmployee te=new TestEmployee();}}
*/

/*
Q47 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) 5000 is salary of ABC

        Correct Answer:

        c) 5000 is salary of ABC

*/
/*
class TestEmployee{
    final int Salary=5000;
    String ename ="ABC";

    void display(){System.out.println(Salary+" is salary of "+ename);}

    public static void main(String args[]){
        TestEmployee s1=new TestEmployee();
        s1.display();
    }
}
*/

/*
Q48 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) 5000 ABC

        Correct Answer:

        c) 5000 ABC

*/
/*
class TestEmployee{
    int esalary;
    String ename;

    TestEmployee(int sal,String name){
        esalary = sal;
        ename = name;
    }
    void display(){System.out.println(esalary+" "+ename);}

    public static void main(String args[]){
        TestEmployee s1 = new TestEmployee(5000,"ABC");
        s1.display();
    }
}
*/

/*
Q49 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) 5000 ABC

        Correct Answer:

        b) Actual argument int can not be converted to String(See parameters in Constructor)

*/
/*
class TestEmployee{
    int esalary;
    String ename;

    TestEmployee(String name,int sal){
        esalary = sal;
        ename = name;
    }
    void display(){System.out.println(esalary+" "+ename);}

    public static void main(String args[]){TestEmployee s1 = new TestEmployee(5000,"ABC");s1.display();}}
*/


/*
Q50 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) 5000 ABC

        Correct Answer:

        b) parameters given in Constructor but value is not given in main() method.

*/
/*
class TestEmployee{
    int esalary=5000;
    String ename = "ABC";

    TestEmployee(int sal,String name){
        esalary = sal;
        ename = name;
    }
    void display(){System.out.println(esalary+" "+ename);}

    public static void main(String args[]){
        TestEmployee s1 = new TestEmployee();
        s1.display();
    }
}
*/

/*
Q51 What will be the output of the code below?


        Answers:
        a) Hello
        b)Run time error
        c) Compile time error

        Correct Answer:

        a) when we do not declare constructor, compiler do it by itself

*/
/*
class TestEmployee{public void employee(){System.out.println("hello");}

    public static void main(String args[]){TestEmployee obj = new TestEmployee();obj.employee();}}
*/

/*
Q52 What will be the output of the code below?


        Answers:
        a) employee salary is : 10
        b)Run time error
        c) Compile time error

        Correct Answer:

        a) employee salary is : 10

*/

/*
class TestEmployee{
    private int sal;
    public TestEmployee(){ sal = 10;}
    public TestEmployee(int salary){sal = salary;}
    public int getValue(){return sal;}
    public static void main(String args[]){TestEmployee te = new TestEmployee();System.out.println("employee salary is: "+te.getValue());}}

*/

/*
Q53 What will be the output of the code below?


        Answers:
        a) x = 10
        b)Run time error
        c) Compile time error

        Correct Answer:

        b) Run time error

*/
/*
class TestEmployee
{
    TestEmployee()
    {
        this(10);
    }
    TestEmployee(int x)
    {
        System.out.println("x="+x);
    }
}

*/

/*
Q54 What will be the output of the code below?


        Answers:
        a) Run time error
        b)1108,1109
        c) Compile time error

        Correct Answer:

        b) 1108,1109

*/

/*
class Employee {int eid1;Employee(int id){this.eid1 = id;}}

class Engineer extends Employee {int eid2;Engineer(int id1, int id2) {super(id1);this.eid2 = id2;}void show() {System.out.println( eid1);System.out.println( eid2);}}

class TestEmployee {public static void main(String args[]) {Engineer err = new Engineer(1108, 1109);err.show();}}
*/

/*
Q55 What will be the output of the code below?


        Answers:
        a) Run time error
        b)1108,1109
        c) Compile time error

        Correct Answer:

        c) Compile time error

*/

/*
class Employee {int eid1;Employee(int id){this.eid1 = id;}}

class Engineer extends Employee {int eid2;Engineer(int id1, int id2) {this.eid1=id1;this.eid2 = id2;}void show() {System.out.println( eid1);System.out.println( eid2);}}

class TestEmployee {public static void main(String args[]) {Engineer err = new Engineer(1108, 1109);err.show();}}
*/

/*
Q56 What will be the output of the code below?


        Answers:
        a) Run time error
        b) 200
        c) Compile time error

        Correct Answer:

        c) 200

*/

/*
class Rectangle {
    int length;
    int breadth;
    int area;

    Rectangle(int len,int bre){length  = len;breadth = bre;}
    void area(){area=length*breadth;System.out.println(area);}}


class TestEmployee {public static void main(String args[]) {Rectangle r1 = new Rectangle(20,10);r1.area();}}

*/

/*
Q57 Can a constructor be private?


        Answers:
        a) yes
        b) No
        c) none of the above

        Correct Answer:

        a) Private constructor is used to serve singleton classes

*/


/*
Q58 Can we call a constructor from other?


        Answers:
        a) yes
        b) No
        c) none of the above

        Correct Answer:

        a) calling one constructor from other is called constructor chianing.
*/

/*
Q59 How manu arguments we can give in copy constructor?


        Answers:
        a) any number
        b) one
        c) none of the above

        Correct Answer:

        a) Copy constructor can have only one argument.
*/

/*
Q60 what is return type of constructor?


        Answers:
        a) int
        b) float
        c) void
        d) none of the above

        Correct Answer:

        d) Constructors does not have any return type.
*/





// Testing Topic 4: class constructor


/*
Q61 What will be the output of the code below?


        Answers:
        a) Run time error
        b)Compile time error
        c) 5000null, 5000 ABC XYZ Corp

        Correct Answer:

        c) 5000null, 5000 ABC XYZ Corp

*/
/*
class TestEmployee{int esalary;String ename;String ecompany;

    TestEmployee(int sal,String name){esalary = sal;ename = name;}

    TestEmployee(int sal,String name, String cname){esalary = sal;ename = name;ecompany = cname;}

    void display(){System.out.println(esalary+" "+ename+ ""+ecompany);}

    public static void main(String args[]){TestEmployee s1 = new TestEmployee(5000,"ABC");TestEmployee s2 = new TestEmployee(5000,"ABC"," XYZ Corp");

        s1.display();s2.display();}}

*/


