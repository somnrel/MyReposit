
public class swimmingPull {

	public static void main(String[] args) {
		int x = 0;
		while (x<4) {
			System.out.print("a"); // �������� 1; �/� �������� 5; �/c �������� 8
			if (x<1) {
				System.out.print(" "); // �������� 2
			}
			System.out.print("n"); // �������� 3; �������� 6; �������� 9
			if (x>1) {
				System.out.print(" oyster"); // �������� 10;
				x = x + 2;
			}
			if (x==1) {
				System.out.print("noys"); // �������� 7
			}
			if (x<1) {
				System.out.print("oise"); //�������� 4
			}
			System.out.println(""); // ������� ������
			x = x + 1; // x==1; x>1
		}

	}

}
