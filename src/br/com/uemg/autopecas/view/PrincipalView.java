package br.com.uemg.autopecas.view;

import br.com.uemg.autopecas.model.Usuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author gustavo
 */
public class PrincipalView extends javax.swing.JFrame {

    public static Usuario usuario;

    /**
     * Creates new form Principal
     *
     * @param usuario
     */
    public PrincipalView(Usuario usuario) {

        System.out.println(usuario);
        PrincipalView.usuario = usuario;
        initComponents();
        permissoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("../assets/background.jpg"));
        Image image = icon.getImage();
        DesktopPanePrincipal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        NomeUsuario = new javax.swing.JLabel();
        NomeCargo = new javax.swing.JLabel();
        MenuBarPrincipal = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemFornecedor = new javax.swing.JMenuItem();
        MenuItemCategoria = new javax.swing.JMenuItem();
        MenuItemProduto = new javax.swing.JMenuItem();
        MenuItemUsuario = new javax.swing.JMenuItem();
        MenuPedido = new javax.swing.JMenu();
        MenuItemOrdemVenda = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LICENCIADO PARA CNPJ: 00.123.453/0001-01");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        DesktopPanePrincipal.setForeground(new java.awt.Color(0, 204, 51));

        NomeUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        NomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NomeUsuario.setText("Bem Vindo(a)");

        NomeCargo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        NomeCargo.setForeground(new java.awt.Color(255, 255, 255));
        NomeCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NomeCargo.setText("Função:");

        DesktopPanePrincipal.setLayer(NomeUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanePrincipal.setLayer(NomeCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPanePrincipalLayout = new javax.swing.GroupLayout(DesktopPanePrincipal);
        DesktopPanePrincipal.setLayout(DesktopPanePrincipalLayout);
        DesktopPanePrincipalLayout.setHorizontalGroup(
            DesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPanePrincipalLayout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addGroup(DesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        DesktopPanePrincipalLayout.setVerticalGroup(
            DesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanePrincipalLayout.createSequentialGroup()
                .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeCargo)
                .addGap(0, 435, Short.MAX_VALUE))
        );

        MenuBarPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        MenuBarPrincipal.setBorder(null);
        MenuBarPrincipal.setToolTipText("");
        MenuBarPrincipal.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        MenuBarPrincipal.setInheritsPopupMenu(true);

        MenuCadastro.setText("CADASTRO");
        MenuCadastro.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        MenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroActionPerformed(evt);
            }
        });

        MenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuItemCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        MenuItemCliente.setText("CLIENTE");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemCliente);

        MenuItemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MenuItemFornecedor.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        MenuItemFornecedor.setText("FORNECEDOR");
        MenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFornecedorActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemFornecedor);

        MenuItemCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MenuItemCategoria.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        MenuItemCategoria.setText("CATEGORIA");
        MenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCategoriaActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemCategoria);

        MenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuItemProduto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        MenuItemProduto.setText("PRODUTO");
        MenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProdutoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemProduto);

        MenuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MenuItemUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        MenuItemUsuario.setText("USUÁRIO");
        MenuItemUsuario.setEnabled(false);
        MenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemUsuario);

        MenuBarPrincipal.add(MenuCadastro);

        MenuPedido.setText("PEDIDO");
        MenuPedido.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        MenuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPedidoActionPerformed(evt);
            }
        });

        MenuItemOrdemVenda.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        MenuItemOrdemVenda.setText("ORDEM DE VENDA");
        MenuItemOrdemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOrdemVendaActionPerformed(evt);
            }
        });
        MenuPedido.add(MenuItemOrdemVenda);

        MenuBarPrincipal.add(MenuPedido);

        MenuSobre.setText("SOBRE");
        MenuSobre.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        MenuBarPrincipal.add(MenuSobre);

        setJMenuBar(MenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanePrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void permissoes() {
        NomeUsuario.setText("BEM VINDO(A), " + usuario.getNome());
        NomeCargo.setText("FUNÇÃO: " + usuario.getCargo());
        if (usuario.getCargo().equals("GERENTE")) {
            MenuItemUsuario.setEnabled(true);
        }

    }

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
        // TODO add your handling code here:

        ClienteView cliente = new ClienteView();
        DesktopPanePrincipal.add(cliente);
        cliente.setVisible(true);


    }//GEN-LAST:event_MenuItemClienteActionPerformed

    private void MenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastroActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void MenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFornecedorActionPerformed
        // TODO add your handling code here:

        FornecedorView fornecedorv = new FornecedorView();
        DesktopPanePrincipal.add(fornecedorv);
        fornecedorv.setVisible(true);

    }//GEN-LAST:event_MenuItemFornecedorActionPerformed

    private void MenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCategoriaActionPerformed
        // TODO add your handling code here:
        CategoriaView categoriav = new CategoriaView();
        DesktopPanePrincipal.add(categoriav);
        categoriav.setVisible(true);
    }//GEN-LAST:event_MenuItemCategoriaActionPerformed

    private void MenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProdutoActionPerformed
        // TODO add your handling code here:
        ProdutoView produtov = new ProdutoView();
        DesktopPanePrincipal.add(produtov);
        produtov.setVisible(true);
    }//GEN-LAST:event_MenuItemProdutoActionPerformed

    private void MenuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedidoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuPedidoActionPerformed

    private void MenuItemOrdemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOrdemVendaActionPerformed
        // TODO add your handling code here:
        VendaView vendav = new VendaView();
        DesktopPanePrincipal.add(vendav);
        vendav.setVisible(true);
    }//GEN-LAST:event_MenuItemOrdemVendaActionPerformed

    private void MenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioActionPerformed
        // TODO add your handling code here:
        UsuarioView usuariov = new UsuarioView();
        DesktopPanePrincipal.add(usuariov);
        usuariov.setVisible(true);
    }//GEN-LAST:event_MenuItemUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPanePrincipal;
    private javax.swing.JMenuBar MenuBarPrincipal;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItemCategoria;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemFornecedor;
    private javax.swing.JMenuItem MenuItemOrdemVenda;
    private javax.swing.JMenuItem MenuItemProduto;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JLabel NomeCargo;
    private javax.swing.JLabel NomeUsuario;
    // End of variables declaration//GEN-END:variables
}
