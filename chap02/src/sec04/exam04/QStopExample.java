package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int keyCode;
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;			//keyCode가 113일 경우(소문자 q) while을 중지함
			}
		}
		System.out.println("종요합니다.");
	}

}
