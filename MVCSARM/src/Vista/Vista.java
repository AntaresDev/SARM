/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author antares
 */
public class Vista extends JFrame{
    public PanelAmbienteV panel;
    public JPanel panelMenu;
    public JButton btnAdmin,btnMesas,btnCaja;
    public Vista(){
        
        panelMenu = new JPanel(new FlowLayout());
        panelMenu.setBorder(BorderFactory.createEtchedBorder());
        
        btnAdmin = new JButton("Administrador");
        btnCaja = new JButton("Caja");
        btnMesas = new JButton("Mesas");
        
        panel = new PanelAmbienteV();
        this.setLayout(new BorderLayout());
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        anadirPanelMenu();
        
        
        
        
        
    }
    public void anadirPanelMenu(){
        panelMenu.add(btnAdmin);
        panelMenu.add(btnCaja);
        panelMenu.add(btnMesas);
        
        
        this.add(panelMenu,BorderLayout.NORTH);
        
        
    }
    
    public void addMenuAction( ActionListener e ){
    	btnAdmin.addActionListener( e );
    	btnCaja.addActionListener( e );
    	btnMesas.addActionListener( e );
    	
    }
    public void anadirPanelAmbiente(){
        
        this.add(panel,BorderLayout.CENTER);
        System.out.println("anadiendo Panel");
    }
    
}
