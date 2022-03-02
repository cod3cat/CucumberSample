package awesomeCucumber.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableStepDefs {
    @Given("my credentials")
    public void myCredentials(DataTable dataTable){
        List<String> creds = dataTable.values();
        System.out.println("Username: " +creds.get(0));
        System.out.println("password: " +creds.get(1));
    }
}
