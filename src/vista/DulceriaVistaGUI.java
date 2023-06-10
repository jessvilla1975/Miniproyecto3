package vista;
import java.awt.BorderLayout;
import java.awt.Color;

import controlador.ControladorDulceria;
import vista.componentesGUI.*;


public class DulceriaVistaGUI extends javax.swing.JFrame implements Vista {

    public DulceriaVistaGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        lbIcono = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        separador = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JPanel();
        lbActualizar = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JPanel();
        lbInsertar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lbEliminar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        lbBuscar = new javax.swing.JLabel();
        btnLista = new javax.swing.JPanel();
        lbLista = new javax.swing.JLabel();
        contenidoPrincipal = new javax.swing.JPanel();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        lbTexto = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setBackground(new java.awt.Color(255, 255, 203));
        pnMenu.setPreferredSize(new java.awt.Dimension(200, 450));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon2.png"))); // NOI18N
        lbIcono.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnMenu.add(lbIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 0, -1, -1));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setText("Dulceria");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleMouseExited(evt);
            }
        });
        pnMenu.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        separador.setBackground(new java.awt.Color(255, 237, 203));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnMenu.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 10));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 203));

        lbActualizar.setBackground(new java.awt.Color(102, 102, 102));
        lbActualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbActualizar.setForeground(new java.awt.Color(153, 153, 153));
        lbActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbActualizar.setText("Actualizar dulces");
        lbActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnMenu.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 40));

        btnInsertar.setBackground(new java.awt.Color(255, 255, 203));

        lbInsertar.setBackground(new java.awt.Color(225, 225, 203));
        lbInsertar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbInsertar.setForeground(new java.awt.Color(153, 153, 153));
        lbInsertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInsertar.setText("Insertar dulces");
        lbInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInsertarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbInsertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbInsertarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInsertarLayout = new javax.swing.GroupLayout(btnInsertar);
        btnInsertar.setLayout(btnInsertarLayout);
        btnInsertarLayout.setHorizontalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        btnInsertarLayout.setVerticalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnMenu.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 203));

        lbEliminar.setBackground(new java.awt.Color(102, 102, 102));
        lbEliminar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbEliminar.setForeground(new java.awt.Color(153, 153, 153));
        lbEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEliminar.setText("Eliminar dulces");
        lbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnMenu.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 203));

        lbBuscar.setBackground(new java.awt.Color(102, 102, 102));
        lbBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbBuscar.setForeground(new java.awt.Color(153, 153, 153));
        lbBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBuscar.setText("Buscar dulces");
        lbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnMenu.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 40));

        btnLista.setBackground(new java.awt.Color(255, 255, 203));

        lbLista.setBackground(new java.awt.Color(102, 102, 102));
        lbLista.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbLista.setForeground(new java.awt.Color(153, 153, 153));
        lbLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLista.setText("Listar dulces");
        lbLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbListaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnListaLayout = new javax.swing.GroupLayout(btnLista);
        btnLista.setLayout(btnListaLayout);
        btnListaLayout.setHorizontalGroup(
            btnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnListaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnListaLayout.setVerticalGroup(
            btnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnListaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnMenu.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 40));

        bg.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 450));

        contenidoPrincipal.setBackground(new java.awt.Color(255, 250, 244));

        pnTitulo.setBackground(new java.awt.Color(255, 226, 225));

        lbTitulo1.setFont(new java.awt.Font("Calisto MT", 0, 48)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(0, 51, 51));
        lbTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo1.setText("Bienvenido/a");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbTexto.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lbTexto.setText("Bienvenido a la izquierda tienes diversas opciones ");

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dulcesMain.png"))); // NOI18N

        javax.swing.GroupLayout contenidoPrincipalLayout = new javax.swing.GroupLayout(contenidoPrincipal);
        contenidoPrincipal.setLayout(contenidoPrincipalLayout);
        contenidoPrincipalLayout.setHorizontalGroup(
            contenidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoPrincipalLayout.createSequentialGroup()
                .addGroup(contenidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoPrincipalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbImagen))
                    .addGroup(contenidoPrincipalLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lbTexto))
                    .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        contenidoPrincipalLayout.setVerticalGroup(
            contenidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(contenidoPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(contenidoPrincipalLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbTexto))
        );

        bg.add(contenidoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInsertarMouseEntered
        btnInsertar.setBackground(new Color(255,237,184));
    }//GEN-LAST:event_lbInsertarMouseEntered

    private void lbInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInsertarMouseExited
        btnInsertar.setBackground(new Color(255,255,203));
    }//GEN-LAST:event_lbInsertarMouseExited

    private void lbActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbActualizarMouseEntered
        btnActualizar.setBackground(new Color(255,237,184));
    }//GEN-LAST:event_lbActualizarMouseEntered

    private void lbActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbActualizarMouseExited
       btnActualizar.setBackground(new Color(255,255,203));
    }//GEN-LAST:event_lbActualizarMouseExited

    private void lbEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEliminarMouseEntered
        btnEliminar.setBackground(new Color(255,237,184));
    }//GEN-LAST:event_lbEliminarMouseEntered

    private void lbEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEliminarMouseExited
        btnEliminar.setBackground(new Color(255,255,203));
    }//GEN-LAST:event_lbEliminarMouseExited

    private void lbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuscarMouseEntered
        btnBuscar.setBackground(new Color(255,237,184));
    }//GEN-LAST:event_lbBuscarMouseEntered

    private void lbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuscarMouseExited
        btnBuscar.setBackground(new Color(255,255,203));
    }//GEN-LAST:event_lbBuscarMouseExited

    private void lbListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaMouseEntered
        btnLista.setBackground(new Color(255,237,184));
    }//GEN-LAST:event_lbListaMouseEntered

    private void lbListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaMouseExited
        btnLista.setBackground(new Color(255,255,203));
    }//GEN-LAST:event_lbListaMouseExited

    private void lbInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInsertarMouseClicked
        InsertarVista menuInsertar = new InsertarVista();
        menuInsertar.setSize(600,480);
        menuInsertar.setLocation(0,0);
        
        contenidoPrincipal.removeAll();
        contenidoPrincipal.add(menuInsertar, BorderLayout.CENTER);
        contenidoPrincipal.revalidate();
        contenidoPrincipal.repaint();
    }//GEN-LAST:event_lbInsertarMouseClicked

    private void titleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseEntered
        //btnLista.setBackground(new Color(255,237,184));
    }//GEN-LAST:event_titleMouseEntered

    private void titleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseExited
        //btnLista.setBackground(new Color(255,255,203));
    }//GEN-LAST:event_titleMouseExited

    private void lbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbActualizarMouseClicked
        ActualizarVista menuActualizar = new ActualizarVista();
        menuActualizar.setSize(600,480);
        menuActualizar.setLocation(0,0);
        
        contenidoPrincipal.removeAll();
        contenidoPrincipal.add(menuActualizar, BorderLayout.CENTER);
        contenidoPrincipal.revalidate();
        contenidoPrincipal.repaint();
    }//GEN-LAST:event_lbActualizarMouseClicked

    private void lbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEliminarMouseClicked
        EliminarVista menuEliminar = new EliminarVista();
        menuEliminar.setSize(600,480);
        menuEliminar.setLocation(0,0);
        
        contenidoPrincipal.removeAll();
        contenidoPrincipal.add(menuEliminar, BorderLayout.CENTER);
        contenidoPrincipal.revalidate();
        contenidoPrincipal.repaint();
    }//GEN-LAST:event_lbEliminarMouseClicked

    private void lbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuscarMouseClicked
        BuscarVista menuBuscar = new BuscarVista();
        menuBuscar.setSize(600,480);
        menuBuscar.setLocation(0,0);
        
        contenidoPrincipal.removeAll();
        contenidoPrincipal.add(menuBuscar, BorderLayout.CENTER);
        contenidoPrincipal.revalidate();
        contenidoPrincipal.repaint();
    }//GEN-LAST:event_lbBuscarMouseClicked

    private void lbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaMouseClicked
        ListaVista menuLista = new ListaVista();
        menuLista.setSize(600,480);
        menuLista.setLocation(0,0);
        
        contenidoPrincipal.removeAll();
        contenidoPrincipal.add(menuLista, BorderLayout.CENTER);
        contenidoPrincipal.revalidate();
        contenidoPrincipal.repaint();
    }//GEN-LAST:event_lbListaMouseClicked

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
            java.util.logging.Logger.getLogger(DulceriaVistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DulceriaVistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DulceriaVistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DulceriaVistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DulceriaVistaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnInsertar;
    private javax.swing.JPanel btnLista;
    public javax.swing.JPanel contenidoPrincipal;
    public javax.swing.JLabel lbActualizar;
    public javax.swing.JLabel lbBuscar;
    public javax.swing.JLabel lbEliminar;
    private javax.swing.JLabel lbIcono;
    private javax.swing.JLabel lbImagen;
    public javax.swing.JLabel lbInsertar;
    public javax.swing.JLabel lbLista;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JPanel separador;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    // Metodos a implementar
   

    @Override
    public void insertarDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertarDulce'");
    }

    @Override
    public void actualizarDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarDulce'");
    }

    @Override
    public void eliminarDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarDulce'");
    }

    @Override
    public void buscarDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarDulce'");
    }

    @Override
    public void listarDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarDulce'");
    }

    @Override
    public void iniciar(ControladorDulceria controlador) {
        setVisible(true);
    }

    @Override
    public String getNombresDulces() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombresDulces'");
    }

    @Override
    public String getCategoria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategoria'");
    }
}
