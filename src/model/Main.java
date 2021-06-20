package model;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        // contoh objek data Karyawan constructor 1
        Karyawan k2     = new Karyawan();

        // contoh objek data Karyawan constructor 2
        Karyawan k3     = new Karyawan("Ervia Lindasari", "Ervia1234");

        // contoh objek data Karyawan constructor 3
        Karyawan k1     = new Karyawan("K01",
                                      "Ervia Lindasari",
                                       LocalDate.of(1998, 3, 22),
                                      "Guntung Manggis",
                                      "089688129532",
                                      "Belum Menikah",
                                      1,
                                      2);
        k1.printKaryawan();

        // contoh objek data Karyawan constructor 4
        Karyawan k5     = new Karyawan();

        // contoh objek data Karyawan constructor 5
        Karyawan k6     = new Karyawan("Vika Permatasari", "Vika0111");

        // contoh objek data Karyawan constructor 6
        Karyawan k4     = new Karyawan("K02",
                                       "Vika Permatasari",
                                        LocalDate.of(1992, 7, 25),
                                       "Guntung Payung",
                                       "08125130006",
                                       "Menikah",
                                       2,
                                       4);
        k4.printKaryawan();

        // contoh objek data karyawan guru
        Guru k7 = new Guru("K03", "Ervinadya Aulina Dewi", LocalDate.of(1996, 9, 13), "Guntung Payung", "08125130006", "Menikah", 2, 4, "15112208", "Matematika", "MIPA");
        k7.printKaryawan();
    }
}