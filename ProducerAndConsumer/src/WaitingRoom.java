import java.util.LinkedList;
import java.util.Queue;

public class WaitingRoom {

    /*
    Rules:
    max 10 persons in waiting room
    max 2 persons over 60 years in waiting room
     */

    private final Queue<Person> persons = new LinkedList<>();
    //LinkedList er en implementation af Queue interfacet, som er en datastruktur der følger FIFO princippet (First In First Out),
    private static final int MAX_NUMBER_OF_PERSONS_IN_WAITING_ROOM = 10;
    private static final int MAX_NUMBER_OF_PERSONS_OVER_60_IN_WAITING_ROOM = 2;

    public synchronized void enterWaitingRoom(Person person) {
        while (!checkIfItIsOkForPersonToEnter(person)) {
            try {
                wait(); // wait() er en metode fra Object klassen, som gør at tråden venter indtil notify() bliver kaldt.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        persons.add(person);
        System.out.println("Inserted person with name: " + person.getName() + " and age: " + person.getAge() + " - Current number of people in waiting room: " + persons.size());
        notifyAll();
    }

    public synchronized Person exitWaitingRoom() {
        while (persons.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Person person = persons.remove();
        System.out.println("Removed person with name: " + person.getName() + " and age: " + person.getAge() + " - Current number of people in waiting room: " + persons.size());
        notifyAll();
        return person;
    }

    private boolean checkIfItIsOkForPersonToEnter(Person person) {
        if(persons.size() >= MAX_NUMBER_OF_PERSONS_IN_WAITING_ROOM)
        {
            return false;
        }
        else
        {
            int currentNumberOfPersonsOver60 = 0;
            for (Person personInList : persons) {
                if (personInList.getAge() > 60) {
                    currentNumberOfPersonsOver60++;
                }
            }
            if(person.getAge() > 60)
            {
                currentNumberOfPersonsOver60++;
            }
            return currentNumberOfPersonsOver60 <= MAX_NUMBER_OF_PERSONS_OVER_60_IN_WAITING_ROOM;
        }
    }
}
