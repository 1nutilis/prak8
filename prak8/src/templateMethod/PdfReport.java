package templateMethod;

public class PdfReport extends ReportGenerator{
    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для PDF...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение PDF отчета...");
    }
}
