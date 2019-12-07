
public class Magnets {
	static int x = 3;

	public static void main(String[] args) {
		if (x>2) {
			System.out.print("a");
		}
<<<<<<< HEAD
		while (x>0) { //повторять пока x>0
			x =x-1; // отнимаем при каждом цикле x-1
			System.out.print("-"); // выводи "-" после того, как отнимешь х-1
			if (x==2) { //если x равен 2, то =>
				System.out.print("b c"); //=> то выведи b c
			}
			if (x==1) { // если x равен 1
				System.out.print("d"); // => то выведи d
				x = x - 1; // т.к x сейчас равен 1, то x - 1 = 0, для окончания цикла
=======
		while (x>0) {
			x =x-1;
			System.out.print("-");
			if (x==2) {
				System.out.print("b c");
			}
			if (x==1) {
				System.out.print("d");
				x = x - 1;
>>>>>>> 134286b... Р—Р°РґР°С‡Р° РњР°РіРЅРёС‚С‹
			}
		}
	}

}
