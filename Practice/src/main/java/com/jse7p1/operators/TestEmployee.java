package com.jse7p1.operators;

/**
 * Created by sandeep on 29/01/2016.
 *
 * TODO Ramesh
 *  This class should Test the following
 *  a) Use Java operators
 *  b) Use parenthesis to override operator precedence
 *  c) Test equality between Strings and other objects using == and equals ()
 */
//  Topic:1 Java Operator:-
/*
Q1 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) Employee id is : 30,Employee id is : 20
        c) none of the above

        Correct Answer:
        b) Employee id is : 30,Employee id is : 20 (ternary operator is used)
*/
    /*
public class TestEmployee {

    public static void main(String args[]){int eid, eid2;eid = 10;
        eid2 = (eid == 1) ? 20: 30;System.out.println( "Employee id is : " +  eid2 );
        eid2 = (eid == 10) ? 20: 30;System.out.println( "Employee id is : " + eid2 );}}
*/

/*
Q2 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) Employee id is : 30,Employee id is : 30
        c) none of the above

        Correct Answer:
        b) Employee id is : 30,Employee id is : 30
*/
/*
public class TestEmployee {

    public static void main(String args[]){int eid, eid2;eid = 10;
        eid2 = (eid == 1) ? 20: 30;System.out.println( "Employee id is : " +  eid2 );
        eid2 = (eid == 1) ? 20: 30;System.out.println( "Employee id is : " + eid2 );}}
*/

/*
Q3 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) Employee id is : 30,Employee id is : 30
        c) none of the above

        Correct Answer:
        a) compile time error
*/
/*
public class TestEmployee {

    public static void main(String args[]){String eid, eid2; eid = 10;
        eid2 = (eid == 1) ? 20: 30;System.out.println( "Employee id is : " +  eid2 );
        eid2 = (eid == 10) ? 20: 30;System.out.println( "Employee id is : " + eid2 );}}
*/

/*
Q4 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) True
        c) none of the above

        Correct Answer:
        a) compile time error
*/
/*
public class TestEmployee

{public static void main(String args[]){String name = "James";boolean result = name instanceof Integer;System.out.println( result );}}
*/

/*
Q5 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) True
        c) none of the above

        Correct Answer:
        b) True
*/
/*
public class TestEmployee

{public static void main(String args[]){String name = "James";boolean result = name instanceof String;System.out.println( result );}}
*/

/*
Q6 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) 5,10,10
        c) none of the above

        Correct Answer:
        b) 5,10,10
*/
/*
public class TestEmployee {

    public TestEmployee() {

        int j = 10;j = 5; int k = j;System.out.println(j);k = j = 10;
        System.out.println(j);System.out.println(k);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q7 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) 5,10,10
        c) none of the above

        Correct Answer:
        b) 5,10,10
*/
/*
public class TestEmployee {

    public TestEmployee() {

        int j = 10;j = 5; int k = j;System.out.println(j);k = (j = 10);
        System.out.println(j);System.out.println(k);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q8 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) 5,10,10
        c) none of the above

        Correct Answer:
        a) compile time error
*/
/*
public class TestEmployee {

    public TestEmployee() {

        int j = 10;j = 5; int k = j;System.out.println(j);(k = j) = 10;
        System.out.println(j);System.out.println(k);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q9 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) 1.0
        c) 1

        Correct Answer:
        b) 1.0
*/
/*
public class TestEmployee {
    public TestEmployee() {double d1 = 12 / 8;System.out.println(d1);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q10 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) 1.0
        c) 1

        Correct Answer:
        c) 1
*/
/*
public class TestEmployee {
    public TestEmployee() {int d1 = 12 / 8;System.out.println(d1);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q11 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) false,true
        c) true,false

        Correct Answer:
        b) false,true
*/
/*
public class TestEmployee {
    public TestEmployee( ) {int x = 10,y ,z;System.out.println((x == (y=(z=5))));System.out.println((x != (y=(z=11))));}
    public static void main(String args[]){new TestEmployee();}}
*/

/*
Q12 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) false,true
        c) true,false

        Correct Answer:
        a) compile time error
*/
/*
public class TestEmployee {
    public TestEmployee( ) {int x = 10,y ,z;System.out.println((x == (y=(z=5)));System.out.println((x != (y=(z=11))));}
    public static void main(String args[]){new TestEmployee();}}
*/

/*
Q13 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) Run time error
        c) 9
        d) 10

        Correct Answer:
        c) 9
*/
/*
public class TestEmployee { public TestEmployee() {int x = 10, y = 9,z;z = y < x ? y : x;System.out.println(z);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q14 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) 11
        c) 9
        d) 10

        Correct Answer:
        b) 11
*/
/*
public class TestEmployee { public TestEmployee() {int x = 10, y = 9,z=11;z = y=(z) < x ? y : z;System.out.println(z);}
    public static void main(String args[]) {new TestEmployee();}}
*/

/*
Q15 What will be the output of the code below ?


        Answers:
        a) compile time error
        b) Run time error
        c) false


        Correct Answer:
        c) false (integers can be compared to boolean object)
*/
/*
public class TestEmployee {
    public static void main(String[] args) {int x = 10,y = 20;boolean z = x == y;System.out.println(z);}}


/*
Q16 What will be the output of the code below ?


        Answers:
        a) 20,5
        b)10,5
        c) compile time error


        Correct Answer:
        a) 20,5
*/
/*
public class TestEmployee {
    public static void main(String[] args) {int x = 10;int y = 20;int z = 5;
    if ((y > x) && (x > z)) {System.out.println(y);}
        if ((y > z) || (x > z)) {System.out.println(z);}}}
*/

/*
Q17 What will be the output of the code below ?


        Answers:
        a) 20,5
        b)10,5
        c) compile time error
        d) 5


        Correct Answer:
        d) 5
*/
/*
public class TestEmployee {
    public static void main(String[] args) {int x = 5;int y = 20;int z = 5;
    if ((y >= x) && (x > z)) {System.out.println(y);}
        if ((y > z) || (x > z)) {System.out.println(z);}}}
*/

/*
Q18 What will be the output of the code below ?


        Answers:
        a) Before :10, After : 40
        b) Before :10, After : 20
        c) compile time error


        Correct Answer:
        a) Before :10, After : 40
*/
/*
public class TestEmployee {
    public static void main(String[] args) {int x = 10;int y = x << 2;System.out.println("Before: " + x);System.out.println("After: " + y);}}
*/

/*
Q19 Conditional operator is also known as: ?


        Answers:
        a) Ternary operator
        b) Arithmetic operator
        c) Assignment operator


        Correct Answer:
        a) ternary operator
*/

/*
Q20 If the value already exists in the variable: ?


        Answers:
        a) Can not be overwritten by assignment operator
        b) Can be overwritten by assignment operator
        c) Assignment operator


        Correct Answer:
        b) Can be overwritten by assignment operator
*/

/*
Q21 What will be the output of the code below ?


        Answers:
        a) 10,20,30
        b) 10,20
        c) 10,30
        d) compile time error


        Correct Answer:
        a) 10,20,30
*/
/*
public class TestEmployee
{public static void main(String args[]){int numbers[] = {10, 20, 30};for(int x : numbers ){System.out.print( x );System.out.print(",");}}}
*/

/*
Q22 What will be the output of the code below ?


        Answers:
        a) 9
        b) 10
        c) 0
        d) compile time error


        Correct Answer:
        c) 0
*/
/*
public class TestEmployee{public static void main(String args[]){int x = 5, y = 4 , z=0;x = (++x + y-- ) * z++;System.out.println(x);}}
*/

/*
Q22 What will be the output of the code below ?


        Answers:
        a) 119
        b) 120
        c) 121
        d) compile time error


        Correct Answer:
        a) 119
*/
/*
public class TestEmployee{
    public static void main(String args[]){
        int a=20;
         a = a++ + 100 ;
        System.out.println( --a ) ;
    }}

*/


/*
Q23 What will be the output of the code below ?


        Answers:
        a) 119
        b) 120
        c) 121
        d) compile time error


        Correct Answer:
        d) ++a is not valid identifier
*/
/*
public class TestEmployee{
    public static void main(String args[]){
         int  ++a = 100 ;
        System.out.println( --a ) ;
    }}
*/


/*
Q24 What will be the output of the code below ?


        Answers:
        a) true
           \n
           a==A
        b) compile time error
        c) true
           a==A

        Correct Answer:
        c) true
           a==A
*/
/*
public class TestEmployee{

    public static void main(String args[]){

        System.out.print("A"=="A");
        System.out.print("\n");
        System.out.print("a==A");
    }
}

*/

/*
Q25 What will be the output of the code below ?


        Answers:
        a) 50
        b) 22
        c) compile time error

        Correct Answer:
        a) x* = 3+7 is equal to x = x*(3+7)
*/
/*
 public class TestEmployee

{
    public static void main(String args[])
    {
        int x =5;
        x *= 3 + 7;
        System.out.println(x);
    }
}
*/

/*
Q26 What will be the output of the code below ?


        Answers:
        a) 32
        b) 36
        c) compile time error

        Correct Answer:
        b) 36
*/

/*
class TestEmployee {

    public static void main(String args[])

    {
        int g = 3;
        System.out.print(++g + (g-- * 8));
    }

}
*/

/*
Q27 What will be the output of the code below ?


        Answers:
        a) 11 10
        b) 11 11
        c) 10 11
        d) compile time error

        Correct Answer:
        a) 11 10
*/
/*
public class TestEmployee
{
        public static void main(String args[])
        {
            int x , y;
            x = 10;
            x++;
            --x;
            y = x++;
            System.out.println(x + " " + y);
        }
    }
*/



