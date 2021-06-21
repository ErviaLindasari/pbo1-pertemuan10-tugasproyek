package model;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        // contoh objek data Karyawan constructor 1
        Karyawan k2     = new Karyawan("Ervia Lindasari");

        // contoh objek data Karyawan constructor 2
        Karyawan k3 = new Karyawan(123456);

        // contoh objek data Karyawan constructor 3
        Karyawan k1     = new Karyawan();
        k1.setIdKaryawan("K01");
        k1.setNama("Ervia Lindasari");
        k1.setTanggalLahir(LocalDate.of(1998, 3, 22));
        k1.setAlamat("Guntung Manggis");
        k1.setNoTelp("089688129532");
        k1.setStatus("Belum Menikah");
        k1.setGol(1);
        k1.setLamaKerja(2);
        k1.setRiwayat("S1");

        k1.printKaryawan();

        // contoh objek data Karyawan constructor 4
        Karyawan k5     = new Karyawan("Vika Permatasari");

        // contoh objek data Karyawan constructor 5
        Karyawan k6     = new Karyawan(123678);

        // contoh objek data Karyawan constructor 6
        Karyawan k4     = new Karyawan();
        k4.setIdKaryawan("K02");
        k4.setNama("Ervinadya Aulina Dewi");
        k4.setTanggalLahir(LocalDate.of(1996, 9, 13));
        k4.setAlamat("Guntung Payung");
        k4.setNoTelp("08125130006");
        k4.setStatus("Menikah");
        k4.setGol(2);
        k4.setLamaKerja(4);
        k4.setRiwayat("S1");

        k4.printKaryawan();

        // contoh objek data karyawan guru
        Guru g1         = new Guru();
        g1.setIdKaryawan("K03");
        g1.setNip("15112208");
        g1.setNama("Vika Permatasari");
        g1.setTanggalLahir(LocalDate.of(1994, 7, 22));
        g1.setAlamat("Guntung Payung");
        g1.setNoTelp("08125130006");
        g1.setStatus("Menikah");
        g1.setGol(3);
        g1.setLamaKerja(6);
        g1.setJurusan("Matematika");
        g1.setBidangKeahlian("MIPA");
        g1.setRiwayat("S2");

        g1.printKaryawan();
        g1.Bonus(100000);
    }
}