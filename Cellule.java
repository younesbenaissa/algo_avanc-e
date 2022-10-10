public class Cellule {
    private Object elem;
    private Cellule suivant;

    public Cellule() {
        this((Object)null);
    }

    public Cellule(Object var1) {
        this.elem = var1;
        this.suivant = null;
    }

    public Object getElement() {
        return this.elem;
    }

    public Cellule getSuivant() {
        return this.suivant;
    }

    public void setElement(Object var1) {
        this.elem = var1;
    }

    public void setSuivant(Cellule var1) {
        this.suivant = var1;
    }

    public String toString() {
        return this.elem.toString();
    }
}