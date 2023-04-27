package honeybee.spring4.mvc.employee.service;

import honeybee.spring4.mvc.employee.model.EMPV0;

import java.util.List;

public interface EmpService {
    boolean empInsert(EMPV0 emp);
    List<EMPV0> empSelect();
    EMPV0 empSelectOne(int empno);
    boolean empUpdate(EMPV0 emp);
    boolean empDelete(int empno);
}