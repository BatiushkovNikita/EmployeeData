package by.self.employee.data.interf;

import by.self.employee.data.model.Department;
import by.self.employee.data.model.Position;
import by.self.employee.data.vo.DepartmentVO;

import java.util.List;
import java.util.Set;

public interface LocalService {

    List<Department> getAllDepartments();

    List<Position> getAllPositions();
}
