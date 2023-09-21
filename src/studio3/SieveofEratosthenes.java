package studio3;

public class SieveofEratosthenes {

	public static void main1(String[] args) {
		int x, y, prime;
		
		System.out.println("All the prime numbers: ");
		
		for (x = 1; x <=intN; x++) {
			
			if (x == 1 || x == 0)
				continue;
			prime = 1;
			
			for (y = 2; y <= x / 2; ++y) {
				if (x%y == 0) {
					prime = 0;
					break;
				}
			}
			
			if (prime == 1)
				System.out.print(x + "");
			
		}
	}
	
	public static void main(String[] args)
	{
		int N = 10000;
		
		prime_N(N);
		
	}
}
	}
		}