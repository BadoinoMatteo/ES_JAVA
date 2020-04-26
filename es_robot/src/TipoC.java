public class TipoC extends Robot {
    private TipoMateriale tipoMateriale;

    public TipoC(String nome, float costoSec, Processore processore, TipoMateriale tipoMateriale) throws ValoreNonValido {
        super(nome, costoSec, processore);

        switch (tipoMateriale){
            case ACCIAIO:
                this.tipoMateriale=TipoMateriale.ACCIAIO;
                break;
            case FERRO:
                this.tipoMateriale=TipoMateriale.FERRO;
                break;
            case ALLUMINIO:
                this.tipoMateriale=TipoMateriale.ALLUMINIO;
                break;
            default:
                throw new ValoreNonValido("materiale non presente");
        }
    }

    public TipoMateriale getTipoMateriale() {
        return tipoMateriale;
    }

    @Override
    public String toString() {
        return "TipoC{" +
                "tipoMateriale=" + tipoMateriale +
                '}';
    }
}
