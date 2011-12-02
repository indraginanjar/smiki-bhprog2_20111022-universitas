/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indraginanjar@gmail.com
 */
public class ReadonlyTableModel extends DefaultTableModel {
    private static final long serialVersionUID = 1L;

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    public void readResultSet(ResultSet rs){
        dataVector.removeAllElements();
        try {
            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();
            setColumnCount(0);
            for(int i=1; i <= meta.getColumnCount(); ++i){
                addColumn(meta.getColumnName(i));
            }
            Object[] columnData = new Object[columnCount];
            while(rs.next()){
                for(int i=0; i < columnCount; ++i){
                    if(meta.getColumnType(i + 1) == Types.DATE){
                        columnData[i] = rs.getDate(i + 1);
                    }else{
                        columnData[i] = rs.getString(i + 1);
                    }
                }
                addRow(columnData);
            }
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(ReadonlyTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
