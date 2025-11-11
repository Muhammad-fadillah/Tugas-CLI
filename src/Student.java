public class Student {
    private String name;
    private String nim;

    public Student(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", NIM: " + nim;
    }
}
