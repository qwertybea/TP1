public class CV{
  
  private String nom;
  private String prenom;
  private String formation;
  private float experiance;
  private String[] competences;
  private String attentes;

  public CV(){
    
    
    
  }

  public void affiche(){
    
    String competencesLisible = "";

    for(int i = 0; i < competences.length; i++){
      if(i != competences.length - 1){
        competencesLisible += competences[i] + ", ";
      }else{
        competencesLisible += competences[i] + ".";
      }
    } 
    
    System.out.println("nom : " + this.nom + 
		    "\nprenom : " + this.prenom +
		    "\nFormation : " + this.formation +
		    "\nExpériences : " + this.experience +
		    "\nCompétences : " + this.competencesLisible +
		    "\nAttentes : " + this.attentes);
  }
  
}

public static void main(String args[]){
  
}
