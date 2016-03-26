package by.self.employee.data.impl;

import by.self.employee.data.interf.EmployeeService;
import by.self.employee.data.model.Department;
import by.self.employee.data.model.Employee;
import by.self.employee.data.repository.EmployeeRepository;
import by.self.employee.data.vo.DepartmentVO;
import by.self.employee.data.vo.EmployeeVO;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService {

    @Inject
    private EmployeeRepository employeeRepository;


    @Override
    @Transactional(readOnly = true)
    public List<EmployeeVO> getAll() {
        return extractAllEmployee((List<Employee>) employeeRepository.findAll());
    }

    @Override
    @Transactional
    public void createEmployee(EmployeeVO employeeVO) {
        if (employeeVO != null) {
            employeeRepository.save(extractEmployee(employeeVO));
        }
    }

    @Override
    @Transactional
    public void deleteEmployee(Integer id) {
        if (id != null) {
            employeeRepository.delete(id);
        }
    }

    private List<EmployeeVO> extractAllEmployee(List<Employee> employees) {
        List<EmployeeVO> employeeVOs = new ArrayList<>();
        for (Employee employee : employees) {
            employeeVOs.add(extractEmployeeVO(employee));
        }
        return employeeVOs;
    }

    private Employee extractEmployee(EmployeeVO employeeVO) {
        Employee employee = new Employee();
        employee.setFirstName(employeeVO.getFirstName());
        employee.setLastName(employeeVO.getLastName());
        employee.setPosition(employeeVO.getPosition());
        //employee.setDepartmentId(employeeVO.getDepartment().getId());
        employee.setDepartment(extractDepartment(employeeVO));
        return employee;
    }

    private EmployeeVO extractEmployeeVO(Employee employee) {
        EmployeeVO employeeVO = new EmployeeVO();
        employeeVO.setId(employee.getId());
        employeeVO.setFirstName(employee.getFirstName());
        employeeVO.setLastName(employee.getLastName());
        employeeVO.setPosition(employee.getPosition());
        //employeeVO.setDepartmentName();
        return employeeVO;
    }

    private  Department extractDepartment(EmployeeVO employeeVO) {
        Department department = new Department();
        //department.setName(employeeVO.getDepartment().getName());
        return department;
    }
}
