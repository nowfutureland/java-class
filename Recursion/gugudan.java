public class Recursion5_Gugudan {
	
		static void gugudan(int level, int count) {
			if(count > 9) {
				return;
			}else {
				System.out.printf("%d * %d = %d\n", level, count, level*count);
				gugudan(level, ++count);
			}
		}

	public static void main(String[] args) {
		System.out.println("gugudan print");
		gugudan(2,1);
	}

}
