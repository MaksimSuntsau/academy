package by.academy.classwork.lesson10;

public enum EnumDemo {

	MONDAY(1, "Den tjazheliy"), TUTHDAY(2, "Uzhe polegche"), WENTHDAY(3, "Seredinka"),
	THIRTHDAY(4, "Ribniy den"), FRIDAY(5, "Urrra"), SATURDAY(6, "Skying"), SUNDAY(7, "Otdihaem");

	private int c;
	private String s;

	EnumDemo(int c, String s) {
		this.c = c;
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public int getC() {
		return c;
	}

}
