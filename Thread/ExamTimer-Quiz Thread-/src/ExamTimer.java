public class ExamTimer extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}