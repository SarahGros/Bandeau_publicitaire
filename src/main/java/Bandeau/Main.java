/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author sarah
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Bandeau bandeaupub = new Bandeau();
        Scenario scenar = new Scenario();
        Zoom z = new Zoom(bandeaupub, 2, "Bonjour", 100, 6);
        scenar.ajouterEffet(z);
        
        Fond fond = new Fond(bandeaupub, 8, "Hello");
        fond.ajouterFond(Color.RED);
        fond.ajouterFond(Color.BLACK);
        fond.ajouterFond(Color.BLUE);
        scenar.ajouterEffet(fond);
        Tourner t = new Tourner(bandeaupub, 2, "Tourne" );
        scenar.ajouterEffet(t);
        scenar.demarrerScénario();
    }
    
}
