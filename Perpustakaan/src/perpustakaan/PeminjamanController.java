/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.awt.Dialog;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class PeminjamanController {
    
    
    public void showFormPeminjaman() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan1(); 
    }
    
    public void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
            if(listBuku.isEmpty())
            {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } 
            else Perpustakaan.formPeminjaman.display(listBuku);
        } catch(Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
    
       public void pinjam(ArrayList<BukuDipinjam> BukuDipinjam){
        Perpustakaan.peminjamanManager = new PeminjamanManager();
        
        boolean status = Perpustakaan.peminjamanManager.save(BukuDipinjam);
        if (status == true) {
            DialogUI dialogUI = new DialogUI("Peminjaman Buku Berhasil!");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        } else  {
            DialogUI dialogUI = new DialogUI("Jumlah Buku yang dipinjam melebihi 10 buku");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
    
}
