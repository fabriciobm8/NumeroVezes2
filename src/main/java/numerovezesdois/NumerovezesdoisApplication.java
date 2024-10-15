package numerovezesdois;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumerovezesdoisApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumerovezesdoisApplication.class, args);
	}

}

// POST - http://localhost:8080/number
// GET ALL - http://localhost:8080/numbers
// GETBYID - http://localhost:8080/number/1
// PUT - http://localhost:8080/number/2
//DELETE - http://localhost:8080/number/4

