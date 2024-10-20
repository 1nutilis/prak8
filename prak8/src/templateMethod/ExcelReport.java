package templateMethod;

public class ExcelReport extends ReportGenerator{
    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для Excel...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение Excel отчета...");
    }
}
