package decorateurs;
import composants.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson;

    public Decorateur(Boisson boisson){
        this.boisson = boisson ;
    }

    // make the get description method abstract to force the subclasses to implement it
    @Override
    public abstract String getDescription();

}
