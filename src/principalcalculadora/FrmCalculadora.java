
package principalcalculadora;


public class FrmCalculadora extends javax.swing.JFrame {

 
    public FrmCalculadora() {
        initComponents();
    }
int numero1;
int numero2;
String valor;
    Calculadora calculadora = new Calculadora();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnSiete = new javax.swing.JButton();
        jBtnOcho = new javax.swing.JButton();
        jBtnNueve = new javax.swing.JButton();
        jBtnCuatro = new javax.swing.JButton();
        jBtnCinco = new javax.swing.JButton();
        jBtnSeis = new javax.swing.JButton();
        jBtnUno = new javax.swing.JButton();
        jBtnDos = new javax.swing.JButton();
        jBtnTres = new javax.swing.JButton();
        JBtnCero = new javax.swing.JButton();
        jBtnSumar = new javax.swing.JButton();
        jBtnRestar = new javax.swing.JButton();
        jBtnMultiplicar = new javax.swing.JButton();
        jBtnDividir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBtnSalir = new javax.swing.JButton();
        jBtnHacerCalculo = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnSiete.setText("7");
        jBtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSieteActionPerformed(evt);
            }
        });

        jBtnOcho.setText("8");
        jBtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOchoActionPerformed(evt);
            }
        });

        jBtnNueve.setText("9");
        jBtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNueveActionPerformed(evt);
            }
        });

        jBtnCuatro.setText("4");
        jBtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCuatroActionPerformed(evt);
            }
        });

        jBtnCinco.setText("5");
        jBtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCincoActionPerformed(evt);
            }
        });

        jBtnSeis.setText("6");
        jBtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSeisActionPerformed(evt);
            }
        });

        jBtnUno.setText("1");
        jBtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUnoActionPerformed(evt);
            }
        });

        jBtnDos.setText("2");
        jBtnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDosActionPerformed(evt);
            }
        });

        jBtnTres.setText("3");
        jBtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTresActionPerformed(evt);
            }
        });

        JBtnCero.setText("0");
        JBtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCeroActionPerformed(evt);
            }
        });

        jBtnSumar.setText("+");
        jBtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumarActionPerformed(evt);
            }
        });

        jBtnRestar.setText("-");
        jBtnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRestarActionPerformed(evt);
            }
        });

        jBtnMultiplicar.setText("*");
        jBtnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplicarActionPerformed(evt);
            }
        });

        jBtnDividir.setText("/");
        jBtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDividirActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnHacerCalculo.setText("Hacer calculo");
        jBtnHacerCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHacerCalculoActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnUno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnDos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnCuatro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnCinco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnSiete)
                                        .addGap(42, 42, 42)
                                        .addComponent(jBtnOcho)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtnCero)
                                .addGap(34, 34, 34)
                                .addComponent(jBtnHacerCalculo)
                                .addGap(32, 32, 32)
                                .addComponent(jBtnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnSalir)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnMultiplicar)
                            .addComponent(jBtnDividir)))
                    .addComponent(jBtnRestar)
                    .addComponent(jBtnSumar))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JBtnCero, jBtnCinco, jBtnCuatro, jBtnDos, jBtnNueve, jBtnOcho, jBtnSiete, jBtnTres, jBtnUno});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jBtnSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSiete)
                    .addComponent(jBtnOcho)
                    .addComponent(jBtnNueve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnRestar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnCuatro)
                            .addComponent(jBtnCinco)
                            .addComponent(jBtnSeis)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBtnMultiplicar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnUno)
                            .addComponent(jBtnDos)
                            .addComponent(jBtnTres)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBtnDividir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnCero)
                    .addComponent(jBtnHacerCalculo)
                    .addComponent(jBtnLimpiar)
                    .addComponent(jBtnSalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSieteActionPerformed
      
        jTextArea1.setText(jTextArea1.getText()+7);
    }//GEN-LAST:event_jBtnSieteActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOchoActionPerformed
       jTextArea1.setText(jTextArea1.getText()+8);
    }//GEN-LAST:event_jBtnOchoActionPerformed

    private void jBtnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNueveActionPerformed
 jTextArea1.setText(jTextArea1.getText()+9);
    }//GEN-LAST:event_jBtnNueveActionPerformed

    private void jBtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCuatroActionPerformed
jTextArea1.setText(jTextArea1.getText()+4);
    }//GEN-LAST:event_jBtnCuatroActionPerformed

    private void jBtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCincoActionPerformed
      jTextArea1.setText(jTextArea1.getText()+5);
    }//GEN-LAST:event_jBtnCincoActionPerformed

    private void jBtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSeisActionPerformed
     jTextArea1.setText(jTextArea1.getText()+6);
    }//GEN-LAST:event_jBtnSeisActionPerformed

    private void jBtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUnoActionPerformed
jTextArea1.setText(jTextArea1.getText()+1);
    }//GEN-LAST:event_jBtnUnoActionPerformed

    private void jBtnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDosActionPerformed
   jTextArea1.setText(jTextArea1.getText()+2);
    }//GEN-LAST:event_jBtnDosActionPerformed

    private void jBtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTresActionPerformed
 jTextArea1.setText(jTextArea1.getText()+3);
    }//GEN-LAST:event_jBtnTresActionPerformed

    private void JBtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCeroActionPerformed
     jTextArea1.setText(jTextArea1.getText()+0);
    }//GEN-LAST:event_JBtnCeroActionPerformed

    private void jBtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumarActionPerformed
            numero1=Integer.valueOf(jTextArea1.getText());
            valor="+";
            jTextArea1.setText("");
    
    }//GEN-LAST:event_jBtnSumarActionPerformed

    private void jBtnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRestarActionPerformed
            numero1=Integer.valueOf(jTextArea1.getText());
            valor="-";
            jTextArea1.setText("");
    }//GEN-LAST:event_jBtnRestarActionPerformed

    private void jBtnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplicarActionPerformed
               numero1=Integer.valueOf(jTextArea1.getText());
            valor="*";
            jTextArea1.setText("");
    }//GEN-LAST:event_jBtnMultiplicarActionPerformed

    private void jBtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDividirActionPerformed
                 numero1=Integer.valueOf(jTextArea1.getText());;
            valor="/";
            jTextArea1.setText("");
    }//GEN-LAST:event_jBtnDividirActionPerformed

    private void jBtnHacerCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHacerCalculoActionPerformed
        int  resultado;  
       numero2=Integer.valueOf(jTextArea1.getText());
        
        resultado=calculadora.calcular(numero1, numero2, valor);
        
        jTextArea1.setText(resultado+"");
        
        
    }//GEN-LAST:event_jBtnHacerCalculoActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        jTextArea1.setText("");
        numero1=0;
        numero2=0;
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

  
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
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnCero;
    private javax.swing.JButton jBtnCinco;
    private javax.swing.JButton jBtnCuatro;
    private javax.swing.JButton jBtnDividir;
    private javax.swing.JButton jBtnDos;
    private javax.swing.JButton jBtnHacerCalculo;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnMultiplicar;
    private javax.swing.JButton jBtnNueve;
    private javax.swing.JButton jBtnOcho;
    private javax.swing.JButton jBtnRestar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnSeis;
    private javax.swing.JButton jBtnSiete;
    private javax.swing.JButton jBtnSumar;
    private javax.swing.JButton jBtnTres;
    private javax.swing.JButton jBtnUno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
