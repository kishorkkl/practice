package com.jse7p1.loops;
import java.io.*;

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

/*
public class TestEmployee {

        public static void main(String[] args) {
            int i = 1;
            int z = 5;
            while (i < z) {
                i++;
                z--;
                System.out.println(i + "," + z);
            }
        }
}
*/

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
}
*/

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



/*Topic:2-Create and use for loops including the enhanced for loop*/

/*Q8.What will be the Output of the code below?
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

/*Q9.What will be the Output of the code below?
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


/*Q10.What will be the Output of the code below?
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

/*Q11.What will be the Output of the code below?
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

/*Q12.What will be the Output of the code below?
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

/*Q13.What will be the Output of the code below?
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



/*Q14.What will be the Output of the code below?
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


/*Q15.What will be the Output of the code below?
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


/*Q16.What will be the Output of the code below?
Answers:-
A)01234
B)will return error
C)No output
D)1234

correct answer:-
A)01234

*/


/*public class TestEmployee {

   public static void main(String[] args){

       for(int i=0,j=5; i < 5 ; i++, j--)

       {
              System.out.print( i);
         }
    }
}*/


/*Q17.What will be the Output of the code below?
Answers:-
A)012345
B)will return error
C)No output
D)12345

correct answer:-
A)012345
*/


/*public class TestEmployee {

   public static void main(String[] args){

       for(int i=0,j=5,k=6; i < k ; i++, j--)

       {
              System.out.print( i);
         }
    }
}*/


/*Q18.What will be the Output of the code below?
Answers:-
A)STRING
B)SRN
C)TIG
D)RING
E)Error

correct answer:-
D)RING
*/


/*
public class TestEmployee {
   public static void main(String[] args) {
	String s = "STRING";
	for (int i = 0; i < s.length(); i++) {
	    char letter = s.charAt(i+2);
	    System.out.print(letter);
	}
   }
}

*/

/*Q19.What will be the Output of the code below?
Answers:-
A)STRING
B)RG
C)TIG
D)RING
E)Error

correct answer:-
B)RG
*/

/*
public class TestEmployee {
   public static void main(String[] args) {
	String s = "STRING";
	for (int i = 0; i < s.length(); i++) {
        i=i+2;
	    char letter = s.charAt(i);
	    System.out.print(letter);
	}
   }
}
*/

/*Q20.What will be the Output of the code below?
Answers:-
A)STRING
B)GNIRT
C)GNIRTS
E)Error

correct answer:-
C)GNIRTS
*/

/*
public class TestEmployee {
   public static void main(String[] args) {
	String s = "STRING";
	for (int i = s.length()-1; i < s.length(); --i) {
	    char letter = s.charAt(i);
	    System.out.print(letter);
	}
   }
}
*/

/*Q21.What will be the Output of the code below?
Answers:-
A)STRING
B)GNIRT
C)GNIRTS
E)Error

correct answer:-
C)GNIRTS
*/


/*
public class TestEmployee {
   public static void main(String[] args) {
	String s = "STRING";
	for (int i = s.length()-1; i < s.length(); i--) {
	    char letter = s.charAt(i);
	    System.out.print(letter);
	}
   }
}
*/

/*Q22.What will be the Output of the code below?
Answers:-
A)STRING
B)RING
c)TRING

correct answer:-
c)TRING
*/

/*
public class TestEmployee {
   public static void main(String[] args) {
	String s = "STRING";
	for (int i = 1; i < s.length(); ++i) {
	    char letter = s.charAt(i);
	    System.out.print(letter);
	}
   }
}

*/


/*
Q23.What will be the Output of the code below?
Answers:-
A)apple
  orange
B)apple
  orange
  banana
C)apple
  orange
  banana
  plum
D)apple
  orange
  plum
correct answer:-
D)apple
  orange
  plum
*/

/*
public class TestEmployee {

    public static void main(String[] args) {

        String[] fruits = {"apple","orange","banana","plum"};
        for (String f : fruits) {
            if (f.startsWith("b")) {
                continue;
            }
            System.out.println(f);
        }
    }
}

*/



/*Q24.What will be the Output of the code below?
Answers:-
A)0,0
  0,1
  1,0
  1,1
B)0,0
  0,1
  0,0
  1,1
c)0,0
  0,1
  0,1
  1,1


correct answer:-
A)0,0
  0,1
  1,0
  1,1
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 2; y++) {
                System.out.println(i + "," + y);
            }
        }
    }
}
*/

/*Q25.What will be the Output of the code below?
Answers:-
A)0,0
  0,1
  1,0
  1,1
B)0,0
  0,1
  0,0
  1,1
c)0,0
  0,1
  0,1
  1,1
D)0,0
  0,1
  1,1

correct answer:-
D)0,0
  0,1
  1,1
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int y = i; y < 2; y++) {
                System.out.println(i + "," + y);
            }
        }
    }
}

*/

/*Q26.What will be the Output of the code below?
Answers:-
A)0,2
  0,3
  1,2
  1,3
B)0,2
  1,3
  1,2
  1,3
c)0,2
  1,3
  1,2
  1,3


correct answer:-
A)0,2
  0,3
  1,2
  1,3
*/


/*
public class TestEmployee {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int y = 2; y < 4; y++) {
                System.out.println(i+","+y);
            }
        }
    }
}
*/

/*Q27.What will be the Output of the code below?
Answers:-
A)0,0,0
  0,1,0
  0,0,1
B)0,0,1
  0,1,1
  1,1,1
c)0,0,0

correct answer:-
c)0,0,0
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            for (int y = 0; y < 1; y++) {
                for (int z = 0; z < 1; z++) {
                    System.out.println(i + "," + y + "," + z);
                }
            }
        }
    }
}

*/

/*Q28.What will be the Output of the code below?
Answers:-
A)0,0,0
  0,1,0
  0,0,1
B)0,0,1
  0,1,1
  1,1,1
c)0,0,0
D)0,0,0
  0,0,1

correct answer:-
D)0,0,0
  0,0,1
*/

/*public class TestEmployee {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            for (int y = 0; y < 1; y++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println(i + "," + y + "," + z);
                }
            }
        }
    }
}*/

/*Topic 3:- Create and use do/while loops*/

/*Q29.What will be the Output of the code below?
Answers:-
A)1
B)123
c)12
d)012

correct answer:-
d)012
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i < 3);
    }
}
*/

/*Q30.What will be the Output of the code below?
Answers:-
A)21
B)321
c)3210

correct answer:-
B)321
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        int n = 3;
        do {
            System.out.print(n);
            n--;
        } while (n > 0);
    }
}

*/

/*Q31.What will be the Output of the code below?
Answers:-
A)1
B)123
c)12
d)012

correct answer:-
B)123
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            System.out.print(i);
        } while (i < 3);
    }
}
*/


/*Q32.What will be the Output of the code below?
Answers:-
A)21
B)321
c)3210
D)210
correct answer:-
D)210
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        int n = 3;
        do {
            n--;
            System.out.print(n);
        } while (n > 0);
    }
}

*/

/*Q33.What will be the Output of the code below?
Answers:-
A)1
B)123
c)12
d)012

correct answer:-
B)123
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        do {
            ++i;
            System.out.print(i);
        } while (i < 3);
    }
}
*/

/*Q34.What will be the Output of the code below?
Answers:-
A)21
B)321
c)3210
D)210
correct answer:-
D)210
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        int n = 3;
        do {
            --n;
            System.out.print(n);
        } while (n > 0);
    }
}
*/

/*Q35.What will be the Output of the code below?
Answers:-
A)1
B)123
c)12
D)012

correct answer:-
D)012
*/


/*
public class TestEmployee {
    public static void main(String[] args) {
        int i = 0;
        do {

            System.out.print(i);
            ++i;
        } while (i < 3);
    }
}

*/



/*Q36.What will be the Output of the code below?
Answers:-
A)21
B)321
c)3210
D)210
correct answer:-
B)321
*/

/*
public class TestEmployee {
    public static void main(String args[]) {
        int n = 3;
        do {
            System.out.print(n);
            --n;
        } while (n > 0);
    }
}
*/

/*Topic 4:- Use break and continue*/

/*Q37.What will be the Output of the code below?
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

/*Q38.What will be the Output of the code below?
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

/*Q39.What will be the Output of the code below?
Answers:-
A)123
B)12345
c)1234-14

correct answer:-
B)12345
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == -1) {
                continue;
            }
            System.out.print(numberArray[i]);
        }
    }
}

*/

/*Q40.What will be the Output of the code below?
Answers:-
A)54-12
B)54-121
c)54-1


correct answer:-
A)54-12
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = numberArray.length-1; i > 0; i--) {
            if(numberArray[i]==3) {
            continue;
            }
            System.out.print(numberArray[i]);
        }
    }
}
*/

/*Q41.What will be the Output of the code below?
Answers:-
A)54-12
B)54-121
c)54-1
D)4-12

correct answer:-
A)54-12
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = numberArray.length-1; i > 0; --i) {
            if(numberArray[i]==3) {
            continue;
            }
            System.out.print(numberArray[i]);
        }
    }
}
*/

/*Q42.What will be the Output of the code below?
Answers:-
A)123
B)12345
c)1234-14
D)2345

correct answer:-
B)12345
*/


/*
public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = 0; i < numberArray.length; ++i) {
            if (numberArray[i] == -1) {
                continue;
            }
            System.out.print(numberArray[i]);
        }
    }
}
*/

/*Q43.What will be the Output of the code below?
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

/*
Q44.What will be the Output of the code below?
Answers:-
A)apple
  orange
B)apple
  orange
  banana
C)apple
  orange
  banana
  plum
D)apple
  orange
  plum
correct answer:-
A)apple
  orange
*/

/*
public class TestEmployee {

    public static void main(String[] args) {

        String[] fruits = {"apple","orange","banana","plum"};
        for (String f : fruits) {
            if (f.startsWith("b")) {
                break;
            }
            System.out.println(f);
        }
    }
}
*/

/*Q45.What will be the Output of the code below?
Answers:-
A)54-12
B)54-121
c)54-1

correct answer:-
c)54-1
*/

/*public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = numberArray.length-1; i > 0; i--) {
            if(numberArray[i]==3) {
         break;
            }
            System.out.print(numberArray[i]);
        }
    }
}*/

/*Q46.What will be the Output of the code below?
Answers:-
A)54-12
B)54-121
c)54-1
D)4-1

correct answer:-
c)54-1
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = numberArray.length-1; i > 0; --i) {
            if(numberArray[i]==3) {
         break;
            }
            System.out.print(numberArray[i]);
        }
    }
}
*/

/*Q47.What will be the Output of the code below?
Answers:-
A)123
B)12345
c)1234-14
D)23

correct answer:-
A)123
*/


/*public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = 0; i < numberArray.length; ++i) {
            if (numberArray[i] == -1) {
                break;
            }
            System.out.print(numberArray[i]);
        }
    }
}*/

/*Q48.What will be the Output of the code below?
Answers:-
A)123
B)12345
c)1234-14

correct answer:-
A)123
*/

/*
public class TestEmployee {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, -1 ,4,5};
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == -1) {
                break;
            }
            System.out.print(numberArray[i]);
        }
    }
}
*/

/*
Topic:5-Compare loop constructs*/
/*
Q49.Which is an entry control loop?*/

/*Answers:-
A)While
B)do While

correct answer:-
A)While*/

/*
Q50.Which is an exit control loop?*/

/*Answers:-
A)While
B)do While

correct answer:-
B)do While*/

/*
Q51.In which loop each execution occurs by testing condition?*/

/*Answers:-
A)While
B)do While

correct answer:-
A)While*/

/*
Q52.In which loop each execution except the first one occurs by testing condition?*/

/*Answers:-
A)While
B)do While

correct answer:-
B)do While*/

/*
Q53.In which loop test condition appears at the beginning?*/

/*Answers:-
A)While
B)do While

correct answer:-
A)While*/

/*
Q54.In which loop test condition appears at the end?*/

/*Answers:-
A)While
B)do While

correct answer:-
B)do While*/

/*
Q55.Which loop processes instance?*/

/*Answers:-
A)For
B)For each
C)Both
D)None

correct answer:-
B)For each
*/