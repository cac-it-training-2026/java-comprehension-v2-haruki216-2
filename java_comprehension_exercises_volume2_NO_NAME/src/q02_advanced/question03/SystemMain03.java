package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		System.out.println("ログイン情報を入力してください");

		ConsoleReader con = new ConsoleReader();
		MemberStorage mem = new MemberStorage();
		//Memberオブジェトのリストを渡している
		LoginService log = new LoginService(mem);

		Member member = null;

		while (member == null) {
			try {
				System.out.print("ID: ");
				int input = con.inputNum();

				System.out.print("パスワード: ");
				String str = con.inputString();

				//入力した値をメソッドに入れて判定
				member = log.doLogin(input, str);

				//当てはまるものがあるか判定
				if (member == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
					continue;
				} else {
					System.out.println("ログインに成功しました");
				}

			} catch (NumberFormatException e) {
				System.out.println("不正な値です");
			} catch (IOException e) {

			}
		}

		System.out.println("ログイン情報を表示します");
		System.out.println(member);
	}
}
