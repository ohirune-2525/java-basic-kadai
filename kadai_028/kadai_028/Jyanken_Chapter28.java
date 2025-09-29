package kadai_028;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	String myHand = "";//空文字
	String yourHand = "";
	String outcome;
	public String getMyChoice() {
		//入力を受け取るところまで
		  System.out.println("自分のじゃんけんの手を入力しましょう");
		  System.out.println("グーはrockのrを入力しましょう");
		  System.out.println("チョキはscissorsのsを入力しましょう");
		  System.out.println("パーはpaperのpを入力しましょう");
	      Scanner Jyanken_Chapter28_scanner = new Scanner(System.in);
	      String input= Jyanken_Chapter28_scanner.next();
	      
	      Jyanken_Chapter28_scanner.close();
	      
	      //入力値の判断
	      switch(input) {
	      	case "r" -> myHand = "r";
	      	case "s" -> myHand = "s";
	      	case "p" -> myHand = "p";
	      	default -> System.out.println("正しい手を入力してください");
	      }
	      //myHandの値を返す
	      return myHand;
	}
	
	public String getRandom() {
		int yourHandIndex;
		
		ArrayList<String> jyankenList = new ArrayList<String>();
		jyankenList.add("r");
		jyankenList.add("s");
		jyankenList.add("p");
		
		//0から2までの乱数を出力して、値をyourHandIndexに代入したい
		yourHandIndex = (int)Math.floor(Math.random() * 3);
		switch(yourHandIndex) {
			case 0 -> yourHand = "r";
			case 1 -> yourHand = "s";
			case 2 -> yourHand = "p";
		default -> System.out.println("正しい入力ではありません");
		}
		return yourHand;	
	}
	
	public void playGame() {
		int outcomeIndex;
		HashMap<String,String> jyanken;
		System.out.println("自分の手は" + myHand + ", 対戦相手の手は" + yourHand);
		jyanken = new HashMap<String,String>();
		
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		
		//じゃんけん結果が正しくないので要修正
		//勝ちと負けはパターンごとに定義要、あいこはelseで書く
		//勝ち、負けそれぞれのパターンについては条件内に&& || 使用して書く
		//outcomeIndex = myHand.compareTo(yourHand);
		if (myHand.equals("r")&yourHand.equals("r") || myHand.equals("s")&yourHand.equals("s")||myHand .equals("p")&yourHand.equals("p")) {
			System.out.println("あいこです");
		} else if (myHand .equals( "r")&yourHand .equals( "s") || myHand .equals( "s")&yourHand .equals("p")||myHand .equals("p")&yourHand.equals("r")) {
				System.out.println("自分の勝ちです");
		} else if (myHand .equals( "r")&yourHand .equals( "p") || myHand .equals( "s")&yourHand .equals("r")||myHand .equals("p")&yourHand.equals("s")){
			System.out.println("自分の負けです");
		}
	}
	
}