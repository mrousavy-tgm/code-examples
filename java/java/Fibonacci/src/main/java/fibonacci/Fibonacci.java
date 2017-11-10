package fibonacci;

import java.math.*;

public class Fibonacci {

	public static void main(String args[]) {
		try {
			Integer n = Integer.parseInt(args[0]);

			BigInteger prepre = new BigInteger("0");
			BigInteger pre = new BigInteger("1");
			BigInteger out = new BigInteger("1");

			if (n >= 2) {
				for (int i = 3; i <= n; i++) {
					prepre = pre;
					pre = out;
					out = prepre.add(pre);
				}
				System.out.println(out);
				// System.out.println(fibonacci(n));
			} else if (n >= 0) {
				System.out.println(n);
			} else {
				System.out.println("not defined");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
