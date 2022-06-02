public class ArbreMot {
    Mot M;
    ArbreMot Left,Right; 
     public ArbreMot(String ch) {
        this.M=new Mot(ch);
        this.Left=null;
        this.Right=null;
    } 
    public void AddMot(String ch) {
            ArbreMot B = new ArbreMot("100");
             ArbreMot A=this;
            while(A!=null && (A.Left!=null || A.Right!=null)) {
                if( A.M.Compare(ch)==1) {
                 A=A.Left;
                 
                }
                else {
                   A=A.Right;
                }
             }
        
        if(A!=null) {
            if(A.M.Compare(ch)==1) {
                A.Left=B;
                System.out.println("Left after adding " +A.Left);
                A.Left.M.mt=ch;
                A.Left.Left=null;
                A.Left.Right=null;
            }
            else {
                A.Right=B;
                A.Right.M.mt=ch;
                A.Right.Left=null;
                A.Right.Right=null;
            }
        
        }
        else {
            A=B;
            A.M.mt=ch;
            A.Left=null;
                A.Right=null;
        }
        }
    Mot S=new Mot (" ");
    public Mot Maximum(ArbreMot A) {
       
        if(A!=null) {
            S=Maximum(A.Right);
        }
        return S;
    }
    int T=0;
    public int Taille(ArbreMot A) {
        
        if(A!=null) {
            T=1+Taille(A.Left)+Taille(A.Right);
        }
        return T;
    }
    boolean E=false;
    public boolean Existe(String N , ArbreMot A) {
       
       if(A!=null) {
        if(A.M.Compare(N)==0){
            E=true;
        }
        else {
            
            if(A.M.Compare(N)==1) {
   
        E=Existe(N,A.Left);
            }
            else {
                E=Existe(N,A.Right);
            }
        }
       }
        return E;
    }
    public void AfficherArbre(ArbreMot A) {
        
         if(A!=null) {
            AfficherArbre(A.Left);
            System.out.println(A.M.mt);
            AfficherArbre(A.Right);
        } 
    }
   
}
