package dev.m.bean;

public class ContractService {
    private final PdfGeneratorBean pdfGeneratorBean;

    public ContractService(PdfGeneratorBean pdfGeneratorBean) {
        this.pdfGeneratorBean = pdfGeneratorBean;
    }

    public void processContract() {
        pdfGeneratorBean.generatorFile("contractFile");
    }
}
