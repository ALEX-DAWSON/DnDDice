/*
 * Alex Dawson
 * 24-Jan-2020
 * --------------------------------------
 * DnDDice/DnDDice.java
 */
package dnddice;
import java.util.*;
import java.text.*;
/**
 *
 * @author ktad2
 */
public class DnDDice extends javax.swing.JFrame {

    /**
     * Creates new form DnDDice
     */
    public DnDDice() {
        initComponents();
    }
    
    public Random random = new Random();
    public SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
    public Dice dice;
    public Calculator calc;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        d20Bttn = new javax.swing.JButton();
        d4Output = new javax.swing.JLabel();
        exitBttn = new javax.swing.JButton();
        d12Bttn = new javax.swing.JButton();
        d12Output = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        d10Bttn = new javax.swing.JButton();
        percOutput = new javax.swing.JLabel();
        d10Output = new javax.swing.JLabel();
        d8Bttn = new javax.swing.JButton();
        d8Output = new javax.swing.JLabel();
        d6Bttn = new javax.swing.JButton();
        d6Output = new javax.swing.JLabel();
        d20Output = new javax.swing.JLabel();
        d4Bttn = new javax.swing.JButton();
        calcLabel = new javax.swing.JLabel();
        num1Input = new javax.swing.JTextField();
        num2Input = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        calcOutput = new javax.swing.JTextArea();
        calcBttn = new javax.swing.JButton();
        plusLabel = new javax.swing.JLabel();
        addRoll1Bttn = new javax.swing.JButton();
        addRoll2Bttn = new javax.swing.JButton();
        addRecentCalcBttn = new javax.swing.JButton();
        clearBttn = new javax.swing.JButton();
        percBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dungeons and Dragons Dice For The Poor");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(102, 0, 0));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/dnddice/assets/icon.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 0, 0));

        title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Dungeons and Dragons Dice For The Poor");

        d20Bttn.setText("Roll D20");
        d20Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d20BttnActionPerformed(evt);
            }
        });

        d4Output.setBackground(new java.awt.Color(204, 0, 0));
        d4Output.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d4Output.setForeground(new java.awt.Color(0, 0, 255));
        d4Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4Output.setText("4");
        d4Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        exitBttn.setText("Exit");
        exitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBttnActionPerformed(evt);
            }
        });

        d12Bttn.setText("Roll D12");
        d12Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d12BttnActionPerformed(evt);
            }
        });

        d12Output.setBackground(new java.awt.Color(204, 0, 0));
        d12Output.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d12Output.setForeground(new java.awt.Color(0, 0, 255));
        d12Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d12Output.setText("12");
        d12Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        d10Bttn.setText("Roll D10");
        d10Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10BttnActionPerformed(evt);
            }
        });

        percOutput.setBackground(new java.awt.Color(204, 0, 0));
        percOutput.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        percOutput.setForeground(new java.awt.Color(0, 0, 255));
        percOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percOutput.setText("100");
        percOutput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        d10Output.setBackground(new java.awt.Color(204, 0, 0));
        d10Output.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d10Output.setForeground(new java.awt.Color(0, 0, 255));
        d10Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d10Output.setText("10");
        d10Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        d8Bttn.setText("Roll D8");
        d8Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8BttnActionPerformed(evt);
            }
        });

        d8Output.setBackground(new java.awt.Color(204, 0, 0));
        d8Output.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d8Output.setForeground(new java.awt.Color(0, 0, 255));
        d8Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8Output.setText("8");
        d8Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        d6Bttn.setText("Roll D6");
        d6Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6BttnActionPerformed(evt);
            }
        });

        d6Output.setBackground(new java.awt.Color(204, 0, 0));
        d6Output.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d6Output.setForeground(new java.awt.Color(0, 0, 255));
        d6Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d6Output.setText("6");
        d6Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        d20Output.setBackground(new java.awt.Color(204, 0, 0));
        d20Output.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d20Output.setForeground(new java.awt.Color(0, 0, 255));
        d20Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d20Output.setText("20");
        d20Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        d4Bttn.setText("Roll D4");
        d4Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4BttnActionPerformed(evt);
            }
        });

        calcLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        calcLabel.setForeground(new java.awt.Color(0, 0, 255));
        calcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcLabel.setText("Calculator");

        calcOutput.setEditable(false);
        calcOutput.setColumns(20);
        calcOutput.setRows(5);
        jScrollPane2.setViewportView(calcOutput);

        calcBttn.setText("Calculate");
        calcBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBttnActionPerformed(evt);
            }
        });

        plusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plusLabel.setForeground(new java.awt.Color(255, 255, 255));
        plusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusLabel.setText("+");

        addRoll1Bttn.setText("Add Most Recent Roll");
        addRoll1Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoll1BttnActionPerformed(evt);
            }
        });

        addRoll2Bttn.setText("Add Most Recent Roll");
        addRoll2Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoll2BttnActionPerformed(evt);
            }
        });

        addRecentCalcBttn.setText("Add Most Recent Calculation");
        addRecentCalcBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecentCalcBttnActionPerformed(evt);
            }
        });

        clearBttn.setText("Clear Calculator");
        clearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBttnActionPerformed(evt);
            }
        });

        percBttn.setText("Roll Percentile");
        percBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d20Bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(d20Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d12Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d12Bttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d10Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d10Bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(percBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(3, 3, 3))
                                    .addComponent(percOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d8Bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(d8Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d6Bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(d6Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d4Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(d4Bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(7, 7, 7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(calcLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num2Input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addRoll2Bttn)
                                    .addComponent(addRoll1Bttn))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addRecentCalcBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2)
                            .addComponent(calcBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(calcLabel)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num1Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addRoll1Bttn)
                            .addComponent(addRecentCalcBttn))
                        .addGap(2, 2, 2)
                        .addComponent(plusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num2Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addRoll2Bttn)
                            .addComponent(clearBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d20Output)
                            .addComponent(d12Output)
                            .addComponent(d10Output)
                            .addComponent(percOutput)
                            .addComponent(d8Output)
                            .addComponent(d6Output)
                            .addComponent(d4Output))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d20Bttn)
                            .addComponent(d12Bttn)
                            .addComponent(d10Bttn)
                            .addComponent(percBttn)
                            .addComponent(d8Bttn)
                            .addComponent(d6Bttn)
                            .addComponent(d4Bttn))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBttn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d20BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20BttnActionPerformed
        dice = new Dice("D20", 20);
        d20Output.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_d20BttnActionPerformed

    private void d12BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d12BttnActionPerformed
        dice = new Dice("D12", 12);
        d12Output.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_d12BttnActionPerformed

    private void d10BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10BttnActionPerformed
        dice = new Dice("D10", 10);
        d10Output.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_d10BttnActionPerformed

    private void d8BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8BttnActionPerformed
        dice = new Dice("D8", 8);
        d8Output.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_d8BttnActionPerformed

    private void d6BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6BttnActionPerformed
        dice = new Dice("D6", 6);
        d6Output.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_d6BttnActionPerformed

    private void d4BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4BttnActionPerformed
        dice = new Dice("D4", 4);
        d4Output.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_d4BttnActionPerformed

    private void exitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBttnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBttnActionPerformed

    private void addRoll1BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoll1BttnActionPerformed
        num1Input.setText(dice.getRoll());
    }//GEN-LAST:event_addRoll1BttnActionPerformed

    private void addRecentCalcBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecentCalcBttnActionPerformed
        num1Input.setText(calc.getAnswer());
    }//GEN-LAST:event_addRecentCalcBttnActionPerformed

    private void addRoll2BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoll2BttnActionPerformed
        num2Input.setText(dice.getRoll());
    }//GEN-LAST:event_addRoll2BttnActionPerformed

    private void calcBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBttnActionPerformed
        int num1 = Integer.parseInt(num1Input.getText());
        int num2 = Integer.parseInt(num2Input.getText());
        calc = new Calculator(num1, num2);
        calcOutput.append(calc.toString());
    }//GEN-LAST:event_calcBttnActionPerformed

    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttnActionPerformed
        num1Input.setText("");
        num2Input.setText("");
        calcOutput.setText("");
    }//GEN-LAST:event_clearBttnActionPerformed

    private void percBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percBttnActionPerformed
        dice = new Dice("Percentile", 100);
        percOutput.setText(dice.getRoll());
        txtOutput.append(dice.toString());
    }//GEN-LAST:event_percBttnActionPerformed

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
            java.util.logging.Logger.getLogger(DnDDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DnDDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DnDDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DnDDice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DnDDice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecentCalcBttn;
    private javax.swing.JButton addRoll1Bttn;
    private javax.swing.JButton addRoll2Bttn;
    private javax.swing.JButton calcBttn;
    private javax.swing.JLabel calcLabel;
    private javax.swing.JTextArea calcOutput;
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton d10Bttn;
    private javax.swing.JLabel d10Output;
    private javax.swing.JButton d12Bttn;
    private javax.swing.JLabel d12Output;
    private javax.swing.JButton d20Bttn;
    private javax.swing.JLabel d20Output;
    private javax.swing.JButton d4Bttn;
    private javax.swing.JLabel d4Output;
    private javax.swing.JButton d6Bttn;
    private javax.swing.JLabel d6Output;
    private javax.swing.JButton d8Bttn;
    private javax.swing.JLabel d8Output;
    private javax.swing.JButton exitBttn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField num1Input;
    private javax.swing.JTextField num2Input;
    private javax.swing.JButton percBttn;
    private javax.swing.JLabel percOutput;
    private javax.swing.JLabel plusLabel;
    private javax.swing.JLabel title;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
