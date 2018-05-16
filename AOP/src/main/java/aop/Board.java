package aop;

import java.util.ArrayList;

public class Board {

	public ArrayList<String> getList(){
		System.out.println("게시물 리스트를 가져온다.");
		return new ArrayList<String>();
	}
	public void insert(int id){
		System.out.println(id+"번쨰 게시물을 저장합ㄴ.ㄷ.ㅏ");
		
	}
//	Member class의 핵심 로직은 getList/insert
//	AOP 공통 로직으로서 시간을 추가적으로 출력해보자.
}
