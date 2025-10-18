package foo.anirudh.rvcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RvcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RvcsApplication.class, args);
	}

}
