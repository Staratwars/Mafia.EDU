/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EtudiantGestion;

/**
 *
 * @author GaetanScopel
 */
public class groupeclass {
    
   
    private String gnom;
    private String annee;
    
    public groupeclass( String gnom, String annee) {
        
        this.gnom = gnom;
        this.annee = annee;
    }

   

    public String getGnom() {
        return gnom;
    }

    public String getAnnee() {
        return annee;
    }

   

    public void setGnom(String gnom) {
        this.gnom = gnom;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
    
    
    
    
}
