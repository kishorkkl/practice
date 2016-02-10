package com.jse7p1.inheritance;

/**
 * Created by sandeep on 10/02/2016.
 *
 * Exam Objective Working with Inheritance
 *
 *
    1.Implement inheritance
    2.Develop code that demonstrates the use of polymorphism
    3.Differentiate between the type of a reference and the type of an object
    4.Determine when casting is necessary
    5.Use super and this to access objects and constructors
    6.Use abstract classes and interfaces

 */

// Topic 1 : Implement inheritance
/*
Q1. What will be the output of the code below?

        Answers:

        a)30
        b)Compile Time Error
        c)Run time Error

        Correct Answer:
        a) 30

*/
/*
public class TestEmployee {
        int z;
        public void addition(int x, int y){
            z = x+y;
            System.out.println(+z);}}
     class Employee extends TestEmployee{
        public static void main(String args[]){
            int a = 20, b = 10;
            Employee em = new Employee();
            em.addition(a, b);}}
*/

/*
Q2. What will be the output of the code below?

        Answers:

        a) 30
        b) Compile Time Error
        c) Run time Error

        Correct Answer:
        a) Compile Time Error (private class can not be inherited)

*/
/*
private class TestEmployee {
        int z;
        public void addition(int x, int y){
            z = x+y;
            System.out.println(+z);}}
     class Employee extends TestEmployee{
        public static void main(String args[]){
            int a = 20, b = 10;
            Employee em = new Employee();
            em.addition(a, b);}}
*/

/*
Q3. What will be the output of the code below?

        Answers:

        a) 30
        b) Compile Time Error
        c) Run time Error

        Correct Answer:
        a) Compile Time Error (we can not implement a class)

*/
/*
public class TestEmployee {
        int z;
        public void addition(int x, int y){
            z = x+y;
            System.out.println(+z);}}
     class Employee implements TestEmployee{
        public static void main(String args[]){
            int a = 20, b = 10;
            Employee em = new Employee();
            em.addition(a, b);}}
*/

/*
Q4. What will be the output of the code below?

        Answers:

        a) 50000
        b) 50000.0
        c) Compile Time Error

        Correct Answer:
        b) 50000.0

*/
/*

public class TestEmployee {
        float salary=40000;
    }
    class Employee extends TestEmployee{
        int bonus=10000;
        float nsalary = salary+bonus;
        public static void main(String args[]){
            Employee p=new Employee();
            System.out.println(+p.nsalary);}}
*/


/*
Q5. What will be the output of the code below?

        Answers:

        a) 50000
        b) 50000.0
        c) Compile Time Error

        Correct Answer:
        c) Compile Time Error

*/

/*
public class TestEmployee {
        float salary=40000;
    }
    class Employee extends TestEmployee{
        int bonus=10000;
        int nsalary = salary+bonus;
        public static void main(String args[]){
            Employee p=new Employee();
            System.out.println(+p.nsalary);}}
*/


/*
Q5. What will be the output of the code below?

        Answers:

        a) Hello Welcome
        b) Welcome Hello
        c) Compile Time Error

        Correct Answer:
        c) Compile Time Error (java does not support multiple inheritance)

*/

/*
public class TestEmployee {
        void msg(){System.out.println("Hello");}
    }
    class Test{
        void msg(){System.out.println("Welcome");}
    }
    class employer extends TestEmployee,Test{

        public static void main(String args[]){
            employer em = new employer();
            em.msg();}}
*/

/*
Q6. What will be the output of the code below?

        Answers:

        a) Hello Welcome
        b) Welcome Hello
        c) Compile Time Error

        Correct Answer:
        b) Welcome Hello

*/

/*
public class TestEmployee {
        void msg1(){System.out.print("Hello ");}
    }
    class Test extends TestEmployee{
        void msg2(){System.out.print("Welcome ");}
    }
    class employer extends Test{

        public static void main(String args[]){
            employer em = new employer();
            em.msg2();em.msg1();}}
*/

/*
Q7. What will be the output of the code below?

        Answers:

        a) Hello Welcome
        b) Welcome Hello
        c) Compile Time Error

        Correct Answer:
        a) Hello Welcome

*/

/*
public class TestEmployee {
        void msg1(){System.out.print("Hello ");}
    }
    class Test extends TestEmployee{
        void msg2(){System.out.print("Welcome ");}
    }
    class employer extends Test{

        public static void main(String args[]){
            employer em = new employer();
            em.msg1();em.msg2();}}
*/

/*
Q8. What will be the output of the code below?

        Answers:

        a) A
           B
           C
        b) A B C
        c) Compile Time Error

        Correct Answer:
        b) A B C

*/

/*
    interface A{public void methodA();}
    interface B extends A{public void methodB();}
    interface C extends A{public void methodC();}
    class TestEmployee implements B, C
    {
        public void methodA(){System.out.print("A ");}
        public void methodB(){System.out.print("B ");}
        public void methodC(){System.out.print("C ");}
        public static void main(String args[])
        {
            TestEmployee em = new TestEmployee();em.methodA();em.methodB();em.methodC();}}
*/

/*
Q9. What will be the output of the code below?

        Answers:

        a) Parent
        b) Parent Child
        c) Compile Time Error

        Correct Answer:
        a) Parent

*/

/*
class Employee
{
    public void p2(){System.out.println("Parent ");}}
public class TestEmployee extends Employee {
    public void p1(){System.out.println("Child ");}
    public static void main(String[] args)
    {
        TestEmployee te = new TestEmployee();te.p2();}}
*/
/*
Q10. What will be the output of the code below?

        Answers:

        a) Parent
        b) Parent Child
        c) Compile Time Error

        Correct Answer:
        b) Parent Child

*/

/*
class Employee
{
    public void p2(){System.out.print("Parent ");}}
    public class TestEmployee extends Employee {
    public void p1(){System.out.print("Child ");}
    public static void main(String[] args)
    {
        TestEmployee te = new TestEmployee();te.p2();te.p1();}}
*/

/*
Q11. What will be the output of the code below?

        Answers:

        a) Java Test
        b) Run time error
        c) Compile Time Error

        Correct Answer:
        b) Java Test

*/
/*
class Test{String exam;}
public class TestEmployee extends Test {
    String lan;
    public void exam(){exam = "Test";lan = "Java";System.out.print(lan+" "+exam);}
    public static void main(String[] args)
    {
        TestEmployee te =new TestEmployee();
        te.exam();}}
*/

/*
Q12. In inheritance, one class acquire another class's?

        Answers:

        a) All properties
        b) Only methods
        c) Only fields
        d) None of the above

        Correct Answer:
        a) All properties
*/

/*
Q13. The class which inherit properties of another class is called?

        Answers:

        a) Super class
        b) Sub class
        c) base class
        d) None of the above

        Correct Answer:
        b) Sub class ( or derived class or child class)
*/

/*
Q14. The class whose properties are inherited is?

        Answers:

        a) Super class
        b) Sub class
        c) None of the above

        Correct Answer:
        a) Super class ( or base or parent class)
*/

/*
Q15. Which keyword is used to inherit the properties of one class to another?

        Answers:

        a) Extends
        b) Implements
        c) None of the above

        Correct Answer:
        a) Extends (implements is used for  interface)
*/

/*
Q16. Is multiple inheritance possible in java?

        Answers:

        a) yes
        b) no
        c) None of the above

        Correct Answer:
        b) no (multiple inheritance cab be done using interface in java)
*/

/*
Q17. Which type of class can be inherited?

        Answers:

        a) public
        b) protected
        c) private
        d) both a and b
        Correct Answer:
        d) both a and b ( private class can not be inherited)
*/

/*
Q18. What is Hybrid inheritance?

        Answers:

        a) combination of single and multiple
        b) combination of single and multilevel
        c) none of the above

        Correct Answer:
        a) combination of single and multiple
*/

/*
Q19. What will be the output of the code below?

        Answers:

        a) A B D C
        b) B A C D
        c) C D A B
        D) Compile time error

        Correct Answer:
        b) B A C D
*/
/*
 class A{public void A(){System.out.print("A ");}}

 class B extends A{public void B(){System.out.print("B ");}}

 class C extends A{public void C(){System.out.print("C ");}}

 class D extends A{public void D(){System.out.print("D ");}}

public class TestEmployee
{
    public static void main(String args[])
    {
        B b = new B();b.B();b.A();
        C c = new C();c.C();
        D d = new D();d.D();}}
*/


/*
Q20. What will be the output of the code below?

        Answers:

        a) Java
        b) World
        c) Java World
        D) Compile time error

        Correct Answer:
        b) B A C D
*/

/*
 class First {protected String str;First(){str = "Java ";}}
 class Second extends First {
    Second() {str = str.concat("World");}
    void display(){System.out.println(str);}}
 class TestEmployee extends Second {
    public static void main (String args[]){
        Second sc = new Second();sc.display();}}
*/

/*
Q21. What will be the output of the code below?

        Answers:

        a) 2
        b) 1
        c) 2 1
        D) Compile time error

        Correct Answer:
        a) 2
*/

/*
 class A {int i; void display() {System.out.println(i);}}

class B extends A {int j;void display() {System.out.println(j);}}

public class TestEmployee { public static void main(String args[]){B b = new B();b.i=1;b.j=2;b.display();}}
*/

/*
Q22. What will be the output of the code below?

        Answers:

        a) 2
        b) 1
        c) 1 2
        D) Compile time error

        Correct Answer:
        c) 2
*/

/*
 class A {int i; void displa() {System.out.print(i+" ");}}

class B extends A {int j;void display() {System.out.print(j+" ");}}

public class TestEmployee { public static void main(String args[]){B b = new B();b.i=1;b.j=2;b.displa();b.display();}}
*/

/*
Q23. What will be the output of the code below?

        Answers:

        a) 2 3
        b) 2 2
        c) 3 2
        D) Compile time error

        Correct Answer:
        a) 2 3
*/

/*
class A {int i;}

class B extends A {int j;void display() {super.i = j + 1;System.out.println(j + " " + i);}}

class TestEmployee {

    public static void main(String args[]){B obj = new B();obj.i=1;obj.j=2;obj.display();}}
*/

/*
Q24. What will be the output of the code below?

        Answers:

        a) 2 3
        b) 2 2
        c) 2 1
        D) Compile time error

        Correct Answer:
        c) 2 1
*/

/*
class A {int i;}

class B extends A {int j;void display() {super.i = j + 1;System.out.println(i + " " + j);}}

class TestEmployee {

    public static void main(String args[]){B obj = new B();obj.i=2;obj.j=1;obj.display();}}
*/


/*
Q25. What will be the output of the code below?

        Answers:

        a) 2 3
        b) 1 2
        c) 2 1
        D) Compile time error

        Correct Answer:
        b) 1 2
*/

/*
class A {int i;}

class B extends A {int j;void display() {super.i = j + 1;System.out.println(j + " " + i);}}

class TestEmployee {

    public static void main(String args[]){B obj = new B();obj.i=2;obj.j=1;obj.display();}}
*/

/*
Q26. What will be the output of the code below?

        Answers:

        a) 2 3
        b) 1 2
        c) 2 1
        d) Compile time error

        Correct Answer:
        d) Compile time error
*/

/*
class A {private int i;}

class B extends A {int j;void display() {super.i = j + 1;System.out.println(j + " " + i);}}

class TestEmployee {

    public static void main(String args[]){B obj = new B();obj.i=2;obj.j=1;obj.display();}}
*/

/*
Q27. Which of these keywords is used to refer to member of base class from a sub class?

        Answers:

        a) upper
        b) super
        c) this
        d) none of the above

        Correct Answer:
        b) super
*/

/*
Q28. one class can extend how many classes?

        Answers:

        a) one
        b) two
        c) many
        d) none of the above

        Correct Answer:
        a) one (one class can extend only one class but can implements many interfaces)
*/

/*
Q29. If super class method is deleted, the code will work of subclass?

        Answers:

        a) yes
        b) no
        c) none of the above

        Correct Answer:
        a) no (because both class tightly coupled)
*/

/*
Q30. Constructor can be inherited by subclass?

        Answers:

        a) yes
        b) no
        c) none of the above

        Correct Answer:
        a) no (The constructor in Java is not inherited by the subclass)
*/

