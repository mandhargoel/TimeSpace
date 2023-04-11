package TimeSpace;

import java.util.Arrays;
import java.util.Scanner;

public class SOE {

	public static void main(String[] args) {
		// Sieve of Eratosthenis
		//prime numbers upto n limit
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		SOEforPRIME(n);

	}
	
	public static void SOEforPRIME(int n) {
		boolean[] primes = new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for(int table=2; table*table<=n;table++) {
			if (primes[table]==false){
				continue;
			}
			for(int mult=2;table*mult<=n;mult++) {
				primes[table*mult]=false;
			}
		}
		for(int i=0; i<primes.length;i++) {
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}

}
