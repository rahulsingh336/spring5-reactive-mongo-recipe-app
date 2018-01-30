package rs.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


/**
 * Created by rs
 */
@Getter
@Setter
public class Notes {

    @Id
    private String id;
    private String recipeNotes;
}
