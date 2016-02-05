package com.jse7p1.arrays;

/**
 * Created by sandeep on 05/02/2016.
 * Topic 4
 * TODO Ramesh
 a)Declare, instantiate, initialize and use a one-dimensional array
 b)Declare, instantiate, initialize and use multi-dimensional array
 c)Declare and use an ArrayList

 Topic 1: Declare, instantiate, initialize and use a one-dimensional array

 /*
 Q1 What will be the output of the code below ?

 Answers:
 a) 1 2 3
 b) 1.0 2.0 3.0
 c) Compile time Error

 Correct Answer:

 b) 1.0 2.0 3.0
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            int[] myList = {1, 2, 3,};
            for (double element: myList) {
                System.out.println(element);
            }
        }
    }
*/

 /*
 Q2 What will be the output of the code below ?

 Answers:
 a) 1 2 3
 b) 1.0 2.0 3.0
 c) Compile time Error

 Correct Answer:

 a) 1 2 3
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            int[] myList = {1, 2, 3,};
            for (int element: myList) {
                System.out.println(element);
            }
        }
    }
*/

/*
 Q3 What will be the output of the code below ?

 Answers:
 a) 0.0
 b) 0.0  0.0
 c) Compile time Error

 Correct Answer:

 b) 0.0  0.0
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            int[] myIntArray = new int[2];
            for (float element: myIntArray) {
                System.out.println(element);}}}
*/

/*
 Q4 What will be the output of the code below ?

 Answers:
 a) null null null
 b) Run time error
 c) Compile time Error

 Correct Answer:

 a) null null null
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            String[] myStringArray = new String[3];
            for (String element: myStringArray) {
                System.out.println(element);}}}
*/


/*
 Q5 What will be the output of the code below ?

 Answers:
 a) null null null
 b) a b c
 c) Compile time Error

 Correct Answer:

 c) Compile time Error
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            String[] myStringArray = {a,b,c};
            for (String element: myStringArray) {
                System.out.println(element);}}}
*/

/*
 Q6 What will be the output of the code below ?

 Answers:
 a) null null null
 b) a b c
 c) Compile time Error

 Correct Answer:

 b) a b c
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            String[] myStringArray = new String[]{"a","b","c"};
            for (String element: myStringArray) {
                System.out.println(element);}}}
*/

/*
 Q7 What will be the output of the code below ?

 Answers:
 a) null null null
 b) a b c
 c) Compile time Error

 Correct Answer:

 c) Compile time Error
 */

/*
public class TestEmployee {
        public static void main(String[] args) {
            String[] myStringArray = new String[]{"a","b","c"};
            for (int element: myStringArray) {
                System.out.println(element);}}}
*/

/*
 Q8 What will be the output of the code below ?

 Answers:
 a) 10 20 70
 b) 20 70 10
 c) Compile time Error

 Correct Answer:

 a) 10 20 70
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[3];a[0]=10;a[1]=20;a[2]=70;
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);}}
*/

/*
 Q9 What will be the output of the code below ?

 Answers:
 a) 10 20 70
 b) 20 70 10
 c) Compile time Error
 d) Run time error

 Correct Answer:

 d) Run time error ( ArrayIndexOutOfBoundException)
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[3];a[0]=10;a[1]=20;a[2]=70;a[3]=80;
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);}}
*/

/*
 Q10 What will be the output of the code below ?

 Answers:
 a) 10 20 70 80
 b) 10 20 70
 c) 10 20
 d) Compile time Error

 Correct Answer:

 c) 10 20
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[4];a[0]=10;a[1]=20;a[2]=70;a[3]=80;
            for(int i=0;i<a.length-2;i++)
                System.out.println(a[i]);}}
*/

/*
 Q11 What will be the output of the code below ?

 Answers:
 a) 10 20 70 80
 b) object of all elements
 c) compile time Error

 Correct Answer:

 b) object of all elements
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[4];a[0]=10;a[1]=20;a[2]=70;a[3]=80;
            for(int i=0;i<a.length;i++)
                System.out.println(a);}}
*/

/*
 Q12 What will be the output of the code below ?

 Answers:
 a) 10 20 70 80
 b) compile time Error
 c) Run time error

 Correct Answer:

 c) Run time error (ArrayIndexOutOfBoundException)
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[4];a[1]=10;a[2]=20;a[3]=70;a[4]=80;
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);}}
*/

/*
 Q13 What will be the output of the code below ?

 Answers:
 a) 10 20 70 80
 b) 0 10 20 70 80
 c) compile time Error
 d) Run time error

 Correct Answer:

 b) 0 10 20 70 80
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[5];a[1]=10;a[2]=20;a[3]=70;a[4]=80;
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);}}
*/

/*
 Q14 What will be the output of the code below ?

 Answers:
 a) 10 20 70 80
 b) 0 10 20 70 80
 c) 0 10 20 70 80 0
 d) compile time Error

 Correct Answer:

 c) 0 10 20 70 80 0
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[6];a[1]=10;a[2]=20;a[3]=70;a[4]=80;
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);}}
*/


/*
 Q15 What will be the output of the code below ?

 Answers:
 a) 10 20 70 80
 b) 0 10 0 20 70 80
 c) 0 10 20 70 80 0
 d) compile time Error

 Correct Answer:

 b) 0 10 0 20 70 80
 */
/*
public class TestEmployee {
        public static void main(String args[]){
            int a[]=new int[6];a[1]=10;a[3]=20;a[4]=70;a[5]=80;
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);}}
*/

/*
 Q16 What will be the output of the code below ?

 Answers:
 a) 0
 b) compile time Error
 c) Run time error


 Correct Answer:

 c) Run time error(ArryaIndexOutOfBound)
 */
/*
public class TestEmployee {
        public static void main(String[] args)
        {
            int[] emptyArray = new int[0];
            System.out.println(emptyArray.length);
            emptyArray[0] = 1;}}
*/

/*
 Q17 What will be the output of the code below ?

 Answers:
 a) 0
 b) compile time Error
 c) Run time error


 Correct Answer:

 a) 0
 */
/*
public class TestEmployee {
        public static void main(String[] args)
        {
            int[] emptyArray = new int[0];
            System.out.println(emptyArray.length);
            }}
*/

/*
 Q18 Array can store heterogeneous elements?

 Answers:
 a) TRUE
 b) FALSE
 C) None of the above


 Correct Answer:

 b) False(Array can store only homogeneous elements, to store all types of elements go for collection framework)
 */

/*
 Q19 Is Array growable ?

 Answers:
 a) no
 b) yes
 C) None of the above


 Correct Answer:

 a) no (Array size is fixed when we declare it)
 */

/*
 Q20 Is Array growable ?

 Answers:
 a) no
 b) yes
 C) None of the above


 Correct Answer:

 a) no (Array size is fixed when we declare it, To solve this problem, collection framework is used in java.)
 */

/*
 Q21 Array index starts with?

 Answers:
 a) 0
 b) 1
 C) None of the above


 Correct Answer:

 a) 0 (Array index start with 0 by default)
 */

/*
 Q22 What will be the output of the code below ?

 Answers:
 a) -2
 b) 0
 c) compile time Error
 d) Run time error


 Correct Answer:

 d) Run time error (NegativeArraySizeException)
 */
/*
public class TestEmployee {
        public static void main(String[] args)
        {
            int[] arr = new int[-2];
            System.out.println(arr.length);
            }}
*/

/*
 Q23 What will be the output of the code below ?

 Answers:
 a) a
    b
    c
 b) abc
 c) compile time Error

 Correct Answer:

 a) a
    b
    c
 */

/*
public class TestEmployee {
        private String[] arr = {"a", "b", "c"};
        public TestEmployee(){
            int size = arr.length;
            for (int i=0; i<size; i++){
                System.out.println(arr[i]);}}
        public static void main(String[] args){new TestEmployee();}}
*/



