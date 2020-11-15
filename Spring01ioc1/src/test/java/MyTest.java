import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    @Test
    public void IOCTest(){
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao((UserDao) new UserDaoOracleImpl());
        userService.getUser();
    }

    @Test
    public void CPXTest(){
        // 获取ApplicationContext 拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 容器有了  要什么直接get
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}



