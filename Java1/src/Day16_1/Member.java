package Day16_1;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int score;
	
	
	public Member() {}
	
	
	
	
	
	public Member(String id, String pw, String name, String phone, int score) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.score = score;
	}
	public Member(String id2, String pw2, String name2, String phone2) {
		this.id = id2;
		this.pw = pw2;
		this.name = name2;
		this.phone = phone2;
	}





	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
