package dev.m.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainContructor {
    public static void main(String[] args) {

        // context thuộc class ApplicationContext quản lý các obj-bean quản lý các dependency injection tương tự
        // entityManager factory quản lý obj-database
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService service = context.getBean(ContractService.class);
        service.processContract();

    }
}
