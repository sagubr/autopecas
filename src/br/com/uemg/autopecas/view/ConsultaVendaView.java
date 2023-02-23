package br.com.uemg.autopecas.view;

import br.com.uemg.autopecas.DAO.ClienteDAO;
import br.com.uemg.autopecas.DAO.PedidoDAO;
import br.com.uemg.autopecas.controller.ConnectionFactory;
import br.com.uemg.autopecas.model.Cliente;
import br.com.uemg.autopecas.model.Pedido;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author gustavo
 */
public final class ConsultaVendaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaClienteView
     */
    ClienteView ccview = new ClienteView();
    VendaView vview = new VendaView();

    public ConsultaVendaView() {
        initComponents();
        DefaultTableModel cliente = (DefaultTableModel) TabelaVendas.getModel();
        TabelaVendas.setRowSorter(new TableRowSorter(cliente));

        read();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelConsultaClientes = new javax.swing.JPanel();
        ScrollPainel = new javax.swing.JScrollPane();
        TabelaVendas = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18)), "Consulta de Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18))); // NOI18N
        setClosable(true);
        setForeground(java.awt.Color.white);
        setName(""); // NOI18N
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        TabelaVendas.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        TabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Total", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaVendasMouseClicked(evt);
            }
        });
        ScrollPainel.setViewportView(TabelaVendas);

        javax.swing.GroupLayout PainelConsultaClientesLayout = new javax.swing.GroupLayout(PainelConsultaClientes);
        PainelConsultaClientes.setLayout(PainelConsultaClientesLayout);
        PainelConsultaClientesLayout.setHorizontalGroup(
            PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelConsultaClientesLayout.setVerticalGroup(
            PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelConsultaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelConsultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(250, 250, 926, 327);
    }// </editor-fold>//GEN-END:initComponents

    public void read() {
        try (Connection connection = new ConnectionFactory().getConnection()) {

            DefaultTableModel ListaVenda = (DefaultTableModel) TabelaVendas.getModel();
            ListaVenda.setNumRows(0);

            PedidoDAO dao = new PedidoDAO(connection);

            for (Pedido p : dao.read()) {

                ListaVenda.addRow(new Object[]{
                    p.getId(),
                    p.getCliente().getPessoa().getNome(),
                    p.getTotal(),
                    p.getData()
                });

            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaVendaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

        if (TabelaVendas.getSelectedRow() != 0) {

            TabelaVendas.getValueAt(TabelaVendas.getSelectedRow(), 1).toString();
            TabelaVendas.getValueAt(TabelaVendas.getSelectedRow(), 2).toString();
            TabelaVendas.getValueAt(TabelaVendas.getSelectedRow(), 3).toString();
            TabelaVendas.getValueAt(TabelaVendas.getSelectedRow(), 4).toString();

        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void TabelaVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaVendasMouseClicked
        Pedido p = new Pedido();

        p.setId(Integer.valueOf(TabelaVendas.getValueAt(TabelaVendas.getSelectedRow(), 0).toString()));

        System.out.println("ID QUE TO ENVIANDO!" + p.getId());
        vview.capturarOrcamento(p);

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaVendasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelConsultaClientes;
    private javax.swing.JScrollPane ScrollPainel;
    private javax.swing.JTable TabelaVendas;
    // End of variables declaration//GEN-END:variables
}
