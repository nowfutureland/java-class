package a_java_test;

import java.util.Scanner;

class People {
	private String name; //성명
	private int kor;	 //국어
	private int eng;	 //영어
	private int math;	 //수학
	private int sum;	 //합계
	private double avg;	 //평균
	private int rank;	 //석차
	
	void setName(String name) {
		this.name = name;
	}
	void setKor(int kor) {
		this.kor = kor;
	}
	void setEng(int eng) {
		this.eng = eng;
	}
	
	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getMath() {
		return math;
	}
	int getSum() {
		return this.getKor() + this.getEng() + this.getMath();
	}
	double getAvg() {
		return (double) this.getSum() / 3;
	}
	int getRank() {
		return rank;
	}
	void setMath(int math) {
		this.math = math;
	}
	void setSum(int sum) {
		this.sum = sum;
	}
	void setAvg(double avg) {
		this.avg = avg;
	}
	void setRank(int rank) {
		this.rank = rank;
	}
	
	void printScore() {
		System.out.printf("%s, %3d, %3d, %3d, %3d, %3.2f, %3d \n",
		this.getName(), this.getKor(),this.getEng(), this.getMath(),this.getSum(),this.getAvg(),this.getRank());
	}
	
}

public class GradePeople {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("몇명의 성적처리를 하나요(숫자입력)?");
		int num = input.nextInt();
		
		//객체배열 선언(성적처리 인원)
		People stu[] = new People[num];
		
		//객체배열 초기화 (중요)
		for(int i=0; i<stu.length; i++) {
			stu[i] = new People();
		}
		
		//키보드 데이터 입력	
		for(int i=0; i<stu.length; i++) {
			System.out.print("성명을 입력하세요");
			stu[i].setName(input.next());
			
			System.out.print("국어점수를 입력하세요");
			stu[i].setKor(input.nextInt());
			System.out.print("영어점수를 입력하세요");
			stu[i].setEng(input.nextInt());
			System.out.print("수학점수를 입력하세요");
			stu[i].setMath(input.nextInt());
		}
		
		//석차 처리
		for(int i=0; i<stu.length; i++) {
			int rank = 1;
			for(int j=0; j<stu.length; j++) {
				if(stu[i].getSum() < stu[j].getSum()) rank++;
			}
			stu[i].setRank(rank);			
		}
		
		//출력
		System.out.println("===============출력===============");
		System.out.printf("%3s %3s %3s %3s  %3s  %3s %4s \n",
					"성명","국어","영어","수학","합계","평균","석차");
		
		for(int i=0; i<stu.length; i++) {
			stu[i].printScore();
		}
		
	}

}
