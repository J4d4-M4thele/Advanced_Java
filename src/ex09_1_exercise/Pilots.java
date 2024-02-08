package ex09_1_exercise;

import java.util.function.Predicate;

/**
 *
 * @author oracle
 */
public class Pilots implements Predicate<Person>{
    
    @Override
    public boolean test(Person p){
        return p.getAge() >= 23 && p.getAge() <= 65;
    }
}
