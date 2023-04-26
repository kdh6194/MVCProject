package honeybee.spring4.mvc.employee.dao;

import honeybee.spring4.mvc.employee.model.EMPV0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("empdao")
public class EMPDAOImpl implements EMPDAO {
    private JdbcTemplate jdbcTemplate;

    @Value("#{jdbc['insertSQL']}") private String insertSQL;
    @Value("#{jdbc['selectSQL']}") private String selectSQL;
    @Value("#{jdbc['selectOneSQL']}") private String selectOneSQL;
    @Value("#{jdbc['updateSQL']}") private String updateSQL;
    @Value("#{jdbc['deleteSQL']}") private String deleteSQL;


    @Autowired
    public EMPDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public int insertEmp(EMPV0 emp) {
        int result = 0;
       
        return result;
    };
    public List<EMPV0> selectEmp() {
        RowMapper<EMPV0> mapper = new EmpMapper();

        return jdbcTemplate.query(selectSQL,mapper) ;
    };

    private class EmpMapper implements RowMapper<EMPV0> {
        @Override
        public EMPV0 mapRow(ResultSet rs, int num) throws SQLException {
            EMPV0 emp = new EMPV0(rs.getInt(1),rs.getString(2),""
                    ,rs.getString(3),"","",rs.getString(4),0,0.0,0,rs.getInt(5));
            emp.setEmpno(rs.getInt(1)); // add역할을 한다.

            return emp;
        }
    }


    public EMPV0 selectOneEmp(int empno) {
        EMPV0 emp = null;

        return emp;
    };

    public int deleteEmp(int empno) {
        int result =0;

        return result;
    };

    public int updateEmp(EMPV0 emp) {
        int result = 0;


        return result;
    };
}
