import java.util.GregorianCalendar;
import java.util.Vector;

public class Contratto {
    private String cellulare;
    private GregorianCalendar validoDa;
    private GregorianCalendar emessaFattura;
    private final int TEMPOSOLLECITO = 30;
    private TipoContratto tipoContratto;
    private final int COSTO_EVO = 65;
    private final int COSTO_PLUS = 65;
    private final int COSTO_START = 65;
    private Cliente sottoscrittoDa;
    private Vector<Opzione> opzioni=new Vector<Opzione>();
    private Vector <String> numeriGratis=new Vector<String>();


    public Contratto(String cellulare, GregorianCalendar validoDa, TipoContratto tipoContratto, Cliente sottoscrittoDa) {
        this.cellulare = cellulare;
        this.validoDa = validoDa;
        this.tipoContratto = tipoContratto;
        this.sottoscrittoDa = sottoscrittoDa;
    }

    public String getCellulare() {
        return cellulare;
    }

    public GregorianCalendar getEmessaFattura() {
        return emessaFattura;
    }

    public GregorianCalendar getValidoDa() {
        return validoDa;
    }

    public int getCOSTO_EVO() {
        return COSTO_EVO;
    }

    public int getCOSTO_PLUS() {
        return COSTO_PLUS;
    }

    public int getCOSTO_START() {
        return COSTO_START;
    }

    public int getTEMPOSOLLECITO() {
        return TEMPOSOLLECITO;
    }

    public TipoContratto getTipoContratto() {
        return tipoContratto;
    }

    public Cliente getSottoscrittoDa() {
        return sottoscrittoDa;
    }

    @Override
    public String toString() {
        return "Contratto{" +
                "cellulare='" + cellulare + '\'' +
                ", validoDa=" + validoDa.getTime() +
                ", tipoContratto=" + tipoContratto +
                ", sottoscrittoDa=" + sottoscrittoDa +
                '}';
    }

    public double getCostoTotale() {
        double costoTotale = 0;
        if (tipoContratto == TipoContratto.EVO) {
            costoTotale = COSTO_EVO;
        } else if( tipoContratto== TipoContratto.PLUS){
            costoTotale=COSTO_PLUS;
        }else if(tipoContratto== TipoContratto.START){
            costoTotale=COSTO_START;
        }
    return costoTotale;
    }

    public void addOpzione(Opzione opzione){
        opzioni.add(opzione);
    }

    public void AddNumeroGratis(String cellulare ){
        if (numeriGratis.size()<3){
            numeriGratis.add(cellulare);
        }else{
            new ValoreNonValido("numero massimo raggiunto");
        }
    }

}
