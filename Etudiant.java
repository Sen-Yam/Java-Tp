public class Etudiant {
    int matricule ;
    String Nom , Prenom , Specialite  ;
    char  section;
    double Note1,Note2;
   public Etudiant() {
       this.matricule=0;
       this.Nom=" ";
       this.Prenom=" ";
       this.Specialite=" ";
       this.section=' ';
       this.Note1=0.0;
       this.Note2=0.0;
       
       

   }
   public Etudiant(int matricule , String Nom , String Prenom , String Specialite , char section , double Note1 , double Note2) {
    this.matricule=matricule;
    this.Nom=Nom;
    this.Prenom=Prenom;
    this.Specialite=Specialite;
    this.section=section;
    this.Note1=Note1;
    this.Note2=Note2;
    
    

}
   public int GetMatricule() {
       return this.matricule;
   }
   public String GetNom() {
       return this.Nom;
   }
   public String GetPremom() {
       return this.Prenom;
   }
   public String GetSpecialite() {
       return this.Specialite;
   }
   public char GetSection() {
       return this.section;
   }
   public double GetNote1() {
       return this.Note1;
   }
  
   public double GetNote2() {
       return this.Note2;
   }
  
   public void SetMatricule(int Matricule) {
       this.matricule=Matricule;
   }
   public void SetNom(String Nom) {
    this.Nom=Nom;
}
public void SetPremom(String Prenom) {
    this.Prenom=Prenom;
}
public void SetSpecialite(String Specialite) {
    this.Specialite=Specialite;
}
public void SetSection(char section) {
     this.section=section;
}
public void SetNote1(double Note1) {
     this.Note1=Note1;
}

public void SetNote2(double Note2) {
    this.Note2=Note2;
}
public void AFFICHAGE() {
    System.out.println(this.matricule);
    System.out.println(this.Nom);
    System.out.println(this.Prenom);
    System.out.println(this.Specialite);
    System.out.println(this.section);
    System.out.println(this.Note1);
    System.out.println(this.Note2);
  
}
   
}


