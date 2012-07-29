/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author antares
 */
public class Controlador {
    public Vista vista;
    
    public Controlador(Vista vista){
        this.vista = vista;
        //this.modelo = modelo;
        //this.vista.panel.btnAddMesa.addActionListener(this);
        
        vista.panel.addMesa(new OyenteAddMesa());
        vista.addMenuAction(new OyenteAddMenu());
        
        //this.vista.panel.pnlCentral.btnareatrue.addActionListener(this);
        
        this.vista.panel.pnlCentral.addAccionTipo(new OyenteChbTipo());
    }
    
    class OyenteAddMesa implements ActionListener{
        public void actionPerformed( ActionEvent e ){
           System.out.println("btnInsertarMesa");
           vista.panel.pnlCentral.insertarMesa(vista);
        }
    }
    
    class OyenteAddMenu implements ActionListener{
        public void actionPerformed( ActionEvent e ){
          String arg = e.getActionCommand();
                //System.out.println( arg );
                
                        
                if ( arg .equals( "Administrador" ) ){
                    System.out.println( arg );
                    
                }
               else 
                    if ( arg.equals( "Caja" ) )    
                        System.out.println( arg );
                        
                    else
                        if ( arg.equals( "Mesas" ) ){
                            System.out.println( arg );
                            vista.anadirPanelAmbiente();
                            vista.repaint();
                        }    
                        else
                        
                            System.out.println( "ningun eevento" );;
        }
    }
    class OyenteChbTipo implements ActionListener{
        public void actionPerformed( ActionEvent e ){
           System.out.println("chbtipo");
           JComboBox fuente=(JComboBox)e.getSource();
            //se obtiene el elemento seleccionado
            String seleccion=(String)fuente.getSelectedItem();
            //se cambia la imagen
            System.out.println( seleccion );
            if(seleccion.equals("tipo2")||seleccion.equals("tipo3")){
                System.out.println( "entro al if tipo2 tipo3" );
                vista.panel.pnlCentral.chbPos2.setEnabled(true);
            }
        }
    }
    
    
   /* public void actionPerformed(ActionEvent e) {
        
        JComboBox fuente=(JComboBox)e.getSource();
        //se obtiene el elemento seleccionado
        String seleccion=(String)fuente.getSelectedItem();
        //se cambia la imagen
        System.out.println( seleccion );
        if(seleccion.equals("tipo2")||seleccion.equals("tipo3")){
            System.out.println( "entro al if tipo2 tipo3" );
            vista.panel.pnlCentral.chbPos2.setEnabled(true);
        }
    }*/
    
    
}
