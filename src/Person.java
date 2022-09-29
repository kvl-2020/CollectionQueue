public class Person {
    private String firstName;
    private String lastName;
    private int countTicket;

    public Person(String firstName, String lastName, int countTicket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countTicket = countTicket;
    }

    public int toRide() {
        if (countTicket > 0) {
            countTicket--;
        }
        return countTicket;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + countTicket + " билетов";
    }

    public String toStringRide() {
        return firstName + " " + lastName + " прокатился(лась) на аттракционе";
    }
}
