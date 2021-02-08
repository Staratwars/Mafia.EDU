/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EtudiantGestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GaetanScopel
 */
public class Importation extends javax.swing.JFrame {

    /**
     * Creates new form Importation
     */
    public Importation() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Importer FORMATION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Importation fichier CSV");

        jButton2.setText("Importer ETUDIANT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Importer UE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Importer UEVALIDE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Importer UTILISATEUR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con; //connexion
    PreparedStatement pst; //etat
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JFileChooser fc = new JFileChooser();
    /* affichage du dialog et test si le bouton ok est pressé */
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

        String nomFichierOuvert = fc.getSelectedFile().getName();
        String path = fc.getSelectedFile().getAbsolutePath();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionetudiant","root",""); //mdp de base vide (blck)
            /* demande au système d'ouvrir le fichier précédemment séléctionné*/

            String query = " LOAD DATA INFILE '"+nomFichierOuvert+"' INTO TABLE formation " + " FIELDS TERMINATED BY ';' " + " LINES TERMINATED BY '\n'(nomf,parcours)";


            ResultSet results;


            try{

            Statement stmt = con.createStatement();

            results = stmt.executeQuery(query);

            stmt.close();
            }

            catch(Exception e){
            System.out.println("exception due à la requête"+e);
            }

    }
    catch(Exception e){
            System.out.println("exception due à la requête"+e);
                }
    }
         
        

        

       
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
    /* affichage du dialog et test si le bouton ok est pressé */
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

        String nomFichierOuvert = fc.getSelectedFile().getName();
        //String path = fc.getSelectedFile().getAbsolutePath();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionetudiant","root",""); //mdp de base vide (blck)
            /* demande au système d'ouvrir le fichier précédemment séléctionné*/

            String query = " LOAD DATA INFILE '"+nomFichierOuvert+"' INTO TABLE etudiant " + " FIELDS TERMINATED BY ';' " + " LINES TERMINATED BY '\n'(prenom,nom,sexe,tel,mail,idf,nomf)";


            ResultSet results;


            try{

            Statement stmt = con.createStatement();

            results = stmt.executeQuery(query);

            stmt.close();
            }

            catch(Exception e){
            System.out.println("exception due à la requête"+e);
            }

    }
    catch(Exception e){
            System.out.println("exception due à la requête"+e);
                }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             JFileChooser fc = new JFileChooser();
    /* affichage du dialog et test si le bouton ok est pressé */
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

        String nomFichierOuvert = fc.getSelectedFile().getName();
        //String path = fc.getSelectedFile().getAbsolutePath();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionetudiant","root",""); //mdp de base vide (blck)
            /* demande au système d'ouvrir le fichier précédemment séléctionné*/

            String query = " LOAD DATA INFILE '"+nomFichierOuvert+"' INTO TABLE ue " + " FIELDS TERMINATED BY ';' " + " LINES TERMINATED BY '\n'(nom,dureeh,ECTS)";


            ResultSet results;


            try{

            Statement stmt = con.createStatement();

            results = stmt.executeQuery(query);

            stmt.close();
            }

            catch(Exception e){
            System.out.println("exception due à la requête"+e);
            }

    }
    catch(Exception e){
            System.out.println("exception due à la requête"+e);
                }
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    JFileChooser fc = new JFileChooser();
    /* affichage du dialog et test si le bouton ok est pressé */
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

        String nomFichierOuvert = fc.getSelectedFile().getName();
        //String path = fc.getSelectedFile().getAbsolutePath();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionetudiant","root",""); //mdp de base vide (blck)
            /* demande au système d'ouvrir le fichier précédemment séléctionné*/

            String query = " LOAD DATA INFILE '"+nomFichierOuvert+"' INTO TABLE uevalide " + " FIELDS TERMINATED BY ';' " + " LINES TERMINATED BY '\n'(validation,note,idUe,idE,semestre,anneU)";


            ResultSet results;


            try{

            Statement stmt = con.createStatement();

            results = stmt.executeQuery(query);

            stmt.close();
            }

            catch(Exception e){
            System.out.println("exception due à la requête"+e);
            }

    }
    catch(Exception e){
            System.out.println("exception due à la requête"+e);
                }
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          JFileChooser fc = new JFileChooser();
    /* affichage du dialog et test si le bouton ok est pressé */
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

        String nomFichierOuvert = fc.getSelectedFile().getName();
        //String path = fc.getSelectedFile().getAbsolutePath();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionetudiant","root",""); //mdp de base vide (blck)
            /* demande au système d'ouvrir le fichier précédemment séléctionné*/

            String query = " LOAD DATA INFILE '"+nomFichierOuvert+"' INTO TABLE utilisateur " + " FIELDS TERMINATED BY ';' " + " LINES TERMINATED BY '\n'(nom,prenom,motdepasse,utype,Username)";


            ResultSet results;


            try{

            Statement stmt = con.createStatement();

            results = stmt.executeQuery(query);

            stmt.close();
            }

            catch(Exception e){
            System.out.println("exception due à la requête"+e);
            }

    }
    catch(Exception e){
            System.out.println("exception due à la requête"+e);
                }
    }
    }//GEN-LAST:event_jButton5ActionPerformed
               
       
    
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
            java.util.logging.Logger.getLogger(Importation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Importation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Importation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Importation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Importation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
