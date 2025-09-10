package dev.m.contructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
    private final PdfGeneratorScan pdfGeneratorScan;

    @Autowired
    public ContractService(PdfGeneratorScan pdfGeneratorScan) {
        this.pdfGeneratorScan = pdfGeneratorScan;
    }

    public void processContract() {
        pdfGeneratorScan.generatorFile("contractFile");
    }
}
