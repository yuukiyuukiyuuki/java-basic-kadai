package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
        Dictionary_Chapter20 fruitAry = new Dictionary_Chapter20();
        String[] wordsLook = {"apple", "banana", "grape", "orange"};

        for (String word : wordsLook) {
            String meaning = fruitAry.seach(word);
            System.out.println(word + "の意味は" + meaning);
        }
    }
}
