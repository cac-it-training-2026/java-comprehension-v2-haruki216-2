package q01_basic.question04;

class Member {
	//TODO ここから実装する

	int id;
	String password;
	String name;
	int age;
	int rank;

	public Member() {

	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
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

	public void showMember() {

		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("pssword:" + password);
		System.out.println("name:" + name);
		System.out.println("age" + age);
		System.out.println("rank:" + rank);
		System.out.println("******************");

	}

}
