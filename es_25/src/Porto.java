public class Porto {
        private Affitto[] posti;
        private int nPosti;
        private final int MAX_POSTI = 100;
        private float costoAlMetro;

        public Porto(float costoAlMetro){
            posti = new Affitto[MAX_POSTI];
            nPosti=0;
            this.costoAlMetro=costoAlMetro>=0?costoAlMetro:0;
        }

        public float getCostoAlMetro() {
            return costoAlMetro;
        }

        public int getnPosti() {
            return nPosti;
        }

        public void setCostoAlMetro(float costoAlMetro) {
            this.costoAlMetro=costoAlMetro>=0?costoAlMetro:0;
        }
        public void addPosto(Affitto posto){
            if (nPosti<MAX_POSTI){
                this.posti[nPosti]=posto;
                nPosti++;
            }
        }
        public String nomeAffittuario(Affitto posto){
            int tro =-1;
            int k = 0;
            while (k<nPosti && tro==-1){
                if (posti[k]==posto){
                    return posti[k].getNome();
                }
                k++;
            }
            if (tro==-1){
                return "Questo posto non c'è";
            }
            return null;
        }

        public float getPrezzo(Affitto posto){
            int tro =-1;
            int k = 0;
            while (k<nPosti && tro==-1){
                if (posto == posti[k]){
                    return (float) ((posti[k].getFineAffitto().getTimeInMillis()-posti[k].getInizioAffitto().getTimeInMillis())
                            *(24 * 60 * 60 * 1000) *(posti[k].getBarca().getDimensioni()*costoAlMetro));
                }
                k++;
            }
            if (tro==-1){
                return (float)0;
            }
            return 0;
        }

        public String controlla(Affitto posto){
            int tro =-1;
            int k = 0;
            while (k<nPosti && tro==-1){
                if (posti[k]==posto){
                    return "Occupato";
                }
                k++;
            }
            if (tro==-1){
                return "Libero";
            }
            return null;
        }

        public String affittaPosto(Affitto posto){
            int trov =-2;
            int k = 0;
            while (k<nPosti && trov==-2){
                if (posti[k]==posto){
                    return "Affittato";
                }
                k++;
            }
            if (trov==-2){

                return "Libero";
            }
            return null;
        }
    }
