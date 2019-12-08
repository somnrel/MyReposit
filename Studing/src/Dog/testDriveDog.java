package Dog;

public class testDriveDog { 

	public static void main(String[] args) { // главный метод
		
		Dog d = new Dog();  // создание объекта класса Dog
		
		d.size = 40; // .(точка) - оператор доступа; устанавливаем значение поля size
		
		d.name = "John"; // устанавливаем значение поля name
		
		d.breed = "Labrador"; // устанавливаем значения поля breed
		
		d.bark(); // вызываем метод bark();
	}

}
