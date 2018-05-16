package aop;

public class Member {

	public Boolean login(String id){
		System.out.println(id+"회원님 로그인 하셨씁니다.");
		return true;
	}
	public Boolean logout(){
		System.out.println("회원님 로그아웃 하셨씁니다.");
		return false;
	}
//	Member class의 핵심 로직은 login/logout
//	AOP 공통 로직으로서 접속시간을 추가적으로 출력해보자.
}
