import java.util.List;

public class ViewPage extends AbstractPage {

    public ViewPage(java.util.Scanner scanner, CLIApp app) {
        super(scanner, app);
    }

    @Override
    public void show() {
        System.out.println("=== DATA MAHASISWA ===");
        List<Student> students = app.getStudents();

        if (students.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }

        pause();
        app.setCurrentPage(app.getHomePage());
    }
}
