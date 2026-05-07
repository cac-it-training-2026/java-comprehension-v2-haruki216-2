package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetid, String newpassword) {
		for (Member member : members) {
			boolean found = false;

			if (member.getId() == targetid) {
				member.setPassword(newpassword);
				found = true;
				break;
			}
			if (!found) {
				System.out.println("該当者はいませんでした。");
			}
		}

	}

}
