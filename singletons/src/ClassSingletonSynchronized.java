public class ClassSingletonSynchronized
{
	private static ClassSingletonSynchronized INSTANCE;
	// klassesingleton hjælper med at sikre at der kun er en instans af klassen
	// Class-Based Singleton
	private String info = "Initial info class";

	private ClassSingletonSynchronized() {
	}
	// synchronized sikre at der kun er en tråd der kan tilgå metoden
	//dvs. at der kun kan være en tråd der kan tilgå metoden
	public synchronized  static ClassSingletonSynchronized getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ClassSingletonSynchronized();
		}

		return INSTANCE;
	}
}
