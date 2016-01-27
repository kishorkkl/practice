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

/*
Q9.  javac.exe FileName.java  the command line is used to?

    Answers:-

    a) Execute the java file
    b) Compile the java file
    c) Execute and Compile the java file
    d) None of the above

        Correct Answer:
        b)compile the java file

*/

/*Q10.What will be the output of the code below?

Answers:-

a)Compile Time Error
b)1
c)2
d)-1

correct answer:-
d)-1

 */


/*
public class TestCalendar {

    static int i = 1;

    public static void main(String[] args) {
        int k = Employee();
        System.out.println(Employee());
    }

    static int Employee() {
        int j;
        i = i++;
        j = i--;
        return i;

    }

}
*/


/*Q11.  What will be the output of the code below?*/

/*Answers:-

        a)Compile Time Error
        b)Run Time Error
        c)4
        d)5

        correct answer:-
        b)main method must return a value of type void
*/




/*public class TestCalendar {

    static int i = 5;

    public static int main(String[] args) {
        int k = cars();
        return k;
    }

    static int cars() {
        int j;
        i = i++;
        j = i--;
        return j;

    }
}*/


/*Q12.  What will be the output of the code below?*/

/*Answers:-

        a)Compile Time Error
        b)Run Time Error
        c)No. of Cars = 13
        d)None of the above

        correct answer:-
       a)non-static method cars() cannot be referenced from a static context
*/


/*
public class TestCalendar {

    public static void main(String[] args) {
        int k = cars();
       System.out.println("No. of Cars = "+ k);
    }

     int cars() {
        int j=7,k=6;
        j = j++ + k--;
        return j;

    }
}*/

/*Q13.  What will be the output of the code below?*/

/*Answers:-

        a)Compile Time Error
        b)Run Time Error
        c)13
        d)None of the Above

        correct answer:-
           b)Exception in thread "main"  java.lang.NoSuchMethodException:
*/



/*
public class TestCalendar {

    public static void main() {
        int k = cars();
        System.out.println(k);
    }

    static int cars() {
        int j = 7, k = 6;
        j = j++ + k--;
        return j;

    }
}
*/


/*Q14.  What will be the output of the code below?*/

/*Answers:-

        a)Compile Time Error
        b)Run Time Error
        c)0,1
        d)1,4

        correct answer:-
        a)non-static method cannot be referenced from a static context

*/

/*
public class TestCalendar {

     int i = 0;

    public static void main(String[] args){
        cars();
    }

     void cars() {

        int j,k;
        j = i*2 + i++;
        k= j*3 + i++;
        System.out.println(j +","+ k);

    }
}


*/

/* Q15. Is it possible to use a member from a different package without importing that package ?
Answers:-

a)Yes
b)No

Correct Answer:-
a) yes,by using the member's fully qualified name, which includes the package name

 */


/*Q16.import fruits.A* will import?

Answers:-

a)all members of fruits package.
b)all members of fruits package begin with A.
c)Nothing.

Correct Answer:-
C)It cannot be used to match a subset of the classes in a package.

 */

/*Q.17 import graphics.Rectangle.Square; is used to import?
Answers:-

a)Rectangle & Square classes of graphics package
b)Rectangle class of graphics package
c)nested class of enclosing class
d)both b and c

Correct Answer:-
C) allows you to import the public nested classes of an enclosing class as
import package.Class.NestedClass

 */

/*Q18.Qualified name of the package member and the path name to the java file are ?

Answers:-
a)opposite to each other
b)parallel to each other

 Correct Answer:-

   b)  class name – graphics.Rectangle
       pathname to file – graphics\Rectangle.java

*/

/*Q19. import static java.lang.Math.*; is used to import?

Answers:-

a)members of enclosing class
b)static nested classes of enclosing class
c)static members of enclosing class
d)None of the above

correct answer:-
c)
static import statement is used to import the static members of java.lang.Math so that you don't need to prefix the class name as
double x = cos(PI * theta);

without static import:-
double x = Math.cos(Math.PI * theta);

*/

/*Q20.To use a public package member from outside its package?

    A.Refer to the member by its fully qualified name
    B.Import the package member
    C.Import the member's entire package

    Answers:-
    a)B & C
    b)B
    c)C
    d)A,B and C

    correct answer:-
    d)

 */

/*Q21. Java provides which specifier when no access modifier is declared ?

Answers:-
a)private
b)protected
c)package
d)public

    correct answer:-
   c) Any class, field, method or constructor that has no declared access modifier is accessible only by classes in the same package

*/

/*Q22.Java compiler automatically imports which entire package for each source file?
 Answers:-
  a)java.lang package
  b)java.util package
  c)the package for the current file
  d)both a & b
  e)both a & c

  correct answer:-
  e)
 Java compiler automatically imports two entire packages for each source file:
(1) the java.lang package and
(2) the current package (the package for the current file).
  */

/*Q23. A package is a collection of ?

a)classes
b)interfaces
c)exceptions ,errors and enums


Answers:-
a)A
b)A & B
c)A,B and C

correct answers:-
c)A package is a collection of related Java entities (such as classes, interfaces, exceptions, errors and enums)
*/
