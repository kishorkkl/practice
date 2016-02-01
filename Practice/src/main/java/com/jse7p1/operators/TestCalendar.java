package com.jse7p1.operators;

/**
 * Created by sandeep on 29/01/2016.
 *
 *  TODO Pallavi
 *
 *   This class should Test the following
 *  a) Create if and if/else constructs
 *  b) Use a switch statement
 */

/*Topic 1:-Create if and if/else constructs */

/*Q1.What will be the output of the code below?

    Answers:-
    A)Hello MohanI have10Chocolates
    B)Hello Mohan I have 10 Chocolates
    C)HelloMohanI have10Chocolates
    D)HelloMohanIhave10Chocolates

    Correct answer:-
    C
     */

/*
public class TestCalendar {

public static void main(String [] arr)
{

if (i == 10) {
    String s = "I have" + i + "Chocolates";
    String newString = new String("Hello" + string + s);
    System.out.println(newString);
}

}
    static int i = 10;
    static String string = "Mohan";
}
*/


/*Q2.What will be the output of the code below?

    Answers:-
    A)Output:556
    B)Nothing
    C)Output:5 5 5
    D)Output:6 6 5

    Correct answer:-
 A)Output:556
     */


/*
public class TestCalendar {

   static class TestDay{

    private int I = 5;

   }
    public static void main(String [] arr)
    {
        TestDay testDay = new TestDay();
        int j = testDay.I;
        j=j++;

        if(j!= testDay.I) {
            System.out.println("Nothing");
        }
        else
        {
            System.out.println("Output:" + j + testDay.I++ + testDay.I);
        }
    }

}
*/


/*Q3.What will be the output of the code below?

    Answers:-
    A)Output:66,12
    B)Output:12,12
    C)Output:11,11
    D)Output:56,11

    Correct answer:-
  A)Output:66,12

     */


/*public class TestCalendar {

    public static void main(String [] arr)
    {

            TestDay testDay = new TestDay();
            int j = testDay.I;

        if(j==5)
        {
            int k = ++j;
            j = j++;
            System.out.print("Output:" + k + j + ",");
            System.out.print(k + j);
        }

    }

    static class TestDay{
        private int I=5 ;
    }
}*/


/*Q4.What will be the output of the code below?

    Answers:-
    A)161820
    B)161616
    C)161617
    D)171718

    Correct answer:-
     A)161820

     */

/*

public class TestCalendar {

    private static int x = 10;

    public static void main(String [] arr)
    {
        int y=5,z;

        if(y==5) {
            z = x++ + ++y;
            System.out.print(z);
            z = x++ + ++y;
            System.out.print(z);
            z = x++ + ++y;
            System.out.print(+z);
        }
    }

}

*/


/*Q5.What will be the output of the code below?

    Answers:-
    A)157
    B)146
    C)136
    D)Error

    Correct answer:-
    A)157

     */


/*
public class TestCalendar {

    private static int x = 11;

    public static void main(String [] arr)
    {
        int y=5,z;

        if(x==11 && y!=9) {
            z = x-- + --y;
            System.out.print(z);
            z = x-- - --y;
            System.out.print(z);
        }
        else
        {
            System.out.print("Error");
        }
    }

}

*/


/*Q6.Q.What will be the output of the code below?

    Answers:-
    A)0
    B)11
    C)2
    D)3

    Correct answer:-
B)11

     */


/*
public class TestCalendar {

   static class TestDay{

    private int I = 35;

   }
    public static void main(String [] arr)
    {
        TestDay testDay = new TestDay();
        int j = testDay.I;

        if(j==testDay.I || J == 11 ) {
            System.out.println(J % j);
        }

    }

    static int J= 11;

}
*/



/*Q7.What will be the output of the code below?

    Answers:-
    A)Fail
    B)Pass


    Correct answer:-
B)Pass

     */


/*
public class TestCalendar {

   static class Result{

    private int marks;

   }
    public static void main(String [] arr)
    {
        if(!result(marksOfMohan) ||  result(marksOfShina) == false )
        {
        System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }

    static Boolean result(int marksObtainedByStudent)
    {
        Result result = new Result();
        marksObtainedByStudent=result.marks;

        if(marksObtainedByStudent< 40)
        {
            resultStatus=false;
        }
        else
        {
            resultStatus=true;
        }

        return resultStatus;
    }
    static int marksOfMohan=50, marksOfShina=40;
    static Boolean resultStatus;
}

*/

/*Q8.What will be the output of the code below?

    Answers:-
    A)Test conducted
    B)Test not conducted

    Correct answer:-
   A)Test conducted

*/

/*
public class TestCalendar
{
    public static void main(String args[])
    {
        if(test=true) System.out.println("Test conducted");else System.out.println("Test not conducted");

    }
    static Boolean test;
}
*/

/*Q9.What will be the output of the code below?

    Answers:-
    A)Zero
       One
    B)Zero
       Zero
    C)One
    D)Else reached


    Correct answer:-
 A)Zero
   One

*/


/*public class TestCalendar
{

    public static void main(String[] args) { for (int i = 0; i <= 1; i++) {
	    if (i == 0) {
		System.out.println("Zero");
	    } else if (i == 1) {
		System.out.println("One");
	    } else {
		System.out.println("Else reached");
	    }
	}
}
}*/

/*Q10.What will be the output of the code below?

        Answers:-
        A)Run time error
        B)Not 16!
          Not 16!
        C)Not 16!
        D)Compile time error


        Correct answer:-
       B)Not 16!
          Not 16!
        */

/*public class TestCalendar
{

    public static void main(String[] args) {

        int value = 15;

        if (value != 16) System.out.println("Not 16!");

        if (!(value == 16)) System.out.println("Not 16!");

    }
}*/


/*Q11.What will be the output of the code below?

        Answers:-
        A)Run time error
        B)TOMATO
        C)ROSE
        D)ROSE
           ROSE


        Correct answer:-
       D)ROSE
           ROSE
        */



/*
public class TestCalendar {

    static String color1 = "Red";
    static String color2 = "Pink";

    public static void main(String[] args) {

        if (color1 == "Red" && color2 == "Pink") {
            System.out.println("ROSE");
        }

       if (color1 == "Red" || color2 == "Pink") {
            System.out.println("ROSE");
        }

        if (color1 == "Red" && color2 != "Pink"){
            System.out.println("TOMATO");
        }

    }
}
*/

/*Q12.What will be the output of the code below?

    Answers:-
    A)It fits
    B)Does not fit

    correct answers:-
    Does not fit
    */

/*
public class TestCalendar {

    public static void main(String[] args) {

        Boolean fits = width <= 10 && height <= 20;

        if (fits && weight <= 150) {
            System.out.println("It fits");
        } else {
            System.out.println("Does not fit");
        }
    }
    static int width = 50,height = 100,weight = 200;
}

*/

/*Q13.What will be the output of the code below?

        Answers:-
        A)true
        B)false

correct answer:-
A)true
*/
/*
public class TestCalendar {

    public static void main(String[] args) {

        boolean Empty = true;
        boolean occupied = false;

        if (Empty && !occupied) {System.out.println(true);}
        else {System.out.println(false);}
    }
}
*/

/*Q14.What will be the output of the code below?

        Answers:-
        A)remainder exits
        B)remainder is 0

correct answer:-
 A)remainder exits
*/
/*public class TestCalendar {

    static int remainderExists(int value) {
        int i = 10;
        return (value % i);
    }

    public static void main(String[] args) {
        int number = 5;
        if (remainderExists(number) != 0) {
            System.out.println(" remainder exits");
        }
        else
        {
            System.out.println(" remainder is 0");
        }
    }
}*/
/*
Q15.What will be the output of the code below?

        Answers:-
        A)true
        B)false

        correct answer:-
         A)true
          */

/*
public class TestCalendar {

    public static void main(String args[]) {
        if (11 + 11 + 11 + 11 + 11 == 55) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }

}
*/

/*Q.16What will be the output of the code below?

        Answers:-
        A)Hello !
        B)Good Morning
        C)None of the above

        correct answer:-
      C)None of the above
      Hello !Good Morning
        */


/*
public class TestCalendar {

    public static void main(String args[]) {

    int x = 6;
        if (x==6) {
            System.out.print("Hello !");
        }
        if(x>=6){
            System.out.print("Good Morning");
        }
    }

}
*/

/*Q17.What will be the output of the code below?*/

/*Answers:-
A)Hello
B)Friend
C)0
D)Hello Friend

Correct answer:-
D)Hello Friend


 */


/*public class TestCalendar {

    public static void main(String args[]) {
        System.out.print("Hello ");
        System.out.print("Friend");
        if (args.length > 0) {
            System.out.println(args[0]);
        }
    }
}*/

/*Topic 2:-Use a switch statement*/

/*Q18.What will be the output of the code below?*/

/*Answers:-
A)1: 1
  2 or 3: 2
B)1: 1
  2 or 3: 3
C)Compile time error

correct answer:-
A)1: 1
  2 or 3: 2

*/
/*
public class TestCalendar {
    public static void main(String[] args) {

        for (int i = 0; i <= 2;i++) {

            switch (i) {
                case 1: {
                    System.out.println("1: " + i);
                    break;
                }
                case 2:
                case 3: {
                    System.out.println("2 or 3: " + i);
                }

            }
        }
    }
}*/












