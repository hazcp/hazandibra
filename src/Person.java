import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private Date dateCreated;
    private GregorianCalendar dateOfBirth;

    public Person(String name,int age, GregorianCalendar dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateCreated = formatDateCreated();
        this.dateOfBirth = dateOfBirth;
    }

    public Date formatDateCreated() {
        return new Date();
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", dateCreated= " + dateCreated +
                ", dateOfBirth= " + dateOfBirth.get(Calendar.DATE) + "/" +  dateOfBirth.get(Calendar.MONTH) + "/" + dateOfBirth.get(Calendar.YEAR) +
                '}';
    }

//    public static class PersonComp implements Comparator<Person> {
//        public int compare(Person p1, Person p2) {
//            return p1.getAge() - p2.getAge();
//        }
//    }

}
