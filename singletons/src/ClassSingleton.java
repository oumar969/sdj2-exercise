public final class ClassSingleton {

	private static ClassSingleton INSTANCE;
	// klassesingleton hjælper med at sikre at der kun er en instans af klassen
	// Class-Based Singleton
	private String info = "Initial info class";

	private ClassSingleton() {
	}

	public static ClassSingleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ClassSingleton();
		}

		return INSTANCE;
	}

	public static ClassSingleton getINSTANCE()
	{
		return INSTANCE;
	}

	public static void setINSTANCE(ClassSingleton INSTANCE)
	{
		ClassSingleton.INSTANCE = INSTANCE;
	}

	public String getInfo()
	{
		return info;
	}

	public void setInfo(String info)
	{
		this.info = info;
	}
}