/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author antares
 */

import java.awt.GridBagConstraints;
import java.awt.Insets;
public class ConstraintGroup extends GridBagConstraints {
    
    private static final int NUM_CONSTRAINTS = 4;
    private int number = 0;
    private int[][] constraints;
    private double[][] weights;
    
    private ConstraintGroup() {}
    
    public ConstraintGroup(int[][] constraints, double[][] weights) {
    super();
    this.constraints = constraints;
    this.weights = weights;
    }
    public void setConstraints(int element) {
        int[] location = constraints[element * NUM_CONSTRAINTS];
        int[] area = constraints[element * NUM_CONSTRAINTS + 1];
        int[] size = constraints[element * NUM_CONSTRAINTS + 2];
        int[] insets = constraints[element * NUM_CONSTRAINTS + 3];
        double[] weights = this.weights[element];
        this.weightx = weights[0];
        this.weighty = weights[1];
        this.gridx = location[0];
        this.gridy = location[1];
        this.gridwidth = area[0];
        this.gridheight = area[1];
        this.fill = size[0];
        this.anchor = size[1];
        if (insets != null) {
            this.insets = new Insets(insets[0],insets[1],insets[2],insets[3]);
        }
        }
    public GridBagConstraints getConstraints(int element) {
        setConstraints(element);
        return this;
    }
    
}
