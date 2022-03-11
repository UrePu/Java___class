package Day08;

public class Loan {
	String loanName; 	// 상품명
	int loanAmount;		//액수
	double loanInterest;
	String loanPerson;
	boolean loanRe;

	//상품 (상품명,액수,"0")
	//빌려간사람(상품명, 액수, members.id)
	public Loan(){};
	public Loan(String loanName, int loanAmount) {
		this.loanAmount = loanAmount;
		this.loanName = loanName;
	}
}
