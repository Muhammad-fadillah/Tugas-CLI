import java.util.Iterator;

public class DeletePage extends AbstractPage {

    public DeletePage(java.util.Scanner scanner, CLIApp app) {
        super(scanner, app);
    }

    @Override
    public void show() {
        System.out.println("=== HAPUS DATA MAHASISWA ===");
        System.out.print("Masukkan nama atau NIM yang ingin dihapus: ");
        String input = scanner.nextLine();

        boolean found = false;
        Iterator<Student> iterator = app.getStudents().iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getName().equalsIgnoreCase(input) || s.getNim().equalsIgnoreCase(input)) {
                iterator.remove();
                found = true;
                System.out.println("Data berhasil dihapus!");
                break;
            }
        }

        if (!found) {
            System.out.println("Data tidak ditemukan!");
        }

        pause();
        app.setCurrentPage(app.getHomePage());
    }
}
