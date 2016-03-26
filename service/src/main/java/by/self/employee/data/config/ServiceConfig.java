package by.self.employee.data.config;

import by.self.employee.data.impl.EmployeeServiceImpl;
import by.self.employee.data.impl.ServiceImpl;
import by.self.employee.data.interf.EmployeeService;
import by.self.employee.data.interf.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"by.self.employee.data"})
@Import(DataConfig.class)
public class ServiceConfig {

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeServiceImpl();
    }

    @Bean
    public Service service() {
        return new ServiceImpl();
    }
}
