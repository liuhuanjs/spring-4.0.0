package com.huantec.spring.aop.demo4;

import com.huantec.spring.aop.demo4.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 案例四：Spring框架的事务管理完成转账的案例
 *
 * @author liuhuan 2018-09-10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop-jdbc.xml")
public class JdbcAopTest {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    // 插入操作
    public void demo1(){
        jdbcTemplate.update("insert into account values (null,?,?)", "冠希",10000d);
    }

    @Test
    // 修改操作
    public void demo2(){
        jdbcTemplate.update("update account set name=?,money =? where id = ?", "思雨",10000d,5);
    }

    @Test
    // 删除操作
    public void demo3(){
        jdbcTemplate.update("delete from account where id = ?", 5);
    }

    @Test
    // 查询一条记录
    public void demo4(){
        Account account = jdbcTemplate.queryForObject("select * from account where id = ?", new BeanMapper(), 1);
        System.out.println(account);
    }

    @Test
    // 查询所有记录
    public void demo5(){
        List<Account> list = jdbcTemplate.query("select * from account", new BeanMapper());
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @Test
    public void update1() {
        // 创建连接池，先使用Spring框架内置的连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring_day03?Unicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("213");
        // 创建模板类
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        // 完成数据的添加
        jdbcTemplate.update("insert into account values (null,?,?)", "hellokitty", 10000);
    }

    class BeanMapper implements RowMapper<Account> {
        public Account mapRow(ResultSet rs, int arg1) throws SQLException {
            Account account = new Account();
            account.setId(rs.getInt("id"));
            account.setName(rs.getString("name"));
            account.setMoney(rs.getDouble("money"));
            return account;
        }
    }
}
