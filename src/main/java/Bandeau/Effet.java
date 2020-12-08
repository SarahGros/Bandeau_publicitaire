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
public abstract class Effet {
    protected static Bandeau bandeauPub = new Bandeau() ;
    private int rep;
    private String txt;
    private Font font;
    private Color back;
    private Color fore;

    public Effet(Bandeau beandeauPub, int rep, String txt) {
        this.bandeauPub = bandeauPub;
        this.rep = rep;
        this.txt = txt;
        this.font = bandeauPub.getFont();
        this.back = bandeauPub.getBackground();
        this.fore = bandeauPub.getForeground();
    }
    
    public abstract void meth() throws Exception;     

    public Bandeau getBandeauPub() {
        return bandeauPub;
    }

    public int getRep() {
        return rep;
    }

    public String getTxt() {
        return txt;
    }

    public Font getFont() {
        return font;
    }

    public Color getBack() {
        return back;
    }

    public Color getFore() {
        return fore;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setBack(Color back) {
        this.back = back;
    }

    public void setFore(Color fore) {
        this.fore = fore;
    }
    
    
}
