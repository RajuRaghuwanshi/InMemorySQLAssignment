package model;

import lombok.Data;

import java.util.Map;

/**
 * @author rajuraghuwanshi
 */
@Data
public class TableRow {

    private String tableName;
    private Map<String, FieldType> dataMap;

    public TableRow(String tableName) {
        this.tableName = tableName;
    }
}
