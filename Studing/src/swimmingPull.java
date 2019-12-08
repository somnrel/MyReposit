
public class swimmingPull {

	public static void main(String[] args) {
		int x = 0;
		while (x<4) {
			System.out.print("a"); // действие 1; н/с действие 5; н/c действие 8
			if (x<1) {
				System.out.print(" "); // действие 2
			}
			System.out.print("n"); // действие 3; действие 6; действие 9
			if (x>1) {
				System.out.print(" oyster"); // действие 10;
				x = x + 2;
			}
			if (x==1) {
				System.out.print("noys"); // действие 7
			}
			if (x<1) {
				System.out.print("oise"); //действие 4
			}
			System.out.println(""); // перенос строки
			x = x + 1; // x==1; x>1
		}

	}

}
