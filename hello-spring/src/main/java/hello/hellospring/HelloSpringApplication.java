package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		
		스프링 통합 테스트부터 보면 된다잉
		config오류는 뭔지 모르겠는데 안 고쳐도될것같고(문제되면 주석처리해버랴도 될거같음)
		JdbcMemberRepository오류는 그 이제 복붙한거라 뒷부분에 아직 안만들 클래스를 import해놔서 생긴 오류니깐 알아둬

		https://www.inflearn.com/questions/489733/h2-%EC%84%A4%EC%B9%98-%EA%B4%80%EB%A0%A8 이거 함 봐보고
	}

}
