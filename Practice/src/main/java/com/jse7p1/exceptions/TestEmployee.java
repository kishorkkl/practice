package com.jse7p1.exceptions;
import java.io.*;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
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

/*Q20.IllegalArgumentException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
B)Run-time exception
*/

/*Q21.ArithmeticException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
B)Run-time exception
*/

/*Q22.ClassCastException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
B)Run-time exception
*/

/*Q23.IllegalStateException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
B)Run-time exception
*/

/*Q24.NullPointerException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
B)Run-time exception
*/

/*Q25.IndexOutBoundsException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
B)Run-time exception
*/

/*Q26.Base class  of NumberFormatException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException

Correct answer:-
B)IllegalArgumentException
*/

/*Q27.Base class  of ArrayIndexOutOfBoundsException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException

Correct answer:-
A)IndexOutBoundsException
*/

/*Q28.NoSuchMethodException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q29.FileNotFoundException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q30.InterruptedIOException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q31.ClassNotFoundException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q32.IOException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q33.SQLException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q34.FontFormatException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q35.CloneNotSupportedException  is
Answers:-
A)Compile-time exception
B)Run-time exception

Correct answer:-
A)Compile-time exception
*/

/*Q36.Base class  of FileNotFoundException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException
C)ReflectiveOperationException
D)IOException

Correct answer:-
D)IOException
*/

/*Q37.Base class  of SQLException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException
C)ReflectiveOperationException
D)IOException

Correct answer:-
D)IOException
*/

/*Q38.Base class  of InterruptedIOException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException
C)ReflectiveOperationException
D)IOException

Correct answer:-
D)IOException
*/

/*Q39.Base class  of ClassNotFoundException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException
C)ReflectiveOperationException
D)IOException

Correct answer:-
C)ReflectiveOperationException
*/

/*Q40.Base class  of NoSuchMethodException?
Answers:-
A)IndexOutBoundsException
B)IllegalArgumentException
C)ReflectiveOperationException
D)IOException

Correct answer:-
C)ReflectiveOperationException
*/

/*Q41.what occurs when an unexpected exception occurs in a static initializer
Answers:-
A) AssertionError is thrown
B)ExceptionInInitializeError is thrown
C)VirtualMachineError is thrown

Correct answer:-
B)ExceptionInInitializeError is thrown
*/

/*Q42.OutOfMemoryError is thrown
Answers:-
A)when a JVM error occurs.
B)when garbage collection is performed but is unable to free up any space.
C)upon a failed assertion

Correct answer:-
B)
*/

/*Q43.VirtualMachineError is thrown
Answers:-
A)when a JVM error occurs.
B)when garbage collection is performed but is unable to free up any space.
C)upon a failed assertion
D)when JVM cannot find a class definition.

Correct answer:-
A)when a JVM error occurs.
*/

/*Q44.when JVM cannot find a class definition
Answers:-
A)AssertionError is thrown
B)ExceptionInInitializeError is thrown
C)VirtualMachineError is thrown
D)NoClassDefFoundError is thrown

Correct answer:-
D)NoClassDefFoundError is thrown
*/

/*Q45.Error thrown upon a failed assertion
Answers:-
A)AssertionError
B)ExceptionInInitializeError
C)VirtualMachineError
D)NoClassDefFoundError

Correct answer:-
A)AssertionError
*/

/*Topic:-2: Create a try-catch block and determine how exceptions alter normal program flow*/

/*Q46.what will be the Output of the code below?*/
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
            } catch (Exception e) {
                System.out.println("Exception thrown  :" + e);
            }
        }
    }
*/



/*Q47.what will be the Output of the code below?*/
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

/*Q48.what will be the Output of the code below?*/
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

/*Q49.what will be the Output of the code below?*/
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


/*Q50.what will be the Output of the code below?*/
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

/*Q51.what will be the Output of the code below?*/
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


/*Q52.what will be the Output of the code below?*/
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


/*Q53.what will be the Output of the code below?*/
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

/*Q54.what will be the Output of the code below?*/
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


/*Q55.what will be the Output of the code below?*/
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

/*Q56.what will be the Output of the code below?*/
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

/*Q57.what will be the Output of the code below?*/
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

/*Q58.what will be the Output of the code below?*/
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

/*Q59.what will be the Output of the code below?*/
/*Answers:-
A)NumberFormatException
B)Error
c)GOOD
D)MORNING
E)GOOD
MORNING

/*correct answer:-
E)GOOD
MORNING
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        try{
           throw new NumberFormatException();
        }catch(NumberFormatException nfe){

        }
        finally{
            System.out.println("GOOD");
        }
        System.out.println("MORNING");
    }
}
*/

/*Q60.what will be the Output of the code below?*/
/*Answers:-
A)Exception
B)Error
c)APPLES
D)APPLES
JUICE

/*correct answer:-
D)APPLES
JUICE
*/

/*public class TestEmployee {

private static class Fruits{

    void fruits()
    {
        System.out.println("APPLES");
    }
}
    public static void main(String args[]) {
        try{
            Fruits f = new Fruits();
            f.fruits();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("JUICE");
        }

    }
}*/

/*Topic:-3 Describe what Exceptions are used for in Java*/

/*Q61.what will be the Output of the code below?*/

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

/*Q62.what will be the Output of the code below?*/
/*
Answers:-
A)ArithmeticException
B)NullPointerException
c)Error
D)ArrayIndexOutOfBoundsException
E)IndexOutOfBoundsException

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

/*Q63.what will be the Output of the code below?*/
/*
Answers:-
A)ArithmeticException
B)NullPointerException
c)Error
D)ArrayIndexOutOfBoundsException
E)IndexOutOfBoundsException

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



/*Q64.what will be the Output of the code below?*/
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
      }catch(Exception e){
	    System.out.println(e);
       }
   }
}*/


/*Q65.which exception will be thrown by code below?*/
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

/*Q66.which exception will be thrown by code below?*/
/*
Answers:-
A)FileNotFoundException
B)IOException
C)ClassNotFoundException

correct answer:-
A)FileNotFoundException*/

/*public class TestEmployee {
     public static void main(String args[])
   {
	FileInputStream fis = null;
	try{
	    fis = new FileInputStream("file.txt");
	}catch(Exception e){
            System.out.println(e);
	 }
   }
}*/

/*Q67.which exception will be thrown by code below?*/
/*
Answers:-
A)FileNotFoundException
B)IOException
C)IllegalArgumentException
D)NumberFormatException
E)Error

correct answer:-
E)Error
reason: actual and formal argument lists differ in length */

/*
public class TestEmployee {
    static void temp(int i, int j) {
        int temp;
        temp = i;
        i = j;
        j = temp;
    }
    public static void main(String args[]) {
        try {
            TestEmployee te = new TestEmployee();
            te.temp(4,8,9);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/


/*Q68.which exception will be thrown by code below?*/
/*
Answers:-
A)FileNotFoundException
B)IOException
C)IllegalArgumentException
D)NumberFormatException
E)Error
correct answer:-
D)NumberFormatException*/

/*
public class TestEmployee {
    private static final String str = "0.3";
    public static void main(String[] args){
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}

*/


/*Q69.which exception will be thrown by code below?*/
/*
Answers:-
A)FileNotFoundException
B)IllegalStateException
C)IllegalArgumentException
D)NumberFormatException
E)Error
correct answer:-
B)IllegalStateException*/


/*
public class TestEmployee {

    public static void main(String[] args){
      ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.add("C");

        Iterator i = a.iterator();
        while(i.hasNext())
        {
            i.next();
            i.remove();
            i.remove();
        }

    }
}
*/


/*Q70.which exception will be thrown by code below?*/
/*
Answers:-
A)ClassCastException
B)IllegalStateException
C)IllegalArgumentException
D)NumberFormatException
E)Error
correct answer:-
A)ClassCastException*/

/*
public class TestEmployee {
    public static void main(String[] args){
        Object x = new Float("1.0");
        System.out.println((double) x);
    }
}
*/



/*Topic-4:Invoke a method that throws an exception*/

/*Q71.what will be the Output of the code below*/
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
}
*/

/*Q72.what will be the Output of the code below*/
/*
Answers:-

A)No output
B)Error
C)java.lang.NullPointerException
D)java.lang.ArithmeticException

correct answer:-
D)java.lang.ArithmeticException
*/


/*
public class TestEmployee {
    static void throwsMethod() throws Exception  {
       int  m=l-1;
        int n=1/m;
    }

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static int k =8,j=9,l=j-k;
}
*/

/*Q73.what will be the Output of the code below*/
/*
Answers:-

A)No output
B)Error
C)java.lang.NullPointerException
D)java.lang.ArithmeticException
E)ArrayIndexOutOfBoundsException

correct answer:-
E)ArrayIndexOutOfBoundsException
*/



/*public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        int arr[] = {'0','1','2'};
        System.out.println(arr[4]);
    }

}*/

/*Q74.what will be the Output of the code below*/
/*
Answers:-

A)No output
B)Error
C)java.lang.NullPointerException
D)java.lang.ArithmeticException
E)java.lang.ArrayIndexOutOfBoundsException
F)java.lang.StringIndexOutOfBoundsException

correct answer:-
C)java.lang.NullPointerException
*/


/*
public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
       String s=null;
        System.out.println(s.length());
    }

}
*/

/*Q75.what will be the Output of the code below*/
/*
Answers:-

A)No output
B)Error
C)java.lang.NumberFormatException
D)java.lang.ArithmeticException
E)java.lang.ArrayIndexOutOfBoundsException
F)java.lang.StringIndexOutOfBoundsException

correct answer:-
C)java.lang.NumberFormatException
*/

/*
public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        int i=Integer.parseInt ("STRING") ;
        System.out.println(i);
    }

}
*/

/*Q76.what will be the Output of the code below*/
/*
Answers:-

A)No output
B)Error
C)java.lang.NumberFormatException
D)java.lang.ArithmeticException
E)java.lang.ArrayIndexOutOfBoundsException
F)java.lang.StringIndexOutOfBoundsException

correct answer:-
C)java.lang.NumberFormatException
*/

/*
public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        int i=Integer.parseInt ("STRING") ;
        System.out.println(i);
    }

}
*/

/*Q77.what will be the Output of the code below*/
/*
Answers:-

A)Null
B)Error
C)java.lang.NumberFormatException
D)java.lang.ArithmeticException
E)java.lang.ArrayIndexOutOfBoundsException
F)java.lang.StringIndexOutOfBoundsException

correct answer:-
F)java.lang.StringIndexOutOfBoundsException
*/


/*
public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        String str="STRING";
        System.out.println(str.length());;
        char c = str.charAt(0);
        c = str.charAt(10);
        System.out.println(c);
    }

}
*/

/*Q78.what will be the Output of the code below*/
/*
Answers:-

A)Null
B)Error
C)java.lang.IOException
D)java.lang.FileNotFoundException
E)java.lang.NullPointerException

correct answer:-
F)java.lang.FileNotFoundException
*/


/*public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        FileInputStream fis = null;
        fis = new FileInputStream("file.txt");
    }

}*/


/*Q79.what will be the Output of the code below*/
/*
Answers:-

A)java.lang.IllegalArgumentException
B)Error
C)java.lang.IOException
D)java.lang.FileNotFoundException
E)java.lang.NullPointerException

correct answer:-
B)Error
  reason: actual and formal argument lists differ in length
*/


/*
public class TestEmployee {

    public static void main(String args[]) {
        try {
            TestEmployee te = new TestEmployee();
            te.throwsMethod(4,8,9);
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod(int i, int j) throws Exception  {
       int temp;
        temp = i;
        i = j;
        j = temp;
    }

}
*/

/*Q80.what will be the Output of the code below*/
/*
Answers:-

A)Null
B)Error
C)java.lang.NumberFormatException
D)java.lang.ArithmeticException
C)java.lang.IOException

correct answer:-
C)java.lang.NumberFormatException
*/


/*
public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    private static final String str = "0.3";

}
*/


/*Q81.what will be the Output of the code below*/
/*
Answers:-
A)FileNotFoundException
B)IllegalStateException
C)IllegalArgumentException
D)NumberFormatException
E)Error

correct answer:-
B)IllegalStateException
*/

/*public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.add("C");
        Iterator i = a.iterator();
        while(i.hasNext())
        {
            i.next();
            i.remove();
            i.remove();
        }
    }

}*/

/*Q82.what will be the Output of the code below*/
/*
Answers:-
A)ClassCastException
B)IllegalStateException
C)IllegalArgumentException
D)NumberFormatException
E)Error
correct answer:-
A)ClassCastException*/

/*public class TestEmployee {

    public static void main(String args[]) {
        try {
            throwsMethod();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }

    static void throwsMethod() throws Exception  {

        Object x = new String("1.0");
        System.out.println((double) x);

    }

}*/

/*Topic:5-Recognize common exception classes and categories*/

/*Q83.All exceptions and errors inherit from which class
Answers:-
A)Throwable class
B)Object class
C)StackTraceElement

Correct answer:-
A)Throwable class
*/

/*Q84.which exception is thrown when attempting to access an array with an invalid index value
Answers:-

        A)ArithmeticException
        B)NullPointerException
        C)ArrayIndexOutOfBoundsException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
        c)ArrayIndexOutOfBoundsException*/

/*Q85.which exception is thrown when attempting to access an array with an  ndex value either negative or beyond the length of the array.
Answers:-

        A)ArithmeticException
        B)NumberFormatException
        C)ArrayIndexOutOfBoundsException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
        c)ArrayIndexOutOfBoundsException*/


/*Q86.which exception is thrown when attempting to cast a reference variable to a type that fails the IS-A test.
Answers:-

        A)NumberCastException
        B)NumberFormatException
        C)ClassCastException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
        c)ClassCastException */



/*Q87.which exception is thrown when a method receives an argument formatted differently than the method expects.
Answers:-

        A)IllegalArgumentException
        B)IllegalMonitorStateException
        C)IllegalStateException
        D)IllegalThreadStateException
        */

/*
correct answer:-
          A)IllegalArgumentException */

/*Q88.which exception is thrown when the state of the environment does not match the operation being attempted
Answers:-

        A)IllegalArgumentException
        B)IllegalMonitorStateException
        C)IllegalStateException
        D)IllegalThreadStateException
        */

/*
correct answer:-
              C)IllegalStateException*/


/*Q89.which exception is thrown when attempting to access an object with a reference variable whose current value is null.
Answers:-

        A)ArithmeticException
        B)NullPointerException
        C)ArrayIndexOutOfBoundsException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
          B)NullPointerException*/


/*Q90.which exception is thrown when a method that converts a String to a number receives a String that it cannot convert.
Answers:-

        A)ArithmeticException
        B)NullPointerException
        C)NumberFormatException
        D)StringIndexOutOfBoundsException
        */

/*
correct answer:-
          C)NumberFormatException */

/*Q91.which exception is thrown when a statement’s boolean test returns false.
Answers:-

        A)ArithmeticException
        B)NullPointerException
        C)NumberFormatException
        D)AssertionError
        */

/*
correct answer:-
          D)AssertionError  */

/*Q92.which Error is thrown when attempting to initialize a static variable or an initialization block.
Answers:-

        A)StackOverflowError
        B)NullPointerException
        C)ExceptionInInitializerError
        D)NoClassDefFoundError
        */

/*
correct answer:-
            C)ExceptionInInitializerError  */

/*Q93.which Error is thrown when a method recurses too deeply.
Answers:-

        A)StackOverflowError
        B)ExceptionInInitializerError
        C)NoClassDefFoundError
        */

/*
correct answer:-
            A)StackOverflowError  */


/*Q94.which Error is thrown when the JVM can’t find a class it needs, because of a command-line error, a classpath issue, or a missing .class file.
Answers:-

        A)StackOverflowError
        B)ExceptionInInitializerError
        C)NoClassDefFoundError
        */

/*
correct answer:-
            C)NoClassDefFoundError  */


/*Q95.which exception is thrown when Assignment to an array element of an incompatible type.
Answers:-

        A)ArithmeticException
        B)ArrayStoreException
        C)ArrayIndexOutOfBoundsException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
          B)ArrayStoreException*/

/*Q96.which exception is thrown when an attempt to index outside the bounds of a string.
Answers:-

        A)ArithmeticException
        B)StringIndexOutOfBoundsException
        C)ArrayIndexOutOfBoundsException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
         B)StringIndexOutOfBoundsException*/


/*Q97.which exception is thrown when  an access to a class is denied
Answers:-

        A)IllegalStateException
        B)IllegalAccessException
        C)IllegalArgumentException
        D)IndexOutOfBoundsException
        */

/*
correct answer:-
         B)IllegalAccessException*/


/*Q98.which exception is thrown when  a requested field does not exist
Answers:-

        A)IllegalFieldException
        B)IllegalAccessException
        C)IllegalArgumentException
        D)NoSuchFieldException
        */

/*
correct answer:-
         D)NoSuchFieldException*/


/*Q99.which exception is thrown when  a requested method does not exist
Answers:-

        A)IllegalMethodException
        B)IllegalAccessException
        C)IllegalArgumentException
        D)NoSuchMethodException
        */

/*
correct answer:-
         D)NoSuchMethodException*/

/*Q100.which exception is thrown when one thread has been interrupted by another thread
Answers:-

        A)IllegalStateException
        B)IllegalAccessException
        C)IllegalMonitorStateException
        D)InterruptedException
        */

/*
correct answer:-
         D)InterruptedException*/

