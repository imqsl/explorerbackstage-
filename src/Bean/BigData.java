package Bean;

public class BigData {
String name;
String sex;
String phonenum;
String qqnum;
String email;
String wechat;
String alipay;
String jd;
String badiu;
	public BigData() {
	
	}
	
	public BigData(String name, String sex, String phonenum, String qqnum, String email, String wechat, String alipay,
			String jd, String badiu) {
		super();
		this.name = name;
		this.sex = sex;
		this.phonenum = phonenum;
		this.qqnum = qqnum;
		this.email = email;
		this.wechat = wechat;
		this.alipay = alipay;
		this.jd = jd;
		this.badiu = badiu;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getQqnum() {
		return qqnum;
	}
	public void setQqnum(String qqnum) {
		this.qqnum = qqnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getAlipay() {
		return alipay;
	}
	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}
	public String getJd() {
		return jd;
	}
	public void setJd(String jd) {
		this.jd = jd;
	}
	public String getBadiu() {
		return badiu;
	}
	public void setBadiu(String badiu) {
		this.badiu = badiu;
	}
	@Override
	public String toString() {
		return "BIgData [name=" + name + ", sex=" + sex + ", phonenum=" + phonenum + ", qqnum=" + qqnum + ", email="
				+ email + ", wechat=" + wechat + ", alipay=" + alipay + ", jd=" + jd + ", badiu=" + badiu + "]";
	}

}
