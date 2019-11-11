package Chapter01;

public class InfiniteLoop {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		for (;;) {
			sum += i;
			if (sum >= 5000) {
				break;

			}
			i++;

		}

	}

}
