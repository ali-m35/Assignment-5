/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

import javax.swing.DefaultListModel;
import a5.Controller;
import java.util.ArrayList;

/**
 *
 * @author ali-m35
 */
public class GradeGUI extends javax.swing.JFrame {

        // ***** instance variables and objects *****
       
        protected Controller c;
        protected DefaultListModel gradeListModel = new DefaultListModel();
    
     /**
     * Creates new form GradeGUI
     */
    public GradeGUI() {
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

        inputpanel = new javax.swing.JPanel();
        inputPanelLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        studentIdTxt = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        gradeLabel = new javax.swing.JLabel();
        gradeSpn = new javax.swing.JSpinner();
        courseLabel = new javax.swing.JLabel();
        courseCombo = new javax.swing.JComboBox<>();
        markLabel = new javax.swing.JLabel();
        markTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        outputGradeInfo = new javax.swing.JLabel();
        gradeListScrollPane = new javax.swing.JScrollPane();
        gradeList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        inputpanel.setBackground(new java.awt.Color(0, 255, 255));
        inputpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inputPanelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        inputPanelLabel.setText("Input Grade Information");

        IDLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        IDLabel.setText("ID:");

        studentIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTxtActionPerformed(evt);
            }
        });

        firstNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        firstNameLabel.setText("First Name:");

        lastNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lastNameLabel.setText("Last Name:");

        gradeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        gradeLabel.setText("Grade Level:");

        courseLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        courseLabel.setText("Course:");

        courseCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "English", "Math", "Chemistry", "Biology", "Art", "Computer Science", "Physics ", "Geography", "History", " " }));
        courseCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courseComboItemStateChanged(evt);
            }
        });
        courseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboActionPerformed(evt);
            }
        });

        markLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        markLabel.setText("Mark");

        submitBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputpanelLayout = new javax.swing.GroupLayout(inputpanel);
        inputpanel.setLayout(inputpanelLayout);
        inputpanelLayout.setHorizontalGroup(
            inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanelLabel)
                    .addGroup(inputpanelLayout.createSequentialGroup()
                        .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDLabel)
                            .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputpanelLayout.createSequentialGroup()
                                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gradeSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inputpanelLayout.createSequentialGroup()
                                .addComponent(lastNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(gradeLabel)))
                        .addGap(20, 20, 20)
                        .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseLabel)
                            .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markLabel)))
                    .addGroup(inputpanelLayout.createSequentialGroup()
                        .addComponent(submitBtn)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        inputpanelLayout.setVerticalGroup(
            inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(gradeLabel)
                    .addComponent(courseLabel)
                    .addComponent(markLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(inputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IDLabel.getAccessibleContext().setAccessibleName("ID");

        outputPanel.setBackground(new java.awt.Color(0, 255, 255));
        outputPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        outputGradeInfo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        outputGradeInfo.setText("Output Grade Information");

        gradeList.setModel(gradeListModel);
        gradeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                gradeListValueChanged(evt);
            }
        });
        gradeListScrollPane.setViewportView(gradeList);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(outputGradeInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(gradeListScrollPane))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputGradeInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradeListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTxtActionPerformed

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboActionPerformed

    private void gradeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gradeListValueChanged
        // TODO add your handling code here:
        
        int n = gradeList.getSelectedIndex();
        
        /**
		 * send the index of the record to the controller
		 * getGrade method
		 * get grade gets the record fro mthe arraylist
		 * calculates the details, appends details to a string 
		 * and return the string to the patient detail text area 
		 * in the gui
		 */
        
                 
    }//GEN-LAST:event_gradeListValueChanged

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:\
            System.out.println("submit button clicked");
                       String firstName = firstNameTxt.getText();
                       String lastName =  lastNameTxt.getText();
                       
                       int gradeLevel = getGradeLevel();
                       String course = getCourse();
                       int mark = getMark();
        
                       System.out.println("first name: " + firstName);
                       System.out.println("last name: " + lastName);
                       System.out.println("grade leve: " + gradeLevel);
                       System.out.println("course: " + course);
                       System.out.println("mark: " + mark);
        
                       reSetInputs();
                       
                       c.submitButtonClicked(firstName, lastName, gradeLevel, course, mark);
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void courseComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboItemStateChanged

    protected void loadGradeListModel(ArrayList<Grade> list) {
        
        for(Grade g: list) {
            gradeListModel.addElement(g);
        }// end for loop
        
        
    }// end loadGradeListModel
    
    private String getCourse() {
        return courseCombo.getSelectedItem().toString();
    }// end getCourse
    
    private int getGradeLevel() {
        return Integer.parseInt(gradeSpn.getValue().toString());
    }// end getGradeLevel
    
    private int getMark() {
        return Integer.parseInt(markTxt.getText().toString());
    }// end getMark
    
    private void reSetInputs() {
         firstNameTxt.setText("");
         lastNameTxt.setText("");
         gradeSpn.setValue(1);
         
         courseCombo.setSelectedIndex(0);
         markTxt.setText("");
    }// end reSetInputs
    
    //***** setter method*****
        
            public void addController(Controller c) {
                System.out.println("controller addded to ui");
                this.c = c;
            }// end addController
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JList<String> gradeList;
    private javax.swing.JScrollPane gradeListScrollPane;
    private javax.swing.JSpinner gradeSpn;
    private javax.swing.JLabel inputPanelLabel;
    private javax.swing.JPanel inputpanel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel markLabel;
    private javax.swing.JTextField markTxt;
    private javax.swing.JLabel outputGradeInfo;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JTextField studentIdTxt;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
