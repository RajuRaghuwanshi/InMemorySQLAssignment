package model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author rajuraghuwanshi
 */
@Data
@Builder
public class Field<T> {
    private String name;
    private FieldType<T> fieldType;
    private List<Constraint> constraints;

    boolean isValid() {
        return true;
    }

}
