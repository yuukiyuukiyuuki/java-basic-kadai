package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	//自分のじゃんけんの手
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		// Scannerクラスの生成
		Scanner scanner = new Scanner(System.in);

		// 入力内容の取得
		String input = scanner.nextLine();

		// じゃんけんの手を判定
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			//scanner.close();
		} else {
			System.out.println("じゃんけんの手ではありません。再入力してください。");
		}
		return input;
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] rspArray = { "r", "s", "p" };
		String random = rspArray[(int) Math.floor(Math.random() * 3)];
		return random;
	}

	// じゃんけんメソッド
	public void playGame() {
		HashMap<String, String> type = new HashMap<String, String>();

		type.put("r", "グー");
		type.put("s", "チョキ");
		type.put("p", "パー");

		// 自分と対戦相手のじゃんけんの手を取得
		String myChoice = getMyChoice();
		String choice = getRandom();

		System.out.println("自分の手は" + type.get("r") + "," + "対戦相手の手は" + type.get("p"));

		// 自分と対戦相手のじゃんけんの手の比較
		if (myChoice.equals(choice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && choice.equals("s")) || (myChoice.equals("s")
				&& choice.equals("p")) || (myChoice.equals("p") && choice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
		
	}
}
