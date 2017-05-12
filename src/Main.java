
public class Main {

    private static int n10 = 10;
    private static int n100 = 100;
    private static int n1000 = 1000;

    public static void main(String[] args) {
        Main main = new Main();


        System.out.println("Case n=10:");
        main.fragment01(n10);
        main.fragment02(n10);
        main.fragment03(n10);
        main.fragment04(n10);
        main.fragment05(n10);
        main.fragment06(n10);
        main.fragment07(n10);
        System.out.println();

        System.out.println("Case n=100:");
        main.fragment01(n100);
        main.fragment02(n100);
        main.fragment03(n100);
        main.fragment04(n100);
        main.fragment05(n100);
        main.fragment06(n100);
        main.fragment07(n100);
        System.out.println();

        System.out.println("Case n=1000:");
        main.fragment01(n1000);
        main.fragment02(n1000);
        main.fragment03(n1000);
        main.fragment04(n1000);
        main.fragment05(n1000);
        main.fragment06(n1000);
        main.fragment07(n1000);

        System.out.println(main.isPrime(8));
    }

	/*
     * PART 1: Analysis of Algorithms
	 */

    //O(N) lineare Komplexität
    public void fragment01(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++;
        }
        System.out.println("Fragment 1 sum is: " + sum);
    }

    //O(N^2) quadratische Komplexität
    public void fragment02(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                sum++;
            }
        System.out.println("Fragment 2 sum is: " + sum);
    }

    //O(N^2) quadratische Komplexität
    public void fragment03(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 3 sum is: " + sum);
    }

    //O(N^2) quadratische Komplexität
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

    //O(N^3) kubische Komplexität
    public void fragment05(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 5 sum is: " + sum);
    }

    //O(N^2) quadratische Komplexität
    public void fragment06(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 6 sum is: " + sum);
    }

    //O(N^3) kubische Komplexität
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

    /*
     * * PART 2: Prime Numbers
     */

    public boolean isPrime(int n) {
        if (n <= 2)
            return (n == 2);
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
