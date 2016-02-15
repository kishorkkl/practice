package com.jse7p1.exceptions;
import java.io.*;
import java.util.IllegalFormatException;
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

/*Q22.what will be the Output of the code below?*/
/*Answers:-
A)HELLO
B)GOOD MORNING
C)HELLO
GOOD MORNING
D)HELLO
FRIEND
GOOD MORNING
E)Error

/*correct answer:-
E)Error
System.out.println("FRIEND"); is  unreachable statement
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
       try
       {
       System.out.println("HELLO");
           throw new ArithmeticException();
         System.out.println("FRIEND");
       }
       catch(ArithmeticException e)
       {
           System.out.println("GOOD MORNING");
       }
    }
}
*/

/*Q23.what will be the Output of the code below?*/
/*Answers:-
A)Exception
B)Error

/*correct answer:-
B)Error
*/


/*public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           throw new ArithmeticException();
       }

       catch(IllegalFormatException Ife )
       {
           Ife.printStackTrace();
       }
       catch(RuntimeException Re)
       {
           Re.printStackTrace();
       }
       catch(ArithmeticException e)
       {
           e.printStackTrace();
       }
    }
}*/


/*Q24.what will be the Output of the code below?*/
/*Answers:-
A)Exception
B)Error

/*correct answer:-
A)Exception
*/


/*public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           throw new ArithmeticException();
       }
       catch(IllegalFormatException Ife )
       {
           Ife.printStackTrace();
       }
       catch(RuntimeException Re)
       {
           Re.printStackTrace();
       }
    }
}*/

/*Q25.what will be the Output of the code below?*/
/*Answers:-
A)Exception
B)Error
c)No output
D)Null
/*correct answer:-
D)Null
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           throw new ArithmeticException();
       }
       catch(ArithmeticException e)
       {
          System.out.print(e.getMessage());
       }
       catch(IllegalFormatException Ife )
       {
           Ife.printStackTrace();
       }
       catch(RuntimeException Re)
       {
           Re.printStackTrace();
       }
    }
}
*/


/*Q26.what will be the Output of the code below?*/
/*Answers:-
A)ArithmeticException
B)Error
c)No output
D)/ by zero
/*correct answer:-
D)/ by zero
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           int r = 2/0;
           throw new ArithmeticException();
       }
       catch(ArithmeticException e)
       {
           System.out.println(e.getMessage());

       }
    }
}
*/


/*Q27.what will be the Output of the code below?*/
/*Answers:-
A)ArithmeticException
B)Error
c)ArithmeticException: / by zero
D)/ by zero
/*correct answer:-
c)ArithmeticException: / by zero
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           int r = 9/0;

       }
       catch(ArithmeticException e)
       {
          System.out.println(e.toString());
       }
    }
}
*/

/*Q28.what will be the Output of the code below?*/
/*Answers:-
A)NumberFormatException
B)Error
c)No Output
D)caught
/*correct answer:-
c)No Output
*/


/*public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           throw new NumberFormatException();
       }
       catch(NumberFormatException e)
       {

       }
    }
}*/


/*Q29.what will be the Output of the code below?*/
/*Answers:-
A)NumberFormatException
B)Error
c)IllegalFormatException

/*correct answer:-
A)NumberFormatException
When exceptions are being caught, if the exception class is not found, the system will look for the
superclass of the exception being thrown
*/


/*
public class TestEmployee {
    public static void main(String args[]) {
       try
       {
           throw new NumberFormatException();
       }
       catch(IllegalFormatException ie)
       {
           System.out.println(ie);
       }
    }
}
*/

/*Q30.what will be the Output of the code below?*/
/*Answers:-
A)NumberFormatException
B)Error
c)NumberFormatException
   FAB
D)No output

/*correct answer:-
c)NumberFormatException
   FAB
*/

/*public class TestEmployee {
    public static void main(String args[]) {
        try{
            int i=Integer.parseInt ("STRING") ;
            System.out.println(i);
        }finally{
            System.out.println("FAB");
        }
    }
}*/

/*Q31.what will be the Output of the code below?*/
/*Answers:-
A)STRING
B)Error
c)STRING
   FAB
D)FAB

/*correct answer:-
A)STRING
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        try{
           System.out.println("STRING");
            System.exit(0);
        }finally{
            System.out.println("FAB");
        }
    }
}
*/

/*Q32.what will be the Output of the code below?*/
/*Answers:-
A)ArithmeticException
B)Error
c)GOOD
D)MORNING

/*correct answer:-
B)Error
java: unreachable statement- System.out.println("MORNING");
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        try{
           throw new ArithmeticException();
        }finally{
            System.out.println("GOOD");
        }
        System.out.println("MORNING");
    }
}
*/
