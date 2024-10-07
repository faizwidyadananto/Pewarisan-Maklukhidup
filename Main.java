    public class Main {
            public static void main(String[] args) {
                // Membuat objek manusia
                Manusia manusia = new Manusia("Tifa", "Perempuan");
                manusia.cetakNama();
                manusia.jenisKelamin.tampilkanJenisKelamin();
                manusia.bernafas();
                manusia.masaHidup("remaja");

                System.out.println();

                // Membuat objek hewan
                Hewan hewan = new Hewan("Kucing", "Jantan");
                hewan.cetakNama();
                hewan.jenisKelamin.tampilkanJenisKelamin();
                hewan.bernafas();
                hewan.masaHidup("anak-anak");

                System.out.println();

                // Membuat objek tumbuhan
                Tumbuhan tumbuhan = new Tumbuhan("Mawar");
                tumbuhan.cetakNama();
                tumbuhan.bernafas();
                tumbuhan.masaHidup("dewasa");
            }
        }
        abstract class MakhlukHidup {
            String nama;

            // Konstruktor
            public MakhlukHidup(String nama) {
                this.nama = nama;
            }

            // Method abstrak (polimorfis)
            public abstract void bernafas();

            // Method untuk mencetak nama
            public void cetakNama() {
                System.out.println("Nama: " + this.nama);
            }
        }

// Kelas JenisKelamin
        class JenisKelamin {
            String jenisKelamin;

            // Konstruktor
            public JenisKelamin(String jenisKelamin) {
                this.jenisKelamin = jenisKelamin;
            }

            // Method untuk menampilkan jenis kelamin
            public void tampilkanJenisKelamin() {
                System.out.println("Jenis Kelamin: " + this.jenisKelamin);
            }
        }

// Kelas turunan Manusia
        class Manusia extends MakhlukHidup {
            JenisKelamin jenisKelamin;

            // Konstruktor
            public Manusia(String nama, String jenisKelamin) {
                super(nama);
                this.jenisKelamin = new JenisKelamin(jenisKelamin);
            }

            // Implementasi method abstrak
            @Override
            public void bernafas() {
                System.out.println(nama + " bernafas melalui paru-paru.");
            }

            // Method tambahan
            public void masaHidup(String fase) {
                System.out.println(nama + " dalam fase " + fase);
            }
        }

// Kelas turunan Hewan
        class Hewan extends MakhlukHidup {
            JenisKelamin jenisKelamin;

            // Konstruktor
            public Hewan(String nama, String jenisKelamin) {
                super(nama);
                this.jenisKelamin = new JenisKelamin(jenisKelamin);
            }

            // Implementasi method abstrak
            @Override
            public void bernafas() {
                System.out.println(nama + " bernafas melalui paru-paru.");
            }

            // Method tambahan
            public void masaHidup(String fase) {
                System.out.println(nama + " dalam fase " + fase);
            }
        }

// Kelas turunan Tumbuhan
        class Tumbuhan extends MakhlukHidup {

            // Konstruktor
            public Tumbuhan(String nama) {
                super(nama);
            }

            // Implementasi method abstrak
            @Override
            public void bernafas() {
                System.out.println(nama + " bernafas melalui stomata.");
            }

            // Method tambahan
            public void masaHidup(String fase) {
                System.out.println(nama + " dalam fase " + fase);
            }
        }