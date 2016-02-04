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

/*public class TestCalendar {
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
}*/


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


 /*Q18.What will be the output of the code below?

 Answers:-
A)1
B)10
C)20
D)40

 Correct answer:-
 B)10

  */

/*    public class TestCalendar {

        public static void main(String args[]){
            int a, b;
            a = 10;
            b = (a == 1) ? 20: ((a==10 ? 10: 40)) ;
            System.out.println( b );
        }
}*/

/*
Q19.What will be the output of the code below?
        Answers:-
        A)c += a  = 10
          c -= a = 0
        B)Error
        C)c += a  = 40
          c -= a = 20
        D)c += a  = 40
          c -= a = 30

        Correct answer:-
        D)c += a  = 40
           c -= a = 30
*/

/*public class TestCalendar {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;

        if (c == a + b) {
            c += a;
            System.out.println("c += a  = " + c);

             c -= a ;
            System.out.println("c -= a = " + c );
        }
    }
}*/

/*
Q20.What will be the output of the code below?
        Answers:-
        A)c *= a = 0
        B)c *= a = 30
        C)Error
        D)c *= a = 150
        Correct answer:-
        D)c= 5 * 6 = 30
        c *= 5 =30 *  5 = 150

*/

/*public class TestCalendar {
    public static void main(String args[]) {
        int a = 5;int c;
        int b = 6;

        c = a * b;

        if (c == a * b) {
            c *= a ;
            System.out.println("c *= a = " + c );
        }
    }
}*/

/*Q21.What will be the output of the code below?*/

/*Answers:-
        A)b /= a = 1
         b %= a = 1
        B)b /= a = 1
         b %= a = 5
        C)Error
        D)b /= a = 1.5
         b %= a = 5

        Correct answer:-
       A)b /= a = 1
         b %= a = 1
        */


/*
public class TestCalendar {
    public static void main(String args[]) {

        int a = 10,b = 15;

        if(a==10 || b== 15) {
            b /= a;
            System.out.println("b /= a = " + b);

            b %= a;
            System.out.println("b %= a = " + b);
        }

    }
}
*/


 /*Q22.What will be the output of the code below?*/

/*Answers:-
        A)c <<= 2 = 64
           c >>= 2 = 16
            c >>= a = 4
        B)c <<= 2 = 4
           c >>= 2 = 16
            c >>= a = 64
        C)Error
        D)c <<= 2 = 4
           c >>= 2 = 1
            c >>= a = 0

        Correct answer:-
        A)c <<= 2 = 64
           c >>= 2 = 16
            c >>= a = 4
        */

/*

public class TestCalendar {
    public static void main(String args[]) {

        int a = 8,b = 8, c = a + b;

        if(c == a + b) {
            c <<= 2 ; System.out.println("c <<= 2 = " + c );
     c >>= 2 ;System.out.println("c >>= 2 = " + c );
     c >>= 2 ;System.out.println("c >>= a = " + c );
        }
    }
}
*/


 /*Q23.What will be the output of the code below?*/

/*Answers:-
        A)c <<= 2 = 2
        B)c <<= 2 = 4
        C)c <<= 2 = 64
        D)c <<= 2 = 1

        correct answer:-
        C)c <<= 2 = 64(Left shift AND assignment operator.) */

/*
public class TestCalendar {
    public static void main(String args[]) {

        int a = 8,b = 8, c = a + b;

        if(c == a + b) {
            c <<= 2 ;
     System.out.println("c <<= 2 = " + c );

        }

    }
}
*/

/*Q24.what will be the output of the code below?

        Answers:-
        A)a = 6
        B)a = 4
        C)a = 8
        D)a = 3

        correct answer:-
        C)a = 3 (Right shift AND assignment operator) */

/*public class TestCalendar {
    public static void main(String args[]) {

        int a = 12;

        if(a == 12) {
            a >>= 2 ;
     System.out.println("a = " + a );
        }

    }
}*/

/*Q25.what will be the output of the code below?

        Answers:-
        A)a =12
        B)a =64
        C)a =72
        D)a =6

      correct answer:-
       C)72 (Left shift AND assignment operator.) */


/*
public class TestCalendar {
    public static void main(String args[]) {

        int a = 9;
        if(a == 9) {
            a <<= 3 ;
            System.out.println("a = " + a );
        }
    }
}
*/


 /*Q26.What will be the output of the code below?*/

/*Answers:-
        A)c >>= a =16
        B)c >>= a = 4
        C)Error
        D)c >>= a =20

        Correct answer:-
       B)c >>= a = 4 (Right shift AND assignment operator)
        */

/*public class TestCalendar {
    public static void main(String args[]) {

        int a = 10,b = 8, c = a + b;

        if(c == a + b) {

     c >>= 2 ;
     System.out.println("c >>= a = " + c );
        }
    }
}*/


 /*Q27.What will be the output of the code below?*/

/*Answers:-
        A)c &= a  = 70
        B)Error
        C)c &= a  = 4
        D)c &= a  = 0

        Correct answer:-
           C)4 (Bitwise AND of 5 (0101) and 14(1110))
        */


/*
public class TestCalendar {
    public static void main(String args[]) {
        int a = 5, c = 14;
        if (a==5 && c==14) {
            c &= a;
            System.out.println("c &= a  = " + c);
        }
    }
}
*/



/*Q28:-What will be the output of the code below?
Answers:-
        A)c |= a   = 19
        B)c |= a   = 14
        C)c |= a   = 15
        D)c |= a   = 0

        Correct answer:-
   C)c |= a   = 15
   (Bitwise OR of 14(1110),5(0101))
        */


/*
public class TestCalendar {
    public static void main(String args[]) {

        int a = 14, c = 5;

        if (a==14 && c==5) {

            c |= a;
            System.out.println("c |= a   = " + c);

        }
    }
}*/


/*Q29:-What will be the output of the code below?
Answers:-
        A)40
        B)14
        C)10
        D)0

        Correct answer:-
        B)14(Bitwise Ex-OR operation of 10(1010),4(0100))

        */
/*
public class TestCalendar {
    public static void main(String args[]) {
        int a = 10, c = 4;
        if (a==10 && c==4) {
            c ^= a;
            System.out.println(c);
        }
    }
}
*/


/*Q30.What will be the output of the code below?
Answers:-
        A)true
        B)false

        Correct answer:-
          A)true
( will return true since name is type of String)*/

/*
public class TestCalendar {
    static boolean bool;
    public static void main(String args[]) {
      String name = "JOHN";
        bool=name instanceof String;
        if (bool)
      System.out.println(bool );

   }
}
*/

/*
Q31.What will be the output of the code below?
        Answers:-
        A)130
        B)14
        C)8
        D)0

        Correct answer:-
       C)8
       (Binary AND Operation)
      10(1010) AND 13(1101) = 1000 i.e. 8
*/

/*public class TestCalendar {
    public static void main(String args[]) {
        int x = 10, y = 13, z = 0;
        if (x == 10 && y == 13) {
            z = x & y;
            System.out.println( z);
        }
    }
}*/

/*
Q32.What will be the output of the code below?
        Answers:-
        A)21
        B)10
        C)11
        D)0

        Correct answer:-
       C)11
       (Binary OR Operation)
      10(1010) OR 13(1011) = 1011 i.e. 11
*/

/*
public class TestCalendar {
    public static void main(String args[]) {
        int x = 11, y = 10, z = 0;
        if (x == 11 && y == 10) {
            z = x | y;
            System.out.println( z);
        }
    }
}
*/

/*
Q33.What will be the output of the code below?
        Answers:-
        A)8
        B)4
        C)96
        D)2

        Correct answer:-
       B)4
       (Binary XOR Operation)
      12(1100) XOR 8(1000) = 0100 i.e. 4
*/

/*public class TestCalendar {
    public static void main(String args[]) {
        int x = 12, y = 8 ,z = 0;
        if (x == 12 && y == 8) {
            z = x ^ y;
            System.out.println( z);
        }
    }
}*/

/*Q34.What will be the output of the code below?
        Answers:-
        A)1101
        B)1100
        C)0000
        D)0010

        Correct answer:-
        A)1101
        (complement of 2 (0010) )
        */

/*public class TestCalendar {
    public static void main(String args[]) {
        int a=2,b;
        if (a==2) {
          b = ~a;
System.out.println(Integer.toBinaryString(b));
        }
    }
}*/

/*Q35.What will be the output of the code below?
        Answers:-
        A)0(0000)
        B)1(0001)
        C)4(0100)
        D)8(1000)

        Correct answer:-
        D)8(1000)
      Binary Left Shift Operation
        */

/*
public class TestCalendar {
    public static void main(String args[]) {
        int a=2,b;
        if (a==2) {
            b = a << 2 ;
System.out.println(b+"(" +Integer.toBinaryString(b) + ")");
        }
    }
}
*/

/*Q36.What will be the output of the code below?
        Answers:-
        A)64
        B)2
        C)8
        D)1

        Correct answer:-
       B)2
      Binary Right Shift Operation
        */

/*public class TestCalendar {
    public static void main(String args[]) {
        int a=16,b;
        if (a==16) {
          b = a >> 3 ;
System.out.println(b);
        }
    }
}*/

/*Q37.What will be the output of the code below?
        Answers:-
        A)16
        B)12
        C)10
        D)4

        Correct answer:-
         D)4
     zero fill right shift Operation
     (10010(16) >>> 00100(4))
        */


/*public class TestCalendar {
    public static void main(String args[]) {
        int a=18,b;
        if (a==18) {
          b = a >>> 2 ;
System.out.println(b);
        }
    }
}*/

/*Q38.What will be the output of the code below?
        Answers:-
        A)16
        B)8
        C)compile time error
        D)execution time error

        Correct answer:-
           C)compile time error
             there is no zero fill left shift Operation
*/
/*
public class TestCalendar {
    public static void main(String args[]) {
        int a=2,b;
        if (a==2) {
          b = a <<< 2 ;
System.out.println(b);
        }
    }
}

*/

/*Q39.What will be the output of the code below?
        Answers:-
        A)a && b =false
        B)a && b =true

        Correct answer:-
           A)a && b =false
            (Logical AND)
        */

/*public class TestCalendar {
    public static void main(String args[]) {

        boolean a = true,b = false;

     if(a) {
         System.out.println("a && b = " + (a && b));
     }
        }
    }*/

/*Q40.What will be the output of the code below?
        Answers:-
        A)a || b =false
        B)a || b = true

        Correct answer:-
        B)a || b = true
        (Logical OR)*/

/*
public class TestCalendar {

   static boolean a = true,b = false;

    public static void main(String args[]) {

        if(a || b) {
            System.out.println("a || b = " + (a||b) );
        }
    }
}
*/

/*Q41.What will be the output of the code below?
        Answers:-
        A)false
        B)true

        Correct answer:-
        B)true
        (Logical NAND operation)*/

/*
public class TestCalendar {
   static boolean a = true,b = false;
    public static void main(String args[]) {
        if(a || b) {
            System.out.println(!(a && b));
        }
    }
}
*/

/*Q42.What will be the output of the code below?
        Answers:-
        A)10
        B)30
        C)Error
        D)false

        Correct answer:-
         D)false*/

/*
public class TestCalendar {

static int a=10 ,b=30;

    public static void main(String args[]) {
if(a==10 && b== 30)
            System.out.println(a==b);
    }
}
*/


/*Q43.What will be the output of the code below?
        Answers:-
        A)10
        B)56
        C)Error
        D)false
        E)true

        Correct answer:-
         E)true*/

/*
public class TestCalendar {
static int a=10 ,b=56;
    public static void main(String args[]) {
if(a==10 || b == 56)
            System.out.println(a!=b);
    }
}
*/


/*Q44.What will be the output of the code below?
        Answers:-
        A)15
        B)51
        C)Error
        D)false
        E)true

        Correct answer:-
          D)false */

/*public class TestCalendar {
static int a=15 ,b=51;
    public static void main(String args[]) {
            if(a==15 || b ==51)
            System.out.println(a>b);
    }
}*/

/*Q45.What will be the output of the code below?
        Answers:-
        A)45
        B)41
        C)Error
        D)false

        Correct answer:-
          D)false */

/*
public class TestCalendar {
static int a=45 ,b=41;
    public static void main(String args[]) {
            if(b==41)
            System.out.println(a<b);
    }
}
*/

/*Q46.What will be the output of the code below?
        Answers:-
        A)41678
        B)15567
        C)Error
        D)false
        E)true

        Correct answer:-
             E)true */
/*
public class TestCalendar {
static int a=15567 ,b=41678;
    public static void main(String args[]) {
            if(b==41678)
            System.out.println(b>=a);
    }
}*/

/*Q47.What will be the output of the code below?
        Answers:-
        A)78111
        B)16799
        C)Error
        D)false
        E)true

        Correct answer:-
             E)true */

/*
public class TestCalendar {
static int a=78111 ,b=16799;
    public static void main(String args[]) {
            if(a==78111)
            System.out.println(b<=a);
    }
}
*/

/*Q48.What will be the output of the code below?
        Answers:-
        A)11,4
        B)0,4
        C)15,4

        Correct answer:-
        A)11,4

*/

/*
public class TestCalendar {
static int a=15 ,b=11;
    public static void main(String args[]) {
        if(a==15 && b ==11)
        System.out.print(b % a);
        System.out.print(",");
        System.out.print(a% b);
    }
}
*/

/*Q49.What will be the output of the code below?
        Answers:-
        A)889
        B)888
        C)789
        D)999

        Correct answer:-
      C)789
*/

/*public class TestCalendar {
    static int a=7;
    public static void main(String args[]) {
        if (a==7)
        System.out.print(a++);
        System.out.print(a++);
        System.out.print(a++);
    }
}*/

/*Q50.What will be the output of the code below?
        Answers:-
        A)456
        B)555
        C)666
        D)567

        Correct answer:-
     D)567
*/

/*
public class TestCalendar {
static int a=4;
    public static void main(String args[]) {
        if (a==4)
        System.out.print(++a);
        System.out.print(++a);
        System.out.print(++a);
    }
}
*/

/*Q51.What will be the output of the code below?
        Answers:-
        A)8,8
        B)8,9
        C)9,9
        D)9,8

        Correct answer:-
    A)8,8
*/

/*public class TestCalendar {
static int x=9;
    public static void main(String args[]) {
        if (x==9)
        System.out.print(--x +"," + x-- );
    }
}*/



/*Topic 2:-Use a switch statement*/

/*Q52.What will be the output of the code below?*/

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

/*Q53.What will be the output of the code below?*/
/*Answers:-
A)21
B)12
C)22
D)21

correct answer:-
A)21
*/

/*
public class TestCalendar {
    static int getRollNo(String studentName) {
        switch (studentName) {
            case "Rohan":
                return 1;
            case "Shikha":
                return 2;
        }
    return 0;
    }
    public static void main(String[] args) {
        String name = "Shikha";int roll_no = getRollNo(name);
        System.out.print(roll_no);System.out.print(getRollNo("Rohan"));
    }
}
*/

/*Q54.What will be the output of the code below?*/
/*Answers:-
A)ABC
B)AB
C)BC
D)B

correct answer:-
D)B */

/*
public class TestCalendar {
    public static void main(String[] args) {int value = 100;
switch (value) {
        case 10 * 1:System.out.print("A");break;
        case 10 * 10:System.out.print("B");break;
        case 10 * 100:System.out.print("C");break;
        }}}
*/

/*Q55.What will be the output of the code below?*/
/*Answers:-
A)ABC
B)AB
C)BC
D)B

correct answer:-
D)B */


/*
public class TestCalendar {
    public static void main(String[] args) {int value = 0;
switch (value) {
        case 2:System.out.print("A");break;
        case 5 % 5:System.out.print("B");break;
        case 1:System.out.print("C");break;
        }}}
*/

/*Q56.What will be the output of the code below?*/
/*Answers:-
A)00123
B)0123
C)12341234
D)0123401234

correct answer:-
A)00123 */

/*
public class TestCalendar {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.print(i);
            }
            System.out.print(i);
        }
    }
}
*/

/*Q57.What will be the output of the code below?*/
/*Answers:-
A)00123
B)0123
C)123
D)01

correct answer:-
D)01 */

/*
public class TestCalendar {
    public static void main(String[] args) {
        for (int i = 0; i <4; ++i) {
            switch (i) {
                case 0:
                case 1:
                    System.out.print(i);
                    continue;
                default:
                    break;
            }
        }
    }
}
*/

/*Q58.What will be the output of the code below?*/
/*Answers:-
A)false
B)Compile time error
C)Run time error


correct answer:-
B)Compile time error
 Type mismatch: cannot convert from int to byte
  A byte can never equal 1000 so an error occurs. */

/*public class TestCalendar {
        public static void main(String[] args) {
            byte value = 100;
            switch (value) {
                case 100 * 10:
                    System.out.println(false);
                    return ;
            }
        }
}*/

/*Q59.What will be the output of the code below?*/
/*Answers:-
A)Values are h, e
B)Values are h, e??
C)?


correct answer:-
A)Values are h, e */

/*
public class TestCalendar {
    public static void main(String[] args) {
        String value = "Hello";
        switch (value.charAt(0)) {
            case 'H':
                switch (value.charAt(1)) {
                    case 'e':
                        System.out.println("Values are h, e");
                        break;
                    case 'l':
                        System.out.println("?");
                        break;
                }
                break;
            case 'e':
                System.out.println("?");
                break;
        }
    }
}
*/

/*Q60.What will be the output of the code below?*/
/*Answers:-
A)true
B)truetrue
C)compile time error
D)Run time error

correct answer:-
C)compile time error : duplicate case label*/

/*
public class TestCalendar {
        public static void main(String[] args) {

            int value = 10;
            switch (value) {
                case 10:
                    System.out.println(true);
                    break;
                case 10:
                    System.out.println(true);
                    break;
            }
        }
    }
*/

/*Q61.What will be the output of the code below?*/
/*Answers:-
A)10
B)20
C)compile time error
D)0

correct answer:-
A)10*/

/*public class TestCalendar {
        public static void main(String[] args) {
            int a = 10,b=20;
            char c = '%';
            switch (c) {
                case '%':
                    System.out.println(a % b);
                    break;
            }
        }
    }*/

/*Q62.What will be the output of the code below?*/
/*Answers:-
A)150
B)30
C)Run time error
D)Compile time error

correct answer:-
A)150*/

/*
public class TestCalendar {
        public static void main(String[] args) {
            int a = 5,b=6;
            char c = '*';
            switch (c) {
                case '*':
                    System.out.println(a *= b *= 5);
                    break;
            }
        }
    }
*/

/*Q63.What will be the output of the code below?*/
/*Answers:-
A)5
B)30
C)Run time error
D)Compile time error

correct answer:-
A)5*/

/*
public class TestCalendar {
        public static void main(String[] args) {
            int a = 5,b=6;
            char c = '/';
            switch (c) {
                case '/':
                    System.out.println(a *= b /= 5);
                    break;
            }
        }
    }
*/

/*Q64.What will be the output of the code below?*/
/*Answers:-
A)5611
B)5613
C)6713
D)6715

correct answer:-
B)5613*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 5, b = 6;
        char c = '+';
        if ((c != '*')) {
            switch (c) {
                case '+':
                    System.out.print(a++);
                    System.out.print(b++);
                    System.out.print(a + b);
                    break;
            }
        }
    }
}
*/

/*Q65.What will be the output of the code below?*/
/*Answers:-
A)9716
B)8614
C)9718
D)9714

correct answer:-
A)9716*/

/*

public class TestCalendar {
    public static void main(String[] args) {
        int a = 8, b = 6;
        char c = '+';
        if ((c != '*')) {
            switch (c) {
                case '+':
                    System.out.print(++a);
                    System.out.print(++b);
                    System.out.print(a + b);
                    break;
            }
        }
    }
}
*/

/*Q66.What will be the output of the code below?*/
/*Answers:-
A)9616
B)9716
C)8715
D)8717

correct answer:-
A)9616*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 8, b = 6;
        char c = '+';
        if ((c != '*')) {
            switch (c) {
                case '+':
                    System.out.print(++a);
                    System.out.print(b++);
                    System.out.print(a + b);
                    break;
            }
        }
    }
}*/

/*Q67.What will be the output of the code below?*/
/*Answers:-
A)457
B)347
C)349
D)459

correct answer:-
A)457*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 4, b = 5;
        char c = '+';
        if ((c == '+')) {
            switch (c) {
                case '+':
                    System.out.print(a--);
                    System.out.print(b--);
                    System.out.print(a + b);
                    break;
            }
        }
    }
}
*/

/*Q68.What will be the output of the code below?*/
/*Answers:-
A)9412
B)8412
C)9512
D)9413

correct answer:-
A)9412*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 9, b = 5;
        char c = '+';
        if ((c == '+')) {
            switch (c) {
                case '+':
                    System.out.print(a--);
                    System.out.print(--b);
                    System.out.print(a + b);
                    break;
            }
        }
    }
}*/

/*Q69.What will be the output of the code below?*/
/*Answers:-
A)941
B)840
C)940
D)No output

correct answer:-
D)No output*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 9, b = 5;
        char c = '%';
        if ((c == '+')) {
            switch (c) {
                case '%':
                    System.out.print(a--);
                    System.out.print(--b);
                    System.out.print(a % b);
                    break;
            }
        }
    }
}*/

/*Q70.What will be the output of the code below?*/
/*Answers:-
A)941
B)840
C)940
D)No output

correct answer:-
C)940*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 9, b = 5;
        char c = '%';
        if ((c != '+')) {
            switch (c) {
                case '%':
                    System.out.print(a--);
                    System.out.print(--b);
                    System.out.print(a % b);
                    break;
            }
        }
    }
}
*/

/*Q71.What will be the output of the code below?*/
/*Answers:-
A)941
B)840
C)940
D)No output

correct answer:-
C)940*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 9, b = 5;
        char c = '%';
        if ((c != '+' || c== '%')) {
            switch (c) {
                case '%':
                    System.out.print(a--);
                    System.out.print(--b);
                    System.out.print(a % b);
                    break;
            }
        }
    }
}*/

/*Q72.What will be the output of the code below?*/
/*Answers:-
A)10
B)0
C)5
D)No output

correct answer:-
C)5*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 10, b = 5;
        if (a>1) {
            switch (a) {
                case 10:
                    System.out.print(a = b);
                    break;
            }
        }
    }
}
*/

/*Q73.What will be the output of the code below?*/
/*Answers:-
A)12
B)0
C)32
D)No output

correct answer:-
B)0
& (bitwise and) */

/*

public class TestCalendar {
    public static void main(String[] args) {
        int a = 8, b = 4;
        if (a>1) {
            switch (a) {
                case 8:
                    System.out.print(a & b);
                    break;
            }
        }
    }
}

*/

/*Q74.What will be the output of the code below?*/
/*Answers:-
A)12
B)0
C)32
D)No output

correct answer:-
A)12
| (bitwise or) */

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 8, b = 4;
        if (a>1) {
            switch (a) {
                case 8:
                    System.out.print(a | b);
                    break;
            }
        }
    }
}
*/

/*Q75.What will be the output of the code below?*/
/*Answers:-
A)12
B)0
C)32
D)No output

correct answer:-
A)12
^ (bitwise XOR) */


/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 8, b = 4;
        if (a>1) {
            switch (a) {
                case 8:
                    System.out.print(a ^ b);
                    break;
            }
        }
    }
}

*/

/*Q76.What will be the output of the code below?*/
/*Answers:-
A)1000
B)1110
C)0001
D)0111

correct answer:-
D)0111
 	~ (bitwise compliment)  */

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 8;
            switch (a) {
                case 8:
                    System.out.print(Integer.toBinaryString(~a));
                    break;
            }
        }
    }
*/

/*Q77.What will be the output of the code below?*/
/*Answers:-
A)4100
B)81000
C)121100
D)9111

correct answer:-
A)4100
 << (left shift)*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 1;
            switch (a) {
                case 1:
                    System.out.print(a<<2);
                    System.out.print(Integer.toBinaryString(a<<2));
                    break;
            }
        }
    }
*/

/*Q78.What will be the output of the code below?*/
/*Answers:-
A)210
B)81000
C)121100
D)4100

correct answer:-
A)210
 	>> (right shift)*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 8;
            switch (a) {
                case 8:
                    System.out.print(a>>2);
                    System.out.print(Integer.toBinaryString(a>>2));
                    break;
            }
        }
    }*/

/*Q79.What will be the output of the code below?*/
/*Answers:-
A)210
B)311
C)5101
D)4100

correct answer:-
B)311
 >>> (zero fill right shift)*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 12;
            switch (a) {
                case 12:
                    System.out.print(a>>>2);
                    System.out.print(Integer.toBinaryString(a>>>2));
                    break;
            }
        }
    }
*/

/*Q80.What will be the output of the code below?*/
/*Answers:-
A)4100
B)311
C)5101
D)None of the above

correct answer:-
D)None of the above
 <<< No such operator in java*/


/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 12;
            switch (a) {
                case 12:
                    System.out.print(a<<<2);
                    System.out.print(Integer.toBinaryString(a<<<2));
                    break;
            }
        }
    }*/

/*Q81.What will be the output of the code below?*/
/*Answers:-
A)true
B)false

correct answer:-
A)true */

/*
public class TestCalendar {
    public static void main(String[] args) {
        boolean t=true,f=false;
        int n=0;
        if(t==true && f == false)
            switch (n) {
                case 0:
                    System.out.print(t && f || t && t);
                    break;
            }
        }
    }
*/


/*Q82.What will be the output of the code below?*/
/*Answers:-
A)true
B)false

correct answer:-
A)true */

/*

public class TestCalendar {
    public static void main(String[] args) {
        boolean t=true,f=false;
        int n=0;
        if(t==true && f == false)
            switch (n) {
                case 0:
                    System.out.print(t || f || t || t);
                    break;
            }
        }
    }
*/

/*Q83.What will be the output of the code below?*/
/*Answers:-
A)true
B)false

correct answer:-
A)true */

/*
public class TestCalendar {
    public static void main(String[] args) {
        boolean t=true,f=false;
        int n=0;
        if(t==true && f == false)
            switch (n) {
                case 0:
                    System.out.print(t || f && t || t);
                    break;
            }
        }
    }
*/

/*Q84.What will be the output of the code below?*/
/*Answers:-
A)true
B)false

correct answer:-
B)false */


/*
public class TestCalendar {
    public static void main(String[] args) {
        boolean t=true,f=false;
        int n=0;
        if(t==true && f == false)
            switch (n) {
                case 0:
                    System.out.print(t && f && t && t);
                    break;
            }
        }
    }
*/

/*Q85.What will be the output of the code below?*/
/*Answers:-
A)true
B)false

correct answer:-
B)false */


/*
public class TestCalendar {
    public static void main(String[] args) {
        boolean t=true,f=false;
        int n=0;
        if(t==true && f == false)
            switch (n) {
                case 0:
                    System.out.print(!(t && f || t && t));
                    break;
            }
        }
    }
*/

/*Q86.What will be the output of the code below?*/
/*Answers:-
A)true
B)false

correct answer:-
B)false */

/*
public class TestCalendar {
    public static void main(String[] args) {
        boolean t=true,f=false;
        int n=0;
        if(t==true && f == false)
            switch (n) {
                case 0:
                    System.out.print(!(t && !f || t && !t));
                    break;
            }
        }
    }*/

/*Q87.What will be the output of the code below?*/
/*Answers:-
A)28
B)4
C)12
D)None of the above

correct answer:-
A)28*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a += b += a);
                    break;
            }
        }
    }
*/


/*Q88.What will be the output of the code below?*/
/*Answers:-
A)14
B)28
C)22
D)None of the above

correct answer:-
C)22*/


/*

public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a += b += a /=2);
                    break;
            }
        }
    }
*/


/*Q89.What will be the output of the code below?*/
/*Answers:-
A)84
B)52
C)13
D)None of the above

correct answer:-
A)84*/


/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a *= b +=a /=b );
                    break;
            }
        }
    }
*/


/*Q90.What will be the output of the code below?*/
/*Answers:-
A)0
B)48
C)12
D)None of the above

correct answer:-
B)48*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a *= b +=a % b );
                    break;
            }
        }
    }*/

/*Q91.What will be the output of the code below?*/
/*Answers:-
A)0
B)8
C)12
D)None of the above

correct answer:-
B)8
*/


/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a -= b +=a % b );
                    break;
            }
        }
    }
*/



/*Q92.What will be the output of the code below?*/
/*Answers:-
A)0
B)8
C)24
D)20

correct answer:-
D)20
(According to precedence order of Assignment operator (Right to Left))*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a += b +=b += b % b);
                    break;
            }
        }
    }*/

/*Q93.What will be the output of the code below?*/
/*Answers:-
A)28
B)8
C)24
D)20

correct answer:-
A)28
(According to precedence order of Assignment operator (Right to Left))*/
/*
public class TestCalendar {
    public static void main(String[] args) {
    int a = 12,b=4;
    switch (a) {
        case 12:
            System.out.print(a -= b -=b += b * b);
            break;
    }
}
}*/

/*Q94.What will be the output of the code below?*/
/*Answers:-
A)0
B)3
C)-3
D)-1

correct answer:-
C)-3
(According to precedence order of Assignment operator (Right to Left))*/


/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a /= b -=b + b );
                    break;
            }
        }
    }*/


/*Q95.What will be the output of the code below?*/
/*Answers:-
A)8
B)96
C)52
D)0

correct answer:-
C)52
(According to precedence order of Assignment operator (Right to Left))*/


/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a % b + b + b * a);
                    break;
            }
        }
    }

*/


/*Q96.What will be the output of the code below?*/
/*Answers:-
A)8
B)12
C)-8
D)0

correct answer:-
B)12
(According to precedence order of Assignment operator (Right to Left))*/

/*public class TestCalendar {
    public static void main(String[] args) {
        int a = 12,b=4;
            switch (a) {
                case 12:
                    System.out.print(a %= b += b += b -= a *=b);
                    break;
            }
        }
    }*/


/*Q97.What will be the output of the code below?*/
/*Answers:-
A)8
B)4
C)-8
D)0

correct answer:-
C)-8
(According to precedence order of Assignment operator (Right to Left))*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 2,b=4;
            switch (a) {
                case 2:
                    System.out.print(a *= b -= a *=b);
                    break;
            }
        }
    }
*/


/*Q98.What will be the output of the code below?*/
/*Answers:-
A)8
B)4
C)1
D)2

correct answer:-
D)2
(According to precedence order of Assignment operator (Right to Left))*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 2,b=4;
            switch (a) {
                case 2:
                    System.out.print(a *= b -= a +=b /=b);
                    break;
            }
        }
    }
*/


/*Q99.What will be the output of the code below?*/
/*Answers:-
A)8
B)4
C)1
D)None of the above

correct answer:-
D)None of the above
compile time error: expecting variable instead of 2 */


/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 2,b=4;
            switch (a) {
                case 2:
                    System.out.print(a *= b -= a +=b * 2 /=b );
                    break;
            }
        }
    }
*/


/*Q100.What will be the output of the code below?*/
/*Answers:-
A)0
B)1
C)192
D)None of the above

correct answer:-
A)0
(According to precedence order of Assignment operator (Right to Left))
*/

/*
public class TestCalendar {
    public static void main(String[] args) {
        int a = 2,b=4;
            switch (a) {
                case 2:
                    System.out.print(a *= b *= a *=b %= b );
                    break;
            }
        }
    }

*/









