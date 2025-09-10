package dev.m.contructor;

import org.springframework.stereotype.Component;

@Component
public class PdfGeneratorScan {
    public void generatorFile(String fileName) {
        System.out.println("Export file " + fileName + ".pdf to PDF");
    }
}
