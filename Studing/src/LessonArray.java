
public class LessonArray {
 static String [] wordListOne= {"One","Two","Three"}; //������� ������ ��������� ������
 static String [] wordListTwo= {"Limon","Apple","Carrot"}; //������� ������ ��������� ������
 static String [] wordListThree= {"Eat","Throw","Put"}; //������� ������ ��������� ������
 static int oneLength = wordListOne.length; // ��������� ����-�� ���� � �������
 static int twoLength = wordListTwo.length; // ��������� ����-�� ���� � �������
 static int threeLength = wordListThree.length; // ��������� ����-�� ���� � �������
 static int rand1 = (int) (Math.random() * oneLength); // ���������� ��������� �����
 static int rand2 = (int) (Math.random() * twoLength); // ���������� ��������� �����
 static int rand3 = (int) (Math.random() * threeLength); // ���������� ��������� �����
 static String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; // ������ �����
	public static void main(String[] args) { 
		System.out.println(phrase);
}
}
