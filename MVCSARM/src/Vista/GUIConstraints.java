/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridBagConstraints;

/**
 *
 * @author antares
 */
public final class GUIConstraints{
private final int NONE = GridBagConstraints.NONE;
private final int BOTH = GridBagConstraints.BOTH;
private final int SOUT = GridBagConstraints.SOUTH;


private final int CENT = GridBagConstraints.CENTER;
private final int WEST = GridBagConstraints.WEST;
private final int SOEA = GridBagConstraints.SOUTHEAST;
private final int HORI = GridBagConstraints.HORIZONTAL;
private final int RELA = GridBagConstraints.RELATIVE;
private final int REMA = GridBagConstraints.REMAINDER;

    final int[][] gMain = new int[][] {
        {0, 0}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp1 [0][0]
        {1, 0}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp2 [1][0]
        {2, 0}, {1, REMA }, {BOTH, CENT}, {0, 0, 0, 0}, //comp3 [0][0]
        {3, 0}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp4 [0][0]
        {4, 0}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp5 [0][0]
        {5, 0}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp6 [0][0]
        {6, 0}, {REMA, 1 }, {BOTH, CENT}, {0, 0, 0, 0}, //comp7 [0][0]
            
        {0, 1}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp8 [0][0]
        {1, 1}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp9 [0][0]
        {3, 1}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp10 [0][0]
        {4, 1}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp11 [0][0]
        {5, 1}, {1, 1 }, {BOTH, CENT}, {0, 0, 2, 0},    //comp12 [0][0]
        {6, 1}, {REMA, 1 }, {BOTH, CENT}, {0, 0, 2, 0}, //comp13 [0][0]
        
        {0, 2}, {2, REMA }, {BOTH, CENT}, {0, 0, 0, 0}, //comp14 [0][0]
        {3, 2}, {1, 1 }, {BOTH, CENT}, {0, 2, 2, 0},    //comp15 [0][0]
        {4, 2}, {1, 1 }, {BOTH, CENT}, {0, 0, 2, 2},    //comp16 [0][0]
        {5, 2}, {1, 1 }, {BOTH, CENT}, {2, 2, 0, 0},    //comp17 [0][0]
        {6, 2}, {1, 1 }, {BOTH, CENT}, {2, 0, 0, 0},    //comp18 [0][0]
        
        {3, 3}, {1, 1 }, {BOTH, CENT}, {2, 0, 0, 0},    //comp19 [0][0]
        {4, 3}, {1, 1 }, {BOTH, CENT}, {2, 0, 0, 2},    //comp20 [0][0]
        {5, 3}, {1, 1 }, {BOTH, CENT}, {0, 2, 0, 0},    //comp21 [0][0]
        {6, 3}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp22 [0][0]
        
        {3, 4}, {1, 1 }, {BOTH, CENT}, {0, 2, 0, 0},    //comp23 [0][0]
        {4, 4}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp24 [0][0]
        {5, 4}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0},    //comp25 [0][0]
        {6, 4}, {1, 1 }, {BOTH, CENT}, {0, 0, 0, 0}     //comp26 [0][0]
    };
    final double[][] wMain = new double[][] {
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        
        
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        
        
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0},
        {1.0, 1.0}
        
    };
    public void toStringconstraint(){
      System.out.println(gMain.length);
    }
}

