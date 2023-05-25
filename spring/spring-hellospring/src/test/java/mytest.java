import com.tl.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
//        获取spirng的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        我们的对象被spring管理了
        Hello h1 = (Hello) context.getBean("h1");
        Object h11 = context.getBean("h1");
        System.out.println(h11.toString());
        System.out.println(h1.toString());
        System.out.println(h1);
    }
}
