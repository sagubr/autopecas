package br.com.uemg.autopecas.view;

import br.com.uemg.autopecas.DAO.ClienteDAO;
import br.com.uemg.autopecas.DAO.FornecedorDAO;
import br.com.uemg.autopecas.controller.ConnectionFactory;
import br.com.uemg.autopecas.model.Cliente;
import br.com.uemg.autopecas.model.Fornecedor;
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
public final class ConsultaFornecedorView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaClienteView
     */
    FornecedorView ccview = new FornecedorView();

    public ConsultaFornecedorView() {
        initComponents();
        DefaultTableModel fornecedor = (DefaultTableModel) TabelaFornecedores.getModel();
        TabelaFornecedores.setRowSorter(new TableRowSorter(fornecedor));

        TabelaFornecedores.getColumnModel().getColumn(0).setPreferredWidth(40);
        TabelaFornecedores.getColumnModel().getColumn(1).setPreferredWidth(250);
        TabelaFornecedores.getColumnModel().getColumn(2).setPreferredWidth(130);
        TabelaFornecedores.getColumnModel().getColumn(3).setPreferredWidth(110);
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
        TextoArgumento = new javax.swing.JTextField();
        LabelArgumento = new javax.swing.JLabel();
        BotaoConsultar = new javax.swing.JButton();
        ScrollPainel = new javax.swing.JScrollPane();
        TabelaFornecedores = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18)), "Consulta de Fornecedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18))); // NOI18N
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

        TextoArgumento.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        LabelArgumento.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelArgumento.setText("Nome:");

        BotaoConsultar.setBackground(new java.awt.Color(0, 102, 102));
        BotaoConsultar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoConsultar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoConsultar.setText("Consultar");
        BotaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultarActionPerformed(evt);
            }
        });

        TabelaFornecedores.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        TabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Apelido", "Inscricao", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFornecedoresMouseClicked(evt);
            }
        });
        ScrollPainel.setViewportView(TabelaFornecedores);

        javax.swing.GroupLayout PainelConsultaClientesLayout = new javax.swing.GroupLayout(PainelConsultaClientes);
        PainelConsultaClientes.setLayout(PainelConsultaClientesLayout);
        PainelConsultaClientesLayout.setHorizontalGroup(
            PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPainel)
                    .addGroup(PainelConsultaClientesLayout.createSequentialGroup()
                        .addGroup(PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelArgumento)
                            .addGroup(PainelConsultaClientesLayout.createSequentialGroup()
                                .addComponent(TextoArgumento, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoConsultar)))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelConsultaClientesLayout.setVerticalGroup(
            PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelArgumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoArgumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setBounds(250, 250, 926, 386);
    }// </editor-fold>//GEN-END:initComponents

    public void read() {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            DefaultTableModel ListaFornecedor = (DefaultTableModel) TabelaFornecedores.getModel();
            ListaFornecedor.setNumRows(0);

            FornecedorDAO dao = new FornecedorDAO(connection);

            for (Fornecedor f : dao.read()) {

                ListaFornecedor.addRow(new Object[]{
                    f.getId(),
                    f.getPessoa().getNome(),
                    f.getPessoa().getInscricao(),
                    f.getContato()});

            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaFornecedorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void read(String busca) {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            DefaultTableModel ListaFornecedor = (DefaultTableModel) TabelaFornecedores.getModel();
            ListaFornecedor.setNumRows(0);

            FornecedorDAO dao = new FornecedorDAO(connection);

            for (Fornecedor f : dao.read(busca)) {
                //**/

                ListaFornecedor.addRow(new Object[]{
                    f.getId(),
                    f.getPessoa().getNome(),
                    f.getPessoa().getInscricao(),
                    f.getContato()});

            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaFornecedorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

        if (TabelaFornecedores.getSelectedRow() != 0) {

            TabelaFornecedores.getValueAt(TabelaFornecedores.getSelectedRow(), 1).toString();
            TabelaFornecedores.getValueAt(TabelaFornecedores.getSelectedRow(), 2).toString();
            TabelaFornecedores.getValueAt(TabelaFornecedores.getSelectedRow(), 3).toString();
            TabelaFornecedores.getValueAt(TabelaFornecedores.getSelectedRow(), 4).toString();

        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void BotaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultarActionPerformed
        // TODO add your handling code here:
        read(TextoArgumento.getText());
    }//GEN-LAST:event_BotaoConsultarActionPerformed

    private void TabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFornecedoresMouseClicked
        Fornecedor f = new Fornecedor();

        f.setId(Integer.valueOf(TabelaFornecedores.getValueAt(TabelaFornecedores.getSelectedRow(), 0).toString()));

        ccview.capturar(f);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaFornecedoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConsultar;
    private javax.swing.JLabel LabelArgumento;
    private javax.swing.JPanel PainelConsultaClientes;
    private javax.swing.JScrollPane ScrollPainel;
    private javax.swing.JTable TabelaFornecedores;
    private javax.swing.JTextField TextoArgumento;
    // End of variables declaration//GEN-END:variables
}