package org.elsquatrecaps.portada.jportadamicroservice.client.gui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author josep
 */
public class ProcessFrame extends javax.swing.JFrame {
    private HTMLEditorKit htmlkit = new HTMLEditorKit();
    private HTMLDocument document ;
    
    /**
     * Creates new form processFrame
     */
    public ProcessFrame() {
        initComponents();
        this.jTextPane.setContentType("text/html");
        this.jTextPane.setText("<html><body><table id='table'><tr><th>File name</th><th>process name</th><th>ressult process</th></tr></table></body></html>");
        document = (HTMLDocument) this.jTextPane.getStyledDocument();
    }
    
    @Override
    public void setVisible(boolean v){
        setProgressBarPanelVisible(v);
        super.setVisible(v);
    }
    
    public void setProgressBarPanelVisible(boolean v){
        this.progressBarPanel.setVisible(v);
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
        progressBarPanel = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        fileNameLabel = new javax.swing.JLabel();
        commandLabel = new javax.swing.JLabel();
        percentLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();

        setMinimumSize(new java.awt.Dimension(750, 510));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setType(java.awt.Window.Type.UTILITY);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(750, 510));

        progressBarPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fileNameLabel.setText(" ");

        commandLabel.setText("(...)");

        percentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        percentLabel.setText("0.00 %");

        javax.swing.GroupLayout progressBarPanelLayout = new javax.swing.GroupLayout(progressBarPanel);
        progressBarPanel.setLayout(progressBarPanelLayout);
        progressBarPanelLayout.setHorizontalGroup(
            progressBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progressBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(progressBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(progressBarPanelLayout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(percentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                    .addGroup(progressBarPanelLayout.createSequentialGroup()
                        .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(commandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        progressBarPanelLayout.setVerticalGroup(
            progressBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progressBarPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(progressBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(progressBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileNameLabel)
                    .addComponent(commandLabel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jButton1.setText("Save result list");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setViewportView(jTextPane);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLayeredPane1.setLayer(progressBarPanel, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(progressBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(progressBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser(new File("./").getAbsoluteFile());   
        fc.setSelectedFile(new File("report_for_images.csv"));
        int res = fc.showSaveDialog(this);
        if(res!=JFileChooser.CANCEL_OPTION){
            File f = fc.getSelectedFile();
            File d = f.getParentFile();
            if(!d.exists()){
                d.mkdirs();
            }
            try(FileWriter strb = new FileWriter(f)){
                strb.append("\"");
                try{
                    Element tableElement = document.getElement("table");
                    for(int i=0; i<tableElement.getElementCount(); i++){
                        Element trElement = (HTMLDocument.BlockElement) tableElement.getElement(i);
                        for(int j=0; j<trElement.getElementCount(); j++){
                            int init = trElement.getElement(j).getStartOffset();
                            int longElement = trElement.getElement(j).getEndOffset()-init;
                            strb.append(document.getText(init, longElement).replace("\n", ""));
                            if(j+1<trElement.getElementCount()){
                                strb.append("\",\"");                    
                            }else{
                                strb.append("\"");
                            }
                        }
                        if(i+1<tableElement.getElementCount()){
                            strb.append("\n\"");
                        }else{
                            strb.append("\n");
                        }
                    }
                } catch (BadLocationException ex) {
                    Logger.getLogger(ProcessFrame.class.getName()).log(Level.SEVERE, null, ex);
                }                
            } catch (IOException ex) {
                Logger.getLogger(ProcessFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  
    public void updateList(String file, String process, double percent, boolean processOk){
        try {
            document.insertBeforeEnd(
                    document.getElement("table"),
                    String.format("<tr><td>%s</td><td>(%s)</td><td>[%s]</td></tr>", file, process, processOk?"OK":"ERROR"));
        } catch (BadLocationException | IOException ex) {
            Logger.getLogger(ProcessFrame.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void updateProgress(String file, String process, double percent){
            this.percentLabel.setText(String.format("%6.2f %%", percent));
            this.fileNameLabel.setText(String.format("(%s)", file));
            this.commandLabel.setText(String.format("(%s)", process));
            this.jProgressBar1.setValue((int) percent);
            this.jProgressBar1.setString(this.percentLabel.getText());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel commandLabel;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel percentLabel;
    private javax.swing.JPanel progressBarPanel;
    // End of variables declaration//GEN-END:variables
}