package by.academy.classwork.lesson10;

public class SwitchDemo {

	public static void main(String[] args) {

		EnumDemo dayOfWeek = EnumDemo.TUTHDAY;

		switch (dayOfWeek) {
		case MONDAY:
			System.out.println("Ponedelnik");
			break;
		case TUTHDAY:
			System.out.println("Vtornik");
			break;
		case WENTHDAY:
			System.out.println("Sreda");
			break;
		case THIRTHDAY:
			System.out.println("Chetverg");
			break;
		case FRIDAY:
			System.out.println("Pyatnica");
			break;
		case SATURDAY:
			System.out.println("Subbota");
			break;
		case SUNDAY:
			System.out.println("Voskresenie");
			break;

		}

		System.out.println();

		for (int i = 0; i < EnumDemo.values().length; i++) {
			EnumDemo c = EnumDemo.values()[i];
			System.out.println(c.ordinal() + " " + c + " - " + c.getC() + " - " + c.getS());
		}

	}

}
