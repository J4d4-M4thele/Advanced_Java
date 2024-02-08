package ex08_4_exercise;

import java.util.List;
import java.util.function.Predicate;


public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    // Mail mail, Eng employees < 65
    Predicate<Employee> over50 = p -> p.getGender().equals(Gender.MALE) && p.getDept().equals("Eng");
    pl.stream()
            .filter(over50)
            .forEach(p -> robo.roboMail(p));

  }
}
