public class Main
{
	public static void main(String[] args)
	{
				// create the subject
				Student s = new Student(2125, "Omar", "1997-01-01");

				// create observers and register them
				Observer o1 = new View1(s);
				Observer o2 = new View2(s);
				s.register(o1);
				s.register(o2);

				// change subject
				View3 v = new View3(s);
				v.changeStudent();

				View2 v2 = new View2(s);
				v2.update();

				View1 v1 = new View1(s);
				v1.update();
			}
		}
