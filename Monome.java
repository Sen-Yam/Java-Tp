public class Monome{
    int degree ;
    float coeff;
    // non on ne doit pas representer le x par un attribut car il est incunnu
    public Monome(int degree , float coeff) {
        this.degree=degree;
        this.coeff=coeff;
    }
    public void Monome(float coeff) {
        this.coeff=coeff;
        this.degree=0;
    }
    public Monome Derivee() {
        Monome resultat = new Monome(0,0);
        resultat.coeff=this.degree;
        resultat.degree=this.degree-1;
        return resultat;
    }
    public float Evaluer(float X) {
        float result=1;
        for(var i=0 ; i<this.degree ; i++) {
            result=result*X;
        }
        result=result*this.coeff;
        return result;
    }
    public void Afficher(Monome M) {
        System.out.println(M.coeff + "*X^"  + M.degree);
    }
    public boolean Egalitee(Monome X1 , Monome X2) {
        return(X1.coeff==X2.coeff && X1.degree==X2.degree) ;
            
        
    }
    public Monome Produit(Monome M1 , Monome M2) {
        Monome M3= new Monome(0,0);
        M3.coeff=M1.coeff*M2.coeff;
        M3.degree=M2.degree+M1.degree;
        return M3;
    }

}
