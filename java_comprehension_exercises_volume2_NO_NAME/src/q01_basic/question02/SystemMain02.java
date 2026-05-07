package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member member1 = new Member();
		member1.setName("Miura Manabu");
		member1.setAge(30);
		member1.setRank(1);

		member1.showMember();
		System.out.println(">>>RANK UP>>>");
		System.out.println("---GET RANK---");
		member1.rankUp();
		System.out.println("newRank:" + member1.getRank());
	}
}
