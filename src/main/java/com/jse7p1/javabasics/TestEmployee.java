package com.jse7p1.javabasics;

/**
 * Created by sandeep on 21/01/2016.
 *
 * Exam Object 1.1,1.2,1.3
 *
 *   This class should Test the following
 *   a) Rules related to class declaration,structure,modifiers.
 *   b) Rules related to scope of variables
 *   c) Rules on main method declaration,method signature etc.
 *
 */


/*TODO Ramesh
    Begin preparing questions here. The format should be as follows.
       a) First declare the question. Just above the question write a small summary of whats being tested.
       b) Then declare the answers.
       c) Then write small code to verify the Q and answer.
       d) The first Testing Topic example is given below and has 2 questions .You can uncomment any one questions code to test.
       e) Aim to write about 5 questions/programs for each of the topics I have set below.
       f) For names. I suggest you use names of classes, methods, variables that are normally used such as from the below list
            {Company,Employee,Employer} {Car,Manufacturer,Driver} {House,Room,Door} ..etc dont use any specific names of persons etc.
       g) You should also make questions that dont have code and test specific knowledge of the topic but no more than 2 per topic and should test important aspect of the question. These should be in addition to 5 code related questions.
 */

/*
    Testing Topic 1: Testing abstract classes

    Q1.What will be the output of the code below?

    Answers:

    a)Jack01/06/1977
    b)Compile time Error.
    c)Run time Error


    Correct Answer:
    b) Employee class does not implement method getEmployeeId and is not declared abstract.

*/

/*
public class TestEmployee {
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        System.out.println(employee.getEmployeeName() + employee.getEmployeeDOB());
    }
}


class Employee
{
    String employeeName = "Jack";
    String employeeDOB = "01/06/1977";
    String employeeId = "EMP1789234";

    Employee(){}

    String getEmployeeName()
    {
        return this.employeeName;
    }
    String getEmployeeDOB()
    {
        return this.employeeDOB;
    }
    String getEmployeeId();

}

 */
/*
    Q2 What will be the output of the code below?


    Answers:
    a)Jack01/06/1977EMP1789234
    b)Compile time Error.
    c)Run time Error

    Correct Answer:

    b) Employee class is  abstract and therefore cannot be instantiated.

 */
/*
public class TestEmployee {
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        System.out.println(employee.getEmployeeName() + employee.getEmployeeDOB());
    }
}


abstract class Employee
{
    String employeeName = "Jack";
    String employeeDOB = "01/06/1977";
    String employeeId = "EMP1789234";

    Employee(){}

    String getEmployeeName()
    {
        return this.employeeName;
    }
    String getEmployeeDOB()
    {
        return this.employeeDOB;
    }
    String getEmployeeId();

}
*/

/*
    Q3 What will be the output of the code below?


    Answers:
    a) x=0 will be printed 6 times.
    b)Compile time Error.
    c)Run time Error
    d) x=0 will be printed 5 times.

    Correct Answer:

    a) x=0 will be printed 6 times.

 */
/*
public class TestEmployee {

    public static void main(String[] args) {
        int x;
        for (x=0;x<=5;x++)
        {
            int y=0;
            System.out.println("x = "+y);
        }

    }

}
*/

/*
    Q4 What will be the output of the code below?


    Answers:
    a) employye = 1, employe = 3
    b)Compile time Error.
    c)Run time Error


    Correct Answer:

    b) employe cannot be resolved a variable.

 */
/*
public class TestEmployee {
    public static void main(String[] args) {
        int employee = 1;

        {
            int employe = 2;
            System.out.println("employye = " + employee);
        }

        int employye = 3;
        System.out.println("employe = " + employe);
    }
}
*/

/*
Q5 What will be the output of the code below?


        Answers:
        a) age:20
        b)Compile time Error.
        c)Run time Error


        Correct Answer:

        b) age cannot be resolved to a variable

        // System.out.println("Age: " + age); should be written in Employeeage().

 */

/*
public class TestEmployee {
    public void Employeeage() {
        int age = 0;
        age = age + 20;

    }

    public static void main(String args[]) {
        TestEmployee te = new TestEmployee();
        te.Employeeage();
        System.out.println("Age: " + age);
    }
}

*/
/*
Q6 What will be the output of the code below?


        Answers:
        a) Obj1: count is=2,Obj2: count is=3
        b)Compile time Error.
        c)Run time Error
        d) Obj1: count is=2,Obj2: count is=2



        Correct Answer:

        d) Static variable shared by multiple objects

 */

/*
public class TestEmployee
{
    static int count=0;
    public void increment()
    {
        count++;
    }
    public static void main(String args[])
    {
        TestEmployee obj1=new TestEmployee();
        TestEmployee obj2=new TestEmployee();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
    }
}
*/

/*
Q7 What will be the output of the code below?


        Answers:
        a) I'm a static variable
        b)Compile time Error.
        c)Run time Error
        d) Obj1: count is=2, Obj2: count is=2



        Correct Answer:

        b) name cannot be resolved or is not a field

 */

/*
public class TestEmployee {
    public static void main(String[] args) {
        System.out.println(Employee.name);
    }


    public class Employee {
        public static final String NAME = "I'm a static variable";
    }
}

*/

/*
Q8 If you are declaring class variable as public static final, then variable(constant) should be:


        Answers:
        a) in lower case
        b) in upper case
        c)does not matter

        Correct Answer:

        b) variable(constant) should be in upper case.

 */

/*
Q9 Static variable’s value is same for all the objects(or instances) of the class:


        Answers:
        a) yes
        b) no
        c) none of above

        Correct Answer:

        a) yes, instances(objects) of the same class share a single copy of static variables.

 */

