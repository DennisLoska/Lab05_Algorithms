
public class Main {

	private static int n = 10;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.fragment01(n);
		main.fragment02(n);
		main.fragment03(n);
		main.fragment04(n);
		main.fragment05(n);
		main.fragment06(n);
		main.fragment07(n);

		System.out.println(main.isPrime(8));
	}

	public void fragment01(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum++;
		}
		System.out.println("Fragment 1 sum is: " + sum);
	}

	public void fragment02(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				sum++;
			}
		System.out.println("Fragment 2 sum is: " + sum);
	}

	public void fragment03(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				sum++;
			}
		}
		System.out.println("Fragment 3 sum is: " + sum);
	}

	public void fragment04(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum++;
			for (int j = 0; j < n; j++) {
				sum++;
			}
		}
		System.out.println("Fragment 4 sum is: " + sum);

	}

	public void fragment05(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * n; j++) {
				sum++;
			}
		}
		System.out.println("Fragment 5 sum is: " + sum);
	}

	public void fragment06(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		System.out.println("Fragment 6 sum is: " + sum);
	}

	public void fragment07(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n * n; j++) {
				if (j % i == 0) {
					for (int k = 0; k < j; k++) {
						sum++;
					}
				}
			}
		}
		System.out.println("Fragment 7 sum is: " + sum);
	}

	public boolean isPrime(int n) {
		if (n % n == 0 && n % 1 == 0) {
			return true;
		}
		return false;
	}

}
