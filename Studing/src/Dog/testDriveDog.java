package Dog;

public class testDriveDog { 

	public static void main(String[] args) { // ������� �����
		
		Dog d = new Dog();  // �������� ������� ������ Dog
		
		d.size = 40; // .(�����) - �������� �������; ������������� �������� ���� size
		
		d.name = "John"; // ������������� �������� ���� name
		
		d.breed = "Labrador"; // ������������� �������� ���� breed
		
		d.bark(); // �������� ����� bark();
	}

}
