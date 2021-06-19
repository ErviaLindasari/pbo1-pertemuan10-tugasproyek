package model;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        // contoh objek data Karyawan
        Karyawan k1 = new Karyawan();
        k1.idKaryawan   = "K01";
        k1.nama         = "Ervia Lindasari";
        k1.tanggalLahir = LocalDate.of(1998, 3, 22);
        k1.Alamat       = "Guntung Manggis";
        k1.NoTelp       = "089688129532";
        k1.Status       = "Belum Menikah";
        k1.gol          = 123;
        k1.LamaKerja    = 2;

        // contoh objek data karyawan guru
        Guru k2 = new Guru();
        k2.idKaryawan     = "K02";
        k2.nama           = "Ervinadya Aulina Dewi";
        k2.tanggalLahir   = LocalDate.of(1996, 9, 13);
        k2.Alamat         = "Guntung Payung";
        k2.NoTelp         = "08125130006";
        k2.Status         = "Menikah";
        k2.gol            = 123;
        k2.LamaKerja      = 2;
        k2.nip            = "15112208";
        k2.Jurusan        = "Matematika";
        k2.BidangKeahlian = "MIPA";
    }
}