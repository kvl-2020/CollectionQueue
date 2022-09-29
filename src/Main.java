import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = generateClients();
        System.out.println(persons.size());
        Deque<Person> dequePers = new LinkedList();

        for (Person pers:persons) {
            dequePers.offerLast(pers);
        }
        System.out.println(dequePers.size());

        while (!dequePers.isEmpty()) {
            Person luckyPers = dequePers.pollFirst();
            System.out.println(luckyPers.toStringRide());
            if ( luckyPers.toRide() > 0 ) {
                dequePers.offerLast(luckyPers);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> pers = new ArrayList<>();
        pers.add(new Person("Иван", "Баранкин", 7));
        pers.add(new Person("Семен", "Слепаков", 2));
        pers.add(new Person("Феликс", "Дзержинский", 1));
        pers.add(new Person("Элтон", "Джон", 4));
        pers.add(new Person("Тракторина", "Маруськина", 3));
        pers.add(new Person("Поликарп", "Пупкин", 5));
        return pers;
    }
}