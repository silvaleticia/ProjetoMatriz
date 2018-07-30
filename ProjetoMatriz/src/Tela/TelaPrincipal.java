/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Dados.Matriz;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leticia
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Matriz matA = null;
    Matriz matB = null;

    DefaultTableModel model = null;

    boolean tabelaColunaMAtrizA = true;
    boolean tabelaColunaMAtrizB = true;

    public TelaPrincipal() {
        initComponents();
        model = (DefaultTableModel) jTableTabela.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldqColunasA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldqLinhasMA = new javax.swing.JTextField();
        jButtonCriarMA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaidaMA = new javax.swing.JTextArea();
        jButtonPotenciaA = new javax.swing.JButton();
        jButtonTranspostaA = new javax.swing.JButton();
        jButtonPorKA = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelMB = new javax.swing.JLabel();
        jTextFieldqColunasB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldqLinhasMB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaidaMB = new javax.swing.JTextArea();
        jButtonCriarMB = new javax.swing.JButton();
        jButtonPotenciaB = new javax.swing.JButton();
        jButtonTranspostaB = new javax.swing.JButton();
        jButtonPorKB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSaidaResultado = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonSubtrair = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonMultiplicar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULO DE MATRIZ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(3, 3, 3));

        jTableTabela.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TRIANGULAR SUPERIOR", null, null},
                {"TRIANGULAR INFERIOR", null, null},
                {"SIMETRICA", null, null},
                {"IDENTIDADE", null, null},
                {"ORTOGONAL", null, null},
                {"PERMUTAÇÃO", null, null},
                {"IGUAL", null, null},
                {"DIFERENTE", null, null}
            },
            new String [] {
                "ITEM", "MATRIZ A", "MATRIZ B"
            }
        ));
        jTableTabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableTabela.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableTabelaComponentAdded(evt);
            }
        });
        jScrollPane5.setViewportView(jTableTabela);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldqColunasA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldqColunasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldqColunasAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Matriz A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("LINHAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("COLUNAS");

        jTextFieldqLinhasMA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldqLinhasMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldqLinhasMAActionPerformed(evt);
            }
        });

        jButtonCriarMA.setText("CRIAR");
        jButtonCriarMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarMAActionPerformed(evt);
            }
        });

        jTextAreaSaidaMA.setEditable(false);
        jTextAreaSaidaMA.setColumns(20);
        jTextAreaSaidaMA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextAreaSaidaMA.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSaidaMA);

        jButtonPotenciaA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPotenciaA.setText("POTENCIA A");
        jButtonPotenciaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaAActionPerformed(evt);
            }
        });

        jButtonTranspostaA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTranspostaA.setText("TRANSPOSTA A");
        jButtonTranspostaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTranspostaAActionPerformed(evt);
            }
        });

        jButtonPorKA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPorKA.setText("* POR K A");
        jButtonPorKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorKAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldqLinhasMA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonTranspostaA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPotenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPorKA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldqColunasA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCriarMA, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldqLinhasMA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldqColunasA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCriarMA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPotenciaA)
                .addGap(18, 18, 18)
                .addComponent(jButtonTranspostaA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPorKA)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelMB.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelMB.setText("Matriz B");

        jTextFieldqColunasB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("LINHAS");

        jTextFieldqLinhasMB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("COLUNAS");

        jTextAreaSaidaMB.setEditable(false);
        jTextAreaSaidaMB.setColumns(20);
        jTextAreaSaidaMB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextAreaSaidaMB.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaidaMB);

        jButtonCriarMB.setText("CRIAR");
        jButtonCriarMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarMBActionPerformed(evt);
            }
        });

        jButtonPotenciaB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPotenciaB.setText("POTENCIA B");
        jButtonPotenciaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaBActionPerformed(evt);
            }
        });

        jButtonTranspostaB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTranspostaB.setText("TRANSPOSTA B");
        jButtonTranspostaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTranspostaBActionPerformed(evt);
            }
        });

        jButtonPorKB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPorKB.setText("* POR K B");
        jButtonPorKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorKBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabelMB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonTranspostaB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPorKB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPotenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldqLinhasMB, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jTextFieldqColunasB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCriarMB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelMB)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldqLinhasMB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldqColunasB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCriarMB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPotenciaB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTranspostaB)
                .addGap(13, 13, 13)
                .addComponent(jButtonPorKB)
                .addGap(20, 20, 20))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextAreaSaidaResultado.setEditable(false);
        jTextAreaSaidaResultado.setColumns(20);
        jTextAreaSaidaResultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextAreaSaidaResultado.setRows(5);
        jTextAreaSaidaResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(jTextAreaSaidaResultado);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("RESULTADO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("A");

        jButtonAdicionar.setText("+");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("B");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("A");

        jButtonSubtrair.setText("-");
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("B");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("A");

        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("B");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("NOVO CALCULO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAdicionar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonMultiplicar)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jButtonAdicionar)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jButtonSubtrair)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("CALCULADORA DE MATRIZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCriarMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarMAActionPerformed
        // CRIANDO A MATRIZ A
        try {
            if (!(jTextFieldqLinhasMA.getText().equals("") || jTextFieldqColunasA.getText().equals(""))) {
                int qLinhas = Integer.parseInt(jTextFieldqLinhasMA.getText().trim());
                int qColunas = Integer.parseInt(jTextFieldqColunasA.getText().trim());

                matA = new Matriz(qLinhas, qColunas);
                for (int l = 0; l < qLinhas; l++) {
                    for (int c = 0; c < qColunas; c++) {
                        String msg = "A Matriz A[" + l + "][" + c + "]";
                        int elemento = Integer.parseInt(JOptionPane.showInputDialog(msg));
                        matA.setElemento(l, c, elemento);
                    }
                }
                jTextAreaSaidaMA.setText(matA.getMatriz());
                tabelaColunaMAtrizA = false;

                MatrizABoolean();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não permitido campos vazios");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Apenas Números são permitidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCriarMAActionPerformed

    private void jButtonCriarMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarMBActionPerformed
        // CRIANDO A MATRIZ B
        try {
            if (!(jTextFieldqLinhasMB.getText().equals("") || jTextFieldqColunasB.getText().equals(""))) {
                int qLinhas = Integer.parseInt(jTextFieldqLinhasMB.getText().trim());
                int qColunas = Integer.parseInt(jTextFieldqColunasB.getText().trim());

                matB = new Matriz(qLinhas, qColunas);
                for (int l = 0; l < qLinhas; l++) {
                    for (int c = 0; c < qColunas; c++) {
                        String msg = "A Matriz A[" + l + "][" + c + "]";
                        int elemento = Integer.parseInt(JOptionPane.showInputDialog(msg));
                        matB.setElemento(l, c, elemento);

                    }
                }
                jTextAreaSaidaMB.setText(matB.getMatriz());
                tabelaColunaMAtrizB = false;
                
                MatrizBBoolean();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não permitido campos 'vazios'.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Apenas Números são permitidos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCriarMBActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // ADD as MATRIZ
        try {
            // matC=matA+matB
            //Matriz adicao = matA.adicionar(matB);
            //jTextAreaSaidaResultado.setText(adicao.getMatriz());
            String result = " A + B "  +  " \n" +  " \n" + matA.adicionar(matB).getMatriz();
            jTextAreaSaidaResultado.setText(result);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        try {
            //MatC=matA-matB
            String result = " A - B "  + " \n" +  " \n" +matA.subtrair(matB).getMatriz();
            jTextAreaSaidaResultado.setText(result);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        try {
            //matC= matA*matB
            String result = " A * B " + " \n" +  " \n"+ matA.Multiplicar(matB).getMatriz();
            jTextAreaSaidaResultado.setText(result);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jTextFieldqColunasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldqColunasAActionPerformed

    }//GEN-LAST:event_jTextFieldqColunasAActionPerformed

    private void jButtonTranspostaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTranspostaAActionPerformed
        try {
            //matC= matA*matB
            String result = "Transposta da Matriz A"  + " \n" +  " \n"+  matA.Transposta().getMatriz();
            jTextAreaSaidaResultado.setText(result);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonTranspostaAActionPerformed

    private void jButtonTranspostaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTranspostaBActionPerformed
        try {
            //matC= matA*matB
            String result = "Transposta da Matriz B"  + " \n" +  " \n"+  matB.Transposta().getMatriz();
            jTextAreaSaidaResultado.setText(result);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonTranspostaBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextAreaSaidaMA.setText("");
        jTextAreaSaidaMB.setText("");
        jTextAreaSaidaResultado.setText("");
        jTextFieldqColunasA.setText("");
        jTextFieldqColunasB.setText("");
        jTextFieldqLinhasMA.setText("");
        jTextFieldqLinhasMB.setText("");
        tabelaColunaMAtrizA = true;
        tabelaColunaMAtrizB = true;
        
        jButtonCriarMA.setEnabled(tabelaColunaMAtrizA);
        jButtonCriarMB.setEnabled(tabelaColunaMAtrizB);

        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 1; coluna < 3; coluna++) {
                model.setValueAt("", linha, coluna);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPorKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorKAActionPerformed
        try {
            String entrada = JOptionPane.showInputDialog("Digite a Constante");
            int constante = Integer.parseInt(entrada);
            String result = "Matriz A *" + constante + " \n" + matA.multiplicarK(constante).getMatriz();
            jTextAreaSaidaResultado.setText(result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPorKAActionPerformed

    private void jButtonPotenciaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciaAActionPerformed
        try {
            String entrada = JOptionPane.showInputDialog("Digite o Expoente");
            int expoente = Integer.parseInt(entrada);
            String result = "Matriz A ^"  +expoente+ " \n" + matA.Potencia(expoente).getMatriz();
            jTextAreaSaidaResultado.setText(result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPotenciaAActionPerformed

    private void jButtonPotenciaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciaBActionPerformed
        try {
            String entrada = JOptionPane.showInputDialog("Digite o Expoente");
            int expoente = Integer.parseInt(entrada);
            String result = "Matriz B ^"  +expoente+ " \n" + matB.Potencia(expoente).getMatriz();
            jTextAreaSaidaResultado.setText(result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPotenciaBActionPerformed

    private void jButtonPorKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorKBActionPerformed
        try {
            String entrada = JOptionPane.showInputDialog("Digite a Constante");
            int constante = Integer.parseInt(entrada);
            String result = "Matriz B *" + constante + " \n" + matB.multiplicarK(constante).getMatriz();
            jTextAreaSaidaResultado.setText(result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPorKBActionPerformed

    private void jTableTabelaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableTabelaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTabelaComponentAdded

    private void jTextFieldqLinhasMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldqLinhasMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldqLinhasMAActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
   
    public void MatrizABoolean() throws Exception {
        try {
            boolean aux = matA.eTriangularSuperior();
            if (aux) {
                model.setValueAt("SIM", 0, 1);
            } else {
                model.setValueAt("NÃO", 0, 1);
            }

            aux = matA.eTriangularInferior();
            if (aux) {
                model.setValueAt("SIM", 1, 1);
            } else {
                model.setValueAt("NÃO", 1, 1);
            }

            aux = matA.eSimetrica();
            if (aux) {
                model.setValueAt("SIM", 2, 1);
            } else {
                model.setValueAt("NÃO", 2, 1);
            }

            aux = matA.eIdentidade();
            if (aux) {
                model.setValueAt("SIM", 3, 1);
            } else {
                model.setValueAt("NÃO", 3, 1);
            }

            aux = matA.eOrtogonal();
            if (aux) {
                model.setValueAt("SIM", 4, 1);
            } else {
                model.setValueAt("NÃO", 4, 1);
            }

            aux = matA.ePermutacao();
            if (aux) {
                model.setValueAt("SIM", 5, 1);
            } else {
                model.setValueAt("NÃO", 5, 1);
            }

            if (!tabelaColunaMAtrizB) {
                aux = matA.eIgual(matB);
                if (aux) {
                    model.setValueAt("SIM", 6, 1);
                    model.setValueAt("SIM", 6, 2);
                } else {
                    model.setValueAt("NÃO", 6, 1);
                    model.setValueAt("NÃO", 6, 2);
                }

                aux = matA.eDiferente(matB);
                if (aux) {
                    model.setValueAt("SIM", 7, 1);
                    model.setValueAt("SIM", 7, 2);
                } else {
                    model.setValueAt("NÃO", 7, 1);
                    model.setValueAt("NÃO", 7, 2);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    public void MatrizBBoolean() throws Exception {
        try {
            boolean aux = matB.eTriangularSuperior();
            if (aux) {
                model.setValueAt("SIM", 0, 2);
            } else {
                model.setValueAt("NÃO", 0, 2);
            }

            aux = matB.eTriangularInferior();
            if (aux) {
                model.setValueAt("SIM", 1, 2);
            } else {
                model.setValueAt("NÃO", 1, 2);
            }

            aux = matB.eSimetrica();
            if (aux) {
                model.setValueAt("SIM", 2, 2);
            } else {
                model.setValueAt("NÃO", 2, 2);
            }

            aux = matB.eIdentidade();
            if (aux) {
                model.setValueAt("SIM", 3, 2);
            } else {
                model.setValueAt("NÃO", 3, 2);
            }

            aux = matB.eOrtogonal();
            if (aux) {
                model.setValueAt("SIM", 4, 2);
            } else {
                model.setValueAt("NÃO", 4, 2);
            }

            aux = matB.ePermutacao();
            if (aux) {
                model.setValueAt("SIM", 5, 2);
            } else {
                model.setValueAt("NÃO", 5, 2);
            }

            if (!tabelaColunaMAtrizA) {
                aux = matA.eIgual(matB);
                if (aux) {
                    model.setValueAt("SIM", 6, 1);
                    model.setValueAt("SIM", 6, 2);
                } else {
                    model.setValueAt("NÃO", 6, 1);
                    model.setValueAt("NÃO", 6, 2);
                }

                aux = matA.eDiferente(matB);
                if (aux) {
                    model.setValueAt("SIM", 7, 1);
                    model.setValueAt("SIM", 7, 2);
                } else {
                    model.setValueAt("NÃO", 7, 1);
                    model.setValueAt("NÃO", 7, 2);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
        }

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCriarMA;
    private javax.swing.JButton jButtonCriarMB;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonPorKA;
    private javax.swing.JButton jButtonPorKB;
    private javax.swing.JButton jButtonPotenciaA;
    private javax.swing.JButton jButtonPotenciaB;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JButton jButtonTranspostaA;
    private javax.swing.JButton jButtonTranspostaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextArea jTextAreaSaidaMA;
    private javax.swing.JTextArea jTextAreaSaidaMB;
    private javax.swing.JTextArea jTextAreaSaidaResultado;
    private javax.swing.JTextField jTextFieldqColunasA;
    private javax.swing.JTextField jTextFieldqColunasB;
    private javax.swing.JTextField jTextFieldqLinhasMA;
    private javax.swing.JTextField jTextFieldqLinhasMB;
    // End of variables declaration//GEN-END:variables
}
