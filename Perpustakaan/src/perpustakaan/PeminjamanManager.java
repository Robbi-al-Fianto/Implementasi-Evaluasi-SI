/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PeminjamanManager {
        public PeminjamanManager(){
        Perpustakaan.peminjaman = new Peminjaman();
    }
    public boolean save(ArrayList<BukuDipinjam> bukuDipinjamColection){
        if(bukuDipinjamColection.size() > 10){
            return false;
        } else {
            for(BukuDipinjam buku : bukuDipinjamColection){
                Perpustakaan.peminjaman.daftarBuku.add(buku);
            }
            return true;
        }
    }
}
