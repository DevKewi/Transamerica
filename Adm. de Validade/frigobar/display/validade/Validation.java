/*
 * Projeto destribuido por DEVKEWI COMPANY - Todos os direitos reservados.
 * Para alteração do código fonte estará disposto a concordar com termos.
 */
package frigobar.display.validade;

import frigobar.display.Menu;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTable;
import me.kewi.Frigobar;

/**
 *
 * @author DEVKEWI COMPANY - Kewilleen
 */
public class Validation extends javax.swing.JFrame {

    private frigobar.manager.Validation v = Frigobar.getValidation();
    private Menu m = v.getMenu();
    private boolean visible, visibled = false;

    /**
     * Creates new form Validation
     */
    public Validation() {
        initComponents();
        Frigobar.getValidation().minimizar(this);
        setTitle("Verificação de protudos");
        setLocationRelativeTo(null);
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/frigobar/imagens/Icon/logo16x16.png"));
        setIconImage(img);
        checkVisible();
    }

    private void checkVisible() {
        System.out.println(visible);
        if (visible && !visibled) {
            if (table.getRowCount() == 0) {
                this.setVisible(false);
                this.visibled = true;
                Valido v = new Valido();
                v.setVisible(true);
            }
        }
    }

    public boolean getVisibled() {
        return visible;
    }

    public void setVisibled(boolean visible) {
        this.visible = visible;
        checkVisible();
    }

    public JTable getTable() {
        return table;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bNova = new javax.swing.JButton();
        bMenuBar = new javax.swing.JMenuBar();
        bMenu = new javax.swing.JMenu();
        mEditar = new javax.swing.JMenu();
        bRemover = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Próximo(s) vencimento(s)");
        jLabel1.setToolTipText("Classifique-se os breve vencimento(s) abaixo");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTO", "LOTE", "QNT.", "T. DO ALMOX.", "VALIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        bNova.setText("Nova demanda");
        bNova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bNovaMouseClicked(evt);
            }
        });

        bMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frigobar/imagens/Icon/home16x16.png"))); // NOI18N
        bMenu.setText("Menu");
        bMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMenuMouseClicked(evt);
            }
        });
        bMenuBar.add(bMenu);

        mEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frigobar/imagens/Icon/edit16x16.png"))); // NOI18N
        mEditar.setText("Editar");
        mEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mEditarMouseClicked(evt);
            }
        });
        bMenuBar.add(mEditar);

        bRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frigobar/imagens/Icon/trash16x15.png"))); // NOI18N
        bRemover.setText("Remover");
        bRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRemoverMouseClicked(evt);
            }
        });
        bMenuBar.add(bRemover);

        setJMenuBar(bMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bNova)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bNova)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMenuMouseClicked
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_bMenuMouseClicked

    private void bNovaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNovaMouseClicked
        Demanda d = v.getDemanda();
        if (d.getProdutos().getSelectedItem() == null || ((String) d.getProdutos().getSelectedItem()).isEmpty()) {
            Frigobar.sendInfo(2, "Não há produto cadastrado para inserção de vencimento", "Sem produtos");
            return;
        }
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_bNovaMouseClicked

    private void mEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mEditarMouseClicked
        this.setVisible(false);
        Editar e = new Editar();
        e.setVisible(true);
    }//GEN-LAST:event_mEditarMouseClicked

    private void bRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRemoverMouseClicked
        Remover r = new Remover();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bRemoverMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bMenu;
    private javax.swing.JMenuBar bMenuBar;
    private javax.swing.JButton bNova;
    private javax.swing.JMenu bRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mEditar;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
