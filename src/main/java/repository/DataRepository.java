package repository;

import lombok.NonNull;
import model.Field;
import model.Table;
import model.TableRow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rajuraghuwanshi
 */
public class DataRepository {

    private Map<String, List<TableRow>> data;
    private TableRepository tableRepository;

    private static DataRepository dataRepository;


    private DataRepository() {
        data = new HashMap<>();
        tableRepository = TableRepository.getInstance();
    }

    public DataRepository getInstance() {

        if (dataRepository == null) {
            dataRepository = new DataRepository();
        }
        return dataRepository;
    }


    public boolean insertData(String tableName, TableRow tableRow) {

        //apply validation

        final Table tableSchema = tableRepository.getTableSchema(tableName);

        if (data.containsKey(tableName)) {
            data.get(tableName).add(tableRow);
        } else {
            data.put(tableName, Arrays.asList(tableRow));
        }

        return true;
    }


    public List<TableRow> getAllTableData(String tableName) {
        return null;
    }
}
