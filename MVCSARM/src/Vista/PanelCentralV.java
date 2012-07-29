/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author antares
 */
public class PanelCentralV extends JPanel {
    
    private final GUIConstraints cons;
    private final ConstraintGroup cg;
    public JButton btnareatrue, btncancelDlg,btnokDlg;
    public JDialog dialogInsMesa;
    public JComboBox chbPos1;
    public JComboBox chbTipo;
    public JComboBox chbPos2;
    public JLabel lbltipo, lblarea1, lblarea2;
    
    
    public PanelCentralV(String[] tipos, String[] areas){
        
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder("Titulo"));
        this.setBackground(Color.BLACK);
        cons = new GUIConstraints();
        cg = new ConstraintGroup(cons.gMain,cons.wMain);
        
        cons.toStringconstraint();
        iniAreasPnlCentral();
        
        
        //creando componentes Dialog Crear Mesa
        chbTipo = new JComboBox(tipos);
        chbPos1 = new JComboBox(areas);
        chbPos2 = new JComboBox(areas);
        
        lbltipo= new JLabel("Tipo Mesa: ");
        lblarea1=new JLabel("Area 1: ");
        lblarea2=new JLabel("Area 2: ");
        
        btncancelDlg= new JButton("Cancelar");
        btnokDlg= new JButton("Confirmar");
    }
    
    public void iniAreasPnlCentral() {
        
        for (int i = 0; i < 26; i++) {
            int num = i+1;
            if(i==2 || i==13){
                JButton areafalse = new JButton();
                areafalse.setEnabled(false);
                this.add(areafalse,cg.getConstraints(i));
               
            }else{
                btnareatrue = new JButton("Area"+num);
                btnareatrue.setEnabled(true);
                this.add(btnareatrue,cg.getConstraints(i));
                
                btnareatrue.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        areatrueActionPerformed(evt);
                    }
                });
            }
            //this.add(new JLabel("AREA"+i),cg.getConstraints(i));
            //this.add(new JButton(new ImageIcon(getClass().getResource("/Imagenes/mesa.png"))),cg.getConstraints(i));
            
            

        }
        
    }
    private void areatrueActionPerformed(ActionEvent evt) {
        String arg = evt.getActionCommand();
        System.out.println( arg );
                       
    }
    
    /*@Override
    public void paint(Graphics g){
        Dimension tamanio = getSize();
        System.out.println(tamanio.height+"    "+tamanio.width);
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/mapa mesas.png"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        super.paintComponent(g);
    }*/

    public void insertarMesa(JFrame frame) {
        dialogInsMesa = new JDialog(frame, "Insertar Mesa",false);
        dialogInsMesa.setSize(250, 100);
        dialogInsMesa.setVisible(true);
        dialogInsMesa.setResizable(false);
        JPanel panel =new JPanel(new GridLayout(4, 2));
        
        
        
        
        chbPos2.setEnabled(false);
        Container cont = dialogInsMesa.getContentPane();
        //cont.setLayout(new FlowLayout() );
        panel.add(lbltipo);
        panel.add(chbTipo);
        panel.add(lblarea1);
        panel.add(chbPos1);
        panel.add(lblarea2);
        panel.add(chbPos2);
        panel.add(btncancelDlg);
        panel.add(btnokDlg);
        
        cont.add(panel,BorderLayout.CENTER);
        
        
        
    }
    
    
    public void addAccionTipo( ActionListener e ){
        this.chbTipo.addActionListener( e );
    }
    
    
}
