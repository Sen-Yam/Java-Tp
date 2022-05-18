public class Mot {
    String mt;
    public Mot(String M) {
        this.mt=M;
    }
    public Mot Inverse(Mot M) {
       String S="";
        int j=M.mt.length();
        int i;
        while(j>=0) {
            char X=M.mt.charAt(j);
           S=S+X; 
           j--;
        }
        M.mt=S;
        return M;
    }
    public int Compare(String M) {
        int X= this.mt.compareTo(M);
        if(X<0) {
            return -1;
        }
        else {
            if(X==0) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    public void Affichage() {
        System.out.println(this.mt);
    }

}
