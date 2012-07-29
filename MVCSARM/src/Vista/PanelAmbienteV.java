/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author antares
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelAmbienteV extends JPanel {
    public JPanel pnlNorte, pnlEstado; 
    
    public PanelCentralV pnlCentral;
    
    public JLabel lblocupado, lbldisponible;
    public JButton btnUnirMesas, btnAsignarMenu, btnLiberarMesa, btnAddMesa;
    public ConstraintGroup cg;
    public GUIConstraints cons;
    
    
    public PanelAmbienteV(){
                        
        iniciarPanel();
        iniciarComponentes();
    
    }

    private void iniciarComponentes() {
        //iniciando paneles
        pnlNorte = new JPanel();
        pnlNorte.setBorder(BorderFactory.createEtchedBorder());
        pnlNorte.setLayout(new FlowLayout());
        
        pnlEstado = new JPanel();
        pnlEstado.setBorder(BorderFactory.createEtchedBorder());
        pnlEstado.setLayout(new FlowLayout());
        String[] tipos={"tipo1","tipo2","tipo3"};
        String[] areas={"1","2","3","4","5"};        
        
        pnlCentral = new PanelCentralV(tipos,areas);
        
        btnAsignarMenu = new JButton("Asignar Menu"); 
        btnUnirMesas = new JButton("Unir Mesa");
        btnLiberarMesa = new JButton("Liberar Mesa");
        btnAddMesa = new JButton("Anadir Mesa");
        
        
        
        lbldisponible = new JLabel("Mesas Disponibles:");
        lblocupado = new JLabel("Mesas Ocupadas:");
        
        //aniadiendo componentes
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlEstado, BorderLayout.SOUTH);
        pnlNorte.add(btnAsignarMenu);
        pnlNorte.add(btnLiberarMesa);
        pnlNorte.add(btnUnirMesas);
        pnlNorte.add(btnAddMesa);
        
        pnlEstado.add(lbldisponible);
        pnlEstado.add(lblocupado);
        
        cons = new GUIConstraints();
        cg = new ConstraintGroup(cons.gMain,cons.wMain);

        
        
    }

    private void iniciarPanel() {
        this.setLayout(new BorderLayout());
        //this.setSize(1280, 768);
        this.setBounds(new Rectangle(1280, 768));
    }

    public void addMesa( ActionListener e ){
        this.btnAddMesa.addActionListener( e );
    }
    
       
    
}
