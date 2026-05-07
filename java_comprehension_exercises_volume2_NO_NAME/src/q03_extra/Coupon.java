package q03_extra;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	public Coupon() {

	}

	/**
	 * @param id
	 * @param discountRate
	 * @param description
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

	public static Coupon getInstance(int id, double discountRate, String description) {

		return new Coupon(id, discountRate, description);
	}
}
