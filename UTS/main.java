package UTS;

    public class main {

    static void tampilkan(Mahasiswa[] data) {
        System.out.println("======================================================");
        System.out.printf("%-20s %-12s %-6s %-8s\n", "Nama", "NPM", "Nilai", "Ranking");
        System.out.println("======================================================");

        for (Mahasiswa m : data) {
            System.out.printf("%-20s %-12s %-6d %-8d\n",
                    m.nama, m.npm, m.nilai, m.ranking);
        }
        System.out.println();
    }

    static Mahasiswa[] copy(Mahasiswa[] data) {
        Mahasiswa[] hasil = new Mahasiswa[data.length];
        for (int i = 0; i < data.length; i++) {
            hasil[i] = new Mahasiswa(
                    data[i].nama,
                    data[i].npm,
                    data[i].nilai,
                    data[i].ranking
            );
        }
        return hasil;
    }

    public static void main (String[] args) {

        Mahasiswa[] data = {
            new Mahasiswa("Rachel Stephanie", "2302011312", 85, 12),
            new Mahasiswa("Michael Jonathan", "2302011301", 96, 1),
            new Mahasiswa("Jessica Amanda", "2302011314", 83, 14),
            new Mahasiswa("Gabriel Samuel", "2302011305", 92, 5),
            new Mahasiswa("Sarah Angelina", "2302011308", 89, 8),
            new Mahasiswa("Christopher Daniel", "2302011303", 94, 3),
            new Mahasiswa("Samuel Christian", "2302011315", 82, 15),
            new Mahasiswa("Grace Olivia", "2302011302", 95, 2),
            new Mahasiswa("Jonathan Matthew", "2302011311", 86, 11),
            new Mahasiswa("Hannah Victoria", "2302011304", 93, 4),
            new Mahasiswa("David Alexander", "2302011309", 88, 9),
            new Mahasiswa("Elizabeth Naomi", "2302011306", 91, 6),
            new Mahasiswa("Daniel Sebastian", "2302011313", 84, 13),
            new Mahasiswa("Nathaniel Joshua", "2302011307", 90, 7),
            new Mahasiswa("Rebecca Chloe", "2302011310", 87, 10)
    };

        System.out.println("DATA AWAL:");
        tampilkan(data);

        BubbleSort.sort(copy(data));
        InsertionSort.sort(copy(data));
        SelectionSort.sort(copy(data));
    }
}
