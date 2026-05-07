package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
public class LoginService {

	private MemberStorage memberStorage;

	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {

		for (Member member : memberStorage.getMembers()) {

			if (member.getId() == id && member.getPassword().equals(password)) {
				//return文を書けばbreak必要なし
				return member;
			}
		}

		return null;
	}
}