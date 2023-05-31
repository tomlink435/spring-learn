import com.tl.config.TangConfig;
import com.tl.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TangConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
