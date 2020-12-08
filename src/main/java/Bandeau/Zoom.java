/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author sarah
 */
public class Zoom extends Effet {

    private int tailleMax;
    private int vitesse;

    public Zoom(Bandeau beandeauPub, int rep, String txt, int tailleMax, int vitesse) {
        super(beandeauPub, rep, txt);
        this.tailleMax = tailleMax;
        this.vitesse = vitesse;

    }

    @Override
    public void meth() {
        bandeauPub.setMessage(getTxt());
        for (int n = 0; n < this.getRep(); n++) {

            for (int i = 5; i < this.tailleMax; i += this.vitesse) {
                bandeauPub.setFont(new Font("Dialog", Font.BOLD, 5 + i));
                bandeauPub.sleep(100);
            }
        }
        bandeauPub.setFont(this.getFont());
    }

}
