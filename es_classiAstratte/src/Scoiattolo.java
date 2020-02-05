public  class  Scoiattolo extends Animale {
    private int num;
    public Scoiattolo(String nome) {
        super(nome);

    }


    @Override
    public String attivita() {
        return " saltare tra i rami ";
    }

    @Override
    public String vive() {
        return " nei boschi ";
    }

    @Override
    public String mangia() {
        return " ghiande ";
    }
}
