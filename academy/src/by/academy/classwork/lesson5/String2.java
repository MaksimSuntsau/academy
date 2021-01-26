package by.academy.classwork.lesson5;

public class String2 {

	public static void main(String[] args) {

		int n1 = 3;
		int n2 = 56;

		StringBuilder sb = new StringBuilder();

		sb.append(n1).append(" + ").append(n2).append(" = ").append(n1 + n2).append("\n");

		sb.append(n1).append(" - ").append(n2).append(" = ").append(n1 - n2).append("\n");

		sb.append(n1).append(" * ").append(n2).append(" = ").append(n1 * n2).append(".").append("\n");

		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(sb);

		sb1.deleteCharAt(7).insert(7, "ravno").deleteCharAt(23).insert(23, "ravno").deleteCharAt(40).insert(40, "ravno");

		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder(sb);

		sb2.replace(7, 8, "ravno").replace(23, 24, "ravno").replace(40, 41, "ravno");

		System.out.println(sb2);
	}

}
