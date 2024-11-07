package prak8;

public class DatabaseConnection {
    // Instance tunggal (Singleton) untuk kelas DatabaseConnection
    private static DatabaseConnection instance = null;

    // Konstruktor privat untuk mencegah instansiasi langsung dari luar kelas
    private DatabaseConnection() {
        System.out.println("Database connection created.");
    }

    // Method untuk mendapatkan instance DatabaseConnection
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Jika belum ada, buat instance baru
        }
        return instance;
    }

    public static void main(String[] args) {
        // Memanggil getInstance() pertama kali, akan mencetak "Database connection created."
        DatabaseConnection connection = DatabaseConnection.getInstance();
    }
}
