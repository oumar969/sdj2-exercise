import java.util.Scanner;        // Scanner هنا قمنا باستدعاء الكلاس

public class Main {

	public static void main(String[] args) {

		// و الذي سنستخدمه لإدخال بيانات من المستخدم input إسمه Scanner هنا قمنا بإنشاء كائن من الكلاس
		Scanner input = new Scanner(System.in);

		// et إسمه ExamTimer هنا قمنا بإنشاء كائن من الكلاس
		ExamTimer et = new ExamTimer();

		int num1;                           // سنستخدم هذا المتغير لتخزين أول رقم عشوائي يظهر في عملية الجمع
		int num2;                           // سنستخدم هذا المتغير لتخزين ثاني رقم عشوائي يظهر في عملية الجمع
		int userAnswer;                     // سنستخدم هذا المتغير لتخزين العدد الذي سيدخله المستخدم للإجابة على عمليأت الجمع
		int operationsCounter = 0;          // سنخزن عدد العمليات الحسابية التي ستظهر عند تشغيل البرنامج فيه
		int correctAnswersCounter = 0;      // سنخزن عدد الإجابات الصحيحة في هذا المتغير
		int wrongAnswersCounter = 0;        // سنخزن عدد الإجابات الخطئ من ي هذا المتغير

		// الأمر الذي سيجعله في حالة إنتظار مدة 20 ثانية فقط و بعدها سيتوقف كلياً et هنا قمنا بتشغيل الكائن
		et.start();

		System.out.println("---------- Quiz ---------");

		// طالما أن مدة العشرين ثانية لم تنقضي بعد سيستمر في تنفيذ الأوامر الموجودة في هذه الحلقة
		while(et.isAlive())
		{
			num1 = (int)(Math.random()*10);             // num1 سيتم تخزين رقم عشوائي بين 1 و 9 في المتغير
			num2 = (int)(Math.random()*10);             // num2 سيتم تخزين رقم عشوائي بين 1 و 9 في المتغير

			System.out.print(num1+" + "+num2+" = ");    // num2 و num1 هنا سيطلب من المستخدم معرفة ناتج جمع العددين
			userAnswer = input.nextInt();               // هنا سيتم إنتظار المستخدم لإدخال الجواب

			if(userAnswer == num1+num2)                 // إذا كانت إجابته صحيحة, سيتم إضافة عدد الإجابات الصحيحة واحداً
				correctAnswersCounter++;

			else                                        // إذا كانت إجابته خاطئة, سيتم إضافة عدد الإجابات الخطأ واحداً
				wrongAnswersCounter++;

			operationsCounter++;                        // في الأخير سيتم إضافة عدد عمليات الجمع واحداً
		}

		System.out.println("Time end..\n");

		// بعد إنتهاء مدة العشرين ثانية سيتم طباعة عدد عمليات الجمع, عدد الأجوبة الصحيحة و عدد الأجوبة الخاطئة
		System.out.println("--------- Result --------");
		System.out.println("Number of operations:      " +operationsCounter);
		System.out.println("Number of correct answers: " +correctAnswersCounter);
		System.out.println("Number of wrong answers:   " +wrongAnswersCounter);

	}

}