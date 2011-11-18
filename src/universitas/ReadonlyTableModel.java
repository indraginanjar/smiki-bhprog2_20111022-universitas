/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indra
 */
public class ReadonlyTableModel extends DefaultTableModel {
    private static final long serialVersionUID = 1L;

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
}
