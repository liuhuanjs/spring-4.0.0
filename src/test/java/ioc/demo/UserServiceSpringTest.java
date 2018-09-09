package ioc.demo;

import com.huantec.spring.ioc.demo.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring整合JUnit4
 *
 * @author liuhuan 2018-09-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceSpringTest {
    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void getUserList() {
        System.out.println(userService.getUserList());
    }
}
