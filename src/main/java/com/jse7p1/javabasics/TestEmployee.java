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
