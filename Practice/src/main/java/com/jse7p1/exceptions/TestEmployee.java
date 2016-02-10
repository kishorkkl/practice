package com.jse7p1.exceptions;
import java.io.*;
import java.util.Random;

/**
 * Created by sandeep on 10/02/2016.
 *
 * Exam Objective Handling Exceptions
 *
 *
    1. Differentiate among checked exceptions, RuntimeExceptions and Errors
    2. Create a try-catch block and determine how exceptions alter normal program flow
    3. Describe what Exceptions are used for in Java
    4. Invoke a method that throws an exception
    5. Recognize common exception classes and categories

 */

/*Topic:-1:Differentiate among checked exceptions, RuntimeExceptions and Errors*/

/*Q1.An exception occurs in java when
A)A user has entered invalid data.
B)A file that needs to be opened cannot be found.
C)A network connection has been lost in the middle of communications or the JVM has run out of memory.

Answers:-
a)A
b)B
c)A & B
d)All of the above

correct answer:-
d)All of the above*/

/*Q2.Exceptions caused by
A)user error
B)by programmer error
C)by physical resources that have failed in some manner

Answers:-
a)A
b)B
c)A & B
d)All of the above

correct answer:-
d)All of the above*/

/*Q3.A checked exception is an exception occurs at
Answers:-
A)compilation time
B)execution time

Correct answer:-
A)compilation time
*/

/*Q4.A checked exception
Answers:-
A)can ignore by programmer
B)cannot be ignored by programmer

Correct answer:-
B)cannot be ignored by programmer
*/

/*Q5.A checked exception is an exception occurs at
Answers:-
A)compilation time
B)execution time

Correct answer:-
B)execution time
*/

/*Q6.Run-time exception also known as
Answers:-
A)checked exception
B)unchecked exception

Correct answer:-
B)unchecked exception
*/

/*Q7.Syntax error is handled by which exception
Answers:-
A)checked exception
B)unchecked exception

Correct answer:-
A)checked exception
*/

/*Q8.Logical error is handled by which exception
Answers:-
A)checked exception
B)unchecked exception

Correct answer:-
B)unchecked exception
*/

/*Q9.An unchecked exception
Answers:-
A)can ignore by programmer at compilation time
B)cannot be ignored by programmer at compilation time

Correct answer:-
A)can ignore by programmer at compilation time
*/


/*Q10.which of the following is checked exception
A)FileNotFoundException
B)IOException
C)ClassNotFoundException
D)NoSuchMethodException

Answers:-
a)A
B)A,B & C
C)All of the above
D)None of the above

Correct answer:-
C)All of the above*/


/*Q11.which of the following is unchecked exception
A)ArrayIndexOutOfBoundsException
B)IndexOutOfBoundsException
C)NullPointerException
D)ClassCastException

Answers:-
a)A
B)A,B & C
C)All of the above
D)None of the above

Correct answer:-
C)All of the above*/


/*Q12.ArithmeticException is
Answers:-
A)checked exception
B)unchecked exception

Correct answer:-
B)unchecked exception
*/

/*Q13.IllegalArgumentException is
Answers:-
A)checked exception
B)unchecked exception

Correct answer:-
B)unchecked exception
*/

/*Q14.NumberFormatException is
Answers:-
A)checked exception
B)unchecked exception

Correct answer:-
B)unchecked exception
*/

/*Q15.Java errors are
Answers:-
A)checked
B)unchecked

Correct answer:-
B)unchecked
*/

/*Q16.Checked exceptions are checked by
Answers:-
A)User
B)Programmer
C)Compiler

Correct answer:-
C)Compiler*/

/*Q17.Exceptions are thrown with the which of the following keyword
Answers:-
A)Thrown
B)Throws
C)Throw

Correct answer:-
C)Throw*/

/*Q18.Methods of the Throwable class provide support of gathering information about a thrown exception
A)getMessage
B)toString
C)printStackTrace

Answers:-
a)A
B)A & B
C)All of the above
D)None of the above

Correct answer:-
C)All of the above*/

/*Q19.Which keyword is used in method definitions of methods that throw an exception
Answers:-
A)Thrown
B)Throws
C)Throw

Correct answer:-
B)Throws*/

/*Topic:-2: Create a try-catch block and determine how exceptions alter normal program flow*/

/*Q20.what will be the Output of the code below?*/
/*Answers:-
A)java.lang.ArrayIndexOutOfBoundsException: 3
B)Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
C)Error*/

/*correct answer:-
B)Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
*/

/*
public class TestEmployee {

        public static void main(String args[]) {
            try {
                int a[] = new int[2];
                System.out.println(a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown  :" + e);
            }
        }
    }

*/

/*Q21.what will be the Output of the code below?*/
/*Answers:-
A)Division by zero
  After catch statement.
B)Division by zero
C) After catch statement.


/*correct answer:-
A)Division by zero
  After catch statement.
*/


/*public class TestEmployee {
    public static void main(String args[]) {
        int d, a;
        try {
            d = 0;
            a = 7 / d;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero ");
        }
        System.out.println("After catch statement.");
    }
}*/


/*Topic:-3 Describe what Exceptions are used for in Java*/

/*Q22.what will be the Output of the code below?*/

/*
Answers:-
A)ArithmeticException
B)NullPointerException
c)Error

correct answer:-
A)ArithmeticException*/

/*public class TestEmployee {
    public static void main(String[] args) {
        int i = 1/0;
        System.out.println(i);
    }
}*/

/*Q23.what will be the Output of the code below?*/
/*
Answers:-
A)ArithmeticException
B)NullPointerException
c)Error
D)ArrayIndexOutOfBoundsException

correct answer:-
D)ArrayIndexOutOfBoundsException*/

/*
public class TestEmployee {
     public static void main(String[] args) {
        int arr[] = {'0','1','2'};
        System.out.println(arr[4]);
    }
}
*/

/*Q24.what will be the Output of the code below?*/
/*
Answers:-
A)ArithmeticException
B)NullPointerException
c)Error
D)ArrayIndexOutOfBoundsException

correct answer:-
B)NullPointerException*/


/*
public class TestEmployee {
     public static void main(String[] args) {
    String s=null;
    System.out.println(s.length());
}
}
*/

/*Q25.what occurs when an unexpected exception occurs in a static initializer
Answers:-
A) AssertionError is thrown
B)ExceptionInInitializeError is thrown
C)VirtualMachineError is thrown

Correct answer:-
B)ExceptionInInitializeError is thrown
*/

/*Q26.OutOfMemoryError is thrown
Answers:-
A)when a JVM error occurs.
B)when garbage collection is performed but is unable to free up any space.
C)upon a failed assertion

Correct answer:-
B)
*/

/*Q27.what will be the Output of the code below?*/
/*
Answers:-
A)ArithmeticException
B)NullPointerException
c)NumberFormatException
D)ArrayIndexOutOfBoundsException

correct answer:-
c)NumberFormatException*/


/*public class TestEmployee {
      public static void main(String args[])
   {
      try{
	    int i=Integer.parseInt ("STRING") ;
	    System.out.println(i);
      }catch(NumberFormatException e){
	    System.out.println(e);
       }
   }
}*/


/*Q28.which exception will be thrown by code below?*/
/*
Answers:-

A)IndexOutOfBoundsException
B)ArrayIndexOutOfBoundsException
C)StringIndexOutOfBoundsException

correct answer:-
C)StringIndexOutOfBoundsException*/


/*
public class TestEmployee {
     public static void main(String args[])
   {
      try{
	 String str="STRING";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(10);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println(e);
       }
   }
}
*/

/*Topic-4:Invoke a method that throws an exception*/

/*Q29.what will be the Output of the code below*/
/*
Answers:-

A)No output
B)Error
C)java.lang.NullPointerException

correct answer:-
C)java.lang.NullPointerException
*/

/*
public class TestEmployee {
    static void throwsMethod() throws NullPointerException  {
        throw new NullPointerException();
    }

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}*/

/*Topic-5:Recognize common exception classes and categories*/

/*Q30.All exceptions and errors inherit from which class
Answers:-
A)Throwable class
B)Object class
C)StackTraceElement

Correct answer:-
A)Throwable class
*/