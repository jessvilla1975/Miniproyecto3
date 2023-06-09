package vista.componentesGUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class EliminarVista extends javax.swing.JPanel {
    
    /**
     * Creates new form EliminarVista
     */
    public EliminarVista() {
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

        bg = new javax.swing.JPanel();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        lbSeleccion = new javax.swing.JLabel();
        cbListaDulces = new javax.swing.JComboBox<>();
        btnEliminarDulce = new javax.swing.JButton();
        txtInformacion = new javax.swing.JTextField();
        lbSeleccion1 = new javax.swing.JLabel();
        lbEquis = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 250, 244));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTitulo.setBackground(new java.awt.Color(255, 226, 225));

        lbTitulo1.setFont(new java.awt.Font("Calisto MT", 0, 48)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(0, 51, 51));
        lbTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo1.setText("Eliminar Dulces");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(pnTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 110));

        lbSeleccion.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbSeleccion.setText("Seleccione el dulce que desea Eliminar");
        bg.add(lbSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        cbListaDulces.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        cbListaDulces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bg.add(cbListaDulces, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        btnEliminarDulce.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        btnEliminarDulce.setText("Eliminar Dulce");
        btnEliminarDulce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarDulceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarDulceMouseExited(evt);
            }
        });
        btnEliminarDulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDulceActionPerformed(evt);
            }
        });
        bg.add(btnEliminarDulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        txtInformacion.setEditable(false);
        txtInformacion.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        txtInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformacionActionPerformed(evt);
            }
        });
        bg.add(txtInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 370, 50));

        lbSeleccion1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbSeleccion1.setText("Informacion del dulce");
        bg.add(lbSeleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));
        bg.add(lbEquis, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarDulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDulceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarDulceActionPerformed

    private void txtInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInformacionActionPerformed

    private void btnEliminarDulceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarDulceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarDulceMouseEntered

    private void btnEliminarDulceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarDulceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarDulceMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnEliminarDulce;
    public javax.swing.JComboBox<String> cbListaDulces;
    private javax.swing.JLabel lbEquis;
    private javax.swing.JLabel lbSeleccion;
    private javax.swing.JLabel lbSeleccion1;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JPanel pnTitulo;
    public javax.swing.JTextField txtInformacion;
    // End of variables declaration//GEN-END:variables
}
