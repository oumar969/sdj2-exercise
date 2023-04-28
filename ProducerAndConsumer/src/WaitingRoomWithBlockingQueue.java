import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class WaitingRoomWithBlockingQueue
{

    /*
    Does NOT follow these rules:
    max 10 persons in waiting room
    max 2 persons over 60 years in waiting room
     */

    private final BlockingQueue<Person> persons = new ArrayBlockingQueue<>(10);
//ArrayBlockingQueue er en implementation af BlockingQueue interfacet,
// som er en datastruktur der følger FIFO princippet (First In First Out) og har en fast størrelse som er 10 her.
    //syncronized er vigtigt fordi vi har flere tråde der tilgår den samme datastruktur.
    public synchronized void enterWaitingRoom(Person person) {
        persons.add(person);
        System.out.println("Inserted person with name: " + person.getName() + " and age: " + person.getAge() + " - Current number of people in waiting room: " + persons.size());
        notifyAll();
    }

    public synchronized Person exitWaitingRoom() {
        Person person = persons.remove();
        System.out.println("Removed person with name: " + person.getName() + " and age: " + person.getAge() + " - Current number of people in waiting room: " + persons.size());
        notifyAll();
        return person;
    }
}
