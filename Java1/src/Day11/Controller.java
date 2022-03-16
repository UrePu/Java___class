package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	// 0. �Խù� ����Ʈ  [ ��� �Խù��� ��� ����Ʈ ] 
	public static ArrayList<Board> boadlist = 
			new ArrayList<>();
	//2.����޼ҵ� 
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
		//1. ��üȭ [ ������ 4�� ---> 1�� ��ü]
		Board board = new Board(����, ����, �ۼ���, ��й�ȣ);
		
		boadlist.add(board);
		save();
	}
	//3.����޼ҵ�
	public static void view() {}
	//4.�����޼ҵ�
	public static boolean update(int index, String pw , String title , String cont) {
		Board temp = boadlist.get(index);
		if(temp.getPassword().equals(pw)) {
			temp.setTitle(title);
			temp.setContent(cont);
			boadlist.set(index, temp);
			save();
			return true;
		}else{return false;}
	}
	//5.�����޼ҵ� 
	public static boolean delete(int index , String pw) {
		if(boadlist.get(index).getPassword().equals(pw)) {
			boadlist.remove(index);
			save();
			return true;
		}else{return false;}
		
	}
	//6.��۾���޼ҵ� 
	public static void replywrite() {}
	//7.�Խù�����޼ҵ� 
	public static void save() {
		try {
			//1. ������� Ŭ����
			FileOutputStream outputStream = new FileOutputStream("D:/Java/�Խù�����.txt");
			//2. ���Ͽ� �ۼ��� ���� [ ���پ� = �Խù� 1���� = ��ü 1����]
			for(Board board : boadlist) {
				String �ۼ����� = board.getTitle() + ","+board.getContent() + ","+ board.getPassword() + "," + board.getWriter() + "," + board.getViewcount() + "," + board.getDate() + "\n";
				
				outputStream.write(�ۼ�����.getBytes());
			}
		} catch (Exception e) {
			System.out.println("���� ���� ����");
		}
	}
	//8.�Խù��ҷ�����޼ҵ� 
	public static void load() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/Java/�Խù�����.txt"); // 1. �����Է�Ŭ���� 
			byte[] bytes = new byte[1000]; // 2. ����Ʈ�迭 ����
			inputStream.read( bytes ); // 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ���� 
			String file = new String( bytes ); // 4. ����Ʈ -> ���ڿ� ��ȯ 
			String[] boards = file.split("\n"); // 5. ���ڿ� �ڸ��� [ ���پ� [ \n ] -> 1����ü ] 
			int i = 0;
			for( String temp : boards ) { // �迭�� ���ڿ� �ϳ��� ������ 
				if( i + 1 == boards.length) break;
				String[] field = temp.split(","); // 6. ���ڿ� �ڸ��� [ ���� [,] -> ���ʵ� ] 
				Board board = new Board( field[0], field[1],
						field[2], field[3], Integer.parseInt(field[4]),field[5], null);  // 7. ��üȭ 
										// ��ȸ���� �ʵ�� �������̹Ƿ� ���������� ����ȯ [ Integer.parseInt( ���ڿ� ) ]
				boadlist.add(board);// 8. ����Ʈ ��� 
				i++;
			}
		}catch( Exception e ) { }
		
	}
}
