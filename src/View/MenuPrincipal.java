/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MenuPrincipalController;

/**
 *
 * @author Administrador
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuPaciente = new javax.swing.JMenuItem();
        jMenuServiços = new javax.swing.JMenuItem();
        jMenuEspecialista = new javax.swing.JMenuItem();
        jMenuProntiarios = new javax.swing.JMenu();
        jMenuAgenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setText("Cadastros");

        jMenuPaciente.setText("Paciente");
        jMenuCadastro.add(jMenuPaciente);

        jMenuServiços.setText("Serviços");
        jMenuCadastro.add(jMenuServiços);

        jMenuEspecialista.setText("Prontuario");
        jMenuCadastro.add(jMenuEspecialista);
        jMenuEspecialista.getAccessibleContext().setAccessibleName("Especialista");

        jMenuBar1.add(jMenuCadastro);

        jMenuProntiarios.setText("Prontiarios");
        jMenuBar1.add(jMenuProntiarios);

        jMenuAgenda.setText("Agenda");
        jMenuAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAgendaMouseClicked(evt);
            }
        });
        jMenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendaActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuAgenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendaActionPerformed
        
    }//GEN-LAST:event_jMenuAgendaActionPerformed

    private void jMenuAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAgendaMouseClicked
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_jMenuAgendaMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuEspecialista;
    private javax.swing.JMenuItem jMenuPaciente;
    private javax.swing.JMenu jMenuProntiarios;
    private javax.swing.JMenuItem jMenuServiços;
    // End of variables declaration//GEN-END:variables
}