package by.self.employee.data.impl;

import by.self.employee.data.interf.Service;
import by.self.employee.data.model.Department;
import by.self.employee.data.repository.DepartmentRepository;
import by.self.employee.data.repository.EmployeeRepository;
import by.self.employee.data.vo.DepartmentVO;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;
import java.util.List;
import java.util.Set;

@EnableTransactionManagement
public class ServiceImpl implements Service{

    @Inject
    private EmployeeRepository employeeRepository;

    @Inject
    private DepartmentRepository departmentRepository;

    @Override
    public Set<Department> getAll() {
        return (Set<Department>) departmentRepository.findAll();
    }

    @Override
    public List<String> getPositionNames() {
        return employeeRepository.getEmployeePositions();
    }
}
