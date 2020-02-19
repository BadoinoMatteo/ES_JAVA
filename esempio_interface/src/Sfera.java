public class Sfera extends Solido {
    double raggio;

    public Sfera(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
        this.raggio = raggio;
    }

    @Override
    public double superficie() {
        return (4*Math.PI*(raggio*raggio));
    }

    @Override
    public double volume() {
        return (4*Math.PI*(raggio*raggio*raggio)/3);
    }
}
