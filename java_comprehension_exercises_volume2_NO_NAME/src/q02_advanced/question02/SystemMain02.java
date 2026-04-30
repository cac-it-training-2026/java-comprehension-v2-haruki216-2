package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する

		ConsoleReader con = new ConsoleReader();
		Member m1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(m1);
		members.add(m2);
		System.out.println("会員情報を表示します");
		MemberManager.showAllMembers(members);

		System.out.println("***********");
		int i = 0;
		String str = "";
		try {
			System.out.println("===パスワードを変更します＝＝＝");
			System.out.println("input target id>>");
			i = con.inputNumber();
			System.out.println("input new password>");
			str = con.inputString();

		} catch (IOException | NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();

		}

		System.out.println("---SHOW DATA---");

		MemberManager.updatePassword(members, i, str);

		MemberManager.showAllMembers(members);
	}
}
