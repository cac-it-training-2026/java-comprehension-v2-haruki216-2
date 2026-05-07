package q02_advanced.question03;

import java.util.List;

public class MemberManager {

	private MemberManager() {

	}

	public void ShowAllMember(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public void updatePassword(List<Member> members, int id, String password) {
		for (Member member : members) {
			if (member.getId() == id) {
				member.setPassword(password);

			}
		}
	}
}
