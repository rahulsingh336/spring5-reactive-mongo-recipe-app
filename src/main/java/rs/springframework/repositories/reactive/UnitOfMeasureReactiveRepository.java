package rs.springframework.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import rs.springframework.domain.UnitOfMeasure;
import reactor.core.publisher.Mono;

/**
 * Created by rs on 1/30/2018.
 */
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}