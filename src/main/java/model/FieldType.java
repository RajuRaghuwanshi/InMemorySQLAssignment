package model;

import lombok.Data;

/**
 * @author rajuraghuwanshi
 */
@Data
public abstract class FieldType<T> {
    private T value;

}
