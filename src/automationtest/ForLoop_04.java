package automationtest;
/*4.1 Create the class with the name "ForLoop_Q4"
4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
4.4	Create the main method
4.5 Create the Object and call the 'printMyName' method into the main method.*/

public class ForLoop_04 {

    public void printMyName(int howManyTime,String name) {


        for (howManyTime = 1; howManyTime <= 15; howManyTime++) {
            System.out.println("Shruti");
        }

    }

    public static void main(String[] args) {
        ForLoop_04 obj = new ForLoop_04();

      obj.printMyName(10,"Shruti");

    }


}
