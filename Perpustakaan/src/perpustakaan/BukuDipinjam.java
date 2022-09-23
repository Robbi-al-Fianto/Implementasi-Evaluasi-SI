/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author hp
 */
public class BukuDipinjam extends Buku { 
    private int lama;
    
    public  BukuDipinjam (String judul, int lama){
        super(judul);
        this.lama = lama;
    }
    public int lama(int lama){
        return this.lama = lama;
    }
}
