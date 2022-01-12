package atm;

public class Account {
	
	private String nic;
	private int accno;
	private String owner;
	private int balance;
	private String password;
	
	Account(){ 
		this.nic="NULL";
		this.accno=-1;
		this.owner="NULL";
		this.balance=0;
		this.password="12345";
	};
	
    Account(String nic,int accno,String owner,int balance,String password){
		this.nic=nic;
		this.accno=accno;
		this.owner=owner;
		this.balance=balance;
		this.password=password;
	}
	
	public int Getbalance(){ return balance;}
	public String GetPassword(){ return password;}
	public String GetOwner(){ return owner;}
	public int GetAccno(){ return accno;}
	public String Getnic() { return nic;}
	
	public void Setbalance(int b) { balance=b;}
	public void SetPassword(String s) { password=s;}
	public void SetOwner(String s) { this.owner=s;}
	public void SetAccNo(int acc) { accno=acc;}
	public void SetNIC(String nic) { this.nic=nic;}
	
	
}
