package exam1105;

public class MemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoRepository r;
		
		r = new LocalRepository();
		r.addMemo("1",  "Hello");
		
		r = new RemotRepository();
		r.addMemo("1", "Hello");
	}

}
