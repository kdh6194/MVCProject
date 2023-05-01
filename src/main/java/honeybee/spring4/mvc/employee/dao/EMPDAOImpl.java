package honeybee.spring4.mvc.employee.dao;

import honeybee.spring4.mvc.employee.model.EMPV0;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("empdao")
public class EMPDAOImpl implements EMPDAO {
    private static final Logger logger = LogManager.getLogger(EMPDAOImpl.class);
    private SqlSession sqlSession;


    @Autowired
    public EMPDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }



    public int insertEmp(EMPV0 emp) {
        return sqlSession.insert("employee.insertsql",emp);
    };
    public List<EMPV0> selectEmp() {
      return sqlSession.selectList("employee.selectsql");
    };


    public EMPV0 selectOneEmp(int empno) {
     return sqlSession.selectOne("employee.selectOnesql",empno);
    };



    public int deleteEmp(int empno) {
        return sqlSession.delete("employee.deletesql",empno);
    };

    public int updateEmp(EMPV0 emp) {
        return sqlSession.update("employee.updatesql",emp);
    };
}
