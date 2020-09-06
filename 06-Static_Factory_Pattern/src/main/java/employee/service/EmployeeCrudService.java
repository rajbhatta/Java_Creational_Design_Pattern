package employee.service;

import com.azure.cosmos.CosmosClient;
import dbutil.CosmosDBConFactory;
import env.CosmosDbConfig;
import exception.ComosDbCrudException;
import model.Employee;

import java.util.List;

public class EmployeeCrudService implements Crud<Employee> {

    public CosmosDbConfig cosmosDbConfig;
    public CosmosClient cosmosClient;

    public EmployeeCrudService(CosmosDbConfig cosmosDbConfig) {
        this.cosmosDbConfig = cosmosDbConfig;
        cosmosClient= CosmosDBConFactory.getConnection(cosmosDbConfig.getHost(),cosmosDbConfig.getKey());
    }

    public void save(Employee employee) throws ComosDbCrudException {
        //TODO: Persist data here
    }

    public List<Employee> get() throws ComosDbCrudException {
        //TODO: list data here
        return null;
    }

    public Employee getById(int id) throws ComosDbCrudException {
        //TODO: get Employee data here
        return null;
    }

    public void delete() throws ComosDbCrudException {
        //TODO: delete data here
    }
}
