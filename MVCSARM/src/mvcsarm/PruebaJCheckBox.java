/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcsarm;

import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JDialog;
 
 
public class PruebaJCheckBox extends JFrame {
 
	private JCheckBox jCheckBoxs[];
	private JButton jbutton;
 
    public static void main(String args[]) {
        new PruebaJCheckBox();
    }
 
    public PruebaJCheckBox() {
        initComponents();
    }
 
    private void initComponents() {
    	jbutton = new JButton();
 
        setTitle("jFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        jbutton.setText("get a number");
        jbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int ncb = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "write a number", "number"));
        		jCheckBoxs=new JCheckBox[ncb];
				new jDialog(PruebaJCheckBox.this, jCheckBoxs);
			}
		});
 
        getContentPane().add(jbutton, BorderLayout.SOUTH);		
 
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
 
 
    }
}
 
class jDialog extends JDialog{
 
	public jDialog(JFrame f, JCheckBox jCheckBoxs[] ) {
 
		setTitle("JDialog");
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
 
		/*Ciclo para crear los n JCheckBox y colocarle nombre*/
        for(int i=0; i<jCheckBoxs.length; i++){
        	jCheckBoxs[i]=new JCheckBox(""+i);
        }
 
        /*Ciclo para agregar el componente al contenedor(se puede realizar con el anterior)*/
        for(int i=0; i<jCheckBoxs.length; i++){
	        getContentPane().add(jCheckBoxs[i]);
 
        }
 
        /*Ciclo para seleccionarlos*/
        for(int i=0; i<jCheckBoxs.length; i++){
	        jCheckBoxs[i].setSelected(true);
        }
 
        /*Ciclo para eventos de cada jcheckbox*/
        for(int j=0; j<jCheckBoxs.length; j++){
        	jCheckBoxs[j].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
            	JCheckBox cb = (JCheckBox)evt.getItem();
            	System.out.println(cb.getText());
            }
        });
        }
 
	    setModal(true);
	    pack();
	    setLocationRelativeTo(null);
	    setVisible(true);
	}
}