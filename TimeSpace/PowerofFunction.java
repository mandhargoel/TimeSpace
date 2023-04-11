package TimeSpace;

public class PowerofFunction {

	public static void main(String[] args) {
		System.out.println(Power(2, 5));

	}
	public static int Power(int x,int n) {
		if(n==0) {
			return 1;
		}
		
		int pnb2=Power(x, n/2);
		if(n%2==1) {
			return	pnb2*pnb2*x;
		}else {
			return pnb2*pnb2;
		}
	}

}
