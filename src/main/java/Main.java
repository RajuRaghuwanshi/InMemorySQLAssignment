import model.*;
import repository.TableRepository;
import sun.tools.jconsole.Tab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rajuraghuwanshi
 */
public class Main {

    public static void main(String[] args) {

        TableRepository tableRepository = TableRepository.getInstance();

        List<Field> fields = new ArrayList<>();
        Field nameField = Field.builder().name("Name")
                               .fieldType(new StringFieldType())
                               .constraints(Arrays.asList(new NotNullConstraint()))
                               .build();

        //throw Exception:Exception in thread "main" java.lang.RuntimeException: NUMBER OF FIELDS SHOULD BE >=1
        //tableRepository.createTable("User", fields);
        //System.out.println(tableRepository.getTableSchema("User"));


        fields.add(nameField);

        Field ageField = Field.builder().name("Age")
                              .fieldType(new IntegerFieldType())
                              .constraints(Arrays.asList(new NotNullConstraint()))
                              .build();

        fields.add(ageField);
        tableRepository.createTable("User", fields);

        System.out.println(tableRepository.getTableSchema("User"));


        //Exception in thread "main" exception.NotFoundException: TABLE NAME NOT FOUND
        //tableRepository.deleteTable("user");

        Table deletedTable = tableRepository.deleteTable("User");
        System.out.println("DELETED TABLE SCHEMA:");
        System.out.println(deletedTable);




        TableRow tableRow = new TableRow("User");


//
//
//        for (Field field : table.getFields()) {
//            tableRow.getDataMap().put(field.getName(), field.getFieldType().getValue();)
//        }

    }


}
