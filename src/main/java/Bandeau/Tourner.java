/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;

import bandeau.Bandeau;

/**
 *
 * @author sarah
 */
public class Tourner extends Effet {

    public Tourner(Bandeau beandeauPub, int rep, String txt) {
        super(beandeauPub, rep, txt);
    }

    @Override
    public void meth() {
        for (int n = 0; n < this.getRep(); n++) {
            bandeauPub.setMessage(getTxt());
            for (int i = 0; i <= 100; i++) {
                bandeauPub.setRotation(2 * Math.PI * i / 100);
                bandeauPub.sleep(100);
            }
        }
        bandeauPub.setFont(this.getFont());

    }

}
