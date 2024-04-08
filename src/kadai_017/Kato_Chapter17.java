package kadai_017;
//親クラス
public abstract class Kato_Chapter17 {
	// フィールド(姓・名・住所)
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中の区⚪×︎";
	//共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	//個別の紹介
	abstract void eachIntroduce();
	public void  execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
