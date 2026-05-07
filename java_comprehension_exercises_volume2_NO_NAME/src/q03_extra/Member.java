package q03_extra;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private String birthday;
	private int rank;
	private List<Coupon> coupon;

	public Member() {

	}

	public Member(int id, String password, String name, String birthday) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;

		this.coupon = coupon;
	}

	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank() {
		this.rank = (int) (Math.random() * 10 % 3 + 1);

	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return coupon
	 */
	public List<Coupon> getCoupon() {
		return coupon;
	}

	/**
	 * @param coupon セットする coupon
	 */
	public void setCoupon(List<Coupon> coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + birthday + ", rank=" + rank
				+ ", coupon=" + coupon + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("************");
	}

	public static Member getInstance(int id, String password, String name, String birthday) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.format(birthday);

		Member mem1 = new Member(id, password, name, birthday);
		Coupon c1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon c2 = Coupon.getInstance(2, 0.25, "今月の特典");
		List<Coupon> coupons = new ArrayList<>();
		coupons.add(c1);
		coupons.add(c2);
		mem1.setCoupon(coupons);

		return mem1;

	}
}
