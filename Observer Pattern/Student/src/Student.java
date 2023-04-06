class Student extends Subject {
	private int id;
	private String name;
	private String birth;

	public Student(int id, String name, String birth) {
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public void setId(int id) {
		this.id = id;
		notifyObserver();
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
		// there's change, notify observers
		notifyObserver();
	}

	public String getName() {
		return name;
	}

	public void setBirth(String birth) {
		this.birth = birth;
		// there's change, notify observers
		notifyObserver();
	}

	public String getBirth() {
		return birth;
	}
}