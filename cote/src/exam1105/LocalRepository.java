package exam1105;

public class LocalRepository implements MemoRepository{
	public void addMemo(String id, String body) {
		System.out.println("Pc에 메모를 저장합니다");
	}

	@Override
	public void getMemos() {
		// TODO Auto-generated method stub
		System.out.println("Pc의 메모를 조회합니다.");
	}

	@Override
	public void updateMemo(String id, String body) {
		// TODO Auto-generated method stub
		System.out.println("Pc의 메모를 삭제합니다.");
	}

	@Override
	public void deleteMemo(String id) {
		// TODO Auto-generated method stub
		System.out.println("Pc의 메모를 수정합니다.");
	}
}
