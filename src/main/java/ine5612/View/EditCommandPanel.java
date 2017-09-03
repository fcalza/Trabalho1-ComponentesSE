/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.View;

import javax.accessibility.AccessibleRole;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Calza
 */
public class EditCommandPanel extends javax.swing.JPanel {

    int sum;

    /**
     * Creates new form ManagerPanel
     */
    public EditCommandPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        comandaTable = new javax.swing.JTable();
        addToCommand = new javax.swing.JButton();
        removeFromCommand = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        priceComanda = new javax.swing.JLabel();
        finalyzeCommand = new javax.swing.JButton();

        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"�gua 500ml",  new Double(3.0)},
                {"Batata frita",  new Double(15.0)},
                {"Caipirinha",  new Double(8.0)},
                {"Cerveja",  new Double(9.0)},
                {"Prato feito",  new Double(12.0)},
                {"Refrigerante 600ml",  new Double(5.0)}
            },
            new String [] {
                "Produto", "Valor (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produtosTable);

        comandaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(comandaTable);

        addToCommand.setText("Adicionar � comanda");
        addToCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCommandActionPerformed(evt);
            }
        });

        removeFromCommand.setText("Remover da comanda");
        removeFromCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCommandActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor total da comanda: ");

        finalyzeCommand.setText("Finalizar comanda");
        finalyzeCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalyzeCommandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addToCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(removeFromCommand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(finalyzeCommand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(addToCommand)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(removeFromCommand)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalyzeCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //ADICIONAR UM PRODUTO NA COMANDA
    private void addToCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCommandActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) comandaTable.getModel();

        int numCols = produtosTable.getSelectedColumnCount();
        int numRows = produtosTable.getSelectedRowCount();
        int[] rowsSelected = produtosTable.getSelectedRows();
        int[] colsSelected = produtosTable.getSelectedColumns();
        
            //AQUI S� T� PEGANDO UMA COLUNA, objeto com s� um []
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                model.addRow(new Object[]{produtosTable.getValueAt(rowsSelected[i], colsSelected[j])});
                priceComanda.setText(Integer.toString(getSum())); //deve atualiar o pre�o total da comanda no textfild priceComanda
            }
        }
    }//GEN-LAST:event_addToCommandActionPerformed

    //"EDITAR" - REMOVER LINHAS DA COMANDA
    private void removeFromCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCommandActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) comandaTable.getModel();
        if(comandaTable.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Comanda vazia");
        }else{
            model.removeRow(comandaTable.getSelectedRow());
        }
  
    }//GEN-LAST:event_removeFromCommandActionPerformed

    //remover todos os valores da comanda
    private void finalyzeCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalyzeCommandActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) comandaTable.getModel();
        if(comandaTable.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Comanda vazia");
        }else{
            JOptionPane.showMessageDialog(null, this.getSum());
            comandaTable.removeAll();
        }
    }//GEN-LAST:event_finalyzeCommandActionPerformed

    //SOMAR VALORES DA COMANDA
    public int getSum() {
        int rowCount = comandaTable.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            sum += Integer.parseInt(comandaTable.getValueAt(i, 1).toString());
        }

        return sum;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCommand;
    private javax.swing.JTable comandaTable;
    private javax.swing.JButton finalyzeCommand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel priceComanda;
    private javax.swing.JTable produtosTable;
    private javax.swing.JButton removeFromCommand;
    // End of variables declaration//GEN-END:variables
}