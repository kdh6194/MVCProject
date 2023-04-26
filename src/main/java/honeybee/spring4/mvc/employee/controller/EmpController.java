package honeybee.spring4.mvc.employee.controller;

import honeybee.spring4.mvc.employee.dao.EMPDAO;
import honeybee.spring4.mvc.employee.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

    private EmpService empsrv;
    @Autowired
    public EmpController(EmpService empsrv) {
        this.empsrv = empsrv;
    }

    @GetMapping("/select")
    public ModelAndView select() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("emp",empsrv.empSelect());
        mv.setViewName("employeeSelect"); // 뷰 이름 지정

        return mv;
    }


}
