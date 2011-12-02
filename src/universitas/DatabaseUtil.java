package universitas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author indraginanjar@gmail.com
 */
public class DatabaseUtil {
    private DatabaseUtil(){
        
    }
    private static Connection con;

    public static Connection getConnection() {
        if(con == null){
            String user = "root";
            String password = "root";
            try{
                String url = "jdbc:mysql://localhost/universitas";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
            }catch(SQLException e){
                System.err.println("DatabaseUtil.getConnection: " + e.getMessage());
            }
        }
        return con;
    }
        
    public static void createDatabaseStructure(String user, String password){
            try{
                String url = "jdbc:mysql://localhost/";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection("jdbc:mysql://localhost/", 
                        user, password);
                Statement stmt = con.createStatement();
                
                stmt.executeUpdate("CREATE DATABASE universitas");
                
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `mahasiswa` (" 
                        + "`nim` varchar(9) NOT NULL,"
                        + "`nama` varchar(50) NOT NULL,"
                        + "`tanggal_lahir` date NOT NULL,"
                        + "`jurusan` varchar(50) NOT NULL,"
                        + "`alamat` varchar(500) NOT NULL,"
                        + "PRIMARY KEY (`nim`)"
                        + ") ENGINE=MyISAM DEFAULT CHARSET=utf8;");
                
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `matakuliah` ("
                        + "`kode_mtk` varchar(5) NOT NULL,"
                        + "`nama_mtk` varchar(30) NOT NULL,"
                        + "`sks` int(10) unsigned NOT NULL,"
                        + "`semester` int(11) unsigned NOT NULL,"
                        + "PRIMARY KEY (`kode_mtk`)"
                        + ") ENGINE=MyISAM DEFAULT CHARSET=latin1;");
                
            }catch(SQLException e){
                System.err.println("DatabaseUtil.createDatabaseStructure: " 
                        + e.getMessage());
            }
    }
}
