/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Aluno
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        if(Sessao.usuario==null){
            btnChat.setEnabled(false);
            btnChat.setText("<html><font color=black>Chat</font></html>");
            btnData.setEnabled(false);
            btnData.setText("<html><font color=black>Data</font></html>");
            btnQuestões.setEnabled(false);
            btnQuestões.setText("<html><font color=black>Questões</font></html>");
            btnProvas.setEnabled(false);
            btnProvas.setText("<html><font color=black>Provas</font></html>");
            btnCorrecao.setEnabled(false);
            btnCorrecao.setText("<html><font color=black>Correção</font></html>");
        }
        if(Sessao.isAluno()){
            btnProvas.setEnabled(false);
            btnCorrecao.setEnabled(false);
        }

        /*
        //Desabilitar Botão
        btnHome.setText("<html><font color=black>Home</font></html>");
        btnHome.setEnabled(false);
        /*
        Habilitar Botão
        btnHome.setText("Home");
        btnHome.setEnabled(true);
        */
        }
    public void refresh(){
        btnChat.setEnabled(true);
        btnChat.setText("Chat");
        btnData.setEnabled(true);
        btnData.setText("Data");
        btnQuestões.setEnabled(true);
        btnQuestões.setText("Questões");
        btnProvas.setEnabled(true);
        btnProvas.setText("Provas");
        btnCorrecao.setEnabled(true);
        btnCorrecao.setText("Correção");
        if(Sessao.usuario==null){
            btnChat.setEnabled(false);
            btnChat.setText("<html><font color=black>Chat</font></html>");
            btnData.setEnabled(false);
            btnData.setText("<html><font color=black>Data</font></html>");
            btnQuestões.setEnabled(false);
            btnQuestões.setText("<html><font color=black>Questões</font></html>");
            btnProvas.setEnabled(false);
            btnProvas.setText("<html><font color=black>Provas</font></html>");
            btnCorrecao.setEnabled(false);
            btnCorrecao.setText("<html><font color=black>Correção</font></html>");
        }else{
            if(Sessao.isAluno()){
                btnProvas.setEnabled(false);
                btnCorrecao.setEnabled(false);
            }
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        container = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        saibaMais1 = new ui.SaibaMais();
        loginPanel1 = new ui.LoginPanel();
        Baixo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Topo = new javax.swing.JPanel();
        Login = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnHome = new javax.swing.JButton();
        btnBaixar = new javax.swing.JButton();
        btnGaleria = new javax.swing.JButton();
        btnForum = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnQuestões = new javax.swing.JButton();
        btnProvas = new javax.swing.JButton();
        btnCorrecao = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setMaximumSize(new java.awt.Dimension(90, 99));
        Home.setMinimumSize(new java.awt.Dimension(90, 99));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        container.add(Home, "Home");
        container.add(saibaMais1, "SaibaMais");
        container.add(loginPanel1, "Login");

        Baixo.setBackground(new java.awt.Color(33, 150, 243));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Desenvolvedores");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html><body>Somos a turma de Informática 2A do ano de 2016 do CEFET-MG (Centro Federal de <br> Educação Tecnológica de Minas Gerais) desenvolvendo o trabalho final<br> multidisciplinar de Linguagem de Programação 1 e Aplicações para WEB. </body></html>");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobre a Instituição");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html><body>Centro Federal de Educação Tecnológica de Minas Gerais <br>\nAv. Amazonas 5253 - Nova Suiça - Belo Horizonte - MG - Brasil<br>\nTelefone: +55 (31) 3319-7000 - Fax: +55 (31) 3319-7001</body></html>");

        jButton1.setBackground(new java.awt.Color(1, 87, 155));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jButton1.setLabel("SAIBA MAIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BaixoLayout = new javax.swing.GroupLayout(Baixo);
        Baixo.setLayout(BaixoLayout);
        BaixoLayout.setHorizontalGroup(
            BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaixoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BaixoLayout.setVerticalGroup(
            BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaixoLayout.createSequentialGroup()
                .addGroup(BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(BaixoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("Saiba Mais");

        Topo.setBackground(new java.awt.Color(1, 87, 155));

        Login.setBackground(new java.awt.Color(33, 150, 243));
        Login.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("ENTRAR");
        Login.setBorder(null);
        Login.setIconTextGap(0);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(1, 87, 155));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnHome.setBackground(new java.awt.Color(1, 87, 155));
        btnHome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/logo.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setMaximumSize(new java.awt.Dimension(90, 99));
        btnHome.setMinimumSize(new java.awt.Dimension(90, 99));
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome);

        btnBaixar.setBackground(new java.awt.Color(1, 87, 155));
        btnBaixar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBaixar.setForeground(new java.awt.Color(255, 255, 255));
        btnBaixar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Download.png"))); // NOI18N
        btnBaixar.setText("Baixar");
        btnBaixar.setFocusable(false);
        btnBaixar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaixar.setMaximumSize(new java.awt.Dimension(90, 99));
        btnBaixar.setMinimumSize(new java.awt.Dimension(90, 99));
        btnBaixar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBaixar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBaixar);

        btnGaleria.setBackground(new java.awt.Color(1, 87, 155));
        btnGaleria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGaleria.setForeground(new java.awt.Color(255, 255, 255));
        btnGaleria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Galeria.png"))); // NOI18N
        btnGaleria.setText("Galeria");
        btnGaleria.setFocusable(false);
        btnGaleria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGaleria.setMaximumSize(new java.awt.Dimension(90, 99));
        btnGaleria.setMinimumSize(new java.awt.Dimension(90, 99));
        btnGaleria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaleriaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGaleria);

        btnForum.setBackground(new java.awt.Color(1, 87, 155));
        btnForum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnForum.setForeground(new java.awt.Color(255, 255, 255));
        btnForum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Forum.png"))); // NOI18N
        btnForum.setText("Forum");
        btnForum.setFocusable(false);
        btnForum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnForum.setMaximumSize(new java.awt.Dimension(90, 99));
        btnForum.setMinimumSize(new java.awt.Dimension(90, 99));
        btnForum.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnForum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForumActionPerformed(evt);
            }
        });
        jToolBar1.add(btnForum);

        btnChat.setBackground(new java.awt.Color(1, 87, 155));
        btnChat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnChat.setForeground(new java.awt.Color(255, 255, 255));
        btnChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Chat.png"))); // NOI18N
        btnChat.setText("Chat");
        btnChat.setFocusable(false);
        btnChat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChat.setMaximumSize(new java.awt.Dimension(90, 99));
        btnChat.setMinimumSize(new java.awt.Dimension(90, 99));
        btnChat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChat);

        btnData.setBackground(new java.awt.Color(1, 87, 155));
        btnData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnData.setForeground(new java.awt.Color(255, 255, 255));
        btnData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Canledario.png"))); // NOI18N
        btnData.setText("Data");
        btnData.setFocusable(false);
        btnData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnData.setMaximumSize(new java.awt.Dimension(90, 99));
        btnData.setMinimumSize(new java.awt.Dimension(90, 99));
        btnData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });
        jToolBar1.add(btnData);

        btnQuestões.setBackground(new java.awt.Color(1, 87, 155));
        btnQuestões.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuestões.setForeground(new java.awt.Color(255, 255, 255));
        btnQuestões.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/questões.png"))); // NOI18N
        btnQuestões.setText("Questões");
        btnQuestões.setFocusable(false);
        btnQuestões.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuestões.setMaximumSize(new java.awt.Dimension(90, 99));
        btnQuestões.setMinimumSize(new java.awt.Dimension(90, 99));
        btnQuestões.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuestões.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestõesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQuestões);

        btnProvas.setBackground(new java.awt.Color(1, 87, 155));
        btnProvas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProvas.setForeground(new java.awt.Color(255, 255, 255));
        btnProvas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/provas.png"))); // NOI18N
        btnProvas.setText("Provas");
        btnProvas.setFocusable(false);
        btnProvas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProvas.setMaximumSize(new java.awt.Dimension(90, 99));
        btnProvas.setMinimumSize(new java.awt.Dimension(90, 99));
        btnProvas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProvas);

        btnCorrecao.setBackground(new java.awt.Color(1, 87, 155));
        btnCorrecao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCorrecao.setForeground(new java.awt.Color(255, 255, 255));
        btnCorrecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CorrecaoF.png"))); // NOI18N
        btnCorrecao.setText("Correção");
        btnCorrecao.setFocusable(false);
        btnCorrecao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCorrecao.setMaximumSize(new java.awt.Dimension(90, 99));
        btnCorrecao.setMinimumSize(new java.awt.Dimension(90, 99));
        btnCorrecao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCorrecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrecaoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCorrecao);

        javax.swing.GroupLayout TopoLayout = new javax.swing.GroupLayout(Topo);
        Topo.setLayout(TopoLayout);
        TopoLayout.setHorizontalGroup(
            TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopoLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TopoLayout.setVerticalGroup(
            TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(TopoLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Baixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Baixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Login");
    }//GEN-LAST:event_LoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "SaibaMais");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuestõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestõesActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "BancoDeQuestoes");
    }//GEN-LAST:event_btnQuestõesActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Home");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBaixarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixarActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Download");
    }//GEN-LAST:event_btnBaixarActionPerformed

    private void btnGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaleriaActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Galeria");
    }//GEN-LAST:event_btnGaleriaActionPerformed

    private void btnForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForumActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Forum");
    }//GEN-LAST:event_btnForumActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Chat");
    }//GEN-LAST:event_btnChatActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Calendario");
    }//GEN-LAST:event_btnDataActionPerformed

    private void btnProvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvasActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Provas");
    }//GEN-LAST:event_btnProvasActionPerformed

    private void btnCorrecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrecaoActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "Correcao");
    }//GEN-LAST:event_btnCorrecaoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Baixo;
    private javax.swing.JPanel Home;
    private javax.swing.JButton Login;
    private javax.swing.JPanel Topo;
    private javax.swing.JButton btnBaixar;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnCorrecao;
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnForum;
    private javax.swing.JButton btnGaleria;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProvas;
    private javax.swing.JButton btnQuestões;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JToolBar jToolBar1;
    private ui.LoginPanel loginPanel1;
    private ui.SaibaMais saibaMais1;
    // End of variables declaration//GEN-END:variables
}
