import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLIApp {
    private Scanner scanner;
    private boolean running;
    private Page currentPage;

    private List<Student> students;

    private HomePage homePage;
    private AddPage addPage;
    private ViewPage viewPage;
    private DeletePage deletePage;

    public CLIApp() {
        scanner = new Scanner(System.in);
        students = new ArrayList<>();

        homePage = new HomePage(scanner, this);
        addPage = new AddPage(scanner, this);
        viewPage = new ViewPage(scanner, this);
        deletePage = new DeletePage(scanner, this);

        currentPage = homePage;
        running = true;
    }

    public void run() {
        while (running) {
            currentPage.show();
        }
        scanner.close();
        System.out.println("Aplikasi ditutup.");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public HomePage getHomePage() { return homePage; }
    public AddPage getAddPage() { return addPage; }
    public ViewPage getViewPage() { return viewPage; }
    public DeletePage getDeletePage() { return deletePage; }

    public void setCurrentPage(Page page) {
        this.currentPage = page;
    }

    public void stop() {
        running = false;
    }
}
