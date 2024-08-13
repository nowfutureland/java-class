package tire;

public class KumhoTire extends Tire{

	//필드
	//생성자
	public KumhoTire(String location, int maxRotatiton) {
		super(location, maxRotatiton); //부모 클래스(Tire) 생성자 호출
	}
	//메소드
	//@Override
	public boolean roll() {
		++accumulatedRotation;
		//타이어 펑크 여부 판단
		if(accumulatedRotation < maxRotatiton ) {
			System.out.println(location +" KumhoTire 수명: " +
								(maxRotatiton - accumulatedRotation) + "회"); //타이어 수명
			return true;
		}else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***" );
			return false;
		}
	}
}
