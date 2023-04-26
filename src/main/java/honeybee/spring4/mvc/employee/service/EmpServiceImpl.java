package honeybee.spring4.mvc.employee.service;

import honeybee.spring4.mvc.employee.dao.EMPDAO;
import honeybee.spring4.mvc.employee.model.EMPV0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empsrv")
public class EmpServiceImpl implements EmpService {
    private List<EMPV0> empv = null;
    private EMPDAO empdao = null;
    @Autowired
    public EmpServiceImpl(EMPDAO empdao) {
        this.empdao = empdao;
    }

    public List<EMPV0> empSelect() {
        return empdao.selectEmp();
    }


}
