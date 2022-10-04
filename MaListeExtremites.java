public class MaListeExtremites {
    private ListeCurseur lc;
    public MaListeExtremites(){
        lc= new ListeCurseurProf();
    }
    public void rajouterEnTete(Object item){
        lc.allerAuDebut();
        lc.ajouter(item);
    }
    public void rajouterEnQueue(Object item){
        while(!lc.estEnFin()){
            lc.avancer();
        }
        lc.ajouter(item);
    }
    public Object retirerEnTete() throws Exception{
        Object item= voirTete();
        lc.supprimer();
        return item;
    }
    public Object retirerEnQueue() throws Exception{
    Object item = retirerEnTete();

    while(!lc.estEnFin()) {
        lc.ajouter(item);
        lc.avancer();
        item = lc.voirSuivant();
        lc.supprimer();
    }
    return item;

    }
    public Object voirTete() throws Exception{
        lc.allerAuDebut();
        if(lc.estEnFin())throw new Exception("liste vide");
        return lc.voirSuivant();

    }
    public Object voirQueue() throws Exception{
        lc.allerAuDebut();
        if(lc.estEnFin())throw new Exception("liste vide");

        Object item = null;
        while (!lc.estEnFin()){
            item = lc.voirSuivant();
            lc.avancer();
        }
        return item;
    }
    public boolean estVide(){
        lc.allerAuDebut();
        return lc.estEnFin();
    }
}
