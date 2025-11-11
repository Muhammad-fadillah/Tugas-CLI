public class AddPage extends AbstractPage {

    public AddPage(java.util.Scanner scanner, CLIApp app) {
        super(scanner, app);
    }

    @Override
    public void show() {
        System.out.println("=== TAMBAH DATA MAHASISWA ===");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        app.addStudent(new Student(nama, nim));
        System.out.println("Data berhasil ditambahkan!");
        pause();
        app.setCurrentPage(app.getHomePage());
    }
}
