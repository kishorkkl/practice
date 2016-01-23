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


/*TODO Himanshu/Nikhil
    Begin preparing questions here. The format should be as follows.
       a) First declare the question. Just above the question write a small summary of whats being tested.
       b) Then declare the answers.
       c) Then write small code to verify the Q and answer.
       d) The first Testing Topic example is given in TestEmployee class.
       e) Aim to write about 5 questions/programs for each of the topics I have set below.
       f) For names. I suggest you use names of classes, methods, variables that are normally used such as from the below list
            {Company,Employee,Employer} {Car,Manufacturer,Driver} {House,Room,Door} ..etc dont use any specific names of persons etc.
       g) You should also make questions that dont have code and test specific knowledge of the topic but no more than 2 per topic and should test important aspect of the question. These should be in addition to 5 code related questions.

 */
/*public class TestCalendar {
}*/



  /*Testing Topic 1: Java applications with a main method

    Q1.What will be the output of the code below?

        Answers:

        a)null
        b)Compile time Error.
        c)TestCalendar program Running
        d)Run time Error


        Correct Answer:
        c) TestCalendar program Running.
   */

/*
   public class TestCalendar{
    public static void main(String[] args)
    {
        if (null==null) {
            System.out.println("TestCalendar program Running");
        }
    }
}
*/


  /* Q2.What will be the output of the code below?

        Answers:

        a)time is true
        b)Compile time Error.
        c)time is false.
        d)Java.lang.ArithmeticException


        Correct Answer:
        a)time is true.
        */

 /* public class TestCalendar{
    public static void main(String[] args)
    {
        boolean time = false;
        if(time=true){
        System.out.println("time is true");
        }else{
        System.out.println("time is false");
        }
        }
    }
    */

/* Q3.What will be the output of the code below?

        Answers:

        a)true
          true
        b)false
          true
        c)true
          false
        d)false
          false


        Correct Answer:
        b)false
          true

     *Tip:--Integer Limit 0-127
        */


  /*
  public class TestCalendar{
    public static void main(String[] args) {

        Integer min = 128;

        Integer sec = 128;

        System.out.println(min == sec);

        Integer minute = 127;
        Integer second = 127;

        System.out.println(minute == second);
        }
    }
    */

/* Q4.What will be the output of the code below?

        Answers:

        a)Value of Integer:null
          Value of String:null
        b)Value of Integer:
          Value of String:
        c)Compile time Error :The constructor String(String) is ambiguous
        d)Compile time Error :The constructor Integer(Integer) is ambiguous


        Correct Answer:
        b)false
          true

     *Tip:--Integer Limit 0-127
        */


/*
  public class TestCalendar{
    public static void main(String [] args)
        {
        Integer i = new Integer(null);
        String s = new String(null);

        System.out.println("Value of Integer:" +i);
        System.out.println("Value of String:" +s);
        }
    }
    */

/* Q5.What will be the output of the code below?

        Answers:

        a)Compile Time Error
        b)Run Time Error
        c)Exception:java.lang.NullPointerException
        d)Exception: java.lang.StackOverflowError


        Correct Answer:
        d)Exception: java.lang.StackOverflowError

/*
  public class TestCalendar{
    TestCalendar test = new TestCalendar();
    public static void main(String [] args)
        {
          TestCalendar test = new TestCalendar();
          test.show();
        }
        public int show(){
        return (true ? null: 0);
        }
    }
    */









