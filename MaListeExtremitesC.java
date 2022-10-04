public class MaListeExtremitesC implements ListeExtremites {
    private Cellule tete;

    public MaListeExtremitesC(){}
    public MaListeExtremitesC(Object[] tabSource){
        for(Object item: tabSource){
            rajouterEnQueue(item);
        }
    }
    public boolean estVide(){
        return tete==null;
    }
    public Object voirTete() throws Exception{
        if(estVide())throw new Exception("Liste vide");
        return tete.getElement();
    }
    public void rajouterEnTete(Object item){
        Cellule c = new Cellule(item);
        c.setSuivant(tete);
        tete=c;
    }
    public Object retireEnTete() throws Exception{
        Object item = voirTete();
        tete = tete.getSuivant();
        return item;
    }
}
