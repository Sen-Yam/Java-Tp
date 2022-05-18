/* LARABA Yamina Nesrine 
    202031043730
    Acad B grp 2
} */
class Application {
    public static void main (String[] arg) {
      Polynome P1= new Polynome(2,1,0,1,2,1);
      Polynome P2=new Polynome(2,0,0,1,0,-1);
      Polynome P = new Polynome(0,0,0,0,0,0);
      P1.AfficherP(P1);
      if(P.EgaliteeP(P1, P2)==true) {
          System.out.println("Poynomes identiques");
      }
      else {
          System.out.println("Polynomes non identiques");
      }
      float resultat = P1.EvaluerP(P1, 10);
      System.out.println("P1(10) = "+resultat);
      P1.Resoudre_Afficher(P1);
      Polynome Pd= P1.DeriveeP(P1);
      resultat = Pd.EvaluerP(Pd, 20);
      System.out.println("Derivee de P1 au point X=20 est : "+resultat);
      Polynome A= new Polynome(0,1,0,0,3,5);
      Polynome B= new Polynome(0,1,0,0,6,7);
      
      P=P.Multiple(A, B);
      resultat = P.EvaluerP(P, 10);
      System.out.println("Le produit au point X=10 est : "+resultat);
      Polynome C= new Polynome(2,1,0,2,3,5);
      Polynome D= new Polynome(2,1,0,1,6,7);
      P=P.Multiple(C, D);
      resultat = P.EvaluerP(P, 10);
      System.out.println("Le produit au point X=10 est : "+resultat); 


      // la derniere qst on obtient 0 car : le resultat est de type float et non pas double
    }
}
