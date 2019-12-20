public class Telecomando {
    private int canale;
    private int volume;
    private String acceso;
    private boolean mute=false;
    private final int VOLUME_MAX = 100;
    private final int CANALE_MAX = 10;

    public String toString() {
        return "Acceso: " + acceso +  "\nCanale: " + canale +   "\nVolume: " + (mute?"MUTE":volume) + "\n";
    }

    public Telecomando(){
        canale=1;
        volume=15;
        acceso="off";
        mute=false;
    }

    public void setCanaleUp() {
        if(acceso=="on"){
            canale++;
            if(canale==CANALE_MAX) {
                canale=1;
            }
        }else{
            acceso="on";
        }
    }

    public void setCanaleDown() {
        canale--;
        if(canale<0) {
            canale = CANALE_MAX;
        }
    }

    public void setCanale(int canale) {
        if (canale>0 && canale<=CANALE_MAX) {
            this.canale = canale;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolumeUp() {
        volume++;
        if(volume==VOLUME_MAX) {
            volume = 1;
        }
    }

    public void setVolumeDown() {
        volume--;
        if(volume<0) {
            volume = 1;
        }
    }

    public void setVolume(int volume) {
        if (volume>0 && volume<=VOLUME_MAX) {
            this.canale = volume;
        }
    }

    public void muto(){
        mute = !mute;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso() {
        this.acceso = acceso;
    }
}
