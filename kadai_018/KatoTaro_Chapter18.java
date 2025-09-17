package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public void setGivenName(){
		//KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		//5行目不要。Execeをnewすることで実体を生成するため、ここでは型の定義だけでOK
		//thisはクラス自体のフィールド変数。"this"はクラス(継承元の親クラス)で定義したフィールド変数を指す
		this.givenName = "太郎";
	}
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
