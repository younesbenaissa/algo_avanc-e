   public interface ListeExtremites
   {  
      public void rajouterEnTete(Object item);
      public void rajouterEnQueue(Object item);
      public Object retirerEnTete() throws Exception;
      public Object retirerEnQueue() throws Exception;
      public Object voirTete() throws Exception;
      public Object voirQueue() throws Exception;
      public boolean estVide();
   }