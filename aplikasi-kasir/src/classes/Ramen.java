/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author GILANG
 */
public class Ramen extends Menu {
    public Ramen (String namaRamen, double harga) {
        setNamaMenu(namaRamen);
        setHarga(harga);
        setKategori("Ramen");
    }
}