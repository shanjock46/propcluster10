/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 04-may-2010, 16:03:27
 */
package testVistas;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Alberto
 */
public class Principal extends javax.swing.JFrame implements WindowListener {


    /** Creates new form principal */
    public Principal() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        initComponents();
        setLocation(((int)dim.getWidth()/2)-(this.getWidth()/2), ((int)dim.getHeight()/2)-(this.getHeight()/2));
        addWindowListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonNova = new javax.swing.JButton();
        ButtonRanquing = new javax.swing.JButton();
        ButtonSortir = new javax.swing.JButton();
        ButtonVisual = new javax.swing.JButton();
        ButtonEst = new javax.swing.JButton();
        ButtonCrearJug = new javax.swing.JButton();
        ButtonCarregar = new javax.swing.JButton();
        ButtonAjuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("POKER FIVE CARD DRAW");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        ButtonNova.setText("Nova Partida");
        ButtonNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovaActionPerformed(evt);
            }
        });

        ButtonRanquing.setText("Ranquing");
        ButtonRanquing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRanquingActionPerformed(evt);
            }
        });

        ButtonSortir.setText("Sortir");
        ButtonSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSortirActionPerformed(evt);
            }
        });

        ButtonVisual.setText("Visualitzar Partida");
        ButtonVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVisualActionPerformed(evt);
            }
        });

        ButtonEst.setText("Estadistiques");
        ButtonEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEstActionPerformed(evt);
            }
        });

        ButtonCrearJug.setText("Crear Jugador");
        ButtonCrearJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearJugActionPerformed(evt);
            }
        });

        ButtonCarregar.setText("Carregar Partida");
        ButtonCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCarregarActionPerformed(evt);
            }
        });

        ButtonAjuda.setText("Ajuda");
        ButtonAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjudaActionPerformed(evt);
            }
        });

        jLabel1.setText("POKER FIVE CARD DRAW");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonRanquing, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ButtonEst, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonCrearJug, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ButtonVisual, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ButtonNova, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ButtonAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonSortir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(52, 52, 52)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNova, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSortir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonVisual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonCrearJug, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonEst, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonRanquing, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovaActionPerformed
        NovaPartida p = new NovaPartida();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonNovaActionPerformed

    private void ButtonRanquingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRanquingActionPerformed
        Ranquing p = new Ranquing();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonRanquingActionPerformed

    private void ButtonSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSortirActionPerformed
        AvisSortir();
    }//GEN-LAST:event_ButtonSortirActionPerformed

    private void ButtonVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVisualActionPerformed
        VisualitzarPartida p =new VisualitzarPartida();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonVisualActionPerformed

    private void ButtonEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEstActionPerformed
        Estadistiques p = new Estadistiques();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonEstActionPerformed

    private void ButtonCrearJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearJugActionPerformed
        CrearJugador p = new CrearJugador();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonCrearJugActionPerformed

    private void ButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCarregarActionPerformed

    private void ButtonAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjudaActionPerformed
        this.setEnabled(false);
        Ajuda p = new Ajuda(this);
    }//GEN-LAST:event_ButtonAjudaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjuda;
    private javax.swing.JButton ButtonCarregar;
    private javax.swing.JButton ButtonCrearJug;
    private javax.swing.JButton ButtonEst;
    private javax.swing.JButton ButtonNova;
    private javax.swing.JButton ButtonRanquing;
    private javax.swing.JButton ButtonSortir;
    private javax.swing.JButton ButtonVisual;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void AvisSortir(){
        Point pt = new Point();
        pt = this.getLocation();
        AvisSortir p = new AvisSortir(this);
        p.setLocation(pt);
        this.setEnabled(false);
        p.setVisible(true);
    }

    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        AvisSortir();
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

}
