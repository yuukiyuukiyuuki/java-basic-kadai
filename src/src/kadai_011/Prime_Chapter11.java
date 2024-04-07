package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// 配列を作成し、初期化
		boolean[] numberArray = new boolean[101];
		for( int i = 2; i < 101; i++) {
			numberArray[i] =  true;
		}
		
		for(int number = 2; number <= 100; number++) {
			//素数の時
			if(numberArray[number]) {
				System.out.println(number);
			}
			//素数でない時
			for(int noNumber = number * 2; noNumber <= 100; noNumber += number) {
				numberArray[noNumber] = false;
			}
		}
		
		
	}

}
