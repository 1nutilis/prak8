package templateMethod;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PdfReport();

        System.out.println("Генерация PDF отчета:");
        pdfReport.generateReport();
    }
}