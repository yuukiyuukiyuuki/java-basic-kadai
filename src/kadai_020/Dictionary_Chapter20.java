package kadai_020;
import java.util.HashMap;


public class Dictionary_Chapter20 {

	 private HashMap<String, String> fruitAry;
	//辞書に単語と意味を追加
	 public Dictionary_Chapter20() {
		fruitAry = new HashMap<>();
		fruitAry.put("apple", "りんご");
        fruitAry.put("peach", "桃");
        fruitAry.put("banana", "バナナ");
        fruitAry.put("lemon", "レモン");
        fruitAry.put("pear", "梨");
        fruitAry.put("kiwi", "キウィ");
        fruitAry.put("strawberry", "いちご");
        fruitAry.put("grape", "ぶどう");
        fruitAry.put("muscat", "マスカット");
        fruitAry.put("cherry", "さくらんぼ");
	}
	//辞書で調べる
	public String seach(String word) {
		if (fruitAry.containsKey(word)) {
			return fruitAry.get(word);
		} else {
			return "辞書にありません";
		}
	}

}
