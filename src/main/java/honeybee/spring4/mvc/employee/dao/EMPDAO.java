package honeybee.spring4.mvc.employee.dao;

import honeybee.spring4.mvc.employee.model.EMPV0;

import java.util.List;

public interface EMPDAO {
    int insertEmp(EMPV0 emp);
    List<EMPV0> selectEmp();
    EMPV0 selectOneEmp(int empno);
    int updateEmp(EMPV0 emp);
    int deleteEmp(int empno);

}