import java.util.Scanner;
public class test {
    public static void main (String[] arg) {
        int N=0;
        Scanner e= new Scanner(System.in);
        System.out.println("Les elements de enum sont :");
        Mois.Janvier.Afficher();
        Mois[] T = new Mois[100];
       Mois.Aout.AfficherMois(Mois.Avril);
     System.out.println("Donnez les elements du tableau : ");
     for(int i=0;i<10;i++) {
        String m=e.next();
        switch(m)  {  
            case "Janvier" : T[i]=Mois.Janvier;  break;
            case "Fevrier" :T[i]=Mois.Fevrier;  break;
            case "Mars" :  T[i]=Mois.Mars;  break;
            case "Avril" :  T[i]=Mois.Avril;  break;
            case "Mai" :   T[i]=Mois.Mai;  break;
            case "Juin" :   T[i]=Mois.Juin;  break;
            case "Juillet" :  T[i]=Mois.Juillet;  break;
            case "Aout" :  T[i]=Mois.Aout;  break;
            case "Septembre" :   T[i]=Mois.Septembre;  break;
            case "Octobre" :   T[i]=Mois.Octobre;  break;
            case "Novembre" :   T[i]=Mois.Novembre;  break;
            case "Decembre" :  T[i]=Mois.Decembre;  break;
           default :  T[i]=Mois.Janvier;
            }
     }
     System.out.println("Les elements du tableau sont :");
     for( int i=0; i<10;i++) {
        System.out.println(T[i]);
     }
     System.out.println("Donnez une abreviation de mois :");
     String m=e.next();
     System.out.println(Mois.Aout.Recherche(m));
     System.out.println("Affichage de l'enumeration en details :");
     for(Mois mois : Mois.values()) {
         if(mois.nbr==31) {
            System.out.println("nbr= "+mois.nbr+" abrv= "+mois.abrv+" eng= "+mois.eng);
         }
        
     }
     System.out.println("Donnez un nombre de mois :");
     N=e.nextInt();
     int S=1;
     for(Mois mois : Mois.values()) {
         if(S==N) {
            System.out.println("les renseignements du "+N+" eme mois sont : nbr= "+mois.nbr+" abrv= "+mois.abrv+" eng= "+mois.eng);
         }
         S++;
     }

     System.out.println("Donnez les elements du tableau  avec abreviation seulement: ");
     for(int i=0;i<10;i++) {
        String n=e.next();
        switch(n)  {  
            case "Jan" : T[i]=Mois.Janvier;  break;
            case "Fev" :T[i]=Mois.Fevrier;  break;
            case "Mar" :  T[i]=Mois.Mars;  break;
            case "Avr" :  T[i]=Mois.Avril;  break;
            case "Mai" :   T[i]=Mois.Mai;  break;
            case "Juin" :   T[i]=Mois.Juin;  break;
            case "Jui" :  T[i]=Mois.Juillet;  break;
            case "Aout" :  T[i]=Mois.Aout;  break;
            case "Sep" :   T[i]=Mois.Septembre;  break;
            case "Oct" :   T[i]=Mois.Octobre;  break;
            case "Nov" :   T[i]=Mois.Novembre;  break;
            case "Dec" :  T[i]=Mois.Decembre;  break;
           default :  T[i]=Mois.Janvier;
            }
     }
     int i=0;
     System.out.println("Les elements du tableau sont :");
     for( int j=0; j<10;j++) {
        System.out.println(T[j]);
     }
     for(int k=0;k<10;k++) {

         if(T[k].toString().compareTo("Janvier")==0) {
             i++;
             System.out.println(i);
         }
     }
     System.out.println("Le nombre d'occurrence de Janvier est : "+i);

  
    }
}
