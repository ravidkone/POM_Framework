package temp;

public class demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//in a college we have students --> 35 and above they are pass and rest all failed
		//35-50 ---> pass, 50 -60 --> Second class, 60 - 70 --> First class, 70 and above distinction
		int score = 35;
		//Scanner
		if(score>=35 && score <=50) {//35>35 --> =
			System.out.println("Student is pass "+score);
		}
		else if(score>=51 && score<=60) {
			System.out.println("Student came second class "+score);
		}
		else if(score>=61 && score<=70) {
			System.out.println("Student came First class "+score);
		}
		else if(score>=70 && score<=100) {
			System.out.println("Student came Distinction "+score);
		}
		else if(score<=35) {
			System.out.println("Student came second class "+score);
		}
		else {
			System.out.println("Student Fail "+score);
			
		}
		
	}

}
