package rs.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by rs
 */
@Getter
@Setter
@Document
public class UnitOfMeasure {

    @Id
    private String id;
    private String description;
}
