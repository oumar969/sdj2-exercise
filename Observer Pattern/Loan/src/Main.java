public class Main
{
	public static void main(String[] args)
	{

		Newspaper printMedia = new Newspaper();
		Internet onlineMedia = new Internet();

		Loan personalLoan = new Loan("Personalig Loan", 12,
				"sparkasse bank");
		personalLoan.registerObserver(printMedia);
		personalLoan.registerObserver(onlineMedia);
		personalLoan.setInterest(4);

	}


}
