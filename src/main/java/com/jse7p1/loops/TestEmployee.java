package com.jse7p1.loops;

/**
 * Created by sandeep on 05/02/2016.
 * Topic 5
 * TODO Pallavi
 a)Create and use while loops
 b)Create and use for loops including the enhanced for loop
 c)Create and use do/while loops
 d)Compare loop constructs
 e)Use break and continue

 */

/*Topic:1-Create and use while loops*/
/*
Q1.What will be the Output of the code below?
Answers:-
A)2,4
  3,3
B)1,5
  2,4
C)None of the Above

correct answer:-
A)2,4
  3,3
*/

/*public class TestEmployee {

        public static void main(String[] args) {
            int i = 1;
            int z = 5;
            while (i < z) {
                i++;
                z--;
                System.out.println(i + "," + z);
            }
        }
}*/


/*Q2.What will be the Output of the code below?
Answers:-
A)****
B)*****
C)None of the Above

correct answer:-
B)*****
*/

/*
public class TestEmployee {
        public static void main(String[] args) {
            int z=5;
            while (z>0) {
                z--;
                System.out.print("*");
            }
        }
}*/

/*Q3.What will be the Output of the code below?
Answers:-
A)43210
B)4321
C)54321

correct answer:-
A)43210
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int x = 5;
        while (x > 0) {
            x--;
            System.out.print(x);
        }
    }
}
*/

/*Q4.What will be the Output of the code below?
Answers:-
A)12345
B)01234
C)1234

correct answer:-
A)12345
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5)
        {
            i++;
            System.out.print(i);

        }
    }
}
*/

/*Q5.What will be the Output of the code below?
Answers:-
A)12345
B)01234
C)1234

correct answer:-
B)01234
*/


/*
public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5)
        {

            System.out.print(i);
            i++;

        }
    }
}
*/

/*Q6.What will be the Output of the code below?
Answers:-
A)123456
B)12345
C)1234

correct answer:-
A)123456
*/

/*public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5)
        {
            i++;
            System.out.print(i);

            i++;
            System.out.print(i);
        }
    }
}*/


/*Q7.What will be the Output of the code below?
Answers:-
A)compile time error
B)Run time error
C)4
D)4.0

correct answer:-
D)4.0
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
	while (true) {
        double a=16.0;
	    double value = Math.sqrt(a);
	    System.out.println(value);
	    if (a !=2) {
            break;
	    }
	}
    }
}
*/

/*Q8.What will be the Output of the code below?
Answers:-
A)Infinite Loop
B)2
  4
C)1
  3
D)0

correct answer:-
C)1
  3
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int value = 0;
        while (value++ < 4) {
            if ((value % 2) == 0) {
                continue;
            }
            System.out.println(value);
        }
    }
}
*/

/*Q9.What will be the Output of the code below?
Answers:-
A)Infinite Loop
B)i:0
  i:1
  i:2
  i:3
  i:4
  all done!
C)i:1
  i:2
  i:3
  i:4
  all done!


correct answer:-
B)i:0
  i:1
  i:2
  i:3
  i:4
  all done!
*/
/*
public class TestEmployee {

    public static void main(String args[]) {
        int i = 0;
        while (i < 5)

        {
            System.out.println("i:" + i);
            i = i + 1;
        }

        System.out.println("all done!");
    }
}

*/

/*Q10.What will be the Output of the code below?
Answers:-
A)Infinite Loop
B)Hello
C)Hell
D)ello

correct answer:-
C)Hell
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
    String s="Hello";
        int i=0;

        while (i<s.length()-1) {
            System.out.println(s.charAt(i));
            i++;
            if (s.charAt(i)=='o') {
                continue;
            }
        }
    }
}
*/

/*Topic:2-Create and use for loops including the enhanced for loop*/


/*Q11.What will be the Output of the code below?
Answers:-
A)1
B)2
C)1
  2

correct answer:-
C)1
  2

*/


/*public class TestEmployee {

    public static void main(String args[]) {
        int i;
      for(i=1;i<3;i++)
        {
            System.out.println(i);

        }
    }
}*/

/*Q12.What will be the Output of the code below?
Answers:-
A)1
B)2
  1
C)1
  2

correct answer:-
C)1
  2

*/

/*
public class TestEmployee {

    public static void main(String args[]) {
        int i;
      for(i=1;i<3;++i)
        {
            System.out.println(i);

        }
    }
}
*/

/*Q13.What will be the Output of the code below?
Answers:-
A)2
  1
B)3
  2
C)No output

correct answer:-
C)No output

*/


/*public class TestEmployee {

    public static void main(String args[]) {
        int i;
      for(i=3;i<1;i--)
        {
            System.out.println(i);

        }
    }
}*/

/*Q14.What will be the Output of the code below?
Answers:-
A)2
  1
B)3
  2
C)No output

correct answer:-
B)3
  2

*/


/*public class TestEmployee {

    public static void main(String args[]) {
        int i;
      for(i=3;i>1;i--)
        {
            System.out.println(i);

        }
    }
}*/

/*Q15.What will be the Output of the code below?
Answers:-
A)4
  3
  2
B)3
  2
  1
C)No output

correct answer:-
A)4
  3
  2

*/

/*

public class TestEmployee {

    public static void main(String args[]) {
        int j;
      for(j=4;j>1;--j)
        {
            System.out.println(j);

        }
    }
}
*/

/*Q16.What will be the Output of the code below?
Answers:-
A)will execute
B)will return error
C)No output

correct answer:-
A)will execute

*/

/*
public class TestEmployee {

    public static void main(String[] args){
        boolean exp=true;
        for(int i=1; exp ; i++){
            System.out.println("Count is : " + i);
        }
    }
}
*/


/*Q17.What will be the Output of the code below?
Answers:-
A)will execute
B)will return error
C)No output

correct answer:-
B)will return error

*/

/*
public class TestEmployee {

   public static void main(String[] args){
         int exp;
         for(int i=1; exp ; i++){
              System.out.println("Count is : " + i);
         }
    }
}
*/

/*Q18.What will be the Output of the code below?
Answers:-
A)01234
B)will return error
C)No output
D)1234

correct answer:-
A)01234

*/


/*
public class TestEmployee {

   public static void main(String[] args){
       for(int i=0, j =5 ; i < j ; i++)
               {
              System.out.print( i);
         }
    }
}
*/

/*Q19.What will be the Output of the code below?
Answers:-
A)01234
B)will return error
C)No output
D)1234

correct answer:-
A)01234

*/

/*
public class TestEmployee {

   public static void main(String[] args){

       for(int i=0,j=5; i < 5 ; i++, j--)

       {
              System.out.print( i);
         }
    }
}
*/

/*Q20.What will be the Output of the code below?
Answers:-
A)012345
B)will return error
C)No output
D)12345

correct answer:-
A)012345
*/

/*
public class TestEmployee {

   public static void main(String[] args){

       for(int i=0,j=5,k=6; i < k ; i++, j--)

       {
              System.out.print( i);
         }
    }
}
*/

