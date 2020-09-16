package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

/**
 * @author rajuraghuwanshi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private String tableName;
    private List<Field> fields;
}
