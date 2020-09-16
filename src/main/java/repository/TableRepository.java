package repository;

import exception.NotFoundException;
import lombok.NonNull;
import model.Field;
import model.Table;
import sun.tools.jconsole.Tab;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rajuraghuwanshi
 */
public class TableRepository {

    Map<String, Table> tableSchema;

    private static TableRepository tableRepository;

    private TableRepository() {
        tableSchema = new HashMap<>();
    }

    public static TableRepository getInstance() {

        if (tableRepository == null) {
            tableRepository = new TableRepository();
        }
        return tableRepository;
    }

    public boolean createTable(String tableName, List<Field> fields) {

        validateTableSchema(tableName, fields);

        Table table = new Table(tableName, fields);

        this.tableSchema.put(tableName, table);

        return true;
    }

    public Table deleteTable(String tableName) {
        if (tableSchema.containsKey(tableName)) {
            return tableSchema.remove(tableName);
        }
        throw new NotFoundException("TABLE NAME NOT FOUND");
    }


    public Table getTableSchema(@NonNull String tableName) {

        if (tableSchema.containsKey(tableName)) {
            return tableSchema.get(tableName);
        }
        throw new NotFoundException("TABLE NAME NOT FOUND");
    }

    private boolean validateTableSchema(String tableName, List<Field> fields) {
        if (tableName == null || tableName.trim().length() == 0) {
            throw new RuntimeException("TABLE NAME CAN NOT BE NULL OR EMPTY");
        }
        if (fields == null || fields.isEmpty()) {
            throw new RuntimeException("NUMBER OF FIELDS SHOULD BE >=1");
        }

        if (tableSchema.containsKey(tableName)) {
            throw new RuntimeException("table name already exists");
        }

        return true;
    }


}
