/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author indra
 */
public class NavigationUtil {
    private NavigationUtil(){
        
    }
    
    private static MahasiswaForm mhsForm = new MahasiswaForm();
    private static MatakuliahForm mtkForm = new MatakuliahForm();

    public static void showMahasiswaForm(){
        mhsForm.setLocation(mtkForm.getLocation());
        mhsForm.setVisible(true);
        mtkForm.setVisible(false);
    }

    public static void showMatakuliahForm(){
        mtkForm.setLocation(mhsForm.getLocation());
        mtkForm.setVisible(true);
        mhsForm.setVisible(false);
    }
}
