package automationtest;
/*5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
5.4 Print the list using a forEach loop.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_Q5 {
    public static void main(String[] args) {

        ArrayList<String> CourseName = new ArrayList<>();
        CourseName.add("Scrum");
        CourseName.add("Java");
        CourseName.add("Jira");
        CourseName.add("Silenium");
        CourseName.add("Cucumber");
        CourseName.add("Postman");
        CourseName.add("Rest Assured");

        // iterate for each loop
        for (String PrimeList : CourseName) {
            System.out.println(PrimeList);

        }


    }


}
