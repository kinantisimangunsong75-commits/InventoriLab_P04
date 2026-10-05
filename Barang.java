package model;

public class Barang {
    private String kode;
    private String nama;
    private int jumlahTersedia;

    public Barang(String kode, String nama, int jumlahTersedia) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode barang wajib diisi.");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama barang wajib diisi.");
        }
        if (jumlahTersedia < 0) {
            throw new IllegalArgumentException("Jumlah awal tidak boleh negatif.");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.jumlahTersedia = jumlahTersedia;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getJumlahTersedia() { return jumlahTersedia; }
}