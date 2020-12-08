/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sarah
 */
public class Fond extends Effet {

    private List<Color> leFond = new LinkedList();
    
    public Fond(Bandeau beandeauPub, int rep, String txt) {
        super(beandeauPub, rep, txt);
    }
    
    public void ajouterFond(Color c) {
        this.leFond.add(c);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void meth() throws Exception {
        if (this.leFond.isEmpty()) {
            throw new Exception("Pas de couleur");
        }
        bandeauPub.setMessage(this.getTxt());
        for (int n = 0; n < this.getRep(); n++) {
            for (Color c : this.leFond) {
                bandeauPub.setBackground(c);
                bandeauPub.sleep(100);
            }
        }
        bandeauPub.setBackground(getBack());
        
    }
    
}
