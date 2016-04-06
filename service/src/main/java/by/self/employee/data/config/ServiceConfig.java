package by.self.employee.data.config;

import by.self.employee.data.impl.EmployeeServiceImpl;
import by.self.employee.data.impl.LocalServiceImpl;
import by.self.employee.data.interf.EmployeeService;
import by.self.employee.data.interf.LocalService;
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
    public LocalService localService() {
        return new LocalServiceImpl();
    }
}
