/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author manager
 */
public class Inicio_GUI extends javax.swing.JFrame {

    //-->Inicio
 static int cod;
 static String nom;
 static String em;
 static long telefone;
    
  String url2 = "jdbc:mysql://localhost/APRENDER"; // enderço do BD
  String username = "root";        //nome de um usuário de seu BD
  String password = "";  // senha do BD

    
    //-->Fim
    
    public Inicio_GUI() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("APRENDER?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        clienteQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery1.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        GRAVAR = new javax.swing.JButton();
        FECHAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        nome2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tel2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cod2 = new javax.swing.JTextField();
        CONSULTAR = new javax.swing.JButton();
        ALTERAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(204, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Agenda");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 20, 90, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 70, 14);
        jPanel1.add(nome);
        nome.setBounds(90, 60, 230, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 50, 14);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(90, 110, 230, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 170, 60, 30);
        jPanel1.add(tel);
        tel.setBounds(90, 170, 230, 30);

        GRAVAR.setText("Salvar");
        GRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRAVARActionPerformed(evt);
            }
        });
        jPanel1.add(GRAVAR);
        GRAVAR.setBounds(150, 230, 73, 23);

        FECHAR.setBackground(new java.awt.Color(255, 51, 51));
        FECHAR.setForeground(new java.awt.Color(255, 255, 255));
        FECHAR.setText("X");
        FECHAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FECHARActionPerformed(evt);
            }
        });
        jPanel1.add(FECHAR);
        FECHAR.setBounds(333, 10, 50, 40);

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setLayout(null);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList1, tabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 390, 91);

        jLabel5.setText("Nome:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 160, 31, 14);

        nome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome2ActionPerformed(evt);
            }
        });
        jPanel2.add(nome2);
        nome2.setBounds(50, 150, 190, 30);

        jLabel6.setText("Email:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 200, 28, 14);

        email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2ActionPerformed(evt);
            }
        });
        jPanel2.add(email2);
        email2.setBounds(50, 190, 190, 30);

        jLabel7.setText("Telefone");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 240, 50, 14);

        tel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel2ActionPerformed(evt);
            }
        });
        jPanel2.add(tel2);
        tel2.setBounds(50, 230, 190, 30);

        jLabel8.setText("Codigo:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 110, 50, 14);

        cod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod2ActionPerformed(evt);
            }
        });
        jPanel2.add(cod2);
        cod2.setBounds(70, 100, 170, 30);

        CONSULTAR.setText("Consultar");
        CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTARActionPerformed(evt);
            }
        });
        jPanel2.add(CONSULTAR);
        CONSULTAR.setBounds(290, 240, 90, 23);

        ALTERAR.setText("Alterar");
        ALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERARActionPerformed(evt);
            }
        });
        jPanel2.add(ALTERAR);
        ALTERAR.setBounds(300, 160, 73, 23);

        jTabbedPane1.addTab("Gerenciar", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 400, 300);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void GRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRAVARActionPerformed
//==> inicio
nom = nome.getText(); // recebendo o nome
em = email.getText(); // recebendo o email
telefone = Long.valueOf(tel.getText());// recebendo o telefone       
      try { 
            Connection con = null;
    try {
    con = (Connection) DriverManager.getConnection(url2, username, password);
    } catch (SQLException ex) {
    Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);


            
                   }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO cliente(cli_nome, cli_email, cli_tel) values('"+nom+"','"+em+"','"+telefone+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome.setText("");
                email.setText("");
                tel.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            tel.setText("");
        }

       
              



//==>Fim
    }//GEN-LAST:event_GRAVARActionPerformed

    private void FECHARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FECHARActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FECHARActionPerformed

    private void email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2ActionPerformed

    private void nome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome2ActionPerformed

    private void tel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel2ActionPerformed

    private void cod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod2ActionPerformed

    private void CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTARActionPerformed
        //==> Inicio
        try{     //Iniciando o possivel tratamento de erros
            //Declarando a variavel código
            int cod = Integer.valueOf(cod2.getText());
            try {// Tratamento de erro para a conexao
                // Declarando  a variavel de conexão con
                // e estabelendo a conexão
                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url2, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Declarando uma string com o comando mySQL para consulta
                String sql = "SELECT cli_nome,cli_email, cli_tel FROM cliente where cli_cod = "+cod;
                // Criando variavel que executara o comando da string sql
                Statement stm = (Statement) con.createStatement();
                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0; // Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        String nome = rs.getString("cli_nome");
                        String email = rs.getString("cli_email");
                        String telefone = rs.getString("cli_tel");

                        i++;

                        //JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nEmail: " +telefone + "\nTelefone: " +telefone, "Resultado",-1);
                        nome2.setText(String.valueOf(nome));
                        email2.setText(String.valueOf(email));
                        tel2.setText(String.valueOf(telefone));

                    }

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Dado não cadastrado","Resultado",-1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0);
                }

            } catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Código fora do formato
            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0);
            cod2.setText("");
        }

        //--> Fim
    }//GEN-LAST:event_CONSULTARActionPerformed

    private void ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERARActionPerformed
        //-->Inicio
        
        nom = nome2.getText(); // recebendo o nome
      em = email2.getText(); // recebendo o email         
      telefone = Long.valueOf(tel2.getText());// recebendo o telefone
       
      try {     
            Connection con = null;
      try {
            con = (Connection) DriverManager.getConnection(url2, username, password);
      }catch (SQLException ex) {
            Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);
      }
            String sql = "UPDATE cliente SET cli_nome='"+nom+"',cli_email='"+email+"',cli_tel='"+telefone+"' WHERE cli_Cod="+cod2.getText();
            
     
            try { 
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome2.setText("");
                email2.setText("");
                tel2.setText("");
                cod2.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            tel2.setText("");
        }    

        
        //-->Fim
    }//GEN-LAST:event_ALTERARActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTERAR;
    private javax.swing.JButton CONSULTAR;
    private javax.swing.JButton FECHAR;
    private javax.swing.JButton GRAVAR;
    private java.util.List<View.Cliente> clienteList;
    private java.util.List<View.Cliente> clienteList1;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.Query clienteQuery1;
    private javax.swing.JTextField cod2;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email2;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField tel2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
