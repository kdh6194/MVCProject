package honeybee.spring4.mvc.employee.service;

import honeybee.spring4.mvc.employee.dao.EMPDAO;
import honeybee.spring4.mvc.employee.dao.EMPDAOImpl;
import honeybee.spring4.mvc.employee.model.EMPV0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empsrv")
public class EmpServiceImpl implements EmpService {
    private static final Logger logger = LogManager.getLogger(EmpServiceImpl.class);
    private EMPDAO empdao = null;
    @Autowired
    public EmpServiceImpl(EMPDAO empdao) {
        this.empdao = empdao;
    }

    @Override
    public boolean empInsert(EMPV0 emp) {
        empdao.insertEmp(emp);
        return true;
    }

    public List<EMPV0> empSelect() {
        return empdao.selectEmp();
    }

    @Override
    public EMPV0 empSelectOne(int empno) {

        return empdao.selectOneEmp(empno);
    }

    @Override
    public boolean empUpdate(EMPV0 emp) {
        empdao.updateEmp(emp);
        return true;
    }

    @Override
    public boolean empDelete(int empno) {
        empdao.deleteEmp(empno);
        return true;
    }
}
