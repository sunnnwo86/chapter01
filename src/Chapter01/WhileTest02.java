package Chapter01;

public class WhileTest02 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 10) {

			if (i > 5) {

				continue;

			}

			System.out.println(i);
			i++;
		}

	}

}
