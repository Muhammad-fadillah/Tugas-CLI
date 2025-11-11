import java.util.Scanner;

public abstract class AbstractPage implements Page {
    protected Scanner scanner;
    protected CLIApp app;

    public AbstractPage(Scanner scanner, CLIApp app) {
        this.scanner = scanner;
        this.app = app;
    }

    protected void pause() {
        System.out.println("\nTekan ENTER untuk kembali ke menu utama...");
        scanner.nextLine();
    }
}
