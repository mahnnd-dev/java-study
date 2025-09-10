package dev.m.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // context thuộc class ApplicationContext quản lý các obj-bean quản lý các dependency injection tương tự
        // entityManager factory quản lý obj-database
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PdfGeneratorBean pdfGeneratorBean = context.getBean("manhnd", PdfGeneratorBean.class);
        pdfGeneratorBean.generatorFile("manhnd - pdfGenerator");
    }
}
