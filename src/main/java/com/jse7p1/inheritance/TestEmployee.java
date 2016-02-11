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

