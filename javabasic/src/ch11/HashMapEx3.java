package ch11;

import java.util.HashMap;

public class HashMapEx3 {
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
		
		printList();
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap map = (HashMap)phoneBook.get(groupName);
		group.put(tel, name); 	//이름은 중복될 수 있으니 전화번호를 key로 저장
	}
	
	//그룹을 추가하는 메서드
	static void addGroup(string groupName) {
		if(!(phoneBook.containsKey))
	}

}
