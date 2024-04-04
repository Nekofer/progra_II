
import java.awt.Color;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Caro Garcia
 */
public class TIC_TAC__TOE_NENI_GAME extends javax.swing.JFrame {
    
    private int conta=0;
    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    private boolean win=false;
    private Clip clip;

    /**
     * Creates new form TIC_TAC__TOE_NENI_GAME
     */
    public TIC_TAC__TOE_NENI_GAME() {
        initComponents();
        this.setLocationRelativeTo(null);
        reproducirMusica();
    }
    private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else 
        {
        startGame="X";
        }
    }
    
    private void WinningGame()
    {
        String b1=txtbtn1.getText();
        String b2=txtbtn2.getText();
        String b3=txtbtn3.getText();
        
        String b4=txtbtn4.getText();
        String b5=txtbtn5.getText();
        String b6=txtbtn6.getText();
        
        String b7=txtbtn7.getText();
        String b8=txtbtn8.getText();
        String b9=txtbtn9.getText();
        
        //PLAYER X CODING
        
        if (b1==("X")&& b2==("X")&& b3==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b4==("X")&& b5==("X")&& b6==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b7==("X")&& b8==("X")&& b9==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b1==("X")&& b4==("X")&& b7==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b2==("X")&& b5==("X")&& b8==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b3==("X")&& b6==("X")&& b9==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b1==("X")&& b5==("X")&& b9==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b3==("X")&& b5==("X")&& b7==("X")){
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b1==("O")&& b2==("O")&& b3==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b4==("O")&& b5==("O")&& b6==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b7==("O")&& b8==("O")&& b9==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b1==("O")&& b4==("O")&& b7==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b2==("O")&& b5==("O")&& b8==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b3==("O")&& b6==("O")&& b9==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b1==("O")&& b5==("O")&& b9==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if (b3==("O")&& b5==("O")&& b7==("O")){
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            win=true;
            cont();
            conta=0;
        }else if(conta==9){
            JOptionPane.showMessageDialog(this, "Empate","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            win=true;
            conta=0;
        }
        
        if(win==true){
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        
    
    }
    
    private void reproducirMusica() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("Nyan.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            // Obtener el control de ganancia (volumen)
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    
    private void detenerMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
    
    private void cont(){
        jLabel6.setText(String.valueOf(xCount));
        jLabel7.setText(String.valueOf(oCount));
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
        jLabel1 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
        );

        txtbtn3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 204, 204));
        txtexit.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(204, 204, 255));
        txtreset.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playero.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        playero.setText("Player O:");

        playerx.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        playerx.setText(" Player X:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("xxxxxxxxxxx");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("xxxxxxxxxxx");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(playerx))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(jLabel7))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        
        txtbtn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn3.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        
       txtbtn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn1.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        
        txtbtn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn2.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        
        txtbtn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn4.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        
        txtbtn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn5.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        
        txtbtn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn6.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        
        txtbtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn7.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        
        txtbtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn8.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        
        JFrame frame=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit",
                    "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
    
    
        System.exit(0);
    
    }
        
        
        
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        
        txtbtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            
            txtbtn9.setForeground(Color.RED);     
        }
        else 
        {
              txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
        conta++;
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        win=false;
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setEnabled(true);
        txtbtn2.setEnabled(true);
        txtbtn3.setEnabled(true);
        txtbtn4.setEnabled(true);
        txtbtn5.setEnabled(true);
        txtbtn6.setEnabled(true);
        txtbtn7.setEnabled(true);
        txtbtn8.setEnabled(true);
        txtbtn9.setEnabled(true);
        
    }//GEN-LAST:event_txtresetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC__TOE_NENI_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC__TOE_NENI_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC__TOE_NENI_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC__TOE_NENI_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC__TOE_NENI_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
