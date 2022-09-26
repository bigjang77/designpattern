package adapter.ex01;

//고객이 클레임이 들어오면, 
//사과 이메일을 보내기,
//이메일 답장을 DB 저장하기
public class CustomerService {
	
	//private Email email;이메일 라이브러리가 아직 덜만들어짐
	private EmailSend email;
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}

	public void acceptClaim(String msg) {
		// 1. 클레임 받기
		String acceptMsg = msg;
		System.out.println("클레임 내용 : "+acceptMsg);
		// 2.이메일 보내기(x) 하나의 클래스는 하나의 책임만
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();//이메일 라이브러리가 없어서 작동이 안됨
		resultEmail(result);
	}
	
	public void resultEmail(String result) {
		System.out.println("답장을 디비에 저장했습니다 :"+result);
	}
}
