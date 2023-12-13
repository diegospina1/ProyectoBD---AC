package co.edu.ue.principal;

import co.edu.ue.entities.Citas;
import co.edu.ue.model.CitasDao;

public class CrearCita extends javax.swing.JInternalFrame {

    
    public CrearCita() {
        initComponents();
    }
    
    public void ClearFields(){
        txtNombreCita.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtDireccion.setText("");
        txtConsultorio.setText("");
        txtDocPac.setText("");
        txtDocMed.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreCita = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtConsultorio = new javax.swing.JTextField();
        labelNombreCita = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelConsultorio = new javax.swing.JLabel();
        btnAddCita = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        labelCodigoCita = new javax.swing.JLabel();
        txtCodigoCita = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labelDocPac = new javax.swing.JLabel();
        txtDocPac = new javax.swing.JTextField();
        labelDocMed = new javax.swing.JLabel();
        txtDocMed = new javax.swing.JTextField();
        btnMod = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        labelNombreCita.setText("Nombre Cita");

        labelFecha.setText("Fecha");

        labelHora.setText("Hora");

        labelDireccion.setText("Dirección");

        labelConsultorio.setText("Consultorio");

        btnAddCita.setText("Agregar");
        btnAddCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCitaActionPerformed(evt);
            }
        });

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelCodigoCita.setText("Codigo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelDocPac.setText("Documento paciente");

        labelDocMed.setText("Documento medico");

        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnBorrar.setText("Dar de baja");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAddCita)
                        .addGap(27, 27, 27)
                        .addComponent(btnMod)
                        .addGap(30, 30, 30)
                        .addComponent(btnClear)
                        .addGap(34, 34, 34)
                        .addComponent(btnBorrar)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNombreCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelHora)
                                .addComponent(labelDireccion)
                                .addComponent(labelConsultorio))
                            .addComponent(labelCodigoCita)
                            .addComponent(labelDocPac)
                            .addComponent(labelDocMed))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(txtHora)
                            .addComponent(txtNombreCita)
                            .addComponent(txtConsultorio)
                            .addComponent(txtFecha)
                            .addComponent(txtCodigoCita)
                            .addComponent(txtDocPac)
                            .addComponent(txtDocMed, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnBuscar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoCita)
                    .addComponent(txtCodigoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreCita))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConsultorio)
                    .addComponent(txtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocPac)
                    .addComponent(txtDocPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocMed)
                    .addComponent(txtDocMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCita)
                    .addComponent(btnClear)
                    .addComponent(btnCancelar)
                    .addComponent(btnMod)
                    .addComponent(btnBorrar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCitaActionPerformed
        
        Citas cita = new Citas(txtNombreCita.getText(), txtFecha.getText(), txtHora.getText(), txtDireccion.getText(), 
                txtConsultorio.getText(), Integer.parseInt(txtDocMed.getText()), Integer.parseInt(txtDocPac.getText()));
        
        CitasDao dao = new CitasDao();
        
        dao.addCita(cita);
        
        ClearFields();
        
    }//GEN-LAST:event_btnAddCitaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        ClearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        CitasDao dao = new CitasDao();
        Citas cita;
        
        cita = dao.buscarCita(Integer.parseInt(txtCodigoCita.getText()));
        
        txtNombreCita.setText(cita.getNombre_cita());
        txtFecha.setText(cita.getFecha_cita());
        txtHora.setText(cita.getHora_cita());
        txtDireccion.setText(cita.getDireccion_cita());
        txtConsultorio.setText(cita.getConsultorio());
        txtDocPac.setText(String.valueOf(cita.getDocumento_pac()));
        txtDocMed.setText(String.valueOf(cita.getDocumento_med()));
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        
        int citaVieja = Integer.parseInt(txtCodigoCita.getText());
        
        CitasDao dao = new CitasDao();
        Citas cita = new Citas(txtNombreCita.getText(), txtFecha.getText(), txtHora.getText(), txtDireccion.getText(),
                                txtConsultorio.getText(), Integer.parseInt(txtDocMed.getText()),Integer.parseInt(txtDocPac.getText()) );
        
        dao.modificarCita(cita, citaVieja);
        
        ClearFields();
        
    }//GEN-LAST:event_btnModActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        CitasDao dao = new CitasDao();
        dao.DarDeBajaCita(Integer.parseInt(txtCodigoCita.getText()));
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCita;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnMod;
    private javax.swing.JLabel labelCodigoCita;
    private javax.swing.JLabel labelConsultorio;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDocMed;
    private javax.swing.JLabel labelDocPac;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelNombreCita;
    private javax.swing.JTextField txtCodigoCita;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocMed;
    private javax.swing.JTextField txtDocPac;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreCita;
    // End of variables declaration//GEN-END:variables
}