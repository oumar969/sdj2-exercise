public class Test {
    public static void main(String[] args) {
        WaitingRoomWithBlockingQueue waitingRoom = new WaitingRoomWithBlockingQueue();

        Thread peopleEnteringWaitingRoom = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(100); //Try changing this to see what happens
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                waitingRoom.enterWaitingRoom(new Person("Person" + i, (20 - i) * 4));
            }
        });

        Thread peopleExitingWaitingRoom = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(500); //Try changing this to see what happens
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                waitingRoom.exitWaitingRoom();
            }
        });

        peopleEnteringWaitingRoom.start();
        peopleExitingWaitingRoom.start();

    }
}
