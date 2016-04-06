package by.self.employee.data.interf;

import by.self.employee.data.vo.EmployeeVO;
import org.springframework.data.annotation.Id;

import java.util.List;

public interface EmployeeService {

    List<EmployeeVO> getAll();

    void createEmployee(EmployeeVO employeeVO);

    void deleteEmployee(Integer id);

}
