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



  /*Testing Topic 1: Java applications with a main method

/* Q1.What will be the output of the code below?

        Answers:

        a)Runtime Error
        b)Result is:12.9
        c)Compile time Error

        Correct Answer:
        a)Runtime Error
*/

/*
  public class TestCalendar{
    public static int main(String [] args)
        {
            double result,min=7.0,sec=5.9;
            result=min+sec;
            System.out.println("Result is:" +result);
            return 0;
        }
    }
*/


/*
  Q2.What will be the output of the code below?

        Answers:

        a)Runtime Error
        b)Result is:12.9
        c)Compile time Error

        Correct Answer:
        c)Compile time Error
*/

/*
  public class TestCalendar{
    public static void main(String [] args)
        {
            double result,min=7.0,sec=5.9;
            result=min+sec;
            System.out.println("Result is:" +result);
            return 0;
        }
    }
*/

/*
  Q3.What will be the output of the code below?

        Answers:

        a)Exception:java.lang.NoSuchMethodException
        b)Compile time Error
        c)Result is:Good Morning
        d)Exception:java.lang.NoSuchFieldException

        Correct Answer:
        a)Exception:java.lang.NoSuchMethodException
*/

/*
  public class TestCalendar{
    private static void main(String [] args)
        {
            String time=new String("Good Morning");
            System.out.println("Result is:" +time);
        }
    }
*/

/*
  Q4.What will be the output of the code below?

        Answers:

        a)Exception:java.lang.NoSuchMethodException
        b)Compile time Error
        c)Result is:Good Morning
        d)Exception:java.lang.NoSuchFieldException

        Correct Answer:
        a)Exception:java.lang.NoSuchMethodException
*/

/*
  public class TestCalendar{
    public static void main(String args)
        {
            String time=new String("Good Morning");
            System.out.println("Result is:" +time);
        }
    }
*/

  /*
  Q5.What will be the output of the code below?

        Answers:

        a)Compile time Error:incorrect position of static
        b)Runtime error:incorrect position of static
        c)Result is:Good Morning
        d)Exception:java.lang.NoSuchFieldException

        Correct Answer:
        c)Result is:Good Morning
*/

/*
  public class TestCalendar{
   static public void main(String arg[])
        {
            String time=new String("Good Morning");
            System.out.println("Result is:" +time);
        }
    }
*/

/*
  Q6.Can we call main in main method?

        Answers:

        a)yes
        b)Compile time error
        c)Exception:java.lang.StackOverFlowError

        Correct Answer:
        c)Exception:java.lang.StackOverFlowError
*/

/*
   public class TestCalendar{
    public static void main(String [] args)
    {
        main(new String[1]);
    }
}
*/

    /*
  Q7.What will be the output of the code below?

        Answers:

        a)Exception:java.lang.NoSuchMethodException
        b)Compile time Error
        c)Result is:Good Morning
        d)Exception:java.lang.NoSuchFieldException

        Correct Answer:
        a)Exception:java.lang.NoSuchMethodException
*/

/*
public class TestCalendar{
     public static void main(Object obj[])
    {
        String time=new String("Good Morning");
        System.out.println("Result is:" +time);
    }
}
*/

    /*
  Q8.Can we use multiple main method in class?

        Answers:

        a)Run time error
        b)Compile time Error
        c)Result is:Good Morning
        d)Hello

        Correct Answer:
        a)Exception:java.lang.NoSuchMethodException
*/
    /*
public class TestCalendar{
    public static void main(String arg[])
    {
        String time=new String("Good Morning");
        System.out.println("Result is:" +time);
    }
    int main(String str[])
    {
        System.out.println("Hello");
        return 0;
    }
}
*/
