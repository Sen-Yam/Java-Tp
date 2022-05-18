import java.util.Arrays;

public class TabMot {
    int nbr;
    Mot[] Tab;
    int index;
    public TabMot(int nbr , Mot[] Tab,int index) {
        this.nbr=nbr;
        this.Tab=Tab;
        this.index=index;
    }
    public void AjouterMot(Mot M) {
       
            
          this.Tab[this.index]=M;
          this.index++;
       
        
        
    }
    public void Afficher() {
        for(int i=0;i<this.index;i++) {
            System.out.println(this.Tab[i].mt);
        }
    }
}
