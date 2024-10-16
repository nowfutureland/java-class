package ch08;

public class Ex8_4 {

	public static void main(String[] args) {
		System.out.println("1 try블럭문 전");
		try {
			System.out.println("2 try블럭문 전");
			
			System.out.println(0/9 + "try블럭문 0/9 실행");
			System.out.println(9/0 + "try블럭문 9/0 실행");
			System.out.println("91 try블럭문 0/9 실행");
			System.out.println("92 try블럭문 0/9 실행");
			System.out.println("93 try블럭문");
			System.out.println(4); //실행되지 않는다.
		} catch (ArithmeticException ae) {
			System.out.println("4 error-catch블럭문 실행 ae");
		} catch (Exception ae) {
			System.out.println("5 error-catch블럭문 실행 ae");
		}// try-catch 끝
		
		System.out.println(9+" try블럭문 End");
	} // main메서드 끝

}
