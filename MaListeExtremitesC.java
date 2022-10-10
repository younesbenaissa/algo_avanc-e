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

    @Override
    public Object voirQueue() throws Exception {
        return null;
    }

    public void rajouterEnTete(Object item){
        Cellule c = new Cellule(item);
        c.setSuivant(tete);
        tete=c;
    }

    @Override
    public void rajouterEnQueue(Object item) {

    }

    @Override
    public Object retirerEnTete() throws Exception {
        Object item = voirTete();
        tete = tete.getSuivant();
        return item;
    }

    @Override
    public Object retirerEnQueue() throws Exception {
        if(tete.getSuivant()==null){
            Object item = tete.getElement();
            tete= null;
            return item;
        }
        else {
            Cellule c =tete;
            while(c.getSuivant().getSuivant() != null){
                c=c.getSuivant();
            }
            Object item = c.getSuivant().getSuivant();
            c.setSuivant(null);
            return item;
        }
    }


}
