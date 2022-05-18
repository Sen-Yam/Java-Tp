public class Article {
    String Reference  , Designation;
    double Prix_HTT , Taux_TVA;
      public Article () {
        this.Reference=" ";
        this.Designation=" ";
        this.Prix_HTT=0;
        this.Taux_TVA=0;        
    }


    private Article (String Rf , String Des , double HTT , double TVA) {
        this.Reference=Rf;
        this.Designation=Des;
        this.Prix_HTT=HTT;
        this.Taux_TVA=TVA;        
    }
    public  Article (String Rf , String Des) {
        this.Reference=Rf;
        this.Designation=Des;
        this.Prix_HTT=0;
        this.Taux_TVA=0;        
    }
    public double Calculate_TTC() {
        return this.Prix_HTT+(this.Prix_HTT+this.Taux_TVA)/100;
    }

    public String GetReference() {
        return this.Reference;
    }
    public String GetDesignaion() {
        return this.Designation;
    }
    public double GetHTT() {
        return this.Prix_HTT;
    }
    public double GetTVA() {
        return this.Taux_TVA;
    }

    public void setReference(String Ref) {
        this.Reference=Ref;
    }
    public void SetReference(String Des) {
        this.Designation=Des;
    }
    public void SetHTT(double HTT) {
        this.Prix_HTT=HTT;
    }
    public void SetTVA(double TVA) {
        this.Taux_TVA=TVA;
    }
    
    public static void main (String[] arg){
        Article O1 = new Article () ;
        double N1 = O1.Calculate_TTC();
        Article O2 = new Article () ;
        double N23 = O2.Calculate_TTC();
        Article O3 = new Article () ;
        double N = O3.Calculate_TTC();
        
        
    }

}
