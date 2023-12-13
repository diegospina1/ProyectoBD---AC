
package co.edu.ue.principal;

import co.edu.ue.entities.Pacientes;
import co.edu.ue.entities.Telefonos;
import co.edu.ue.model.PacientesDao;
import co.edu.ue.model.TelefonosDao;



public class CrearPaciente extends javax.swing.JInternalFrame {

    
    public CrearPaciente() {
        initComponents();
    }
    
    public void ClearFields(){
        txtDocumento.setText("");
        txtFecha.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtApellidop.setText("");
        txtApellidom.setText("");
        txtTel.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidop = new javax.swing.JTextField();
        txtApellidom = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelApellidop = new javax.swing.JLabel();
        labelApellidom = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JLabel();
        lalbelAdp = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtTel = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTipoTel = new javax.swing.JLabel();
        cbxTipoTel = new javax.swing.JComboBox<>();
        btnModificarPac = new javax.swing.JButton();
        lblCodPlan = new javax.swing.JLabel();
        cbxCodPlan = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();

        setLayer(1);

        labelNombre.setText("Nombre");

        labelApellidop.setText("Primer Apellido");

        labelApellidom.setText("Segundo Apellido");

        labelDireccion.setText("Direccion");

        labelDocumento.setText("Documento");

        lalbelAdp.setText("Fecha Adquisicion Plan");

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        labelTel.setText("Telefono");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTipoTel.setText("Tipo de telefono");

        cbxTipoTel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "CELULAR", "FIJO" }));

        btnModificarPac.setText("Modificar ");

        lblCodPlan.setText("Tipo de plan");

        cbxCodPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "BASICO", "PREMIUM" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lalbelAdp)
                            .addComponent(labelTel)
                            .addComponent(lblTipoTel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTel)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cbxTipoTel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(labelDocumento)
                            .addComponent(labelApellidop)
                            .addComponent(labelApellidom)
                            .addComponent(labelDireccion)
                            .addComponent(lblCodPlan))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidop)
                            .addComponent(txtApellidom)
                            .addComponent(txtDireccion)
                            .addComponent(cbxCodPlan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAdd)
                .addGap(32, 32, 32)
                .addComponent(btnModificarPac)
                .addGap(35, 35, 35)
                .addComponent(btnClear)
                .addGap(28, 28, 28)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumento)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidop))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodPlan)
                    .addComponent(cbxCodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lalbelAdp)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoTel)
                    .addComponent(cbxTipoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificarPac)
                    .addComponent(btnBorrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        TelefonosDao daoTel = new TelefonosDao();
        PacientesDao dao = new PacientesDao();
        
        Pacientes paciente = new Pacientes(Integer.parseInt(txtDocumento.getText()), txtNombre.getText(), txtApellidop.getText(), txtApellidom.getText(),
                                            txtDireccion.getText(),cbxCodPlan.getSelectedIndex(), txtFecha.getText());
        
        Telefonos telefono = new Telefonos(txtTel.getText(), cbxTipoTel.getSelectedIndex());
        
        daoTel.addTel(telefono);
        dao.addPaciente(paciente);
        dao.AsociarPacTel(telefono, paciente);
        
        ClearFields();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        ClearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        PacientesDao dao = new PacientesDao();
        TelefonosDao daoTel = new TelefonosDao();
        Telefonos tel = new Telefonos("", 0);
        
        Pacientes paciente = dao.buscarPaciente(Integer.parseInt(txtDocumento.getText()));
        tel = daoTel.buscarTelP(Integer.parseInt(txtDocumento.getText()));
        
        txtNombre.setText(paciente.getNombre_pac());
        txtApellidop.setText(paciente.getApellido_paterno());
        txtApellidom.setText(paciente.getApellido_materno());
        txtDireccion.setText(paciente.getDireccion_res());
        if(paciente.getCod_plan() == 1){
            
            cbxCodPlan.setSelectedIndex(1);
        }
        else if(paciente.getCod_plan() == 2){
            
            cbxCodPlan.setSelectedIndex(2);
        }
        txtFecha.setText(paciente.getFecha_adq_plan());
        txtTel.setText(tel.getNumero());
        
        if(tel.getCategoria() == 1){
            
            cbxTipoTel.setSelectedIndex(1);
        }
        else if(tel.getCategoria() == 2){
            
            cbxTipoTel.setSelectedIndex(2);
        }
     
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        
        PacientesDao dao = new PacientesDao();
        TelefonosDao daoTel = new TelefonosDao();
        
        Telefonos tel;
        
        tel = daoTel.buscarTelP(Integer.parseInt(txtDocumento.getText()));
        
        String numero = tel.getNumero();
        daoTel.DarDeBajaTel(numero);
        
        dao.DarDeBajaP(Integer.parseInt(txtDocumento.getText()));
        
        
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnModificarPac;
    private javax.swing.JComboBox<String> cbxCodPlan;
    private javax.swing.JComboBox<String> cbxTipoTel;
    private javax.swing.JLabel labelApellidom;
    private javax.swing.JLabel labelApellidop;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel lalbelAdp;
    private javax.swing.JLabel lblCodPlan;
    private javax.swing.JLabel lblTipoTel;
    private javax.swing.JTextField txtApellidom;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}