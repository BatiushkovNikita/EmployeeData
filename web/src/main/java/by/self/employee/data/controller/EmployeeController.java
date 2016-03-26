package by.self.employee.data.controller;

import by.self.employee.data.interf.EmployeeService;
import by.self.employee.data.vo.EmployeeVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.*;

@Controller
public class EmployeeController {

    private Logger Log = LogManager.getLogger(EmployeeController.class.getName());

    @Inject
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String viewEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAll());

        EmployeeVO employee = new EmployeeVO();
        model.addAttribute("employeeParam", employee);

        return "/employees";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employeeParam") EmployeeVO employeeVO) {
        //status.setComplete();
        try {
            employeeService.createEmployee(employeeVO);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "/employees";
    }

    @RequestMapping(value = "{employeeId}/delete", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "redirect:/employees";
    }

/*    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
    public ModelAndView creteEmployee(@ModelAttribute("newsVOParam") NewsVO newsVO,
                                   BindingResult result, SessionStatus status,
                                   @AuthenticationPrincipal UserVO userVO) {
        newsValidator.validate(newsVO, result);
        if (result.hasErrors()) {
            Log.error(result.getAllErrors());
            List<TagVO> tagsVO = tagLocalService.getAllTags();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("addnews");
            modelAndView.addObject("newsVOParam", newsVO);
            modelAndView.addObject("tagsVOParam", tagsVO);
            return modelAndView;
        } else {
            status.setComplete();
            newsVO.setUserId(userVO.getId());
            newsLocalService.addNews(newsVO);
        }
        return new ModelAndView("redirect:/newsfeed", "newsVOParam", newsVO);
    }*/



}
