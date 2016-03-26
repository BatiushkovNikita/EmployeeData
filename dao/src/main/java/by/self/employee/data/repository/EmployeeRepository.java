package by.self.employee.data.repository;

import by.self.employee.data.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("select distinct e.position from Employee e")
    List<String> getEmployeePositions();
}
