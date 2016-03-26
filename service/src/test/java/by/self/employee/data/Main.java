package by.self.employee.data;

import by.self.employee.data.config.DataConfig;
import by.self.employee.data.config.ServiceConfig;
import by.self.employee.data.interf.EmployeeService;
import by.self.employee.data.interf.Service;
import by.self.employee.data.vo.DepartmentVO;
import by.self.employee.data.vo.EmployeeVO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
        //EmployeeService bean = context.getBean(EmployeeService.class);
        Service bean = context.getBean(Service.class);

        //bean.createEmployee(new EmployeeVO("dsdsds", "sasdsdsdsasa", "QdsdsA", new DepartmentVO(1, "Chemistry")));
        //bean.deleteEmployee(1);

        List<String> positionNames = bean.getPositionNames();
        System.out.println(positionNames);


/*        List<EmployeeVO> all = bean.getAll();
        for (EmployeeVO employeeVO : all) {
            System.out.println(employeeVO);
        }*/
    }
}

























































