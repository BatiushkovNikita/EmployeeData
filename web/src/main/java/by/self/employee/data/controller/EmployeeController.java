package by.self.employee.data.controller;

import by.self.employee.data.interf.EmployeeService;
import by.self.employee.data.interf.LocalService;
import by.self.employee.data.vo.EmployeeVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class EmployeeController {

    @Inject
    private EmployeeService employeeService;

    @Inject
    private LocalService localService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String viewEmployees(Model model) {
        model.addAttribute("employeesParam", employeeService.getAll());
        EmployeeVO employee = new EmployeeVO();
        model.addAttribute("employeeParam", employee);
        model.addAttribute("positionsParam", localService.getAllPositions());
        model.addAttribute("departmentsParam", localService.getAllDepartments());
        return "/employees";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employeeParam") EmployeeVO employeeVO) {
        employeeService.createEmployee(employeeVO);
        return "redirect:/employees";
    }

    @RequestMapping(value = "{employeeId}/delete", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "redirect:/employees";
    }
}
