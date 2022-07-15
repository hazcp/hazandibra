import java.util.*;

public class Main {
    public static void main(String[] args) {
//        WhichSeason ws = new WhichSeason();
//        ws.monthWhichSeason(Month.DECEMBER);

        Person p1 = new Person("Haz",19, new GregorianCalendar(1999, Calendar.OCTOBER, 7));
        Person p2 = new Person("Jack",15, new GregorianCalendar(1999,Calendar.OCTOBER, 7));
        Person p3 = new Person("Lynn",21, new GregorianCalendar(1999,Calendar.OCTOBER, 7));
        Person p4 = new Person("Nigel",24, new GregorianCalendar(1999,Calendar.OCTOBER, 7));

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for (Person person : people) {
            System.out.println("Before: " + person.getAge());
        }

        Collections.sort(people);
        System.out.println(people.toString());

//        System.out.println(p1.compareTo(p2));

        for (Person person : people) {
            System.out.println("After: " + person.getAge());
        }

        // add people objects to map
        Map<String,Integer> peopleMap = new HashMap<>();
        for (Person person : people) {
            peopleMap.put(person.getName(),person.getAge());
        }

        for(Map.Entry<String,Integer> person : peopleMap.entrySet()) {
            System.out.println(person.getKey() + " is " + person.getValue() + " years old");
        }




//        Comparator<Person> personComp = new Person.PersonComp();
//        people.sort(personComp);
      //  System.out.println(personComp.compare(p1,p2));
    }
}