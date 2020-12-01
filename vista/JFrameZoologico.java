package vista;
import hijas.Vicunia;
import hijas.Gallina;
import hijas.Tigre;
import javax.swing.ImageIcon;
import padre.Animal;
/**
 *
 * @author pr1407
 */
public class JFrameZoologico extends javax.swing.JFrame {
    
    public JFrameZoologico() {
        initComponents();
        agregarElementos();
    }
    
    void agregarElementos(){
        jboxOpciones.addItem("Seleccione Animal");
        jboxOpciones.addItem("Gallina");
        jboxOpciones.addItem("Tigre");
        jboxOpciones.addItem("Vicunia");
    }
    
    void elegirAnimal(){
        int op = jboxOpciones.getSelectedIndex();
        switch(op){
            case 0: 
                desactivarMetodos(true);
                limpiar();
                break;
            case 1:
                limpiar();
                lblString.setText("Color ");
                lblInt.setText("Edad(anios)");
                imgAnimal.setIcon(new ImageIcon("src/img/hqdefault.jpg"));
                lblnombreAnimal.setText("Gallina");
                desactivarMetodos(false);       
                btnComer.setEnabled(false);
                btnRuido.setEnabled(false);
                break;
            case 2:
                limpiar();
                lblString.setText("Nombre");
                lblInt.setText("Edad(anios)");
                imgAnimal.setIcon(new ImageIcon("src/img/trigre_c.jpg"));
                lblnombreAnimal.setText("Tigre");
                desactivarMetodos(false);
                btnComer.setEnabled(false);
                btnRuido.setEnabled(false);
                break;
            case 3:            
                limpiar();
                imgAnimal.setIcon(new ImageIcon("src/img/Vicuna.jpg"));
                lblnombreAnimal.setText("Vicunia");
                desactivarMetodos(false);
                txtDatoString.setEnabled(false);
                txtDatoInt.setEnabled(false);
                btnComer.setEnabled(false);
                btnRuido.setEnabled(false);
                break;     
        }
    }
    
    void FichaTecnicaVicunia(){
        Animal vicunia = new Vicunia();
        lblFichaAnimal.setText("Informacion de la Vicunia");
        lblNombre.setText("Nombre: "+ vicunia.getNombre());
        lblEdad.setText("Edad: " + vicunia.getEdad()+" anios");
        lblPeso.setText("Peso: " + vicunia.getPeso() + " kg");
        lblColor.setText("Color: "+vicunia.getColor());
    }
    
    void FichaTecnicaTigre(){
        String nuevonombre = txtDatoString.getText();
        int nuevaedad = Integer.parseInt(txtDatoInt.getText());
        Animal tigre = new Tigre(nuevonombre, nuevaedad);
        lblFichaAnimal.setText("Informacion del Tigre");
        lblNombre.setText("Nombre: "+ tigre.getNombre());
        lblEdad.setText("Edad: " + tigre.getEdad()+" anios");
        lblPeso.setText("Peso: " + tigre.getPeso() + " kg");
        lblColor.setText("Color: "+tigre.getColor());
    }
    
    void FichaTecnicaGallina(){
        String nuevocolor = txtDatoString.getText();
        int nuevaedad = Integer.parseInt(txtDatoInt.getText());
        Animal gallina = new Gallina(nuevocolor, nuevaedad);
        lblFichaAnimal.setText("Informacion de la Gallina");
        lblNombre.setText("Nombre: "+ gallina.getNombre());
        lblEdad.setText("Edad: " + gallina.getEdad()+" anios");
        lblPeso.setText("Peso: " + gallina.getPeso() + " kg");
        lblColor.setText("Color: "+gallina.getColor());
    }
    
    void desactivarMetodos(boolean band){
        txtDatoInt.setEnabled(!band);
        txtDatoString.setEnabled(!band);
        btnMostrarInfoAnimal.setEnabled(!band);
        btnComer.setEnabled(!band);
        btnRuido.setEnabled(!band);
    }
    
    void limpiar(){
        txtDatoString.setText(null);
        txtDatoInt.setText(null);
        lblNombre.setText(null);
        lblEdad.setText(null);
        lblPeso.setText(null);
        lblColor.setText(null);
        lblString.setText(null);
        lblInt.setText(null);
        lblnombreAnimal.setText(null);
        lblFichaAnimal.setText(null);
        lblAccion.setText(null);
        imgAnimal.setIcon(null);
    }
    
    void Ruido(){
        int op = jboxOpciones.getSelectedIndex();
        switch(op){
            case 1:
                Animal gallina = new Gallina(txtDatoString.getText() , Integer.parseInt(txtDatoInt.getText()) );
                lblAccion.setText(gallina.hacerRuido());
            break;
            case 2 : 
                Animal tigre = new Tigre(txtDatoString.getText() , Integer.parseInt(txtDatoInt.getText()));
                lblAccion.setText(tigre.hacerRuido());
                break ;
            case 3:
                Animal vicunia = new Vicunia();
                lblAccion.setText(vicunia.hacerRuido());   
                break;
        }
    }
    
    void Comer(){
        int op = jboxOpciones.getSelectedIndex();
        switch(op){
            case 1:
                Animal gallina = new Gallina(txtDatoString.getText() , Integer.parseInt(txtDatoInt.getText()) );
                lblAccion.setText(gallina.comer());
            break;
            case 2 : 
                Animal tigre = new Tigre(txtDatoString.getText() , Integer.parseInt(txtDatoInt.getText()));
                lblAccion.setText(tigre.comer());
                break ;
            case 3:
                Animal vicunia = new Vicunia();
                lblAccion.setText(vicunia.comer());   
                break;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jboxOpciones = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        imgAnimal = new javax.swing.JLabel();
        lblnombreAnimal = new javax.swing.JLabel();
        btnMostrarInfoAnimal = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        btnRuido = new javax.swing.JButton();
        btnComer = new javax.swing.JToggleButton();
        lblAccion = new javax.swing.JLabel();
        txtDatoString = new javax.swing.JTextField();
        txtDatoInt = new javax.swing.JTextField();
        lblString = new javax.swing.JLabel();
        lblInt = new javax.swing.JLabel();
        lblFichaAnimal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jboxOpciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jboxOpcionesItemStateChanged(evt);
            }
        });
        jboxOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxOpcionesActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText(" Informacion del Zoologico");
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoo-huachipa_1.jpg"))); // NOI18N
        imgLogo.setText(" ");
        imgLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnMostrarInfoAnimal.setText("Mostrar informacion");
        btnMostrarInfoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoAnimalActionPerformed(evt);
            }
        });

        btnRuido.setText("Ruido");
        btnRuido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuidoActionPerformed(evt);
            }
        });

        btnComer.setText("Darle de Comer");
        btnComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerActionPerformed(evt);
            }
        });

        txtDatoString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoStringActionPerformed(evt);
            }
        });

        lblFichaAnimal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jboxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(136, 136, 136)
                                            .addComponent(lblnombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(85, 85, 85)
                                            .addComponent(imgAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(lblFichaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(txtDatoString, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(txtDatoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(lblString, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblInt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnRuido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnComer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(34, 34, 34))
                                .addComponent(btnMostrarInfoAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jboxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgLogo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnMostrarInfoAnimal)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblString, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtDatoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatoString, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblFichaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRuido)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatoStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoStringActionPerformed

    private void btnRuidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuidoActionPerformed
        Ruido();
    }//GEN-LAST:event_btnRuidoActionPerformed

    private void btnMostrarInfoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInfoAnimalActionPerformed
        int op = jboxOpciones.getSelectedIndex();
        switch(op){
            case 1:
                FichaTecnicaGallina();
                break;
            case 2:
                FichaTecnicaTigre();
                break;
            case 3:
                FichaTecnicaVicunia();
                break;
        }
        btnComer.setEnabled(true);
        btnRuido.setEnabled(true);
    }//GEN-LAST:event_btnMostrarInfoAnimalActionPerformed

    private void jboxOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxOpcionesActionPerformed

    private void jboxOpcionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jboxOpcionesItemStateChanged
        elegirAnimal();
        
    }//GEN-LAST:event_jboxOpcionesItemStateChanged

    private void btnComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerActionPerformed
        Comer();
    }//GEN-LAST:event_btnComerActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameZoologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameZoologico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnComer;
    private javax.swing.JButton btnMostrarInfoAnimal;
    private javax.swing.JButton btnRuido;
    private javax.swing.JLabel imgAnimal;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jboxOpciones;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFichaAnimal;
    private javax.swing.JLabel lblInt;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblString;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblnombreAnimal;
    private javax.swing.JTextField txtDatoInt;
    private javax.swing.JTextField txtDatoString;
    // End of variables declaration//GEN-END:variables
}
