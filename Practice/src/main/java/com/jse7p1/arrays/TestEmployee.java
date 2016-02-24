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
 Q19 Is Array grow able ?

 Answers:
 a) no
 b) yes
 C) None of the above


 Correct Answer:

 a) no (Array size is fixed when we declare it)
 */

/*
 Q20 Is Array grow able ?

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


/*
 Q24 What will be the output of the code below ?

 Answers:
 a) 0 2 4 6 8
 b) 0 1 2 3 4 5 6 7 8 9
 c) compile time Error

 Correct Answer:

 a) 0 2 4 6 8
 */
/*
public class TestEmployee {
        public static void main(String args[])
        {
            int arr [] = new int[10];
            for (int i = 0; i < 10; ++i) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
                i++;}}}
*/

/*
 Q25 What will be the output of the code below ?

 Answers:
 a) 0 2 4 6 8
 b) 0 1 2 3 4 5 6 7 8 9
 c) compile time Error

 Correct Answer:

 b) 0 1 2 3 4 5 6 7 8 9
 */
/*
public class TestEmployee {
        public static void main(String args[])
        {
            int arr [] = new int[10];
            for (int i = 0; i < 10; ++i) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
                }}}
*/

/*
 Q26 What will be the output of the code below ?

 Answers:
 a) 3
 b) 1
 c) compile time Error

 Correct Answer:

 b) 1
 */
/*
public class TestEmployee {
        public static void main(String args[])
        {
            int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int n = 6;
            n = arr[arr[n] / 2];
            System.out.println(arr[n] / 2);}}
*/

/*
 Q27 What will be the output of the code below ?

 Answers:
 a) 3
 b) 1
 c) compile time Error

 Correct Answer:

 a) 3
 */
/*
public class TestEmployee {
        public static void main(String args[])
        {
            int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int n = 6;
            n = arr[arr[n] / 2];
            System.out.println(arr[n]);}}
*/


/*
 Q28 What will be the output of the code below?

 Answers:
 a) 3
 b) 1
 c) compile time Error

 Correct Answer:

 a) 3
 */

/*
public class TestEmployee {
        public static void main(String args[]) {
            int total = 0;
            int[] i = new int[3];
            for(int j=1;j< i.length; j++)
                total += (i[j] = j);
            System.out.println(total);}}
*/


/*
 Q29 What will be the output of the code below ?

 Answers:
 a) 3
 b) 2
 c) compile time Error

 Correct Answer:

 b) 2
 */

/*
public class TestEmployee {
        public static void main(String args[]) {
            int total = 0;
            int[] i = new int[3];
            for(int j=1;j< i.length; j++)
                total = (i[j] = j);
            System.out.println(total);}}
*/

/*
 Q30 What will be the output of the code below ?

 Answers:
 a) 3
 b) 2
 c) compile time Error
 d) Run time error

 Correct Answer:

 d) Run time error (ArrayIndexOutOfBound)
 */

/*
public class TestEmployee {
        public static void main(String args[]) {
            int total = 0;
            int[] i = new int[3];
            for(int j=1;j<= i.length; j++)
                total += (i[j] = j);
            System.out.println(total);}}
*/

/*
 Q31 What will be the output of the code below ?

 Answers:
 a) 3
 b) 2
 c) compile time Error
 d) Run time error

 Correct Answer:

 d) Run time error (ArrayIndexOutOfBound)
 */
/*
public class TestEmployee {
        public static void main(String args[]) {
            int total = 0;
            int[] i = new int[3];
            for(int j=1;j< i.length; j--)
                total += (i[j] = j);
            System.out.println(total);}}
*/


/*
 Q32 What will be the output of the code below ?

 Answers:
 a) April has 31 days.
 b) April has 30 days.
 c) April has 29 days.
 d)compile time Error

 Correct Answer:

 c) April has 30 days.
 */
/*
public class TestEmployee {
    public static void main(String args[]) {
        int month_days[] = { 31, 28, 30, 29, 31, 30, 31, 31, 30, 31,
                30, 31 };
        System.out.println("April has " + month_days[3] + " days.");
    }
}
*/

/*
 Q33 What will be the output of the code below ?

 Answers:
 a) 123
 b) 012
 c) compile time Error

 Correct Answer:

 a) 123
 */

/*
public class TestEmployee {
    public static void main(String args[]){
        int count = 0;
        int days[] = new int[3];
        while(count < days.length){
            days[count] = ++count;
        }
        for(int index = 0;index < days.length;index++){
            System.out.print(days[index]);}}}
*/

/*
 Q34 What will be the output of the code below ?

 Answers:
 a) 123
 b) 012
 c) compile time Error

 Correct Answer:

 b) 012
 */

/*
public class TestEmployee {
    public static void main(String args[]){
        int count = 0;
        int days[] = new int[3];
        while(count < days.length){
            days[count] = count++;
        }
        for(int index = 0;index < days.length;index++){
            System.out.print(days[index]);}}}
*/

/*
 Q35 What will be the output of the code below ?

 Answers:
 a) 23
 b) 012
 c) compile time Error

 Correct Answer:

 a) 23
 */

/*
public class TestEmployee {
    public static void main(String args[]){
        int count = 0;
        int days[] = new int[3];
        while(count < days.length){
            days[count] = ++count;
        }
        for(int index = 1;index < days.length;++index){
            System.out.print(days[index]);}}}
 */

/*
 Q36 What will be the output of the code below ?

 Answers:
 a) 1
 b) 2
 c) compile time Error

 Correct Answer:

 b) 2
 */
/*
public class TestEmployee {

        public static void main(String argv[]){

            int ary[]=new int[]{1,2,3};

            System.out.println(ary[1]);}}
*/

/*
 Q37 What will be the output of the code below ?

 Answers:
 a) 1
 b) 2
 c) compile time Error

 Correct Answer:

 c) compile time Error (Array size can not be changed after creation of array)
 */
/*
public class TestEmployee {
        public static void main(String argv[]){
            int[] iArray = new int[10];
            iArray.length = 15;
            System.out.println(iArray.length);}}
*/


/*
 Q38 What will be the output of the code below ?

 Answers:
 a) 1
 b) 2
 c) compile time Error

 Correct Answer:

 c) compile time Error (when initialising array, don't give size )
 */
/*
public class TestEmployee {
        public static void main(String argv[]){
            int[] arr = new int[2]{0,1};
            System.out.println(arr);}}
*/


/*
 Q39 Is it mandatory to use new operator to initialize an array ?

 Answers:
 a) Yes
 b) No
 c) None of the above

 Correct Answer:

 b) No, Array can be initialized using both new and comma separated expressions surrounded by curly braces.
 */

/*
 Q40 Which of these is necessary to specify at time of array initialization?

 Answers:
 a) Column
 b) Row
 c) Both column and row
 d) none of the above

 Correct Answer:

 b) Row
 */

/*
 Q41 Arrays in Java are implemented as?

 Answers:
 a) Object
 b) Class
 c) Variable
 d) none of the above

 Correct Answer:

 b) Object
 */

//Topic 2: Declare, instantiate, initialize and use multi-dimensional array


/*
 Q42 What will be the output of the code below ?

 Answers:
 a) 1 0
    0 2
 b) 0 1
    2 0
 c) compile time Error

 Correct Answer:

 a) 1 0
    0 2
 */
/*
    public class TestEmployee {
        public static void main(String[] args) {
            int[][] arr = new int[2][2];
            arr[0][0] = 1;
            arr[1][1] = 2;
            for (int i = 0; i < arr.length; i++) {
                int[] sub = arr[i];
                for (int x = 0; x < sub.length; x++) {
                    System.out.print(sub[x] + " ");}
                System.out.println();}}}
*/

/*
 Q43 What will be the output of the code below ?

 Answers:
 a) 1 0
    0 2
 b) 1 0 0 2
 c) compile time Error

 Correct Answer:

 b) 1 0 0 2
 */
/*
public class TestEmployee {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[1][1] = 2;
        for (int i = 0; i < arr.length; i++) {
            int[] sub = arr[i];
            for (int x = 0; x < sub.length; x++) {
                System.out.print(sub[x] + " ");}}}}
*/

/*
 Q44 What will be the output of the code below ?

 Answers:
 a) 1
    0

    0
    2
 b) 1
    0
    0
    2
 c) compile time Error

 Correct Answer:

 a) 1
    0

    0
    2
 */
/*
    public class TestEmployee {
        public static void main(String[] args) {
            int[][] arr = new int[2][2];
            arr[0][0] = 1;
            arr[1][1] = 2;
            for (int i = 0; i < arr.length; i++) {
                int[] sub = arr[i];
                for (int x = 0; x < sub.length; x++) {
                    System.out.println(sub[x] + " ");}
                System.out.println();}}}
*/


/*
 Q45 What will be the output of the code below ?

 Answers:
 a) 5 0 0 4
 b) 1 0 0 2
 c) compile time Error

 Correct Answer:

 a) 5 0 0 4 (again we are setting new value)
 */
/*
    public class TestEmployee {
        public static void main(String[] args) {
            int[][] arr = new int[][]{{1,0},{0,2}};
            arr[0][0] = 5;
            arr[1][1] = 4;
            for (int i = 0; i < arr.length; i++) {
                int[] sub = arr[i];
                for (int x = 0; x < sub.length; x++) {
                    System.out.print(sub[x] + " ");}}}}
*/

/*
 Q46 What will be the output of the code below ?

 Answers:
 a) 10 20 30

 b) 10
    20
    30
 c) compile time Error

 Correct Answer:

 b) 10
    20
    30
 */

/*
public class TestEmployee {
        public static void main(String[] args) {

            byte[][][] arr = new byte[3][3][3];
            space[0][0][0] = 10;
            space[1][1][1] = 20;
            space[2][2][2] = 30;
            System.out.println(arr[0][0][0]);
            System.out.println(arr[1][1][1]);
            System.out.println(arr[2][2][2]);
        }
    }
*/

/*
 Q47 What will be the output of the code below ?

 Answers:
 a) 2 3

 b) 2 3 4
 c) compile time Error

 Correct Answer:

 a) 2 3
 */

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{1, 2, 3},new int[]{1, 2, 3, 4},};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}
*/


/*
 Q48 What will be the output of the code below ?

 Answers:
 a) 2 3

 b) 2 3 4
 c) compile time Error

 Correct Answer:

 b) 2 3 4
 */

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{1, 2, 3},new int[]{1, 2, 3, 4},};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
    }
}
*/


/*
 Q49 What will be the output of the code below ?

 Answers:
 a) 2
 b) 3
 c) 4
 d) compile time Error

 Correct Answer:

 c) 4
 */

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{1, 2, 3},new int[]{1, 2, 3, 4},new int[]{1, 2, 3, 4,5,6},new int[]{1, 2}};
        System.out.println(arr.length);}}
*/

/*
 Q50 What will be the output of the code below ?

 Answers:
 a) 2
 b) 6
 c) 4
 d) compile time Error

 Correct Answer:

 b) 6
 */

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{1, 2, 3},new int[]{1, 2, 3, 4},new int[]{1, 2, 3, 4,5,6},new int[]{1, 2}};
        System.out.println(arr[2].length);}}

*/

/*
 Q51 What will be the output of the code below ?

 Answers:
 a) 1 0 0 2
 b) 1
    0
    0
    2
 c) compile time Error
 d) Run time error

 Correct Answer:

 d) Run time error (NullPointerException)
 */

/*
    public class TestEmployee {
        public static void main(String[] args) {
            int[][] arr = new int[2][];
            arr[0][0] = 1;
            arr[1][1] = 2;
            for (int i = 0; i < arr.length; i++) {
                int[] sub = arr[i];
                for (int x = 0; x < sub.length; x++) {
                    System.out.print(sub[x] + " ");}
                }}}
*/


/*
 Q52 What will be the output of the code below ?

 Answers:
 a) 1 0 0 2
 b) 1
    0
    0
    2
 c) compile time Error
 d) Run time error

 Correct Answer:

 d) compile time Error(while creating two dimensional array first dimension is must)
 */

/*
    public class TestEmployee {
        public static void main(String[] args) {
            int[][] arr = new int[][2];
            arr[0][0] = 1;
            arr[1][1] = 2;
            for (int i = 0; i < arr.length; i++) {
                int[] sub = arr[i];
                for (int x = 0; x < sub.length; x++) {
                    System.out.print(sub[x] + " ");}
                }}}
*/


/*
 Q53 What is an array of arrays ?

 Answers:
 a) One dimensional array
 b) Two dimensional array
 c) Three dimensional array
 d) None of the above

 Correct Answer:

 d) Two dimensional array
 */

/*
 Q54 What is an array of arrays of arrays ?

 Answers:
 a) One dimensional array
 b) Two dimensional array
 c) Three dimensional array
 d) None of the above

 Correct Answer:

 d) Three dimensional array
 */

/*
 Q55 Which array is best to construct a board or grid ?

 Answers:
 a) One dimensional array
 b) Two dimensional array
 c) Three dimensional array
 d) None of the above

 Correct Answer:

 d) Two dimensional array
 */

/*
 Q56 Can we copy one array to another ?

 Answers:
 a) yes
 b) no
 c) None of the above

 Correct Answer:

 d) Yes,We can copy an array to another by the arraycopy method of System class.
 */

/*
 Q57 While creating two or three dimensional array,first dimension is must?

 Answers:
 a) yes
 b) no
 c) None of the above

 Correct Answer:

 d) Yes,first dimension is must, without that compile will throw error e.g. int[][3] is Not Ok but int[3][] is Ok.
 */

/*
 Q58 What will be the output of the code below ?

 Answers:
 a) Red Balls
 b)Red
 c)Balls

 Correct Answer:
 b)Red
 */
/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink"}, {"Balls"}};

        System.out.println(Balls[0][0]);

    }
}
*/



/*
 Q59 What will be the output of the code below ?

 Answers:
 a) Red Balls
 b)Blue
 c)Balls
 d)Red Blue

 Correct Answer:
 a) Red Balls
 */

/*class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink"}, {"Balls"}};

        System.out.println(Balls[0][0] + Balls[1][0]);

        //    System.out.println(Balls[0][1] + Balls[1][0]);
    }
}*/



/*
 Q60 What will be the output of the code below ?

 Answers:
 a)Red Balls
   Blue Balls
 b)Red Balls
   Blue Blue
 c)Red Blue
   Blue Balls
 d)Error

 Correct Answer:
 a)Red Balls
   Blue Balls
 */

/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink"}, {"Balls"}};

        System.out.println(Balls[0][0] + Balls[1][0]);

        System.out.println(Balls[0][1] + Balls[1][0]);
    }
}
*/

/*
 Q61 What will be the output of the code below ?

 Answers:
 a)Red Balls
   Blue Balls
 b)Red Balls
   Blue Blue
 c)Red Blue
   Blue Balls
 d)Error
 e)Exception

 Correct Answer:
 e)ArrayIndexOutOfBoundsException
 */


/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink"}, {"Balls" ,"Pins"}};

        System.out.println(Balls[0][3] + Balls[1][0]);

        System.out.println(Balls[0][1] + Balls[1][0]);
    }
}
*/

/*
 Q62. What will be the output of the code below ?

 Answers:
 a)Blue Balls
   Red Balls
 b)Blue Balls
   Red Pins
 c)Pink Balls
   Blue Pins
 d)Error
 e)Exception

 Correct Answer:
  c)Pink Balls
   Blue Pins
 */



/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins"}};

        System.out.println(Balls[0][2] + Balls[1][0]);

        System.out.println(Balls[0][1] + Balls[1][1]);
    }
}
*/

/*
 Q63. What will be the output of the code below ?

 Answers:
 a)Blue Balls
   Red Balls
 b)Blue Balls
   Red Pins
 c)Pink Balls
   Blue Pins
 d)Error
 e)Exception

 Correct Answer:
 e)ArrayIndexOutOfBoundsException
 */

/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins"}};

        System.out.println(Balls[1][2] + Balls[1][0]);

        System.out.println(Balls[1][1] + Balls[1][1]);
    }
}
*/

/*
 Q64. What will be the output of the code below ?

 Answers:
 a)Blue Balls
   Red Balls
 b)Blue Balls
   Red Pins
 c)Pink Balls
   Blue Blue
 d)Pins Balls
   Pins Pins
 e)Exception

 Correct Answer:
 d)Pins Balls
   Pins Pins
 */


/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins "}};

        System.out.println(Balls[1][1] + Balls[1][0]);

        System.out.println(Balls[1][1] + Balls[1][1]);
    }
}
*/

/*
 Q65. What will be the output of the code below ?

 Answers:
 a)Red Red
   Red Red
 b)Pins Pins
    Pins Pins
 c)Blue Blue
   Blue Blue
 d)Pins Balls
   Pins Pins
 e)Exception

 Correct Answer:
 b)Pins Pins
    Pins Pins
 */



/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins "}};

        System.out.println(Balls[1][1] + Balls[1][1]);

        System.out.println(Balls[1][1] + Balls[1][1]);
    }
}
*/

/*
 Q66. What will be the output of the code below ?

 Answers:
 a)Red Red
   Red Red
 b)Pins Pins
    Pins Pins
 c)Blue Blue
   Blue Blue
 d)Pins Balls
   Pins Pins
 e)Exception

 Correct Answer:
 e)ArrayIndexOutOfBoundsException
 */


/*class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins "}};

        System.out.println(Balls[2][2] + Balls[2][2]);

        System.out.println(Balls[2][2] + Balls[2][2]);
    }
}*/

/*
 Q67. What will be the output of the code below ?

 Answers:
 a)Red Red
   Red Red
 b)Red Balls
   Red Balls
 c)Blue Blue
   Blue Blue
 d)Balls Balls
   Balls Balls
 e)Exception

 Correct Answer:
 a)Red Red
   Red Red
 */


/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins "}};

        System.out.println(Balls[0][0] + Balls[0][0]);

        System.out.println(Balls[0][0] + Balls[0][0]);
    }
}

*/

/*
 Q68. What will be the output of the code below ?

 Answers:
 a)Red
 b)Balls
 c)Exception

 Correct Answer:
  a)Red
 */


/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins "}};

        System.out.println(Balls[0][0]);

    }
}
*/

/*
 Q69. What will be the output of the code below ?

 Answers:
 a)Blue
 b)Balls
 c)Exception


 Correct Answer:
 c)ArrayIndexOutOfBoundsException
 */



/*
class TestEmployee {

    public static void main(String[] args) {
        String[][] Balls = {{"Red ", "Blue ", "Pink "}, {"Balls" ,"Pins "}};

        System.out.println(Balls[2][1]);

    }
}
*/




//Topic 3: Declare and use an ArrayList


/*
 Q70 What will be the output of the code below ?

 Answers:
 a) ABC XYZ
 b) compile time Error
 c) Run time error

 Correct Answer:

 a) ABC XYZ
 */

/*
import java.util.*;
  public class TestEmployee {
        public static void main(String args[]){

            ArrayList<String> al = new ArrayList();
            al.add("ABC");
            al.add("XYZ");
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");}}}
*/

/*
 Q71 What will be the output of the code below ?

 Answers:
 a) 1 XYZ
 b) compile time Error
 c) Run time error

 Correct Answer:

 a) 1 XYZ (Array list can accept heterogeneous elements)
 */

/*
import java.util.*;
  public class TestEmployee {
        public static void main(String args[]){

            ArrayList al = new ArrayList();
            al.add(1);
            al.add("XYZ");
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");}}}
*/

/*
 Q72 What will be the output of the code below ?

 Answers:
 a) 1 XYZ 2
 b) 1 XYZ 2 3
 c) compile time Error

 Correct Answer:

 b) 1 XYZ 2 3
 */
/*
import java.util.*;
  public class TestEmployee {
        public static void main(String args[]){

            ArrayList al = new ArrayList(2);
            al.add(1);
            al.add("XYZ");
            al.add(2);
            al.add(3);
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");}}}
*/

/*
 Q73 What will be the output of the code below ?

 Answers:
 a) 1 XYZ yes 2
 b) 1 XYZ
 c) yes 2
 d) compile time Error

 Correct Answer:

 b) compile time Error (Array list is defined as String)
 */
/*
import java.util.*;
  public class TestEmployee {
        public static void main(String args[]){

            ArrayList al = new ArrayList(2);
            al.add(1);
            al.add("XYZ");
            ArrayList<String> al2=new ArrayList<String>();
            al2.add("yes");
            al2.add(2);
            al.addAll(al2);
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");}}}
*/


/*
 Q74 What will be the output of the code below ?

 Answers:
 a) 1 XYZ yes 2
 b) 1 XYZ
 c) yes 2
 d) compile time Error

 Correct Answer:

 a) 1 XYZ yes 2
 */
/*
import java.util.*;
  public class TestEmployee {
        public static void main(String args[]){

            ArrayList al = new ArrayList(2);
            al.add(1);
            al.add("XYZ");
            ArrayList al2=new ArrayList();
            al2.add("yes");
            al2.add(2);
            al.addAll(al2);
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");}}}
*/


/*
 Q75 What will be the output of the code below ?

 Answers:
 a) 3
 b) 2
 c) compile time Error

 Correct Answer:

 a) 2
 */

/*
import java.util.*;
  public class TestEmployee {
          public static void main(String args[]) {
              ArrayList<Integer> al = new ArrayList<Integer>();
              al.add(1);
              al.add(88);
              al.add(9);
              al.add(17);
              System.out.println(al.lastIndexOf(9));}}
*/

/*
 Q76 What will be the output of the code below ?

 Answers:
 a) 10 20 30
 b) Run time error
 c) compile time Error

 Correct Answer:

 a) 10 20 30
 */

/*
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        for (int value : al) {
            System.out.print(value+ " ");}}}
*/

/*
 Q77 What will be the output of the code below ?

 Answers:
 a) 10 20 30
 b) 30 20
 c) 20 10
 c) compile time Error

 Correct Answer:

 b) 30 20
 */

/*
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.set(0, 30);
        for (int value : al) {
            System.out.print(value+ " ");}}}
*/

/*
 Q78 What will be the output of the code below ?

 Answers:
 a) 10 20
 b) 30
 c) 10 20
 c) compile time Error

 Correct Answer:

 b) 30
 */

/*
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.clear();
        al.add(30);
        System.out.print(al+ " ");}}
*/

/*
 Q79 What will be the output of the code below ?

 Answers:
 a) 30
 b) 20
 c) 10
 c) compile time Error

 Correct Answer:

 c) 10
 */

/*
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        int minimum = Collections.min(al);
        System.out.print(minimum);}}
*/


/*
 Q80 What will be the output of the code below ?

 Answers:
 a) 30
 b) 20
 c) 10
 c) compile time Error

 Correct Answer:

 a) 30
 */

/*
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        int minimum = Collections.max(al);
        System.out.print(minimum);}}
*/

/*
 Q81 What will be the output of the code below ?

 Answers:
 a) 9 2 17
 b) 17 2 9
 c) 2 9 17
 c) compile time Error

 Correct Answer:

 c) 2 9 17
 */

/*
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(2);
        al.add(17);
        Collections.sort(al);
        System.out.print(al+ " ");}}
*/

/*
 Q82 Can ArrayList store duplicate values ?

 Answers:
 a) no
 b) yes
 c) compile time Error

 Correct Answer:

 b) yes
 */

/*
 Q83 Can ArrayList allow random access ?

 Answers:
 a) no
 b) yes
 c) compile time Error

 Correct Answer:

 b) yes, array works at the index basis.
 */
/*
 Q84 Is Array list grow able or not?

 Answers:
 a) yes
 b) no
 c) compile time Error

 Correct Answer:

 a) yes,array list is dynamic and increase its size according to data.
 */

/*
 Q85 Can Array List shrink automatically?

 Answers:
 a) yes
 b) no
 c) compile time Error

 Correct Answer:

 a) yes,when object is removed, array list shrink automatically.
 */

/*
 Q86 What will be the output of the code below ?

 Answers:
 a) 1 1
 b) 1 2
 c) 2 2
 d) compile time Error

 Correct Answer:

 a) 1 1
 */

/*
import java.util.ArrayList;
public class TestEmployee
{
    public static void main(String args[])
    {
        int[] arr = new int[3];
        arr[0] = 1;arr[1] = 2;
        System.out.print(arr[0]+" ");
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);
        arrL.add(1);arrL.add(2);
        System.out.println(arrL.get(0));}}
*/

/*
 Q87 What will be the output of the code below ?

 Answers:
 a) 1 1
 b) 1 4
 c) 2 2
 d) compile time Error

 Correct Answer:

 b) 1 4
 */

/*
import java.util.ArrayList;
public class TestEmployee
{
    public static void main(String args[])
    {
        int[] arr = new int[3];
        arr[0] = 1;arr[1] = 2;
        System.out.print(arr[0]+" ");
        ArrayList<Integer> arrL = new ArrayList<Integer>(1);
        arrL.add(1);arrL.add(2);arrL.add(3);arrL.add(4);
        System.out.println(arrL.get(3));}}
*/

/*
 Q88 What will be the output of the code below ?

 Answers:
 a) 1 2 1 2
 b) 2 1 1 2
 c) 1 2 2 1
 d) compile time Error

 Correct Answer:

 c) 1 2 2 1
 */

/*
import java.util.ListIterator;
import java.util.ArrayList;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList arrL = new ArrayList();
        arrL.add("1");arrL.add("2");
        ListIterator lt = arrL.listIterator();
        while(lt.hasNext())
            System.out.print(lt.next()+" ");
        while(lt.hasPrevious())
            System.out.print(lt.previous()+" ");}}
*/


/*
 Q89 What will be the output of the code below ?

 Answers:
 a) Blank
 b) 2 1
 c) 1 2
 d) compile time Error

 Correct Answer:

 a) Blank
 */

/*
import java.util.ListIterator;
import java.util.ArrayList;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList arrL = new ArrayList();
        arrL.add("1");arrL.add("2");
        ListIterator lt = arrL.listIterator();
        while(lt.hasPrevious())
            System.out.print(lt.previous()+" ");}}
*/

/*
 Q90 What will be the output of the code below ?

 Answers:
 a) 2 1 2 1
 b) 2 1 1 2
 c) 1 2 1 2
 d) compile time Error

 Correct Answer:

 c) 1 2 1 2
 */

/*
import java.util.ArrayList;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList arrL = new ArrayList();
        arrL.add("1");arrL.add("2");arrL.clone();
        System.out.print(arrL+" ");
        ArrayList al2 = (ArrayList)arrL.clone();
            System.out.print(al2+" ");}}
*/

/*
 Q91 What will be the output of the code below ?

 Answers:

 a) A B
 b) D E
 c) A B D E
 d) compile time Error

 Correct Answer:

 c) A B
 */

/*
import java.util.*;
public class TestEmployee{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("A");
        al.add("B");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("D");
        al2.add("E");
        al2.removeAll(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");}}}
*/

/*
 Q92 What will be the output of the code below ?

 Answers:

 a) A B
 b) D E
 c) A B D E
 d) compile time Error

 Correct Answer:

 c) D E
 */

/*
import java.util.*;
public class TestEmployee{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("A");
        al.add("B");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("D");
        al2.add("E");
        Iterator itr=al2.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");}}}
*/


/*
 Q93 What will be the output of the code below ?

 Answers:

 a) B A C
 b) A B C
 c) A C B
 d) compile time Error

 Correct Answer:

 c) A C B
 */

/*
import java.util.ArrayList;
import java.util.Collections;
public class TestEmployee {
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");list.add("B");list.add("C");
        Collections.swap(list, 1, 2);
        for(String str: list){
            System.out.print(str+" ");}}}
*/


/*
 Q94 What will be the output of the code below ?

 Answers:

 a) A C B
 b) A B C
 c) compile time Error
 d) Run time error

 Correct Answer:

 d) Run time error
 */

/*
import java.util.ArrayList;
import java.util.Collections;
public class TestEmployee {
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");list.add("B");list.add("C");
        Collections.swap(list, 1, 5);
        for(String str: list){
            System.out.print(str+" ");}}}
*/

/*
 Q95 What will be the output of the code below ?

 Answers:

 a) C B A
 b) B C A
 c) compile time Error
 d) Run time error

 Correct Answer:

 a) C B A
 */

/*
import java.util.ArrayList;
import java.util.Collections;
public class TestEmployee {
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");list.add("B");list.add("C");
        Collections.shuffle(list);
        for(String str: list){
            System.out.print(str+" ");}}}
*/

/*
 Q96 obj.add("hello"); --- code line will add "hello" in array list at?

 Answers:

 a) First Position
 b) Last Position
 c) Anywhere in array list

 Correct Answer:

 b) Last Position
 */

/*
 Q97 obj.add(2, "bye");  will add "bye" in array list at?

 Answers:

 a) 3rd position(2nd index)
 b) 3rd position(3nd index)
 c) 2nd position(3nd index)

 Correct Answer:

 a) 3rd position(2nd index)
 */

/*
 Q98 obj.remove(3);  will remove?

 Answers:

 a) 4th element (index 4)
 b) 3rd element (index 4)
 c) 4th element (index 3)

 Correct Answer:

 c) 4th element (index 3)
 */

/*
 Q99 obj.set(2, "ok"); will replace?

 Answers:

 a) 2nd element (index 3) with ok
 b) 3rd element (index 2) with ok
 c) 3rd element (index 3) with ok

 Correct Answer:

 b) 3rd element (index 2) with ok
 */


/*
 Q100 when we initialize ArrayList, its initial capacity will be?

 Answers:

 a) 16
 b) 8
 c) 10

 Correct Answer:

 c) 10
 */