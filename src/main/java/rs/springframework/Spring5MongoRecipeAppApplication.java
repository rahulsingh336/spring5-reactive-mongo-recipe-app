package rs.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Spring5MongoRecipeAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Spring5MongoRecipeAppApplication.class, args);
		/*Flux<String> seq1 = Flux.just("foo", "bar", "foobar");
		seq1.blockFirst();
		seq1.subscribe(System.out::println);*/

		Flux.just("red", "white", "blue")
				.log()
				.map(String::toUpperCase)
				.subscribe();
		Mono.just("red").log().block();

	}
}
