package br.com.uemg.autopecas.view;

import br.com.uemg.autopecas.DAO.CategoriaDAO;
import br.com.uemg.autopecas.DAO.FornecedorDAO;
import br.com.uemg.autopecas.DAO.ProdutoDAO;
import br.com.uemg.autopecas.controller.ConnectionFactory;
import br.com.uemg.autopecas.model.Categoria;
import br.com.uemg.autopecas.model.Fornecedor;
import br.com.uemg.autopecas.model.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class ProdutoView extends javax.swing.JInternalFrame {

    public int transacao;

    /**
     * Creates new form Cliente
     */
    public ProdutoView() {
        initComponents();
        populaComboBoxCategorias();
        populaComboBoxFornecedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelDescricao = new javax.swing.JLabel();
        TextoDescricao = new javax.swing.JTextField();
        Painel = new javax.swing.JTabbedPane();
        PainelInformacoesPessoais = new javax.swing.JPanel();
        LabelApelido = new javax.swing.JLabel();
        LabelPrecoCusto = new javax.swing.JLabel();
        LabelPrecoVenda = new javax.swing.JLabel();
        LabelFornecedor = new javax.swing.JLabel();
        LabelEstoque = new javax.swing.JLabel();
        ComboBoxFornecedor = new javax.swing.JComboBox<>();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        TextoFormatadoPrecoVenda = new javax.swing.JFormattedTextField();
        TextoFormatadoPrecoCusto = new javax.swing.JFormattedTextField();
        TextoFormatadoEstoque = new javax.swing.JFormattedTextField();
        LabelQuantidade = new javax.swing.JLabel();
        LabelTipoUnidade = new javax.swing.JLabel();
        ComboBoxTipoUnidade = new javax.swing.JComboBox<>();
        BotaoAdicionarCategoria = new javax.swing.JButton();
        LabelDataCadastro = new javax.swing.JLabel();
        TextoFormatadoCadastro = new javax.swing.JFormattedTextField();
        TextoFormatadoQuantidade = new javax.swing.JFormattedTextField();
        BotaoGravar = new javax.swing.JButton();
        LabelCodigo = new javax.swing.JLabel();
        BotaoBuscar = new javax.swing.JButton();
        TextoCodigo = new javax.swing.JTextField();
        BotaoNovo = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Cadastro de Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Liberation Sans", 1, 18))); // NOI18N
        setClosable(true);
        setForeground(java.awt.Color.white);
        setResizable(true);
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setInputVerifier(getInputVerifier());
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

        LabelDescricao.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelDescricao.setText("Descrição");

        TextoDescricao.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        Painel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Painel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Painel.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                PainelVetoableChange(evt);
            }
        });

        LabelApelido.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelApelido.setText("Categoria:");

        LabelPrecoCusto.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelPrecoCusto.setText("Preço Custo:");

        LabelPrecoVenda.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelPrecoVenda.setText("Preço Venda:");

        LabelFornecedor.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelFornecedor.setText("Fornecedor:");

        LabelEstoque.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelEstoque.setText("Estoque");

        ComboBoxFornecedor.setSelectedItem(ComboBoxFornecedor);
        ComboBoxFornecedor.setEnabled(false);

        ComboBoxCategoria.setSelectedItem(ComboBoxCategoria);
        ComboBoxCategoria.setEnabled(false);

        TextoFormatadoPrecoVenda.setEditable(false);
        TextoFormatadoPrecoVenda.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        TextoFormatadoPrecoCusto.setEditable(false);
        TextoFormatadoPrecoCusto.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        TextoFormatadoPrecoCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoFormatadoPrecoCustoActionPerformed(evt);
            }
        });

        TextoFormatadoEstoque.setEditable(false);
        TextoFormatadoEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        TextoFormatadoEstoque.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        LabelQuantidade.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelQuantidade.setText("Quantidade");

        LabelTipoUnidade.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelTipoUnidade.setText("Tipo de Unidade:");

        ComboBoxTipoUnidade.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ComboBoxTipoUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNIDADE", "CAIXA", "CONJUNTO" }));
        ComboBoxTipoUnidade.setEnabled(false);

        BotaoAdicionarCategoria.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoAdicionarCategoria.setText("ADIC. CATEGORIA");
        BotaoAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarCategoriaActionPerformed(evt);
            }
        });

        LabelDataCadastro.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelDataCadastro.setText("Data de Cadastro");

        TextoFormatadoCadastro.setEditable(false);
        TextoFormatadoCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y/MM/dd"))));
        TextoFormatadoCadastro.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        TextoFormatadoQuantidade.setEditable(false);
        TextoFormatadoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        TextoFormatadoQuantidade.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout PainelInformacoesPessoaisLayout = new javax.swing.GroupLayout(PainelInformacoesPessoais);
        PainelInformacoesPessoais.setLayout(PainelInformacoesPessoaisLayout);
        PainelInformacoesPessoaisLayout.setHorizontalGroup(
            PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelPrecoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoFormatadoPrecoCusto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelPrecoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoFormatadoPrecoVenda))
                        .addGap(18, 18, 18)
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(LabelEstoque)
                                .addGap(36, 36, 36)
                                .addComponent(LabelQuantidade))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(TextoFormatadoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextoFormatadoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(LabelTipoUnidade)
                                .addGap(0, 55, Short.MAX_VALUE))
                            .addComponent(ComboBoxTipoUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addComponent(LabelFornecedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ComboBoxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(LabelApelido)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(BotaoAdicionarCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(TextoFormatadoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelDataCadastro, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        PainelInformacoesPessoaisLayout.setVerticalGroup(
            PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(LabelApelido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(LabelDataCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoFormatadoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoAdicionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPrecoVenda)
                            .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabelPrecoCusto)
                                .addComponent(LabelQuantidade)
                                .addComponent(LabelEstoque)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoFormatadoPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextoFormatadoPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextoFormatadoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextoFormatadoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelInformacoesPessoaisLayout.createSequentialGroup()
                        .addComponent(LabelTipoUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxTipoUnidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Painel.addTab("Detalhes do Produto", PainelInformacoesPessoais);

        BotaoGravar.setBackground(new java.awt.Color(0, 102, 102));
        BotaoGravar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoGravar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uemg/autopecas/assets/sign-check-icon_34365.png"))); // NOI18N
        BotaoGravar.setText("Gravar");
        BotaoGravar.setEnabled(false);
        BotaoGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGravarActionPerformed(evt);
            }
        });

        LabelCodigo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LabelCodigo.setText("Código");

        BotaoBuscar.setBackground(new java.awt.Color(0, 102, 102));
        BotaoBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uemg/autopecas/assets/search-icon_34373.png"))); // NOI18N
        BotaoBuscar.setToolTipText("");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        TextoCodigo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        BotaoNovo.setBackground(new java.awt.Color(0, 102, 102));
        BotaoNovo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoNovo.setForeground(new java.awt.Color(255, 255, 255));
        BotaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uemg/autopecas/assets/sign-add-icon_34367.png"))); // NOI18N
        BotaoNovo.setText("Novo");
        BotaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoActionPerformed(evt);
            }
        });

        BotaoEditar.setBackground(new java.awt.Color(51, 102, 255));
        BotaoEditar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uemg/autopecas/assets/pencil-icon_34383.png"))); // NOI18N
        BotaoEditar.setText("Editar");
        BotaoEditar.setEnabled(false);
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        BotaoCancelar.setBackground(new java.awt.Color(204, 0, 0));
        BotaoCancelar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uemg/autopecas/assets/sign-error-icon_34362.png"))); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.setEnabled(false);
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoExcluir.setBackground(new java.awt.Color(204, 0, 0));
        BotaoExcluir.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uemg/autopecas/assets/trashcan-full-icon_34338.png"))); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.setEnabled(false);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelDescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextoDescricao)))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGravar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCodigo)
                    .addComponent(LabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGravar)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoEditar)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoNovo))
                .addContainerGap())
        );

        setBounds(150, 50, 721, 525);
    }// </editor-fold>//GEN-END:initComponents

    public final void populaComboBoxCategorias() {

        try (Connection connection = new ConnectionFactory().getConnection()) {
            CategoriaDAO dao = new CategoriaDAO(connection);
            List<Categoria> categoria = new ArrayList<>();
            categoria = dao.read();

            for (Categoria c : categoria) {
                ComboBoxCategoria.addItem(c);

            }
        } catch (SQLException ex) {
        }
    }

    public final void populaComboBoxFornecedores() {

        try (Connection connection = new ConnectionFactory().getConnection()) {
            FornecedorDAO dao = new FornecedorDAO(connection);
            List<Fornecedor> fornecedor = new ArrayList();
            fornecedor = dao.read();

            for (Fornecedor f : fornecedor) {

                ComboBoxFornecedor.addItem(f);
            }
        } catch (SQLException ex) {
        }
    }

    private void BotaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGravarActionPerformed

        gravar();
        TextoCodigo.setEnabled(false);
        BotaoNovo.setEnabled(true);
        BotaoEditar.setEnabled(true);
    }//GEN-LAST:event_BotaoGravarActionPerformed

    public void gravar() {
        try (Connection connection = new ConnectionFactory().getConnection()) {

            ProdutoDAO dao = new ProdutoDAO(connection);
            if (transacao == 0) {

                Produto p = new Produto(
                        0,
                        (Categoria) ComboBoxCategoria.getSelectedItem(),
                        (Fornecedor) ComboBoxFornecedor.getSelectedItem(),
                        TextoDescricao.getText(),
                        Double.valueOf(TextoFormatadoPrecoCusto.getText()),
                        Double.valueOf(TextoFormatadoPrecoVenda.getText()),
                        Integer.valueOf(TextoFormatadoEstoque.getText()),
                        Integer.valueOf(TextoFormatadoEstoque.getText()),
                        String.valueOf(ComboBoxTipoUnidade.getSelectedIndex())
                );
                dao.create(p);

                JOptionPane.showMessageDialog(null, "Gravado no banco de dados!");
                TextoCodigo.setText("");
                campos(false);
            }
            if (transacao == 1) {

                Produto p = new Produto(
                        0,
                        (Categoria) ComboBoxCategoria.getSelectedItem(),
                        (Fornecedor) ComboBoxFornecedor.getSelectedItem(),
                        TextoDescricao.getText(),
                        Double.valueOf(TextoFormatadoPrecoCusto.getText()),
                        Double.valueOf(TextoFormatadoPrecoVenda.getText()),
                        Integer.valueOf(TextoFormatadoEstoque.getText()),
                        Integer.valueOf(TextoFormatadoEstoque.getText()),
                        String.valueOf(ComboBoxTipoUnidade.getSelectedIndex())
                );
                System.out.println(p);
                dao.update(p);

                JOptionPane.showMessageDialog(null, "Gravado no banco de dados!");
                campos(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível concluir a solicitação");
        }
    }

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        if (TextoCodigo.getText().isEmpty()) {
            buscar(0);
            BotaoNovo.setEnabled(true);
        } else {
            buscar(Integer.valueOf(TextoCodigo.getText()));
            BotaoEditar.setEnabled(true);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    public void buscar(Integer busca) {

        try (Connection connection = new ConnectionFactory().getConnection()) {

            if (busca != 0) {

                ProdutoDAO dao = new ProdutoDAO(connection);

                List<Produto> p = dao.read(busca);

                TextoCodigo.setEditable(false);
                BotaoEditar.setEnabled(true);
                preencher(p);
                campos(false);
            } else {
                TextoCodigo.setEnabled(false);
                ConsultaProdutoView produto = new ConsultaProdutoView();
                PrincipalView.DesktopPanePrincipal.add(produto);
                produto.setVisible(true);
                PrincipalView.DesktopPanePrincipal.setComponentZOrder(produto, 0);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não conseguimos recuperar essa informação");
        }
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formInternalFrameOpened

    private void BotaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoActionPerformed
        // TODO add your handling code here:
        transacao = 0;
        limpar();
        campos(true);

        TextoCodigo.setEditable(false);
        BotaoNovo.setEnabled(false);
        BotaoExcluir.setEnabled(false);
        BotaoEditar.setEnabled(false);
    }//GEN-LAST:event_BotaoNovoActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        // TODO add your handling code here:
        transacao = 1;
        campos(true);

        TextoCodigo.setEditable(false);
        BotaoEditar.setEnabled(false);
        BotaoNovo.setEnabled(false);
        BotaoGravar.setEnabled(true);
        BotaoCancelar.setEnabled(true);
        BotaoExcluir.setEnabled(true);
    }//GEN-LAST:event_BotaoEditarActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        // TODO add your handling code here:
        campos(false);

        TextoCodigo.setEditable(true);
        BotaoNovo.setEnabled(true);
        BotaoEditar.setEnabled(false);
        BotaoCancelar.setEnabled(false);
        BotaoGravar.setEnabled(false);
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void PainelVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_PainelVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_PainelVetoableChange

    private void BotaoAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarCategoriaActionPerformed

        CategoriaView ategoria = new CategoriaView();
        PrincipalView.DesktopPanePrincipal.add(ategoria);
        ategoria.setVisible(true);
        PrincipalView.DesktopPanePrincipal.setComponentZOrder(ategoria, 0);
    }//GEN-LAST:event_BotaoAdicionarCategoriaActionPerformed

    private void TextoFormatadoPrecoCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoFormatadoPrecoCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoFormatadoPrecoCustoActionPerformed

    public void excluir() {
        try (Connection connection = new ConnectionFactory().getConnection()) {

            if (JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Confirmação de exclusão!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                ProdutoDAO dao = new ProdutoDAO(connection);
                Produto p = new Produto();

                Integer id = Integer.valueOf(
                        TextoCodigo.getText());

                p.setId(id);
                dao.delete(p);
                limpar();
            }

            JOptionPane.showMessageDialog(null, "Excluído no Banco de Dados");
            campos(false);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível concluir a solicitação");
        }
    }

    public void capturar(Produto produto) {

        TextoCodigo.setText(String.valueOf(produto.getId()));
        TextoCodigo.requestFocus();

    }

    public void preencher(List<Produto> produto) {

        TextoCodigo.setText(String.valueOf(produto.get(0).getId()));
        TextoDescricao.setText(produto.get(0).getDescricao());
        ComboBoxCategoria.setSelectedItem(produto.get(0).getCategoria());
        ComboBoxFornecedor.setSelectedItem(produto.get(0).getFornecedor());
        TextoFormatadoPrecoCusto.setText(String.valueOf(produto.get(0).getCusto()));
        TextoFormatadoPrecoVenda.setText(String.valueOf(produto.get(0).getVenda()));
        TextoFormatadoEstoque.setText(String.valueOf(produto.get(0).getEstoque()));
        TextoFormatadoQuantidade.setText(String.valueOf(produto.get(0).getQuantidade()));
        ComboBoxTipoUnidade.setSelectedIndex(Integer.parseInt(produto.get(0).getUnidade()));

    }

    public void limpar() {

        TextoCodigo.setText("");
        TextoDescricao.setText("");
        ComboBoxCategoria.setSelectedItem("");
        ComboBoxFornecedor.setSelectedItem("");
        TextoFormatadoPrecoCusto.setText("");
        TextoFormatadoPrecoVenda.setText("");
        TextoFormatadoEstoque.setText("");
        TextoFormatadoQuantidade.setText("");
        ComboBoxTipoUnidade.setSelectedIndex(0);
    }

    public void campos(boolean status) {

        TextoDescricao.setEditable(status);
        ComboBoxCategoria.setEnabled(status);
        ComboBoxFornecedor.setEnabled(status);
        TextoFormatadoPrecoCusto.setEditable(status);
        TextoFormatadoPrecoVenda.setEditable(status);
        TextoFormatadoEstoque.setEditable(status);
        TextoFormatadoQuantidade.setEditable(status);
        ComboBoxTipoUnidade.setEnabled(status);
        BotaoCancelar.setEnabled(status);
        BotaoEditar.setEnabled(status);
        BotaoGravar.setEnabled(status);
        BotaoExcluir.setEnabled(status);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarCategoria;
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JButton BotaoNovo;
    private javax.swing.JComboBox<Categoria> ComboBoxCategoria;
    private javax.swing.JComboBox<Fornecedor> ComboBoxFornecedor;
    private javax.swing.JComboBox<String> ComboBoxTipoUnidade;
    private javax.swing.JLabel LabelApelido;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelDataCadastro;
    private javax.swing.JLabel LabelDescricao;
    private javax.swing.JLabel LabelEstoque;
    private javax.swing.JLabel LabelFornecedor;
    private javax.swing.JLabel LabelPrecoCusto;
    private javax.swing.JLabel LabelPrecoVenda;
    private javax.swing.JLabel LabelQuantidade;
    private javax.swing.JLabel LabelTipoUnidade;
    private javax.swing.JTabbedPane Painel;
    private javax.swing.JPanel PainelInformacoesPessoais;
    public static javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoDescricao;
    private javax.swing.JFormattedTextField TextoFormatadoCadastro;
    private javax.swing.JFormattedTextField TextoFormatadoEstoque;
    private javax.swing.JFormattedTextField TextoFormatadoPrecoCusto;
    private javax.swing.JFormattedTextField TextoFormatadoPrecoVenda;
    private javax.swing.JFormattedTextField TextoFormatadoQuantidade;
    // End of variables declaration//GEN-END:variables
}
