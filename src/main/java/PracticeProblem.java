import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		String sussybaka = scanner.nextLine();

		System.out.println(sussybaka.charAt(0));
		
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		boolean bean = scanner.nextBoolean();
		scanner.nextLine();

		System.out.println(!bean);
		
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		int intagar = scanner.nextInt();
		scanner.nextLine();

		System.out.println(intagar > 5);
		
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("In: ");
		double victoryroyale = scanner.nextDouble();
		scanner.nextLine();

		System.out.println((victoryroyale >= -2) && (victoryroyale <=2));
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		String jackieweng = scanner.nextLine();

		System.out.println("Hello World".equals(jackieweng));
		
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		int wan = scanner.nextInt();
		scanner.nextLine();

		System.out.print("In: ");
		int too = scanner.nextInt();
		scanner.nextLine();

		System.out.println(wan <= too);
		
	}

	public static void q7() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		double dubba = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("In: ");
		double dooba = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println(dubba > dooba);
		
	}

}
