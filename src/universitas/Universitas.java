package universitas;

/**
 *
 * @author indraginanjar@gmail.com
 */
public class Universitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseUtil.getConnection();
        NavigationUtil.showMahasiswaForm();
    }
}
