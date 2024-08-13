package tire;

public class Tire {

		//필드
	public int maxRotatiton; 		//최대 회전수(최대 수명)
	public int accumulatedRotation; //누적 회전수
	//static int accumulatedRotation; //누적 회전수
	public String location; 		//타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotatiton) {
		this.location = location;
		this.maxRotatiton = maxRotatiton;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		//타이어 펑크 여부 판단
		if(accumulatedRotation <  maxRotatiton ) {
			System.out.println(location +" Tire 수명: " +
								(maxRotatiton - accumulatedRotation) + "회"); //타이어 수명
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***" );
			return false;
		}
	}
}
