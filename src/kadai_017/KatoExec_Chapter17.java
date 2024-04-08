package kadai_017;

public class KatoExec_Chapter17 extends KatoHanako_Chapter017 {

	public static void main(String[] args) {
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		taro.setGivenName();
		taro.execIntroduce();
		
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		ichiro.setGivenName();
		ichiro.execIntroduce();

		KatoHanako_Chapter017 hanako = new KatoHanako_Chapter017();
		hanako.setGivenName();
		hanako.execIntroduce();
	}
}
