package dev.m.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // context thuộc class ApplicationContext quản lý các obj-bean quản lý các dependency injection tương tự
        // entityManager factory quản lý obj-database
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PdfGeneratorScan pdfGeneratorScan1 = context.getBean(PdfGeneratorScan.class);
        PdfGeneratorScan pdfGeneratorScan2 = (PdfGeneratorScan) context.getBean("pdfGenerator");
        PdfGeneratorScan pdfGeneratorScan3 = context.getBean("pdfGenerator", PdfGeneratorScan.class);
        pdfGeneratorScan1.generatorFile("pdfGenerator1");
        pdfGeneratorScan2.generatorFile("pdfGenerator2");
        pdfGeneratorScan3.generatorFile("pdfGenerator3");


    }
}
