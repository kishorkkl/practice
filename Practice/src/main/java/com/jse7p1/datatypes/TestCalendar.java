package com.jse7p1.datatypes;

/**
 * Created by sandeep on 29/01/2016.
 *
 *  TODO Himanshu/Nikhil
 *   This class should Test the following
 *  a)Explain an Object's Lifecycle (creation, "dereference" and garbage collection)
 *  b)Call methods on objects
 *  c)Manipulate data using the StringBuilder class and its methods
 *  d)Creating and manipulating Strings
 */


   /*Testing Topic 1: Explain an Object's Lifecycle (creation, "dereference" and garbage collection) */
/*
    Q1.What will be the output of code below?

      Answers:

        a)Compile Time Error
        b)Main method not found in class TestSeconds
        c)8400
        d)Run time Error

        Correct Answer:
        c)8400
*/
/*
   class TestSeconds {
    public static int seconds(int hour, int min){
        int mint = hour * 60 + min;
        int result = 60 * mint ;
        return result;
    }
}
   public class TestCalendar  {
    public static void main(String[] args) {
        int seconds = TestSeconds.seconds(2, 20);
        System.out.println(seconds);
    }
}
*/

/*
    Q2.What will be the output of code below?

      Answers:

        a)Unresolved compilation problem
        b)Main method not found in class TestSeconds
        c)8400
        d)Run time Error

      Correct Answer:
        c)8400
*/
/*
       class TestSeconds {
    public  int seconds(int hour, int min){
        int mint = hour * 60 + min;
        int result = 60 * mint ;
        return result;
    }
}

public class TestCalendar {
    public static void main(String[] args) {
        int seconds = TestSeconds().seconds(2, 20);
        System.out.println(seconds);
    }
}
*/
/*
  Q3.What will be the output of code below?

     Answers

        a)Unresolved compilation problem
        b)Main method not found in class TestCalendar
        c)8400
          java.lang.NullPointerException
        d)8400
          Message

     Correct Answer:
        c)8400
          java.lang.NullPointerException
*/
/*
public class TestCalendar {
    public int seconds(int hour, int min){
        int mint = hour * 60 + min;
        int result = 60 * mint ;
        return result;
    }
    public void sayMessage(){
        System.out.println("Message");
    }
}
class TestSeconds {
    public static void main(String[] args) {
        TestCalendar cal = new TestCalendar();
        int seconds = cal.seconds(2, 20);
        System.out.println(seconds);
        cal =null;
        cal.sayMessage();
    }
}
*/

/*
  Q4.What will be the output of code below?

     Answers

        a)Unresolved compilation problem
        b)Main method not found in class TestCalendar
        c)Hello World
        d)Object is not created for TestCalendar


     Correct Answer:
        c)Hello World
*/
/*
    public class TestCalendar {
    public String printHello(){
        return "Hello World";
    }
}
class TestSeconds {
    public static void main(String[] args) {
        String name = new TestCalendar().printHello();
        System.out.println(name);
   }
}
*/

/*
  Q5.When the variable becomes automatically de-referenced variable??

     Answers

        a) At thr end of Code
        b) At the end of block
        c) No longer in scope
        d) Both b and c


     Correct Answer:
        d) Both b and c
*/

/*
  Q6.Should we de-reference variable explicitly?

  Answers:
        a)Yes
        b)No


     Correct Answer:
       b)No
*/

/*
  Q7.How can we de-reference below object?

      Answers:
        TestCalendar test = new TestCalendar();
        a)test= null;
        b)test.close();
        c)test.clear();
        d)test.reset();

     Correct Answer:
       a)test= null;
*/
/*
  Q8.Which method is invoked each time before garbage collector?

  Answers:

        a) protected void finalize()
        b) finally()
        c) protected void run()
        d) run()

     Correct Answer:
       a) protected void finalize(
*/



     /*Testing Topic 2: Call methods on objects */
/*
    Q1.What will be the output of the code below?

        Answers:

        a)Runtime Error
        b)Square root is 2
        c)Compile time Error
        d)Square root is 2.5

        Correct Answer:
        c)Compile time Error
 */
    /*
public class TestCalendar {
    public static void main(String[] args)
    {
        int min=5,sec=callCalendar(min);
        System.out.println("Square root is " + sec);
    }0
    public static int callCalendar(int x)
    {
        int sq;
        sq=(double) Math.sqrt(x);
        return sq;
    }
}
*/

/*
    Q2.What will be the output of the code below?

        Answers:

        a)Runtime Error:variable never get read after assignment
        b)Square root is 3
        c)Compile time Error:cannot convert from double to int
        d)Square root is 2

        Correct Answer:
        c)Square root is 2
 */
/*
public class TestCalendar {
    public static void main(String[] args){
        int min=8;
        min=callCalendar(min);
        System.out.println("Square root is " + sec);
    }
    public static int callCalendar(double x){
        int sq;
        sq=(int) Math.sqrt(x);
        return sq;
    }
}
*/

/*
    Q3.What will be the output of the code below?

        Answers:

        a)40 and 20
        b)40 and 10
        c)20 and 10
        d)Compile time Error:resultCalendar parameter doesn't match variable

        Correct Answer:
        b)40 and 10
 */
/*
public class TestCalendar {
 static int second=20;
    public static void main(String[] args){
        int minute=10;
        TestCalendar test=new TestCalendar();
        test.resultCalendar(minute);
        System.out.println("Value of second "+second);
        System.out.println("Value of minute "+minute);
    }
    public void resultCalendar(int x){
        x=x*2;
        second=second*2;
    }
}
*/

/*
    Q4.What will be the output of the code below?

        Answers:

        a)40 and 20
        b)40 and 10
        c)20 and 10
        d)Compile time Error

        Correct Answer:
        d)Compile time Error
 */
/*
public class TestCalendar {
    static int second=20;
    static int minute=10;
    public static void main(String[] args){
        TestCalendar.resultCalendar(minute);
        System.out.println("Value of second "+second);
        System.out.println("Value of minute "+minute);
    }
    public void resultCalendar(int x){
        x=x*2;
        second=second*2;
    }
}
*/

/*
    Q5.What will be the output of the code below?

        Answers:

        a)80 and 10
        b)80 and 40
        c)160 and 80
        d)160 and 40

        Correct Answer:
        b)80 and 40
 */
/*
public class TestCalendar {
    static int second=20;
    static int minute=10;
    public static void main(String[] args){
        TestCalendar test=new TestCalendar();
        test.resultCalendar(minute);
        test.resultCalendar(second);
        System.out.println("Value of second and minute is "+second+ " and " +minute);
        test.resultCalendar(minute);
    }
    public void resultCalendar(int x){
        minute=minute*2;
        second=second*2;
    }
}
*/

/*
    Q6. Which of these method of Object class is used to obtain class of an
        object at run time?

        Answers:

        a)get()
        b)void getClass()
        c)Class getClass()
        d)None of these

        Correct Answer:
        c)Class getClass()
 */

  /* Testing Topic 3: Manipulate data using the StringBuilder class and its methods */


/*
    Q1.What will be the output of the code below?

        Answers:

        a)Equal
        b)Not Equal
        c)Compile time error
        d)Runtime Error

        Correct Answer:
        c)Compile time error

        Tip: the method reverse() is undefined for the type String
 */
/*
public class TestCalendar {
    public static void main(String[] args) {
        String s = "Java Platform";
        StringBuilder sb = new StringBuilder("Java Platform");
        sb.reverse();
        s.reverse();
        if (s == sb.toString())
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
*/


/*
    Q2.What will be the output of the code below?

        Answers:

        a)Equal
        b)Not Equal
        c)Compile time error
        d)None of these

        Correct Answer:
        b)Not Equal
 */
/*
public class TestCalendar {
    public static void main(String[] args) {
        String s = "Java Platform";
        StringBuilder sb = new StringBuilder("Java Platform");
        if (s == sb.toString())
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
*/

/*
    Q3.What will be the output of code below?

    Answers

        a)Hello Java
        b)Java Hello
        c)HJavaello
        d)Hjavaello

      Correct Answer:
        c)HJavaello
*/
/*
public class TestCalendar {
    public static void main(String args[]){
             StringBuilder sb=new StringBuilder("Hello ");
             sb.insert(1,"Java");
             System.out.println(sb);
     }
}
*/

/*
    Q4.What will be the output of code below?

    Answers

        a)0
         29
        b)16
         45
        c)16
         34
        d)10
         39

      Correct Answer:
        c)16
         34
*/
/*
public class TestCalendar {
    public static void main(String args[]){
             StringBuilder sb=new StringBuilder();
             System.out.println(sb.capacity());
             sb.append("Java Main Platform");
             System.out.println(sb.capacity());
 }
}
*/

/*
    Q5.What will be the output of code below?

    Answers

        a)28
          29
        b)15
          34
        c)28
          34
        d)15
          29

      Correct Answer:
         a)28
           29
*/
/*
public class TestCalendar {
    public static void main(String args[]){
             StringBuilder sb=new StringBuilder("Java Platform");
             System.out.println(sb.append("Object Oriented").length());
             System.out.println(sb.capacity());
 }
}
*/
