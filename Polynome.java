public class Polynome {
    float Coeff1,Coeff2 , Coeff3;
    int degree1,degree2 , degree3;

    public Polynome(int degree1 , int degree2 ,int degree3 , float Coeff1 , float Coeff2 , float Coeff3) {
        if(degree1 <=2 && degree2 <=2 && degree3 <2) {
            this.degree1=degree1;
            this.Coeff1=Coeff1;
            this.degree2=degree2;
            this.Coeff2=Coeff2;
            this.degree3=degree3;
            this.Coeff3=Coeff3;
        }
        
    }
    public int Degree() {
       if(this.degree1 >= this.degree2 && this.degree1 >= this.degree3) {
           return degree1;
       }
       else {
           if(this.degree2 >= this.degree1 && this.degree2 >= this.degree3) {
               return degree2;
           }
           else {
               return degree3;
           }
       }
    }
    public void Resoudre_Afficher(Polynome P) {
        float delta;
        double X,X1,X2;
        
        float B=0,C=0,A=0;
       if(P.Degree()==1) {
           A=0;
           if(P.degree1==P.degree2 && P.degree1==P.degree3) { 
            
            B=P.Coeff1+P.Coeff2+P.Coeff3;
            C=0;
           }
           else {
              if(P.degree1==P.degree2 && P.degree1==1) {
                B=P.Coeff1+P.Coeff2;
                C=P.Coeff3;
              }
              else {
                if(P.degree1==P.degree3 && P.degree1==1) {
                    B=P.Coeff1+P.Coeff3;
                    C=P.Coeff2;
                }
                else {
                    if(P.degree1==1) {
                        C=P.Coeff2+P.Coeff3;
                        B=P.Coeff1;
                    }
                    else {
                        if(P.degree2==1) {
                            C=P.Coeff1+P.Coeff3;
                            B=P.Coeff2;
                        }
                        else {
                            C=P.Coeff2+P.Coeff1;
                            B=P.Coeff3;
                        }
                    }
                }
              }
           }

           }
       
       else {
           if(P.Degree()==2) {
            if(P.degree1==P.degree2 && P.degree1==P.degree3) { 
               A=P.Coeff1+ P.Coeff2 + P.Coeff3;
               B=0 ; 
               C=0;
               }
               else {
                  if(P.degree1==P.degree2 && P.degree1==2) {
                    A=P.Coeff1+ P.Coeff2;
                     if(P.degree3==1) {
                        B=P.Coeff3;
                        C=0;
                     }
                     else {
                        B=0;
                        C=P.Coeff3;
                     }
                  }
                  else {
                    if(P.degree1==P.degree3 && P.degree1==1) {
                        A=P.Coeff1+ P.Coeff3;
                     if(P.degree2==1) {
                        B=P.Coeff2;
                        C=0;
                     }
                     else {
                        B=0;
                        C=P.Coeff2;
                     }
                    }
                    else {
                        if(P.degree1==2) {
                            A=P.Coeff1;
                            if(P.degree2==1 && P.degree3==0) {
                                B=P.Coeff2;
                                C=P.Coeff3;
                            }
                            else {
                                B=P.Coeff3;
                                C=P.Coeff2;
                            }
                        }
                        else {
                            if(P.degree2==1) {
                                A=P.Coeff2;
                                if(P.degree1==1 && P.degree3==0) {
                                    B=P.Coeff1;
                                    C=P.Coeff3;
                                }
                                else {
                                    B=P.Coeff3;
                                    C=P.Coeff1;
                                }
                            }
                            else {
                                if(P.degree3==1) {
                                    A=P.Coeff3;
                                    if(P.degree1==1 && P.degree2==0) {
                                        B=P.Coeff1;
                                        C=P.Coeff2;
                                    }
                                    else {
                                        B=P.Coeff2;
                                        C=P.Coeff1;
                                    }
                            }
                        }
                    }
                  }
               }
    
               }
           }
           else {
               A=0;
               B=0;
               C=P.Coeff1+P.Coeff2+P.Coeff3;
           }
       }
       
       delta = B*B-4*A*C;
       if(A!=0) {
        if(delta > 0) {
            X1=-B-Math.sqrt(delta);
            X1=X1 / (2*A);
            X2=-B-Math.sqrt(delta);
            X2=X2 / (2*A);
            System.out.println(X1+"," +X2);
        }
        else {
            if(delta == 0) {
             X=-B/(2*A);
             System.out.println(X);
            }
            else {
                System.out.println("pas de solution");
            }
        }
       }
       else {
           if(B!=0) {
               X=-C / B;
               System.out.println(X);
           }
           else {
            System.out.println("pas de solution");
           }
       }
       




    }
    public Polynome Multiple(Polynome P1, Polynome P2) {
        float A1=0,A2=0,B1=0,B2=0,C1=0,C2=0,A=0,B=0,C=0,X,Y;
        Polynome P=new Polynome(0,0,0,0,0,0);
        if(P1.Degree()==1) {
            A1=0;
            if(P1.degree1==P1.degree2 && P1.degree1==P1.degree3) { 
             
             B1=P1.Coeff1+P1.Coeff2+P1.Coeff3;
             C1=0;
            }
            else {
               if(P1.degree1==P1.degree2 && P1.degree1==1) {
                 B1=P1.Coeff1+P1.Coeff2;
                 C1=P1.Coeff3;
               }
               else {
                 if(P1.degree1==P1.degree3 && P1.degree1==1) {
                     B1=P1.Coeff1+P1.Coeff3;
                     C1=P1.Coeff2;
                 }
                 else {
                     if(P1.degree1==1) {
                         C1=P1.Coeff2+P1.Coeff3;
                         B1=P1.Coeff1;
                     }
                     else {
                         if(P1.degree2==1) {
                             C1=P1.Coeff1+P1.Coeff3;
                             B1=P1.Coeff2;
                         }
                         else {
                             C1=P1.Coeff2+P1.Coeff1;
                             B1=P1.Coeff3;
                         }
                     }
                 }
               }
            }
 
        }
        else {
            if(P1.Degree()==2) {
             if(P1.degree1==P1.degree2 && P1.degree1==P1.degree3) { 
                A1=P1.Coeff1+ P1.Coeff2 + P1.Coeff3;
                B1=0 ; 
                C1=0;
                }
                else {
                   if(P1.degree1==P1.degree2 && P1.degree1==2) {
                     A1=P1.Coeff1+ P1.Coeff2;
                      if(P1.degree3==1) {
                         B1=P1.Coeff3;
                         C1=0;
                      }
                      else {
                         B1=0;
                         C1=P1.Coeff3;
                      }
                   }
                   else {
                     if(P1.degree1==P1.degree3 && P1.degree1==1) {
                         A1=P1.Coeff1+ P1.Coeff3;
                      if(P1.degree2==1) {
                         B1=P1.Coeff2;
                         C1=0;
                      }
                      else {
                         B1=0;
                         C1=P1.Coeff2;
                      }
                     }
                     else {
                         if(P1.degree1==2) {
                             A1=P1.Coeff1;
                             if(P1.degree2==1 && P1.degree3==0) {
                                 B1=P1.Coeff2;
                                 C1=P1.Coeff3;
                             }
                             else {
                                 B1=P1.Coeff3;
                                 C1=P1.Coeff2;
                             }
                         }
                         else {
                             if(P1.degree2==1) {
                                 A1=P1.Coeff2;
                                 if(P1.degree1==1 && P1.degree3==0) {
                                     B1=P1.Coeff1;
                                     C1=P1.Coeff3;
                                 }
                                 else {
                                     B1=P1.Coeff3;
                                     C1=P1.Coeff1;
                                 }
                             }
                             else {
                                 if(P1.degree3==1) {
                                     A1=P1.Coeff3;
                                     if(P1.degree1==1 && P1.degree2==0) {
                                         B1=P1.Coeff1;
                                         C1=P1.Coeff2;
                                     }
                                     else {
                                         B1=P1.Coeff2;
                                         C1=P1.Coeff1;
                                     }
                             }
                         }
                     }
                   }
                }
     
                }
            }
            else {
                A1=0;
                B1=0;
                C1=P1.Coeff1+P1.Coeff2+P1.Coeff3;
            }
    }
        if(P2.Degree()==1) {
            A1=0;
            if(P2.degree1==P2.degree2 && P2.degree1==P1.degree3) { 
             
             B2=P2.Coeff1+P1.Coeff2+P2.Coeff3;
             C2=0;
            }
            else {
               if(P2.degree1==P2.degree2 && P2.degree1==1) {
                 B1=P2.Coeff1+P2.Coeff2;
                 C1=P2.Coeff3;
               }
               else {
                 if(P2.degree1==P2.degree3 && P2.degree1==1) {
                     B2=P2.Coeff1+P2.Coeff3;
                     C2=P2.Coeff2;
                 }
                 else {
                     if(P2.degree1==1) {
                         C2=P2.Coeff2+P2.Coeff3;
                         B2=P2.Coeff1;
                     }
                     else {
                         if(P2.degree2==1) {
                             C2=P2.Coeff1+P2.Coeff3;
                             B2=P2.Coeff2;
                         }
                         else {
                             C2=P2.Coeff2+P2.Coeff1;
                             B2=P2.Coeff3;
                         }
                     }
                 }
               }
            }
 
        }
        else {
            if(P2.Degree()==2) {
             if(P2.degree1==P2.degree2 && P2.degree1==P2.degree3) { 
                A2=P2.Coeff1+ P2.Coeff2 + P2.Coeff3;
                B2=0 ; 
                C2=0;
                }
                else {
                   if(P2.degree1==P2.degree2 && P2.degree1==2) {
                     A2=P2.Coeff1+ P2.Coeff2;
                      if(P2.degree3==1) {
                         B2=P2.Coeff3;
                         C2=0;
                      }
                      else {
                         B2=0;
                         C2=P2.Coeff3;
                      }
                   }
                   else {
                     if(P2.degree1==P2.degree3 && P2.degree1==1) {
                         A1=P2.Coeff1+ P2.Coeff3;
                      if(P2.degree2==1) {
                         B2=P2.Coeff2;
                         C2=0;
                      }
                      else {
                         B2=0;
                         C2=P2.Coeff2;
                      }
                     }
                     else {
                         if(P2.degree1==2) {
                             A2=P2.Coeff1;
                             if(P2.degree2==1 && P2.degree3==0) {
                                 B2=P2.Coeff2;
                                 C2=P2.Coeff3;
                             }
                             else {
                                 B2=P2.Coeff3;
                                 C2=P2.Coeff2;
                             }
                         }
                         else {
                             if(P2.degree2==1) {
                                 A1=P2.Coeff2;
                                 if(P2.degree1==1 && P2.degree3==0) {
                                     B2=P2.Coeff1;
                                     C2=P2.Coeff3;
                                 }
                                 else {
                                     B2=P2.Coeff3;
                                     C2=P2.Coeff1;
                                 }
                             }
                             else {
                                 if(P2.degree3==1) {
                                     A1=P2.Coeff3;
                                     if(P2.degree1==1 && P2.degree2==0) {
                                         B2=P2.Coeff1;
                                         C2=P2.Coeff2;
                                     }
                                     else {
                                         B2=P2.Coeff2;
                                         C2=P2.Coeff1;
                                     }
                             }
                         }
                     }
                   }
                }
     
                }
            }
            else {
                A2=0;
                B2=0;
                C2=P2.Coeff1+P2.Coeff2+P2.Coeff3;
            }
    }
     X=A1*A2;
     Y=A1*B2 + B1*A2;
     A=A1*C2 + B1*B2 + C1*A2;
     B=C1*B2 + B1*C2;
     C=C1*C2;
     if(X!=0||Y!=0)   {
         P.Coeff1=0;
         P.Coeff2=0;
         P.Coeff3=0;
     }
     else {
         P.Coeff1=A;
         P.Coeff2=B;
         P.Coeff3=C;
         P.degree1=2;
         P.degree2=1;
         P.degree3=0;
     }
     return P;
}
    public Polynome DeriveeP(Polynome P) {
        Polynome Pd;
        Monome M1= new Monome(P.degree1,P.Coeff1);
        Monome M2= new Monome(P.degree2,P.Coeff2);
        Monome M3= new Monome(P.degree3,P.Coeff3);
        M1=M1.Derivee();
        M2=M2.Derivee();
        M3=M3.Derivee();
        Pd= new Polynome(M1.degree,M2.degree,M3.degree,M1.coeff,M2.coeff,M2.coeff);
        return Pd;
    }
    public Boolean EgaliteeP(Polynome P1 , Polynome P2) {
        float A1=0,A2=0,B1=0,B2=0,C1=0,C2=0,A=0,B=0,C=0,X,Y;
        Polynome P=new Polynome(0,0,0,0,0,0);
        if(P1.Degree()==1) {
            A1=0;
            if(P1.degree1==P1.degree2 && P1.degree1==P1.degree3) { 
             
             B1=P1.Coeff1+P1.Coeff2+P1.Coeff3;
             C1=0;
            }
            else {
               if(P1.degree1==P1.degree2 && P1.degree1==1) {
                 B1=P1.Coeff1+P1.Coeff2;
                 C1=P1.Coeff3;
               }
               else {
                 if(P1.degree1==P1.degree3 && P1.degree1==1) {
                     B1=P1.Coeff1+P1.Coeff3;
                     C1=P1.Coeff2;
                 }
                 else {
                     if(P1.degree1==1) {
                         C1=P1.Coeff2+P1.Coeff3;
                         B1=P1.Coeff1;
                     }
                     else {
                         if(P1.degree2==1) {
                             C1=P1.Coeff1+P1.Coeff3;
                             B1=P1.Coeff2;
                         }
                         else {
                             C1=P1.Coeff2+P1.Coeff1;
                             B1=P1.Coeff3;
                         }
                     }
                 }
               }
            }
 
        }
        else {
            if(P1.Degree()==2) {
             if(P1.degree1==P1.degree2 && P1.degree1==P1.degree3) { 
                A1=P1.Coeff1+ P1.Coeff2 + P1.Coeff3;
                B1=0 ; 
                C1=0;
                }
                else {
                   if(P1.degree1==P1.degree2 && P1.degree1==2) {
                     A1=P1.Coeff1+ P1.Coeff2;
                      if(P1.degree3==1) {
                         B1=P1.Coeff3;
                         C1=0;
                      }
                      else {
                         B1=0;
                         C1=P1.Coeff3;
                      }
                   }
                   else {
                     if(P1.degree1==P1.degree3 && P1.degree1==1) {
                         A1=P1.Coeff1+ P1.Coeff3;
                      if(P1.degree2==1) {
                         B1=P1.Coeff2;
                         C1=0;
                      }
                      else {
                         B1=0;
                         C1=P1.Coeff2;
                      }
                     }
                     else {
                         if(P1.degree1==2) {
                             A1=P1.Coeff1;
                             if(P1.degree2==1 && P1.degree3==0) {
                                 B1=P1.Coeff2;
                                 C1=P1.Coeff3;
                             }
                             else {
                                 B1=P1.Coeff3;
                                 C1=P1.Coeff2;
                             }
                         }
                         else {
                             if(P1.degree2==1) {
                                 A1=P1.Coeff2;
                                 if(P1.degree1==1 && P1.degree3==0) {
                                     B1=P1.Coeff1;
                                     C1=P1.Coeff3;
                                 }
                                 else {
                                     B1=P1.Coeff3;
                                     C1=P1.Coeff1;
                                 }
                             }
                             else {
                                 if(P1.degree3==1) {
                                     A1=P1.Coeff3;
                                     if(P1.degree1==1 && P1.degree2==0) {
                                         B1=P1.Coeff1;
                                         C1=P1.Coeff2;
                                     }
                                     else {
                                         B1=P1.Coeff2;
                                         C1=P1.Coeff1;
                                     }
                             }
                         }
                     }
                   }
                }
     
                }
            }
            else {
                A1=0;
                B1=0;
                C1=P1.Coeff1+P1.Coeff2+P1.Coeff3;
            }
    }
        if(P2.Degree()==1) {
            A1=0;
            if(P2.degree1==P2.degree2 && P2.degree1==P1.degree3) { 
             
             B2=P2.Coeff1+P1.Coeff2+P2.Coeff3;
             C2=0;
            }
            else {
               if(P2.degree1==P2.degree2 && P2.degree1==1) {
                 B1=P2.Coeff1+P2.Coeff2;
                 C1=P2.Coeff3;
               }
               else {
                 if(P2.degree1==P2.degree3 && P2.degree1==1) {
                     B2=P2.Coeff1+P2.Coeff3;
                     C2=P2.Coeff2;
                 }
                 else {
                     if(P2.degree1==1) {
                         C2=P2.Coeff2+P2.Coeff3;
                         B2=P2.Coeff1;
                     }
                     else {
                         if(P2.degree2==1) {
                             C2=P2.Coeff1+P2.Coeff3;
                             B2=P2.Coeff2;
                         }
                         else {
                             C2=P2.Coeff2+P2.Coeff1;
                             B2=P2.Coeff3;
                         }
                     }
                 }
               }
            }
 
        }
        else {
            if(P2.Degree()==2) {
             if(P2.degree1==P2.degree2 && P2.degree1==P2.degree3) { 
                A2=P2.Coeff1+ P2.Coeff2 + P2.Coeff3;
                B2=0 ; 
                C2=0;
                }
                else {
                   if(P2.degree1==P2.degree2 && P2.degree1==2) {
                     A2=P2.Coeff1+ P2.Coeff2;
                      if(P2.degree3==1) {
                         B2=P2.Coeff3;
                         C2=0;
                      }
                      else {
                         B2=0;
                         C2=P2.Coeff3;
                      }
                   }
                   else {
                     if(P2.degree1==P2.degree3 && P2.degree1==1) {
                         A1=P2.Coeff1+ P2.Coeff3;
                      if(P2.degree2==1) {
                         B2=P2.Coeff2;
                         C2=0;
                      }
                      else {
                         B2=0;
                         C2=P2.Coeff2;
                      }
                     }
                     else {
                         if(P2.degree1==2) {
                             A2=P2.Coeff1;
                             if(P2.degree2==1 && P2.degree3==0) {
                                 B2=P2.Coeff2;
                                 C2=P2.Coeff3;
                             }
                             else {
                                 B2=P2.Coeff3;
                                 C2=P2.Coeff2;
                             }
                         }
                         else {
                             if(P2.degree2==1) {
                                 A1=P2.Coeff2;
                                 if(P2.degree1==1 && P2.degree3==0) {
                                     B2=P2.Coeff1;
                                     C2=P2.Coeff3;
                                 }
                                 else {
                                     B2=P2.Coeff3;
                                     C2=P2.Coeff1;
                                 }
                             }
                             else {
                                 if(P2.degree3==1) {
                                     A1=P2.Coeff3;
                                     if(P2.degree1==1 && P2.degree2==0) {
                                         B2=P2.Coeff1;
                                         C2=P2.Coeff2;
                                     }
                                     else {
                                         B2=P2.Coeff2;
                                         C2=P2.Coeff1;
                                     }
                             }
                         }
                     }
                   }
                }
     
                }
            }
            else {
                A2=0;
                B2=0;
                C2=P2.Coeff1+P2.Coeff2+P2.Coeff3;
            }
    }
     return(A1== A2 && B1==B2 && C1==C2) ;
        
    }

    public float EvaluerP(Polynome P , float X) {
        Monome M1= new Monome(P.degree1,P.Coeff1);
        Monome M2= new Monome(P.degree2,P.Coeff2);
        Monome M3= new Monome(P.degree3,P.Coeff3);
        float Resultat;
        Resultat=M1.Evaluer(X) + M2.Evaluer(X) + M3.Evaluer(X);
        return Resultat;
    }
    public void AfficherP(Polynome P) {
        Monome M1= new Monome(P.degree1,P.Coeff1);
        Monome M2= new Monome(P.degree2,P.Coeff2);
        Monome M3= new Monome(P.degree3,P.Coeff3);
        System.out.println("le polynome P : \t");
        M1.Afficher(M1);
        System.out.println("+\t");
        M2.Afficher(M2);
        System.out.println("+\t");
        M3.Afficher(M3);
        System.out.println("\n");
    
    
    }


}
