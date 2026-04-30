package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する

		NonMember non = new NonMember("Sato Kensuke");

		members[0] = non;

		Member member = new Member(1, "PassOrd", "Miura Manabu", 28, 2);
		members[1] = member;

		MemberManager.showAllMembers(members);

		non.buyItem();
		member.buyItem();

	}

}
