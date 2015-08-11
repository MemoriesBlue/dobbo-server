import com.elaine.test.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianlan on 15-8-11.
 */
public class Provider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo.xml");
        DemoService demoService = (DemoService)context.getBean("demoService");
        context.start();
        while (true) {

        }
    }
}
