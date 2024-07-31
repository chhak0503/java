package shop.vo;

public class CustomerVO {
	private String custId;
	private String name;
	private String hp;
	private String addr;
	private String rdate;
	
	public CustomerVO() {
	}
	
	public CustomerVO(String custId, String name, String hp, String addr, String rdate) {
		this.custId = custId;
		this.name = name;
		this.hp = hp;
		this.addr = addr;
		this.rdate = rdate;
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [custId=" + custId + ", name=" + name + ", hp=" + hp + ", addr=" + addr + ", rdate=" + rdate
				+ "]";
	}

}
