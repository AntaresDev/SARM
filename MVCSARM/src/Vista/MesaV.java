/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

/**
 *
 * @author antares
 */
public class MesaV extends JButton{
    public int[][] posiciones;
    public boolean estado;
    public int tipo;
    public String nombre;
    public GridBagConstraints c;
    
    
    public MesaV(int[][] posiciones,boolean estado){
        this.posiciones = posiciones;
        this.estado = estado;
        cambiarColor();
        c = new GridBagConstraints();

        
        
    }
    
    public GridBagConstraints asignarPosicion(int tp){
        setTipo(tp);
        
        if(tipo==1){
        c.fill=GridBagConstraints.BOTH;
        c.weightx = 1.0; c.weighty = 1.0;
        c.gridx = 0; c.gridy = 0;
        c.gridwidth = GridBagConstraints.REMAINDER; c.gridheight = 1;
        c.insets = new Insets(0, 0, 0, 0);
        c.anchor = GridBagConstraints.CENTER;
        }


        return c;
    }
    
    public void cambiarColor(){
        if(estado){
            this.setBackground(Color.BLUE);
        }else{
            this.setBackground(Color.GREEN);
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int[][] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(int[][] posiciones) {
        this.posiciones = posiciones;
    }
    
    
    
    
    
}
