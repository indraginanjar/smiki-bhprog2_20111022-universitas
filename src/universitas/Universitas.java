/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author indra
 */
public class Universitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KoneksiDatabase.getKoneksi();
        NavigationUtil.showMahasiswaForm();
    }
}
