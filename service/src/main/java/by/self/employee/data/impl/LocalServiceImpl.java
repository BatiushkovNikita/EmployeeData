package by.self.employee.data.impl;

import by.self.employee.data.interf.LocalService;
import by.self.employee.data.model.Department;
import by.self.employee.data.model.Position;
import by.self.employee.data.repository.DepartmentRepository;
import by.self.employee.data.repository.PositionRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;
import java.util.List;

@EnableTransactionManagement
public class LocalServiceImpl implements LocalService {

    @Inject
    private DepartmentRepository departmentRepository;

    @Inject
    private PositionRepository positionRepository;

    @Override
    public List<Department> getAllDepartments() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public List<Position> getAllPositions() {
        return (List<Position>) positionRepository.findAll();
    }
}
