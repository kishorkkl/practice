package com.jse7p1.methods;

/**
 *
 * Created by sandeep on 10/02/2016.
 *
 * Exam objective Working with Methods and Encapsulation
 *
 *
 1. Create methods with arguments and return values
 2. Apply the static keyword  to methods and fields
 3. Create an overloaded method
 4. Differentiate between default and user defined constructors
 5. Create and overload constructors
 6. Apply access modifiers
 7. Apply encapsulation principles to a class
 8. Determine the effect upon object references and primitive values when they are passed  into methods that change the values

 */

// Topic 1: Create methods with arguments and return values

/*
Q1. What will be the output of the code below?

        Answers:

        a) 11
        b) 6
        c) Compile time error

        Correct Answer:
        b) 6
*/

/*
public class TestEmployee {
     static int minFunction(int n1, int n2) {
        int min;if (n1 > n2)min = n2;else min = n1;return min;}
    public static void main(String arg[])
    {int a = 11;int b = 6;int c = minFunction(a, b);System.out.println(c);}}
*/


/*
Q2. What will be the output of the code below?

        Answers:

        a) Pass
        b) Fail
        c) Compile time error

        Correct Answer:
        a) Pass
*/

/*
public class TestEmployee{

    public static void main(String[] args) {
         minFunction(70);
    }
    public static void minFunction(int num) {
        int min;
        if (num > 60)
           System.out.println("pass");
        else
            System.out.println("fail");}}
*/

/*
Q3. What will be the output of the code below?

        Answers:

        a) 5
        b) 7
        c) Compile time error

        Correct Answer:
        b) 7
*/


/*
public class TestEmployee{

        public static void main(String args[])
        {
            int n;
            String s = " Hello ";
            n = s.length();
           System.out.println(n);}}
*/


/*
Q4. What will be the output of the code below?

        Answers:

        a) 5
        b) 7
        c) 3
        d) Compile time error

        Correct Answer:
        c) 3
*/


/*
public class TestEmployee{

        public static void main(String args[])
        {
            int n;
            String s = " Hello ", t = "";
            t = s.replace(" Hello ", "Yes");
            n = t.length();
            System.out.println(n);
}}
*/

/*
Q5. What will be the output of the code below?

        Answers:

        a) Mr. Hello
        b) Hello Mr.
        c) Compile time error

        Correct Answer:
        b) Hello Mr.
*/

/*
public class TestEmployee{
        public static void main(String args[])
        {
            int n;
            String s = " Hello ",u = "";
            u = s.concat("Mr.");
            System.out.println(u);
}}
*/


/*
Q6. What will be the output of the code below?

        Answers:

        a) 50
        b) 100
        c) Compile time error

        Correct Answer:
        a) 50
*/
/*
public class TestEmployee
{
    public void fun(int val){val = 100;}
    public static void main(String[] args)
    {
        int val = 50;
        TestEmployee te = new TestEmployee();
        te.fun(val);System.out.println(val);}}
*/


/*
Q7. What will be the output of the code below?

        Answers:

        a) 20 10
        b) 100 50
        c) 50 100
        d) Compile time error

        Correct Answer:
        b) 100 50
*/

/*
public class TestEmployee
{
    int val1=10;
    int	val2=20;
    public void callByReference(TestEmployee val3)
    {
        val3.val1=100;val3.val2=50;}
    public static void main(String[] args)
    {
        TestEmployee ts = new TestEmployee();ts.callByReference(ts);
        System.out.println(ts.val1+" "+ts.val2);}}
*/

/*
Q8. What will be the output of the code below?

        Answers:

        a) 200
        b) 0
        c) Compile time error

        Correct Answer:
        a) 200
*/

/*
class Rectangle {
        int length;int width;
    Rectangle(int l, int b) {length = l;width = b;}
        void area(Rectangle r) {
            int area = r.length * r.width;System.out.println(area);}}
public class TestEmployee{
        public static void main(String args[]) {
            Rectangle r1 = new Rectangle(10, 20);r1.area(r1);}}
*/

/*
Q8. What will be the output of the code below?

        Answers:

        a) 200
        b) 0
        c) Compile time error

        Correct Answer:
        b) 0
*/

/*
class Rectangle {
        int l;int b;
    Rectangle(int l, int b) {l = l;b = b;}
        void area(Rectangle r) {
            int area = r.l * r.b;System.out.println(area);}}
public class TestEmployee{
        public static void main(String args[]) {
            Rectangle r1 = new Rectangle(10, 20);r1.area(r1);}}
*/


/*
Q9. What will be the output of the code below?

        Answers:

        a) 200
        b) 0
        c) Compile time error

        Correct Answer:
        a) 0
*/

/*
class Rectangle {
    int length;int width;
    void area(int length, int width) {
        int area = length * width;
        System.out.println(area);}}
public class TestEmployee {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = 20;r1.width = 10;
        r2.area(r1.length, r1.width);}}
*/


/*
Q10. What will be the output of the code below?

        Answers:

        a) 11
        b) Compile time error
        c) Run time error

        Correct Answer:
        a) 11
*/

/*
public class TestEmployee{
    public static void main(String arg[]){
        int num1=5, num2=6;sum(num1,num2);}
    public static void sum(int a, int b){
        int sum=0;sum=a+b;System.out.println(sum);}}
*/


/*
Q11. What will be the output of the code below?

        Answers:

        a) 11
        b) Compile time error
        c) Run time error

        Correct Answer:
        a) 11
*/
/*
class TestEmployee{
    public static void main(String anrg[]){
        int num1=5, num2=6, sum;
        sum=total(num1, num2);
        System.out.println(sum);
    }
    public static int total(int x, int y)
    {
        int s;s = x+y;return s;}}
*/


/*
Q12. What will be the output of the code below?

        Answers:

        a) false
        b) true
        c) Compile time error

        Correct Answer:
        b) true
*/

/*
class Test {
    int x;
    int y;
    boolean equal(){
        return(x == y);}}

class TestEmployee {
    public static void main(String args[])
    {
        Test obj = new Test();
        obj.x = 5;
        obj.y = 5;
        System.out.println(obj.equal());}}
*/


/*
Q13. What will be the output of the code below?

        Answers:

        a) 12
        b) 07
        c) Compile time error

        Correct Answer:
        a) 12
*/

/*
class Test {
    int w,h,l,v;
    void volume(int height, int length, int width) {
        v = width*height*length;}}
class TestEmployee{
    public static void main(String args[])
    {
        Test te = new Test();
        te.h = 1;te.l = 5;te.w = 5;
        te.volume(3,2,2);
        System.out.println(te.v);}}
*/


/*
Q14. What will be the output of the code below?

        Answers:

        a) main test1
        b) main test2
        c) main test2 test1
        d) Compile time error

        Correct Answer:
        c) main test2 test1
*/

/*
public class TestEmployee{
    public void test(){
        System.out.print(" test1");}
    private void test(String s1){
        System.out.print(s1);
        this.test() ;}
    public static void main(String args[]){
        System.out.print(" main");
        TestEmployee obj = new TestEmployee();
        obj.test(" test2");}}
*/

/*
Q15. What is the return type of a method that does not returns any value?

        Answers:

        a) int
        b) float
        c) void
        d) double

        Correct Answer:
        c) void
*/


/*
Q16. How can we define more than one method in a class differentiated by method signature?

        Answers:

        a) Function overriding
        b) Function overloading
        c) Function doubling
        d) None of the above

        Correct Answer:
        b) Function overloading
*/

/*
Q17. Which of the below method have same name as class?

        Answers:

        a) finalize
        b) delete
        c) Constructor
        d) None of the above

        Correct Answer:
        c) Constructor
*/

/*
Q18. A set of code which is referred to by name and can be called?

        Answers:

        a) method
        b) object
        c) argument
        d) None of the above

        Correct Answer:
        a) method
*/

/*
Q19. Built in methods are part of?

        Answers:

        a) Interpreter package
        b) Compiler Package
        c) Both a and b
        d) None of the above

        Correct Answer:
        b) Compiler Package
*/

/*
Q20. Are parameters and arguments are same?

        Answers:

        a) No
        b) Yes
        c) None of the above

        Correct Answer:
        a) No(Parameter is variable defined by a method that receives value when the method is called.
        While argument is a value that is passed to a method when it is called.)
*/

/*
Q21. Method that can be called and executed without creating an object?

        Answers:

        a) Private method
        b) Static method
        c) None of the above

        Correct Answer:
        a) Static method
*/

/*
Q22. Argument passed at the time of running the java program is called?

        Answers:

        a) formal parameter
        b) command line argument
        c) None of the above

        Correct Answer:
        b) command line argument
*/

// Topic 3: Apply the static keyword  to methods and fields


/*
Q23. What will be the output of the code below?

        Answers:

        a) 10200
        b) 1020200
        c) 20200
        d) Compile time error

        Correct Answer:
        a) 10200
*/


/*
public class TestEmployee{
        private static int i;
        private int j;
        public TestEmployee(int j){
            this.j = j;}
        static {i = 100;}
        public static void main(String args[]) {
            TestEmployee example1 = new TestEmployee(10);
            TestEmployee example2 = new TestEmployee(20);
            TestEmployee.i = 200;
            System.out.print(example1.j);;
            System.out.println(example1.i);}}
*/

/*
Q24. What will be the output of the code below?

        Answers:

        a) 10200
        b) 1020200
        c) 20200
        d) Compile time error

        Correct Answer:
        c) 20200
*/

/*
public class TestEmployee{
        private static int i;
        private int j;
        public TestEmployee(int j){
            this.j = j;}
        static {i = 100;}
        public static void main(String args[]) {
            TestEmployee example1 = new TestEmployee(10);
            TestEmployee example2 = new TestEmployee(20);
            TestEmployee.i = 200;
            System.out.print(example2.j);;
            System.out.println(example1.i);}}
*/

/*
Q25. What will be the output of the code below?

        Answers:

        a) 1020
        b) 1020200
        c) 20200
        d) Compile time error

        Correct Answer:
        c) 1020
*/


/*
public class TestEmployee{
        private static int i;
        private int j;
        public TestEmployee(int j){
            this.j = j;}
        static {i = 100;}
        public static void main(String args[]) {
            TestEmployee example1 = new TestEmployee(10);
            TestEmployee example2 = new TestEmployee(20);
            TestEmployee.i = 200;
            System.out.print(example1.j);;
            System.out.println(example2.j);}}
*/

/*
Q26. What will be the output of the code below?

        Answers:

        a) ABCA
        b) ABDA
        c) BDAC
        d) Compile time error

        Correct Answer:
        b) ABDA
*/


/*
public class TestEmployee{
        public static void main(String args[]) {
            StaticMethods.method(10);StaticMethods.method(10.0);
            StaticMethodsSub.method(10.0);
            StaticMethods methods = new StaticMethodsSub();methods.method(10);}}
    class StaticMethods{
        public static void method(int i){System.out.print("A");}
        public static void method(double i){System.out.print("B");}}
    class StaticMethodsSub extends StaticMethods{
        public static void method(int i){System.out.print("C");}
        public static void method(double i){System.out.print("D");}}
*/


/*
Q27. What will be the output of the code below?

        Answers:

        a) ABD
        b) ABDA
        c) BDAC
        d) Compile time error

        Correct Answer:
        a) ABD
*/


/*
public class TestEmployee{
        public static void main(String args[]) {
            StaticMethods.method(10);StaticMethods.method(10.0);
            StaticMethodsSub.method(10.0);
            StaticMethods methods = new StaticMethodsSub();}}
    class StaticMethods{
        public static void method(int i){System.out.print("A");}
        public static void method(double i){System.out.print("B");}}
    class StaticMethodsSub extends StaticMethods{
        public static void method(int i){System.out.print("C");}
        public static void method(double i){System.out.print("D");}}
*/


/*
Q28. What will be the output of the code below?

        Answers:

        a) 20
        b) 10
        c) Compile time error

        Correct Answer:
        b) 10
*/


/*
public class TestEmployee {
        private static int j = 10;
        public static void method(int i) {
            i = 20;
        }
        public static void main(String args[]) {
            method(j);
            System.out.println(j);}}
*/

/*
Q29. What will be the output of the code below?

        Answers:

        a) 20
        b) 10
        c) Compile time error

        Correct Answer:
        a) 20
*/

/*
public class TestEmployee {
        private static int j = 10;
        public static void method(int i) {
            i = 20;
            j=i;
        }
        public static void main(String args[]) {
            method(j);
            System.out.println(j);}}
*/


/*
Q30. What will be the output of the code below?

        Answers:

        a) Hello
        b) Thanks
        c) Compile time error

        Correct Answer:
        b) Thanks
*/


/*
public class TestEmployee {
        static class X{
            static String str="Hello";
        }
        public static void main(String args[])
        {
            X.str="Thanks";
            System.out.println(X.str);}}
*/


/*
Q31. What will be the output of the code below?

        Answers:

        a) ok
        b) 99
        c) Compile time error

        Correct Answer:
        c) Compile time error
*/

/*
public class TestEmployee {
        int num;
        static class Test{
            static String str="ok";
            num = 99;
        }
        public static void main(String args[])
        {
            TestEmployee.Test obj = new TestEmployee.Test();
            System.out.println(obj.str);}}
*/

/*
Q32. What will be the output of the code below?

        Answers:

        a) 11 Hello
        b) 11hello
        c) Compile time error

        Correct Answer:
        a) 11 Hello
*/

/*
public class TestEmployee {
        static int num;
        static String mystr;
        static{
            num = 11;
            mystr = "Hello";
        }
        public static void main(String args[])
        {
            System.out.print(num+" ");
            System.out.println(mystr);}}
*/

/*
Q33. What will be the output of the code below?

        Answers:

        a) 68 A
        b) 98 A
        c) 68 B
        d) 98 B

        Correct Answer:
        d) 98 B
*/


/*
public class TestEmployee {
        static int num;
        static String mystr;
        static{num = 68;mystr = "A";}
        static{num = 98;mystr = "B";}
        public static void main(String args[])
        {
            System.out.print(num+" ");
            System.out.println(mystr);}}
*/

/*
Q34. What will be the output of the code below?

        Answers:

        a) 68 A
        b) 98 A
        c) 68 B
        d) 98 B

        Correct Answer:
        a) 68 A
*/

/*
public class TestEmployee {
        static int num;
        static String mystr;
        static{num = 98;mystr = "B";}
        static{num = 68;mystr = "A";}
        public static void main(String args[])
        {
            System.out.print(num+" ");
            System.out.println(mystr);}}
*/

/*
Q35. What will be the output of the code below?

        Answers:

        a) A0
        b) 0A
        c) 0 A
        d) Compile time error

        Correct Answer:
        b) 0A
*/

/*
public class TestEmployee {
        static int i;static String s="A";
        public static void main(String args[])
        {
            TestEmployee obj=new TestEmployee();
            System.out.print(obj.i);
            System.out.println(obj.s);}}
*/


/*
Q36. What will be the output of the code below?

        Answers:

        a) A0
        b) 0A
        c) A 0
        d) Compile time error

        Correct Answer:
        a) A0
*/

/*
class TestEmployee{
    static int i;
    static String s="A";
    static void display()
    {
        TestEmployee obj=new TestEmployee();
        System.out.print(obj.s);
        System.out.print(obj.i);}
    void fun(){display();}
    public static void main(String args[]){display();}}
*/


/*
Q37. What will be the output of the code below?

        Answers:

        a) 8887
        b) 8788
        c) 88 87
        d) Compile time error

        Correct Answer:
        c) 88 87
*/

/*
class TestEmployee{
        static int var1=77;
        int var2=87;
        public static void main(String args[])
        {
            TestEmployee ob1 = new TestEmployee();
            TestEmployee ob2 = new TestEmployee();
            ob1.var1=88;
            System.out.print(ob1.var1+" ");
            System.out.println(ob2.var2);}}
*/

/*
Q38. What will be the output of the code below?

        Answers:

        a) In Out
        b) In In
        c) Out In
        d) Out Out

        Correct Answer:
        b) In In
*/


/*
public class TestEmployee{
        public static void main(String[] args) {
            TestEmployee te = new TestEmployee();
            child cc = new child();
            te.display();cc.display();
        }
        public static void display(){
            System.out.print("In ");}}

    class child extends TestEmployee{
        public static void show(){
            System.out.println("Out ");}}
*/


/*
Q39. What will be the output of the code below?

        Answers:

        a) In Out
        b) In In
        c) Out In
        d) Out Out

        Correct Answer:
        a) In Out
*/


/*
public class TestEmployee{
        public static void main(String[] args) {
            TestEmployee te = new TestEmployee();
            child cc = new child();
            te.display();cc.show();
        }
        public static void display(){
            System.out.print("In ");}}

    class child extends TestEmployee{
        public static void show(){
            System.out.println("Out ");}}
*/

/*
Q40. What will be the output of the code below?

        Answers:

        a) In Out
        b) In In
        c) Out In
        d) Compile time error

        Correct Answer:
        d) Compile time error
*/


/*
public class TestEmployee{
        public static void main(String[] args) {
            TestEmployee te = new TestEmployee();
            child cc = new child();
            te.display();te.show();
        }
        public static void display(){
            System.out.print("In ");}}

    class child extends TestEmployee{
        public static void show(){
            System.out.println("Out ");}}
*/

/*
Q41. What will be the output of the code below?

        Answers:

        a) In Out
        b) In In
        c) Out In
        d) Compile time error

        Correct Answer:
        b) In In
*/


/*
public class TestEmployee{
        public static void main(String[] args) {
            TestEmployee te = new TestEmployee();
            child cc = new child();
            te.display();te.display();
        }
        public static void display(){
            System.out.print("In ");}}

    class child extends TestEmployee{
        public static void show(){
            System.out.println("Out ");}}
*/

/*
Q42. Static method can access instance variable?

        Answers:

        a) No
        b) Yes
        c) None of the above

        Correct Answer:
        a) No
*/

/*
Q43. Static variable can accessed without object?

        Answers:

        a) False
        b) True
        c) None of the above

        Correct Answer:
        b) True (Static variable can accessed directly by class name.)
*/

/*
Q44. Static method can refer to "this" and "super" keyword?

        Answers:

        a) False
        b) True
        c) None of the above

        Correct Answer:
        a) False
*/


/*
Q45. During class loading in java, static code block is executed first than main method?

        Answers:

        a) False
        b) True
        c) None of the above

        Correct Answer:
        b) True
*/


// Topic 3 : Create an overloaded method

/*
Q46. What will be the output of the code below?

        Answers:

        a) a a 10
        b) 10 a a
        c) a 10 a
        d) Compile time error

        Correct Answer:
        a) a a 10
*/

/*
class Test
{
    public void display(char c){System.out.print(c+" ");}
    public void display(char c, int num){System.out.println(c + " "+num);}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display('a');obj.display('a',10);}}
*/


/*
Q47. What will be the output of the code below?

        Answers:

        a) a a 10
        b) 10 a a
        c) a 10 a
        d) Compile time error

        Correct Answer:
        c) a 10 a
*/

/*
class Test
{
    public void display(char c){System.out.print(c+" ");}
    public void display(char c, int num){System.out.print(c + " "+num+" ");}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display('a',10);obj.display('a');}}
*/

/*
Q48. What will be the output of the code below?

        Answers:

        a) a a 10
        b) 10 a a
        c) a 10 a
        d) Compile time error

        Correct Answer:
        d) Compile time error
*/

/*
class Test
{
    public void display(char c){System.out.print(c + " "+num+" ");}
    public void display(char c, int num){System.out.print(c+" ");}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display('a');obj.display('a',10);}}
*/

/*
Q49. What will be the output of the code below?

        Answers:

        a) a 5
        b) 5 a
        c) Compile time error

        Correct Answer:
        a) a 5
*/

/*
class Test
{
    public void display(char c){System.out.print(c+" ");}
    public void display(int c){System.out.print(c+" ");}}
class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display('a');obj.display(5);}}
*/


/*
Q50. What will be the output of the code below?

        Answers:

        a) a 5
        b) 5 a
        c) Compile time error

        Correct Answer:
        c) Compile time error
*/

/*
class Test
{
    public void display(char c){System.out.print(c+" ");}
    public void display(int c){System.out.print(c+" ");}}
class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display("a");obj.display(5);}}
*/


/*
Q51. What will be the output of the code below?

        Answers:

        a) 12
        b) 21
        c) 22
        d) Compile time error

        Correct Answer:
        b) 21
*/

/*
class Test
{
    public void display(char c, int num){System.out.print("2");}

    public void display(int num, char c){System.out.print("1" );}}

public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display('x',51 );obj.display(52, 'y');}}
*/


/*
Q52. What will be the output of the code below?

        Answers:

        a) 12
        b) 21
        c) 22
        d) Compile time error

        Correct Answer:
        c) 22
*/

/*
class Test
{
    public void display(char c, int num){System.out.print("1");}

    public void display(int num, char c){System.out.print("2" );}}

public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display(51,'x' );
        obj.display(52, 'y');}}
*/


/*
Q53. What will be the output of the code below?

        Answers:

        a) 12
        b) 21
        c) 22
        d) Compile time error

        Correct Answer:
        d) Compile time error
*/

/*
class Test
{
    public void display(int num,char c){System.out.print("1");}

    public void display(int num, char c){System.out.print("2" );}}

public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj = new Test();obj.display(51,'x' );
        obj.display(52, 'y');}}
*/



/*
Q54. What will be the output of the code below?

        Answers:

        a) var1
        b) int1
        c) int1 var1
        d) Compile time error

        Correct Answer:
        c) Compile time error
*/

/*
class Test
{
    public double display(int num1, int num2)
    {
        System.out.print("int1 ");return num1+num2;}
    public int display(int var1, int var2)
    {
        System.out.print("var1 ");return var1-var2;}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj2= new Test();obj2.display1(10,10);obj2.display(20,12);}}
*/

/*
Q55. What will be the output of the code below?

        Answers:

        a) int1 var1
        b) int1 int1
        c) var1 var1
        d) Compile time error

        Correct Answer:
        b) int 1 int1
*/

/*
class Test
{
    public double display(int num1, int num2)
    {
        System.out.print("int1 ");return num1+num2;}
    public int display(int var1, int var2,int var3)
    {
        System.out.print("var1 ");return var1-var2;}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj2= new Test();obj2.display(10,10);obj2.display(20,12);}}
*/

/*
Q56. What will be the output of the code below?

        Answers:

        a) int1 var1
        b) int1 int1
        c) var1 var1
        d) Compile time error

        Correct Answer:
        a) int1 var1
*/

/*
class Test
{
    public double display(int num1, int num2)
    {
        System.out.print("int1 ");return num1+num2;}
    public int display(int var1, int var2,int var3)
    {
        System.out.print("var1 ");return var1-var2;}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj2= new Test();obj2.display(10,10);obj2.display(20,12,5);}}
*/


/*
Q57. What will be the output of the code below?

        Answers:

        a) int1 var1
        b) int1 int1
        c) var1 var1
        d) Compile time error

        Correct Answer:
        c) var1 var1
*/

/*
class Test
{
    public double display(int num1, int num2)
    {
        System.out.print("int1 ");return num1+num2;}
    public int display(int var1, int var2,int var3)
    {
        System.out.print("var1 ");return var1-var2;}}
public class TestEmployee
{
    public static void main(String args[])
    {
        Test obj2= new Test();obj2.display(10,10,2);obj2.display(20,12,5);}}
*/


/*
Q58. What will be the output of the code below?

        Answers:

        a) 20.9 40
        b) 40 20.9
        c) Compile time error

        Correct Answer:
        a) 20.9 40
*/

/*
class TestEmployee{
    void sum(int a,int b){System.out.print(a+b+" ");}
    void sum(double a,double b){System.out.print(a+b+" ");}

    public static void main(String args[]){
        TestEmployee ob=new TestEmployee();
        ob.sum(10.5,10.4);
        ob.sum(20,20);}}
*/


/*
Q59. What will be the output of the code below?

        Answers:

        a) 20.9 40
        b) 40 20.9
        c) Compile time error

        Correct Answer:
        c) Compile time error
*/

/*
class TestEmployee{
    void sum(int a,int b){System.out.print(a+b+" ");}
    void sum(double a,double b){System.out.print(a+b+" ");}

    public static void main(String args[]){
        TestEmployee ob=new TestEmployee();
        ob.sum(10.5,10.4);
        int result=ob.sum(20,20);}}
*/

/*
Q60. What will be the output of the code below?

        Answers:

        a) 50
        b) Run time error
        c) Compile time error

        Correct Answer:
        a) 50
*/

/*
class TestEmployee{
    public static void main (int a){
        System.out.println(a);
    }

    public static void main(String args[]){
        main(50);}}
*/


/*
Q61. What will be the output of the code below?

        Answers:

        a) ok
        b) 218
        c) Compile time error
        d) Run time error

        Correct Answer:
        b) 218
*/

/*
class TestEmployee{
    public  void add(int a, int b){
        System.out.println(a  + b);}
    public static void main(String args[]){
        TestEmployee te = new TestEmployee();
        te.add('o','k');}}
*/


/*
Q62. Suppose we made two methods with same name in class, one will add two numbers and another will add three numbers. Will it work?

        Answers:

        a) yes
        b) No
        c) Will give compile time error

        Correct Answer:
        a) yes
*/

/*
Q63. Can we change return type of overloading method?

        Answers:

        a) yes
        b) No

        Correct Answer:
        b) No
*/

/*
Q64. Can we overload main() method?

        Answers:

        a) yes
        b) No

        Correct Answer:
        a) yes
*/

/*
Q65. Overloaded method are bonded using?

        Answers:

        a) Static binding
        b) Dynamic binding

        Correct Answer:
        a) Static binding
*/

// Topic 4 : Differentiate between default and user defined constructors


/*
Q66. What will be the output of the code below?

        Answers:

        a) C M
        b) M C
        c) C
        d) Compile time error

        Correct Answer:
        a) C M
*/

/*
class TestEmployee{
    TestEmployee(){System.out.print("C ");}

    public void method(){System.out.print("M ");}

    public static void main(String args[]){
        TestEmployee te = new TestEmployee(); te.method();}}
*/

/*
Q67. What will be the output of the code below?

        Answers:

        a) C M
        b) M C
        c) C
        d) Compile time error

        Correct Answer:
        c) C
*/

/*
class TestEmployee{
    TestEmployee(){System.out.print("C ");}

    public void method(){System.out.print("M ");}

    public static void main(String args[]){
        TestEmployee te = new TestEmployee();}}
*/

/*
Q68. What will be the output of the code below?

        Answers:

        a) C M
        b) M C
        c) C
        d) Compile time error

        Correct Answer:
        c) C
*/

/*
class TestEmployee{
    TestEmployee(){System.out.print("C ");}

    public void method(){System.out.print("M ");}

    public static void main(String args[]){
         new TestEmployee();}}
*/

/*
Q69. Will it compile successfully or not?

        Answers:

        a) Yes
        b) No
        c) Will compile but gave run time error


        Correct Answer:
        a) Yes ( when there is no constructor,compiler made a empty constructor automatically)
*/

/*
class TestEmployee{
    public static void main(String args[]){
        TestEmployee te =new TestEmployee();}}
*/

/*
Q70. Will it compile successfully or not?

        Answers:

        a) Hello
        b) Will compile but no output
        c) Run time error


        Correct Answer:
        b) Will compile but no output
*/

/*
public class TestEmployee{
    public static void main(String argv[]){
        TestEmployee c = new TestEmployee();}
    void TestEmployee(){
        System.out.println("Hello");}}
*/


/*
Q71. What will be output of below code?

        Answers:

        a) B
        b) Will compile but no output
        c) Run time error


        Correct Answer:
        a) B
*/


/*
class Test{
    Test(int i){
            System.out.print("A ");}}
public class TestEmployee{
        public static void main(String arg[]){
            TestEmployee s = new TestEmployee();}
         TestEmployee(){
            System.out.print("B ");}}
*/

/*
Q72. Default constructor is?

        Answers:

        a) parameterised constructor
        b) non-parameterised constructor
        c) None of the above


        Correct Answer:
        b) non-parameterised constructor
*/

/*
Q73. Constructor can be?

        Answers:

        a) static
        b) final
        c) abstract
        d) None of the above


        Correct Answer:
        d) None of the above
*/

/*
Q74. Suppose there is a constructor in class, then default constructor is also created by compiler?

        Answers:

        a) No
        b) Yes
        c) None of the above


        Correct Answer:
        a) No
*/

/*
Q75. Can we access default constructor is created by compiler?

        Answers:

        a) Yes
        b) No
        c) None of the above


        Correct Answer:
        b) No
*/

/*
Q76. Default constructor created by compiler and created by user is same?

        Answers:

        a) Yes
        b) No
        c) None of the above


        Correct Answer:
        b) No ()
*/

/*
Q77. What will be the output of the code below?

        Answers:

        a) 0 null
        b) null 0
        c) Compile time error

        Correct Answer:
        c) C
*/

/*
class Test {

    private int eid;
    private String ename;
    public void display() {
        System.out.print(eid+" ");
        System.out.println(ename+" ");}}
public class TestEmployee {

    public static void main ( String[] args ) {
        Test t=new Test();
        t.display();}}
*/



