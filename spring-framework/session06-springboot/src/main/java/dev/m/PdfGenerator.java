package dev.m;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PdfGenerator {
    @PostConstruct
    public void init() {
        generatorFile("manhnd");
    }

    public void generatorFile(String fileName) {
        System.out.println("Export file " + fileName + ".pdf to PDF");
    }

}
