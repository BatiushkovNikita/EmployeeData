package by.self.employee.data.interf;

import by.self.employee.data.model.Department;
import by.self.employee.data.vo.DepartmentVO;

import java.util.List;
import java.util.Set;

public interface Service {

    Set<Department> getAll();

    List<String> getPositionNames();
}
