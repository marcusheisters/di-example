package de.mhei.spring.diexample;

import de.mhei.spring.diexample.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiexampleApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testGetControllerFromCtx() {
        MyController controller = applicationContext.getBean(MyController.class);

        System.out.println(controller.sayHello());
    }
    @Test
    void contextLoads() {
    }

}
