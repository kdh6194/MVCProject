package honeybee.spring4.mvc.employee.controller;


import honeybee.spring4.mvc.employee.dao.EMPDAOImpl;
import honeybee.spring4.mvc.employee.model.EMPV0;
import honeybee.spring4.mvc.employee.service.EmpService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
    private static final Logger logger = LogManager.getLogger(EmpController.class);
    private EmpService empsrv;
    @Autowired
    public EmpController(EmpService empsrv) {
        this.empsrv = empsrv;
    }


    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("emplist",empsrv.empSelect());
        mv.setViewName("employeeSelect"); // 뷰 이름 지정

        return mv;
    }

    @GetMapping("/select")
    public ModelAndView select(@RequestParam int empno) {
        ModelAndView mv = new ModelAndView();

            mv.addObject("emps",empsrv.empSelectOne(empno));

        mv.setViewName("emplist");

        return mv;
    }

    @GetMapping("/add")
    public String add(){

        return "emp";
    }

    @PostMapping("/add")
    public ModelAndView addok(EMPV0 emp) {
        ModelAndView mv = new ModelAndView();
        String view = "empfail";

        if(empsrv.empInsert(emp)) {
            mv.addObject("emp", emp);
            view = "redirect:/list";
        }
        mv.setViewName(view);

        return mv;
    }

    @GetMapping("/update")
    public String update() {
        return "empupdate";
    }

    @PostMapping("/update")
    public ModelAndView updateok() {
        return null;
    }

    @GetMapping("/delete")
    public String delete(int empno) {
        empsrv.empDelete(empno);

        return "redirect:/list";
    }

    @ExceptionHandler(BindException.class)
    public String typeMismatchParam(BindException ex) {
        logger.info("매개변수 오류 발생");
        logger.info(ex.getMessage());
        return "empfail";
    }
}
