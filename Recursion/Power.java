public class Recursion3_Power {
	
		static int Power(int base, int exponent) {
			if(exponent == 0) {
				return 1;
			}else {
				return base * Power(base, exponent-1);
			}
		}

	public static void main(String[] args) {
		final int Base = 2;
		final int Exponent = 8;
		System.out.println(Base + "의 " + Exponent + "승 = " + Power(Base,Exponent));
	}

}
