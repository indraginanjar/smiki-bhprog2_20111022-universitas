/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author indra
 */
public class KoneksiDatabase {
    private KoneksiDatabase(){
        
    }
    private static Connection koneksi;

    /**
     * @return the koneksi
     */
    public static Connection getKoneksi() {
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/universitas";
                String user = "root";
                String password = "root";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                return koneksi;
            }catch(SQLException e){
                System.err.println("Error Membuat Koneksi");
            }
        }
        return koneksi;
    }
}
