import java.util.ArrayList;

class Loan implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String type;
	private int interest;
	private String bank;

	public Loan(String type, int interest, String bank) {
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
		notifyObservers();
	}

	public String getBank() {
		return this.bank;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer ob : observers) {
			System.out
					.println("Notifying Observers on change in Loan interest rate");
			ob.update(this.interest);
		}

	}

}


