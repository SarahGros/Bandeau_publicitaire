/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;

import java.util.*;

/**
 *
 * @author sarah
 */
public class Scenario {
    private List<Effet> effets = new LinkedList<>();
    
    public void ajouterEffet(Effet e){
        this.effets.add(e);
    }
    
    public void demarrerScénario() throws Exception{
        if (this.effets.isEmpty())throw new Exception("pas d'effet");
        for (Effet e : this.effets){
            e.meth();
        }
    }
}
