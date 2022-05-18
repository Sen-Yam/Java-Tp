// LARABA Yamina Nesrine Acad B groupe 2  202031043730



import java.lang.reflect.Array;
import java.util.Scanner;

class App{
    public static void main (String[] arg) {
        
        int N;
        Scanner e= new Scanner(System.in);
      
        Mot[] V;
        V= new Mot[100];
        TabMot T = new TabMot(100,V,0);
       /*  System.out.println("Donnez le nombre des mots");
        do {
             N=e.nextInt();
        }while(N<0 || N>100);
        System.out.println("Donnez les " +N+" mots : ");
        for(int i=0;i<N;i++) {
            String S=e.next();
            Mot M = new Mot(S);
            
            T.AjouterMot(M);
        }
        
         T.Afficher();  
         System.out.println("les mots qui sont inferieurs a la chaine : l'obstination est le chemin de la réussite sont :");
         for(int i=0;i<T.Tab.length;i++)  {
             if(T.Tab[i].Compare("l'obstination est le chemin de la réussite")==-1) {
                 System.out.println(T.Tab[i].mt);
             }
         } 
         for(int i=0;i<T.index;i++)  {
             if(T.Tab[i].Compare("Se réunir est un début ; rester ensemble est un progrès ; travailler ensemble est la reussite")==1) {
                 T.Tab[i].Inverse(T.Tab[i]);
                 T.Tab[i].Affichage();
             }
         } 
 */

         ArbreMot A =null;
         System.out.println("Donnez le nombre des mots de l'arbre");
        do {
             N=e.nextInt();
        }while(N<0 || N>100);
        System.out.println("Donnez les " +N+" mots : ");
        for(int i=0;i<N;i++) {
            String S=e.next();
            if(i==0) {
                A=new ArbreMot(S);
            }
            else {
                A.AddMot(S);
            }
        }
       System.out.println("Les elements de l'arbre sont : ");
          A.AfficherArbre(A);   
          int t= A.Taille(A);
          System.out.println("La taille de l'arbre est : " +t);
         System.out.println(A.Existe("4", A)); 

     
        
    }
    
   
}