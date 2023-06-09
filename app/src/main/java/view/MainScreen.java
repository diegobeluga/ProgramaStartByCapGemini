/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Beluga
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6EmptyList = new javax.swing.JPanel();
        jLabel7EmptyListIcon = new javax.swing.JLabel();
        jLabel8EmptListTitle = new javax.swing.JLabel();
        jLabel9EmptyListSubTitle = new javax.swing.JLabel();
        ToolBar = new javax.swing.JPanel();
        ToolBarTitle = new javax.swing.JLabel();
        ToolBarSubTitle = new javax.swing.JLabel();
        Projects = new javax.swing.JPanel();
        ProjectsTitle = new javax.swing.JLabel();
        ProjectsAdd = new javax.swing.JLabel();
        Tasks = new javax.swing.JPanel();
        TasksTitle = new javax.swing.JLabel();
        TasksAdd = new javax.swing.JLabel();
        ProjectList = new javax.swing.JPanel();
        ScrollPaneProjects = new javax.swing.JScrollPane();
        jList1Projects = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6EmptyList.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7EmptyListIcon.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7EmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7EmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        jLabel8EmptListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8EmptListTitle.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8EmptListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8EmptListTitle.setText("Nenhuma tarefa por aqui !  :D");

        jLabel9EmptyListSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9EmptyListSubTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9EmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9EmptyListSubTitle.setText("Clique no bot�o \"+\" para adicionar uma tarefa");

        javax.swing.GroupLayout jPanel6EmptyListLayout = new javax.swing.GroupLayout(jPanel6EmptyList);
        jPanel6EmptyList.setLayout(jPanel6EmptyListLayout);
        jPanel6EmptyListLayout.setHorizontalGroup(
            jPanel6EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7EmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8EmptListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6EmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9EmptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6EmptyListLayout.setVerticalGroup(
            jPanel6EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6EmptyListLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7EmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8EmptListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9EmptyListSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6EmptyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6EmptyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        ToolBar.setBackground(new java.awt.Color(0, 153, 51));

        ToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ToolBarTitle.setForeground(new java.awt.Color(240, 240, 240));
        ToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        ToolBarTitle.setText(" Todo App");

        ToolBarSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToolBarSubTitle.setForeground(new java.awt.Color(240, 240, 240));
        ToolBarSubTitle.setText("Anote tudo e n�o esque�a de nada!");

        javax.swing.GroupLayout ToolBarLayout = new javax.swing.GroupLayout(ToolBar);
        ToolBar.setLayout(ToolBarLayout);
        ToolBarLayout.setHorizontalGroup(
            ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ToolBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)))
        );
        ToolBarLayout.setVerticalGroup(
            ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ToolBarTitle)
                .addGap(18, 18, 18)
                .addComponent(ToolBarSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Projects.setBackground(new java.awt.Color(255, 255, 255));
        Projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProjectsTitle.setForeground(new java.awt.Color(0, 153, 51));
        ProjectsTitle.setText("Projetos");

        ProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        ProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProjectsLayout = new javax.swing.GroupLayout(Projects);
        Projects.setLayout(ProjectsLayout);
        ProjectsLayout.setHorizontalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProjectsAdd)
                .addContainerGap())
        );
        ProjectsLayout.setVerticalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectsAdd))
                .addContainerGap())
        );

        Tasks.setBackground(new java.awt.Color(255, 255, 255));
        Tasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TasksTitle.setForeground(new java.awt.Color(0, 153, 51));
        TasksTitle.setText("Tarefas");

        TasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout TasksLayout = new javax.swing.GroupLayout(Tasks);
        Tasks.setLayout(TasksLayout);
        TasksLayout.setHorizontalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TasksAdd)
                .addContainerGap())
        );
        TasksLayout.setVerticalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TasksAdd))
                .addContainerGap())
        );

        ProjectList.setBackground(new java.awt.Color(255, 255, 255));
        ProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1Projects.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jList1Projects.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1Projects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1Projects.setFixedCellHeight(50);
        jList1Projects.setSelectionBackground(new java.awt.Color(0, 153, 51));
        ScrollPaneProjects.setViewportView(jList1Projects);

        javax.swing.GroupLayout ProjectListLayout = new javax.swing.GroupLayout(ProjectList);
        ProjectList.setLayout(ProjectListLayout);
        ProjectListLayout.setHorizontalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneProjects)
                .addContainerGap())
        );
        ProjectListLayout.setVerticalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneProjects))
        );

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa Conclu�da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jScrollPane1.setViewportView(jTableTasks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectsAddMouseClicked

        // Ao clicar no + ele chama a TELA de cadastro de projetos
       ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this,rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        
    }//GEN-LAST:event_ProjectsAddMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProjectList;
    private javax.swing.JPanel Projects;
    private javax.swing.JLabel ProjectsAdd;
    private javax.swing.JLabel ProjectsTitle;
    private javax.swing.JScrollPane ScrollPaneProjects;
    private javax.swing.JPanel Tasks;
    private javax.swing.JLabel TasksAdd;
    private javax.swing.JLabel TasksTitle;
    private javax.swing.JPanel ToolBar;
    private javax.swing.JLabel ToolBarSubTitle;
    private javax.swing.JLabel ToolBarTitle;
    private javax.swing.JLabel jLabel7EmptyListIcon;
    private javax.swing.JLabel jLabel8EmptListTitle;
    private javax.swing.JLabel jLabel9EmptyListSubTitle;
    private javax.swing.JList<String> jList1Projects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6EmptyList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask(){
        // Customizando o header da table de tarefas
     jTableTasks.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
     jTableTasks.getTableHeader().setBackground(new Color(0,153,102));
     jTableTasks.getTableHeader().setForeground(new Color(255,255,255));
     
     //Criando um sort autom�tico para as colunas da tabela 
     jTableTasks.setAutoCreateRowSorter(true);
     
    
        
     
        
    }

}


