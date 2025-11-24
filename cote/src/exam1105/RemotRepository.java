package exam1105;

public class RemotRepository implements MemoRepository{

	@Override
	public void addMemo(String id, String body) {
		// TODO Auto-generated method stub
		System.out.println("원격서버에 메모를 저장합니다.");
	}

	@Override
	public void getMemos() {
		// TODO Auto-generated method stub
		System.out.println("원격서버의 메모를 조회합니다.");
	}

	@Override
	public void updateMemo(String id, String body) {
		// TODO Auto-generated method stub
		System.out.println("원격서버의 메모를 삭제합니다.");
	}

	@Override
	public void deleteMemo(String id) {
		// TODO Auto-generated method stub
		System.out.println("원격서버의 메모를 수정합니다.");
	}
	
}
