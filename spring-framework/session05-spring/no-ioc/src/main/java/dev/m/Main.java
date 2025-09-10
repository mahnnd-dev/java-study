package dev.m;

public class Main {
    public static void main(String[] args) {
        PdfGenerator pdfGenerator = new PdfGenerator();
        ContractService service = new ContractService(pdfGenerator);
        service.processContract();
    }
}
