import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void TestAnno(){
        // 如果完全使用了配置类方式去做，我们只能通过AnnotationConfig上下文来获取容器，通过类的class加载
        ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUSer = context.getBean("getUser", User.class);
        System.out.println(getUSer.getName());
    }
}
