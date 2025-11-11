import java.util.Scanner;

public class HomePage extends AbstractPage {

    public HomePage(Scanner scanner, CLIApp app) {
        super(scanner, app);
    }

    @Override
    public void show() {
        System.out.println("=== MENU UTAMA ===");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                app.setCurrentPage(app.getAddPage());
                break;
            case "2":
                app.setCurrentPage(app.getViewPage());
                break;
            case "3":
                app.setCurrentPage(app.getDeletePage());
                break;
            case "4":
                app.stop();
                return;
            default:
                System.out.println("Pilihan tidak valid!");
                pause();
        }
    }
}
