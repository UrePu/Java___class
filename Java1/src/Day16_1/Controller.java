package Day16_1;

import java.util.ArrayList;

public class Controller {
	static ArrayList<Member> memberlist = new ArrayList<>();
	static String[] wordList = new String[100];
	public static boolean signin(String id, String pw, String name, String phone) {
		for(Member temp: memberlist) {
			if(temp!= null && temp.getId().equals(id)) {
				return false;
			}
		}
		Member mem = new Member(id, pw, name, phone);
		memberlist.add(mem);
		return true;
	}

	public static boolean login(String id, String pw) {
		for(Member temp: memberlist) {
			if(temp!= null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public static boolean gameStart(String id, String word) {
	
		if(wordList[0] == null) {
			wordList[0] = word;
			System.out.println("입력받은 단어: " + word);
			return true;
		}else {
			int index = -1;
			for(String temp : wordList) {
				if(temp != null) {
					index ++;
				}
				if(temp != null && temp.equals(word)) {
					return false;
				}
			}
	        char lastChar = wordList[index].charAt(wordList[index].length() - 1);
	        char firstChar = word.charAt(0);
	        if(lastChar == firstChar ) {
	        	System.out.println("입력받은 단어: " + word);
	        	wordList[index + 1] = word;
	        }else {
	        	return false;
	        }
			
		}
		return true;
	}

	public static void save(String id, int index) {
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				if(index > temp.getScore())
					temp.setScore(index);
			}
		}
		
	}

	public static void seeScore(String id) {
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
			System.out.println( temp.getScore());

			}
		}
	}
	
}
