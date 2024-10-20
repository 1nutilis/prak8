package templateMethod;

public abstract class ReportGenerator {
    public final void generateReport() {
        loadData();
        formatData();
        if (customerWantsSave()) {
            saveReport();
        }
    }
    private void loadData() {
        System.out.println("Загрузка данных...");
    }


    protected abstract void formatData();


    protected abstract void saveReport();


    protected boolean customerWantsSave() {
        return true;
    }
}

