package kadai_021;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	//定義したメソッド外からも参照したいのであれば、dictionaryをフィールド変数として定義する必要がある→とフィールド変数dictionaryはクラス全体から参照できる
	HashMap<String,String> dictionary;
	
	//コンストラクタとして実装※クラス名と同じメソッド名
	public Dictionary_Chapter21() { 
		//この書き方だとHashMapの実体がない場合エラーになってしまうので、dictionary自体をコンストラクタとして生成した方がよい
		dictionary = new HashMap<String,String>();
		
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");	
	}
	
	//指定の単語が辞書に登録されているかを調べるメソッド
	public void lookForDictionary() {
		//調べたい単語のListを作成
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("grape");
		wordList.add("orange");
		//Listの要素数を取得
		int size = wordList.size();
		
		//Listの要素数だけ処理を繰り返し
		for (int i=0; i<size; i++){
			
			//Listの要素を順に取り出して変数wordに代入したい
			//どこが違うのかわからない★
			String word = wordList.get(i);
			
			//dictionaryがdefineDictionaryメソッド内にあるので参照できてない★		
			if (dictionary.containsKey(word)) {
				 System.out.println(word + "の意味は"+ dictionary.get(word));
			}
			else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}
