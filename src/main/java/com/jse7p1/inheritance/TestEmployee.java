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

// Topic 2 : Develop code that demonstrates the use of polymorphism


/*
Q31. What will be the output of the code below?

        Answers:

        a) coding
        b) Java coding
        c) Compile time error

        Correct Answer:
        b) Java coding
*/

/*
class Test
{
    void work(){System.out.println("coding");}}
class TestEmployee extends Test
{
    void work(){System.out.println("Java coding");}
    public static void main(String arg[]){Test p=new TestEmployee();p.work();}}
*/

/*
Q32. What will be the output of the code below?

        Answers:

        a) coding
        b) Java coding
        c) Compile time error

        Correct Answer:
        b) Java coding
*/
/*

class Test
{
    void work(){System.out.println("coding");}}
class TestEmployee extends Test
{
    void work(){System.out.println("Java coding");}
    public static void main(String arg[]){TestEmployee p=new TestEmployee();p.work();}}
*/

/*
Q33. What will be the output of the code below?

        Answers:

        a) coding
        b) Java coding
        c) Compile time error

        Correct Answer:
        a) coding
*/

/*
class Test
{
    void work(){System.out.println("coding");}}
class TestEmployee extends Test
{
    void work(){System.out.println("Java coding");}
    public static void main(String arg[]){Test p=new Test();p.work();}}
*/

/*
Q34. What will be the output of the code below?

        Answers:

        a) coding
        b) Java coding
        c) Compile time error

        Correct Answer:
        c) Compile time error
*/

/*
class Test
{
    void work(){System.out.println("coding");}}
class TestEmployee extends Test
{
    void work(){System.out.println("Java coding");}
    public static void main(String arg[]){TestEmployee p=new Test();p.work();}}
*/

/*
Q35. What will be the output of the code below?

        Answers:

        a) java
           c++
        b) Java c++
        c) c++ java
        d) c++
           java

        Correct Answer:
        b) Java c++
*/

/*
import java.util.ArrayList;
import java.util.List;
abstract class Test{public abstract void solveTest();}
class java extends Test{public void solveTest() {System.out.print("java ");}}

class ctest extends Test{public void solveTest() {System.out.println("C++ ");}}

public class TestEmployee{

    public static void main(String args[]) {
        List<Test> lt = new ArrayList<Test>();lt.add(new java());lt.add(new ctest());for(Test list : lt){list.solveTest();}}}
*/


/*
Q36. What will be the output of the code below?

        Answers:

        a) java
           c++
        b) Java c++
        c) c++ java
        d) compile time error

        Correct Answer:
        d) compile time error
*/

/*
import java.util.ArrayList;
import java.util.List;
abstract class Test{public abstract void solveTest();}
class java extends Test{public void solveTest() {System.out.print("java ");}}

class ctest extends Test{public void solveTest() {System.out.println("C++ ");}}

public class TestEmployee{

    public static void main(String args[]) {
        List lt = new ArrayList();lt.add(new java());lt.add(new ctest());for(Test list : lt){list.solveTest();}}}
*/


/*
Q37. What will be the output of the code below?

        Answers:

        a) 10
           30.25
        b) 30.25 10
        c) 10 30.25
        d) compile time error

        Correct Answer:
        c) 10 30.25
*/
/*

class Java{void Test (int a){System.out.print(a+" ");}double Test(double a) {return a*a;}}

class TestEmployee
{
    public static void main (String args [])
    {Java jv = new Java();double result;jv.Test(10);result = jv.Test(5.5);System.out.println(result);}}
*/

/*
Q38. What will be the output of the code below?

        Answers:

        a) 10
           30.25
        b) 30.25 10
        c) 10 30.25
        d) compile time error

        Correct Answer:
        d) compile time error
*/

/*
class Java{double Test (int a){System.out.print(a+" ");}double Test(double a) {return a*a;}}

class TestEmployee
{
    public static void main (String args [])
    {Java jv = new Java();double result;jv.Test(10);result = jv.Test(5.5);System.out.println(result);}}
*/


/*
Q39. What will be the output of the code below?

        Answers:

        a) 20.030.25
        b) 30.2520.0
        c) compile time error

        Correct Answer:
        b) 30.2520.0
*/

/*
class Java{double Test (int a){return (a+a);}double Test(double a) {return a*a;}}

class TestEmployee
{
    public static void main (String args [])
    {Java jv = new Java();double result1,result2;result2=jv.Test(10);result1 = jv.Test(5.5);
        System.out.print(result1);System.out.println(result2);}}
*/

/*
Q40. What will be the output of the code below?

        Answers:

        a) base derived
        b) derived base
        c) compile time error

        Correct Answer:
        a) base derived
*/

/*
class BaseClass{public void method(){System.out.print("base ");}}

class DerivedClass extends BaseClass{public void method(){System.out.println("derived");}}

public class TestEmployee
{
    public static void main (String args []) {
        BaseClass bc = new BaseClass();BaseClass bc1 = new DerivedClass();bc.method();bc1.method();}}
*/


/*
Q41. Why method overloading called static polymorphism ?

        Answers:

        a) compiler know at compile time that which method link to which call
        b) compiler don't know at compile time that which method link to which call
        c) none of the above

        Correct Answer:
        a) compiler know at compile time that which method link to which call
*/

/*
Q42. In Dynamic binding ?

        Answers:

        a) create derived class object
        b) create base class object
        c) none of the above

        Correct Answer:
        b) create base class object
*/

/*
Q43. Method overloading is ?

        Answers:

        a) compile time activity
        b) run time activity
        c) none of the above

        Correct Answer:
        a) compile time activity
*/

/*
Q44. Basic meaning of polymorphism ?

        Answers:

        a) representation of many form into one
        b) representation of one form into many
        c) representation of many form into many
        c) none of the above

        Correct Answer:
        b) representation of one form into many
*/

// Topic 3: Differentiate between the type of a reference and the type of an object

/*
Q45. In below code line emp is which type of reference?
       Employee emp = new Employee();

        Answers:

        a) Strong
        b) Soft
        c) Weak
        d) Phantom

        Correct Answer:
        a) Strong
*/


/*
Q46. In below code line emp is Strong reference, is it eligible to garbage collection?
       Employee emp = new Employee();

        Answers:

        a) No
        b) yes
        c) none of the above

        Correct Answer:
        b) yes ( but in only case when emp is pointed to null...emp=null)
*/


/*
Q47. What is object type in below code line?
       Object o = new Integer(3);

        Answers:

        a) Integer
        b) Object
        c) none of the above

        Correct Answer:
        a) Integer
*/

/*
Q48. What is reference type in below code line?
       Object o = new Integer(3);

        Answers:

        a) Integer
        b) Object
        c) none of the above

        Correct Answer:
        b) Object
*/

/*
Q49. What is reference type based on?


        Answers:

        a) Class
        b) primitive data type
        c) none of the above

        Correct Answer:
        a) Class
*/

// Topic 4 : Determine when casting is necessary


/*
Q50. What will be the output of the code below?

        Answers:

        a) 100100
        b) 100 100
        c) 100
           100
        d) compile time error

        Correct Answer:
        a) 100100
*/
/*
public class TestEmployee
{
    public static void main(String[] args)
    {
        int i = 100;
        long l = i;
        System.out.print(i);
        System.out.println(l);}}
*/

/*
Q51. What will be the output of the code below?

        Answers:

        a) 100 100
        b) 100100.0
        c) 100
           100
        d) compile time error

        Correct Answer:
        b) 100100.0
*/
/*
public class TestEmployee
{
    public static void main(String[] args)
    {
        int i = 100;
        float l = i;
        System.out.print(i);
        System.out.println(l);}}
*/

/*
Q52. What will be the output of the code below?

        Answers:

        a) 100.0100.0
        b) 100 100
        c) 100.0
           100.0
        d) compile time error

        Correct Answer:
        a) 100.0100.0
*/

/*
public class TestEmployee
{
    public static void main(String[] args)
    {
        float i = 100;
        double l = i;
        System.out.print(i);
        System.out.println(l);}}
*/


/*
Q53. What will be the output of the code below?

        Answers:

        a) 100.04100
        b) 100.04 100
        c) 100.04
           100
        d) compile time error

        Correct Answer:
        a) 100.04100
*/

/*
public class TestEmployee
{
    public static void main(String[] args)
    {
        double d = 100.04;
        long l = (long)d;
        System.out.print(d);
        System.out.println(l);}}
*/

/*
Q54. What will be the output of the code below?

        Answers:

        a) Login id & pwd is : xyz abc
        b) Login id & pwd is : abc xyz
        c) compile time error

        Correct Answer:
        b) Login id & pwd is : abc xyz
*/


/*
import java.util.ArrayList;
public class TestEmployee {

    public static void main(String args[]) {
        String username = "abc";String password = "xyz";
        ArrayList al = new ArrayList();al.add(username);al.add(password);
        Object u = al.get(0);String uname = (String) al.get(0);String pass = (String) al.get(1);
        System.out.print("Login id & pwd is : " + uname+ " "+pass);}}
*/


/*
Q55. What will be the output of the code below?

        Answers:

        a) Login id & pwd is : xyz abc
        b) Login id & pwd is : abc xyz
        c) compile time error

        Correct Answer:
        c) compile time error
*/


/*
import java.util.ArrayList;
public class TestEmployee {

    public static void main(String args[]) {
        String username = "abc";String password = "xyz";
        ArrayList al = new ArrayList();al.add(username);al.add(password);
        Object u = al.get(0);String uname = al.get(0);String pass =al.get(1);
        System.out.print("Login id & pwd is : " + uname+ " "+pass);}}
*/

/*
Q56. What will be the output of the code below?

        Answers:

        a) 65.0 66.0
        b) 65.0 B
        c) compile time error

        Correct Answer:
        b) 65.0 B
*/

/*
public class TestEmployee
    {
        public static void main (String args[])
        {
            char ch1 = 'A';double d1 = ch1;
            double d2 = 66.0;char ch2 = (char) d2;
            System.out.print(d1+" ");System.out.println(ch2);}}
*/

/*
Q57. What will be the output of the code below?

        Answers:

        a) 65.0 66.0
        b) 65.0 B
        c) compile time error

        Correct Answer:
        c) compile time error
*/

/*
public class TestEmployee
    {
        public static void main (String args[])
        {
            char ch1 = "A";double d1 = ch1;
            double d2 = 66.0;char ch2 = (char) d2;
            System.out.print(d1+" ");System.out.println(ch2);}}
*/


/*
Q58. What will be the output of the code below?

        Answers:

        a) 2 6 6
        b) 2 6 8
        c) Compile time error

        Correct Answer:
        b) 2 6 8
*/

/*
public class TestEmployee {
    public static void main(String[] arg) {
        int i, ans;double d = 2.75;i = (int)d;System.out.print(i+" ");
        ans = (int)d * 3;System.out.print(ans+" ");
        ans = (int)(d * 3);System.out.println(ans);}}
*/

/*
Q59. Primitive Casting is used to convert data from one primitive data type to another primitive data type?

        Answers:

        a) True
        b) False
        c) none of the above

        Correct Answer:
        a) True
*/


/*
Q60. Converting data from small sized data type to big sized data type is called?

        Answers:

        a) Explicit Narrowing
        b) Auto Widening
        c) none of the above

        Correct Answer:
        b) Auto Widening
*/

/*
Q61. When you are converting data from big sized data type to small sized data type is called?

        Answers:

        a) Explicit Narrowing
        b) Auto Widening
        c) none of the above

        Correct Answer:
        a) Explicit Narrowing
*/

/*
Q62. When we cast a particular variable?

        Answers:

        a) variable data type changed
        b) a new copy of variable is made and its data type changed
        c) none of the above

        Correct Answer:
        b) a new copy of variable is made and its data type changed
*/

// Topic 5 : Use super and this to access objects and constructors



/*
Q63. What will be the output of the code below?

        Answers:

        a) 100
        b) 50
        c) Compile time error

        Correct Answer:
        b) 50
*/
/*
class Test{
    int sal=50;
}

class TestEmployee extends Test{
    int sal=100;

    void display(){
        System.out.println(super.sal);
    }
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        te.display();}}
*/

/*
Q64. What will be the output of the code below?

        Answers:

        a) 100
        b) 50
        c) Compile time error

        Correct Answer:
        a) 100
*/

/*
class Test{
    int sal=50;
}

class TestEmployee extends Test{
    int sal=100;

    void display(){
        System.out.println(sal);
    }
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        te.display();}}
*/

/*
Q65. What will be the output of the code below?

        Answers:

        a) 100 50
        b) 50 100
        c) Compile time error

        Correct Answer:
        b) 50 100
*/

/*
class Test{
    int sal=50;
}

class TestEmployee extends Test{
    int sal=100;

    void display(){
        System.out.print(super.sal+" ");
        System.out.println(sal);
    }
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        te.display();}}
*/


/*
Q66. What will be the output of the code below?

        Answers:

        a) 50 100
        b) 100 50
        c) Compile time error

        Correct Answer:
        a) 50 100
*/

/*
class Test{
    int sal=50;
    Test() {
        System.out.print(sal+" ");
    }
}

class TestEmployee extends Test{
    int sal = 100;
    TestEmployee() {
        super();
        System.out.println(sal);
}
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        }}
*/

/*
Q67. What will be the output of the code below?

        Answers:

        a) 50 100
        b) 100 50
        c) Compile time error

        Correct Answer:
        c) Compile time error
*/

/*
class Test{
    int sal=50;
    Test() {
        System.out.print(sal+" ");
    }
}

class TestEmployee extends Test{
    int sal = 100;
    TestEmployee() {
        super();
        System.out.println(sal);
}
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        te.display();}}
*/

/*
Q67. What will be the output of the code below?

        Answers:

        a) java c++
        b) c++ java
        c) Compile time error

        Correct Answer:
        c) c++ java
*/

/*
class Employee{
    void code(){System.out.println("java");}
}

class TestEmployee extends Employee{
    void code(){System.out.print("c++"+ " ");}
    void display(){
        code();
        super.code();}
    public static void main(String args[]){
        TestEmployee s=new TestEmployee();
        s.display();}}
*/

/*
Q68. What will be the output of the code below?

        Answers:

        a) java c++
        b) c++ java
        c) java
        d) Compile time error

        Correct Answer:
        b) c++ java
*/

/*
class Employee{
    void code(){System.out.println("java");}
}

class TestEmployee extends Employee{
    void code(){System.out.print("c++"+ " ");}
    void display(){
        code();
        super.code();}
    public static void main(String args[]){
        TestEmployee s=new TestEmployee();
        s.display();}}
*/

/*
Q69. What will be the output of the code below?

        Answers:

        a) java c++
        b) c++ java
        c) java
        d) Compile time error

        Correct Answer:
        c) java
*/

/*
class Employee{
    void code(){System.out.println("java");}
}

class TestEmployee extends Employee{
    void code(){System.out.print("c++"+ " ");}
    void display(){
        super.code();}
    public static void main(String args[]){
        TestEmployee s=new TestEmployee();
        s.display();}}
*/


/*
Q70. What will be the output of the code below?

        Answers:

        a) Good Better
        b) Better Good
        c) Good
        d) Compile time error

        Correct Answer:
        a) Good Better
*/

/*
class Test{void display (){System.out.print("Good"+ " ");}}

class Test1 extends Test{void display (){super.display ();System.out.println ("Better");}}

class TestEmployee
{
    public static void main (String k []){Test1 t1=new Test1 ();t1.display ();}}
*/

/*
Q71. What will be the output of the code below?

        Answers:

        a) Good Better
        b) Better Good
        c) Compile time error
        d) Run time error

        Correct Answer:
        d) Run time error
*/

/*
class Test{void display (){System.out.print("Good"+ " ");}}

class Test1 extends Test{void display (){display ();System.out.println ("Better");}}

class TestEmployee
{
    public static void main (String k []){Test1 t1=new Test1 ();t1.display ();}}
*/


/*
Q72. What will be the output of the code below?

        Answers:

        a) 10 20
        b) 20 10
        c) Compile time error

        Correct Answer:
        a) 10 20
*/

/*
class Employee{int a;Employee (int a){this.a=a;System.out.print(a+" ");}};

class Employee1 extends Employee{int b;Employee1 (){super (10);this.b=20;System.out.println (+b);}};

class TestEmployee{public static void main (String arr []){Employee1 em1 = new Employee1 ();}};
*/

/*
Q73. What will be the output of the code below?

        Answers:

        a) 10 20
        b) 20 10
        c) Compile time error

        Correct Answer:
        a) Compile time error
*/

/*
class Employee{int a;Employee (int a){a=a;System.out.print(a+" ");}};

class Employee1 extends Employee{int b;Employee1 (){super (10);this.b=20;System.out.println (+b);}};

class TestEmployee{public static void main (String arr []){Employee1 em1 = new Employee1 (10);}};
*/

/*
Q74. What will be the output of the code below?

        Answers:

        a) 10 20
        b) 20 10
        c) Compile time error

        Correct Answer:
        a) Compile time error ( call to super must be first statement in constructor)
*/

/*
class Test{
    int sal=50;
    Test() {
        System.out.print(sal+" ");
    }
}

class TestEmployee extends Test{
    int sal = 100;
    TestEmployee() {
        System.out.println(sal);
        super();
    }
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        }}
*/



/*
Q75. Super keyword can be used at one of the below levels?

        Answers:

        a) Variable level
        b) Method level
        c) Constructor level
        d) All of the above

        Correct Answer:
        d) All of the above
*/

/*
Q76. Super keyword is?

        Answers:

        a) Reference variable
        b) Local variable
        c) Instance variable
        d) None of the above

        Correct Answer:
        a) Reference variable (The super keyword in java is a reference variable that is used to refer immediate parent class object.)
*/

/*
Q77. Can Super keyword work in static method?

        Answers:

        a) Yes
        b) No
        c) None of the above

        Correct Answer:
        b) No(Super keyword can not work in static method but can call static method)
*/

/*
Q78. Need of Super keyword in java?

        Answers:

        a) To call super class variables, methods, constructors in sub class when there is some similarity.
        b) To call sub class variables, methods, constructors in super class when there is some similarity.
        c) None of the above

        Correct Answer:
        a) To call super class variables, methods, constructors in sub class when there is some similarity.
*/

/*
Q79. super() is used to call?

        Answers:

        a) Methods of super class
        b) Variables of super class
        c) Constructor of super class
        d) All of the above

        Correct Answer:
        c) Constructor of super class
*/

/*
Q80. super is used to call?

        Answers:

        a) Methods and Variables of super class
        b) Constructor of super class
        c) Both a & b
        d) All of the above

        Correct Answer:
        a) Methods and Variables of super class
*/

/*
Q81. super() placed only in constructors's first statement?

        Answers:

        a) True
        b) False
        c) None of the above

        Correct Answer:
        a) True ( otherwise compiler gives--call to super must be first statement in constructor)
*/

/*
Q82. What will be the output of the code below?

        Answers:

        a) 5000
        b) salary is 5000
        c) Compile time error

        Correct Answer:
        a) salary is 5000
*/

/*
class Test{
    Test(){System.out.print("salary is ");}
}

class TestEmployee extends Test{
    int sal;
    TestEmployee(int sal){
        this.sal=sal;
        System.out.println(sal);
    }
    public static void main(String args[]){
        TestEmployee te = new TestEmployee(5000);}}
*/

/*
Q83. What will be the output of the code below?

        Answers:

        a) Hello
        b) Run time error
        c) Compile time error

        Correct Answer:
        a) Hello
*/

/*
class Test {public void show() {this.print();}private void print() {System.out.println("Hello");}}
public class TestEmployee extends Test{
    public static void main(String [] arg){
        Test ab = new Test();ab.show();}}
*/

/*
Q84. What will be the output of the code below?

        Answers:

        a) 20 10
        b) 10 20
        c) Compile time error

        Correct Answer:
        b) 10 20
*/

/*
class Test {
    int var;public void show(int testVariable) {System.out.print(this.var+" ");}}
public class TestEmployee {
    public static void main(String args[]) {
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj1.var = 10;obj2.var = 20;
        obj1.show(50);obj2.show(50);}}
*/


/*
Q85. What will be the output of the code below?

        Answers:

        a) 20 abc 21 xyz
        b) 21 abc 20 xyz
        c) Compile time error

        Correct Answer:
        a) 20 abc 21 xyz
*/

/*
class TestEmployee{
    int id;String name;
    TestEmployee(int id,String name){this.id=id;this.name=name;}
    void display(){System.out.print(id+" "+name+" ");}
    public static void main(String args[]){
        TestEmployee s1 = new TestEmployee(20,"abc");
        TestEmployee s2 = new TestEmployee(21,"xyz");
        s1.display();s2.display();}}
*/


/*
Q86. this keyword can call?

        Answers:

        a) Overloaded Constructor
        b) Constructor of same class
        c) Both a and b
        d) current class instance variable

        Correct Answer:
        d) current class instance variable
*/


/*
Q87. this() can call?

        Answers:

        a) Overloaded Constructor
        b) Constructor of same class
        c) Both a and b
        d) current class instance variable

        Correct Answer:
        c) Both a and b
*/


/*
Q88. this keyword can be used to differentiate between instance variable and local variable.?

        Answers:

        a) yes
        b) no
        c) None of the above


        Correct Answer:
        a) yes
*/


/*
Q89. this keyword can be used to differentiate between instance variable and local variable.?

        Answers:

        a) yes
        b) no
        c) None of the above


        Correct Answer:
        a) yes
*/

// Topic 6 : Use abstract classes and interfaces

/*
Q90. What will be the output of the code below?

        Answers:

        a) THANKS
        b) HELLO
        c) HELLO THANKS
        d) None of the above

        Correct Answer:
        c) HELLO THANKS
*/

/*
interface First{void print();}
class  Second implements First{
public void print(){System.out.print("HELLO"+" ");}}
class  SuperMario implements First{public void print(){System.out.println("THANKS");}}
class  TestEmployee{
public static void main(String args[]){
            First obj=new Second();obj.print();
        obj=new SuperMario();obj.print();}}
*/


/*
Q91. What will be the output of the code below?

        Answers:

        a) THANKS HELLO
        b) HELLO THANKS
        c) Compile time error
        d) None of the above

        Correct Answer:
        c) Compile time error
*/

/*
interface First{void print();}
class  Second implements First{
public void print(){System.out.print("HELLO"+" ");}}
class  SuperMario implements First{public void print(){System.out.println("THANKS");}}
class  TestEmployee{
public static void main(String args[]){
            First obj=new First();obj.print();
        obj=new SuperMario();obj.print();}}
*/


/*
Q92. What will be the output of the code below?

        Answers:

        a) A B
        b) A B B
        c) Compile time error

        Correct Answer:
        A) A B
*/

/*
interface A{void displayA();}
abstract class B{public void displayB(){System.out.println("B"+" ");}
abstract public void display();}
 class  Test  implements A{public void displayB(){System.out.println("B"+ " ");}
public void displayA(){System.out.print("A"+" ");}}
class  TestClass{
public static void main(String args[]){Test obj=new Test();obj.displayA();obj.displayB();}}
*/


/*
Q93. What will be the output of the code below?

        Answers:

        a) A B
        b) A B B
        c) Compile time error

        Correct Answer:
        C) Compile time error
*/

/*
interface A{void displayA();}
abstract class B{public void displayB(){System.out.println("B"+" ");}
abstract public void display();}
 class  Test  implements A{public void displayB(){System.out.println("B"+ " ");}
public void displayA(){System.out.print("A"+" ");}}
class  TestClass{
public static void main(String args[]){Test obj=new Test();obj.displayA();obj.display();obj.displayB();}}
*/

/*
Q94. What will be the output of the code below?

        Answers:

        a) Hello
        b) Compile time error
        c) Run time error

        Correct Answer:
        a) Hello
*/

/*
interface Test1{public void Draw();}

class Test implements Test1{public void Draw() {System.out.println("Hello");}}

public class TestEmployee {public static void main(String[] args) {Test te=new Test();te.Draw();}}
*/

/*
Q95. What will be the output of the code below?

        Answers:

        a) Two One
        b) One Two
        c) Run time error

        Correct Answer:
        b) One Two
*/
/*
interface One {public void one();public void one1();}
public class TestEmployee implements One{public void one(){System.out.print("One"+" ");}
    public void one1(){System.out.println("Two");}
    public static void main(String args[]){
        TestEmployee m = new TestEmployee();m.one();m.one1();}}
*/

/*
Q96. Can we declare interface abstract?

        Answers:

        a) Yes
        b) No
        c) None of the above

        Correct Answer:
        b) No (interface is implicitly abstract)
*/

/*
Q97. Can we instantiate a interface?

        Answers:

        a) Yes
        b) No
        c) None of the above

        Correct Answer:
        b) No
*/

/*
Q98. All the methods in interface is abstract?

        Answers:

        a) True
        b) False
        c) None of the above

        Correct Answer:
        a) True
*/

/*
Q99. A class can implement more than one interface at a time?

        Answers:

        a) True
        b) False
        c) None of the above

        Correct Answer:

        a) True (A class can extend only one class, but implement many interfaces.)
*/

/*
Q100. Which keyword is used when an interface extends another?

        Answers:

        a) implement
        b) extend
        c) None of the above

        Correct Answer:
        a) extend
*/