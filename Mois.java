public enum Mois{
    Janvier(30 , "Jan" , "January" ),
    Fevrier(29,"Fev","February"),
    Mars(30,"Mar","March"),
    Avril(30,"Avr","April"),
    Mai(30,"Mai","May"),
    Juin(30,"Juin","June"),
    Juillet(30,"Jui","July"),
    Aout(30,"Aout","August"),
    Septembre(30,"Sep","September"),
    Octobre(30,"Oct","October"),
    Novembre(30,"Nov","November"),
    Decembre(31,"Dec","December");

    int nbr;
    String abrv;
    String eng;

    Mois(int nbr,String abrv,String eng) {
        this.nbr=nbr;
        this.abrv=abrv;
        this.eng=eng;
    }
     
     public void Afficher() {
        for(Mois mois : Mois.values()) {
            System.out.println(mois);
        }
    }
    public boolean AccepterChaine(String ch) {
        boolean B=false;
        for(Mois mois : Mois.values()) {
            if(mois.toString().compareTo(ch)==0) {
                B=true;
                System.out.println("ex");
            }
        }
        return B;
    } 
    public String NumMois(int N) {
        String m="null";
       switch(N)  {  
       case 1 : m=Mois.Janvier.toString();  break;
       case 2 :  m=Mois.Fevrier.toString();  break;
       case 3 :  m=Mois.Mars.toString();  break;
       case 4 :  m=Mois.Avril.toString();  break;
       case 5 :   m=Mois.Mai.toString();  break;
       case 6 :   m=Mois.Juin.toString();  break;
       case 7 :  m=Mois.Juillet.toString();  break;
       case 8 :  m=Mois.Aout.toString();  break;
       case 9 :   m=Mois.Septembre.toString();  break;
       case 10 :   m=Mois.Octobre.toString();  break;
       case 11 :   m=Mois.Novembre.toString();  break;
       case 12 :  m=Mois.Decembre.toString();  break;
      
       }
       return m;
}
public void AfficherMois(Mois m) {
    System.out.println("Les renseignements du mois "+m+" sont :");
    System.out.println("Le nombre des jours : "+m.nbr);
    System.out.println("L'abreviation en francais : "+m.abrv);
    System.out.println("Le mois en anglais : "+m.eng);
}
public Mois Recherche(String abrv) {
    Mois m=null;
    for(Mois mois : Mois.values()) {
        if(mois.abrv.toString().compareTo(abrv)==0) {
            m=mois;
        }
    }
    return m;
}
}
 

    
 