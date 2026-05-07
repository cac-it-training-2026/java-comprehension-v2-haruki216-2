package q03_extra;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public void showCreateUser(List<Member> members, int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				member.showMember();
			}
		}
	}

}
