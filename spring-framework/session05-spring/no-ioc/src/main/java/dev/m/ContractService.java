package dev.m;

public class ContractService {
    private final PdfGenerator pdfGenerator;

    public ContractService(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    public void processContract() {
        pdfGenerator.generatorFile("contractFile");
    }
}
