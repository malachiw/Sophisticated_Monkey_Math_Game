import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class mathGameGUI extends javax.swing.JFrame {
  
	private JButton submitAnswerButton;
	private JTextField enterAnswerHere;
	private JLabel answerLabel;
	private JLabel problemLabel;
	
	public mathGameGUI() {
        initComponents();
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sophisticated Monkey Math Game");
    }
	
	private void initComponents() {
		
		submitAnswerButton = new JButton();
		enterAnswerHere = new JTextField();
		answerLabel = new JLabel();
		problemLabel = new JLabel();
		
		mathGame aNumber = new mathGame();
		 
        problemLabel.setText(mathGame.number1 + " " + mathGame.operator +
        		" " + mathGame.number2 + " = ");
        
        submitAnswerButton.setText("Submit");
        submitAnswerButton.addActionListener(new java.awt.event.ActionListener() {
           
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAnswerButtonActionPerformed(evt);
            }
        });
        
        answerLabel.setText("Your Answer");
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap())
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(problemLabel)
                    	.addComponent(enterAnswerHere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(submitAnswerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerLabel)
                        .addContainerGap(27, Short.MAX_VALUE))
               ));
 
        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {submitAnswerButton, enterAnswerHere});
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problemLabel)
                	.addComponent(enterAnswerHere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitAnswerButton)
                    .addComponent(answerLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );
	}     
     
		private void submitAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
					
					Integer userInput = new Integer(enterAnswerHere.getText());
        	        boolean answer = (mathGame.mathGameMonkey(userInput));
        	        answerLabel.setText("Your answer is " + answer);
        	    }
	
        	    /**
        	     * @param args the command line arguments
        	     */
        	    public static void main(String args[]) {
        	        java.awt.EventQueue.invokeLater(new Runnable() {
        	            public void run() {
        	                new mathGameGUI().setVisible(true);
        	            }
        	        });
        	    }
}
