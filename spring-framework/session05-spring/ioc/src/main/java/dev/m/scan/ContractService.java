package dev.m.scan;

import org.springframework.stereotype.Service;

@Service
public class ContractService {
    private final PdfGeneratorScan pdfGeneratorScan;

    public ContractService(PdfGeneratorScan pdfGeneratorScan) {
        this.pdfGeneratorScan = pdfGeneratorScan;
    }

    public void processContract() {
        pdfGeneratorScan.generatorFile("contractFile");
    }
}
