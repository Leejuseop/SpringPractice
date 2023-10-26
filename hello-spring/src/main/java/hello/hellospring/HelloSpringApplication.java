package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

		회원레포지토리 테스트 케이스 작성 부터 보면 된다잉 그리고 MemoryMemeberRepository 클래스에 오버라이딩한 메서드 중에 fingByName이거 람다식 이용해서 구현했으니깐 람다식부터 공부하도록.
	}

}
