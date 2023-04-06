import java.util.Date;        // Date هنا قمنا باستدعاء الكلاس

public class RealTime extends Thread {

	@Override
	public void run() {
		// true لا ترجع isInterrupted() طالما أن الدالة
		//// isInterrupted() returnerer ikke true
		while(!Thread.currentThread().isInterrupted())
		{
			// سيتم طباعة الوقت الحالي
			// Det aktuelle tidspunkt vil blive udskrevet
			System.out.printf("Current time: %tr \n", new Date());

			// لثانية واحدة Thread بعدها سيتم إيقاف كائن الـ
			// objektet stopper et sekund
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}