 
   public class TestListe
   { 
      public static void main (String[] args)
      {  // ListeExtremites l = new ListeExtremitesProf();
         ListeExtremites l = new MaListeExtremites();
        int rep;
        String s;
        do
         {  System.out.println("\n1/ tester si la liste est vide ");
            System.out.println("2/ rajouter une valeur en tete");
            System.out.println("3/ rajouter une valeur à la fin ");
            System.out.println("4/ retirer une valeur en tete");
            System.out.println("5/ retirer une valeur à la fin");
            System.out.println("6/ afficher la valeur située en tete de liste");
            System.out.println("7/ afficher la valeur située en queue de liste");
            System.out.println("8/ afficher le contenu de la liste ");
            System.out.println("0/ terminer : ");
            do 
            { rep=Console.readInt("votre choix ? : ");
            } while ((rep<0) || (rep>8));
            switch (rep)
            { 
               case 1 : 
                  if (l.estVide())
                     System.out.println("liste vide");
                  else
                     System.out.println("liste non vide");
                  break;
            
               case 2 : s = Console.readString("valeur à rajouter ? : ").trim();
                  l.rajouterEnTete(s);
                  break;
            
               case 3 : s =  Console.readString("valeur à rajouter ? : ").trim();
                  l.rajouterEnQueue(s);
                  break;
            
               case 4:  
                  try
                  {System.out.println("valeur retirée en tête  : "+ l.retirerEnTete());
                  }
                     catch (Exception e){
                        System.out.println("liste vide");}
                  break;
               case 5: try
                       {System.out.println("valeur retirée en queue : "+ l.retirerEnQueue());
                        }
                     catch (Exception e){ System.out.println("liste vide");}
                  break;
            
               case 6 : try
                  {System.out.println("valeur en tete de liste: "+ l.voirTete());
                  }
                     catch (Exception e) { System.out.println("liste vide");}
                  break;
            
               case 7 :  try
                  {System.out.println("valeur en queue de liste: "+ l.voirQueue());
                  }
                     catch (Exception e) { System.out.println("liste vide");}
                  break;
            
               case 8 : System.out.println(l);  
                  break;
            }  // end switch
         } while (rep!=0);     
      }  // end main
   } // end class