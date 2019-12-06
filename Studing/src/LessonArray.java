
public class LessonArray {
 static String [] wordListOne= {"One","Two","Three"}; //создаем первый строковый массив
 static String [] wordListTwo= {"Limon","Apple","Carrot"}; //создаем второй строковый массив
 static String [] wordListThree= {"Eat","Throw","Put"}; //создаем третий строковый массив
 static int oneLength = wordListOne.length; // вычисляем колл-во слов в массиве
 static int twoLength = wordListTwo.length; // вычисляем колл-во слов в массиве
 static int threeLength = wordListThree.length; // вычисляем колл-во слов в массиве
 static int rand1 = (int) (Math.random() * oneLength); // генерируем случайное число
 static int rand2 = (int) (Math.random() * twoLength); // генерируем случайное число
 static int rand3 = (int) (Math.random() * threeLength); // генерируем случайное число
 static String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; // строим фразу
	public static void main(String[] args) { 
		System.out.println(phrase);
}
}
