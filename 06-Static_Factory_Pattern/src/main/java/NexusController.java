import employee.service.EmployeeCrudService;
import env.CosmosDbConfig;
import env.DbConfig;
import exception.ComosDbCrudException;
import model.Employee;

public class NexusController {
    public static void main(String [] args) throws ComosDbCrudException {
        CosmosDbConfig dbConfig=new CosmosDbConfig();

        EmployeeCrudService employeeCrudService=new EmployeeCrudService(dbConfig);
        employeeCrudService.save(new Employee("fName","lName"));

    }
}
