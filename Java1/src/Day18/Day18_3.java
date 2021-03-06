package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		// p.731~732 : LinkedList 適掘什 
		//				ArrayList 			vs  	LinkedList
		//			  		壕伸						   元滴 
		// 鎧採姥繕託戚   昔畿什奄層生稽 五乞軒尻衣[搭]		辞稽 陥献 五乞軒爽社 尻衣 
		//	紗亀
		//	add[蓄亜]			匙硯	
		//  add[諮脊=掻娃]									匙硯
		//	伊事				匙硯				
		//  肢薦											匙硯
		/*	
		 * 				けけけけけけけけけけ				け			け
		 * 													け
		 * 												け
		 */
		
		// 1. Arraylist 梓端 識情 [ 薦革遣 : String ]
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList 梓端 識情 [ 薦革遣 : String ] 
		LinkedList<String> list2 = new LinkedList<>();
		// 3.獣娃痕呪
		Long starttime; // 獣拙 獣娃 
		Long endtime;	// 魁蟹澗 獣娃
		// 4. arraylist梓端拭 10000鯵 梓端研 諮脊馬澗汽 杏軒澗獣娃  端滴
			 starttime = System.nanoTime();	// 薄仙 獣娃研 蟹葛獣娃 稽 硲窒
		for( int i =0 ; i<10000 ; i++  ) {
			list1.add( 0 ,  i+"" );	// 舛呪伸->庚切伸 痕発 : 1. String.valueOf(舛呪) 2.舛呪+""
									// 庚切伸->舛呪伸 痕発 : 1. Integer.parseInt( 庚切伸 )
		}
			endtime = System.nanoTime(); // 蟹葛段 = 10常/1段
		System.out.println(" Arraylist亜 10000鯵 諮脊馬澗汽 杏軒澗 獣娃 : " + ( endtime-starttime)+"ns" );
		// 5. LinkedList 梓端拭 10000鯵 梓端研 諮脊馬澗汽 杏軒澗 獣娃 端滴 
			starttime = System.nanoTime();
		for( int i = 0 ; i<10000 ; i++ ) {
			list2.add( 0 ,  i+"");
		}
			endtime = System.nanoTime();
		System.out.println(" LinkedList亜 10000鯵 諮脊馬澗汽 杏軒澗 獣娃 : " +( endtime-starttime)+"ns"  );
		
		
		
	}

}





