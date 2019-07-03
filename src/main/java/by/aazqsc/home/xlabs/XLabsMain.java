package by.aazqsc.home.xlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XLabsMain {
    public static void main(String[] args) {
        // загружаем контекст спринга
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "xlabs/xlabs.xml");

        // Находим бин в контекте
        Adapter adapter = (Adapter) ctx.getBean("myAdapter");

        System.out.println(adapter.isTxMode());
    }
}
