public class Dieselbil extends Bil {

    private boolean harPartikelfilter;
    private float kmPrL;


    public Dieselbil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, boolean _harPartikelfilter, float _kmPrL) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.harPartikelfilter = _harPartikelfilter;
        this.kmPrL = _kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrl=" + kmPrL +
                ", regNr=" + getRegNr() +
                ", mærke='" + getMærke() + '\'' +
                ", model='" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }

    public double beregnGrønAfgift() {
        double grønAfgift = 0;


        if (kmPrL >= 20 && kmPrL <= 50) {
            grønAfgift = 130;
        } else if (kmPrL > 15 && kmPrL < 20) {
            grønAfgift = 1390;
        } else if (kmPrL > 10 && kmPrL < 15) {
            grønAfgift = 1850;
        } else if (kmPrL > 5 && kmPrL < 10) {
            grønAfgift = 2770;
        } else if (kmPrL > 0 && kmPrL < 5) {
            grønAfgift = 15260;
        }
        if (harPartikelfilter == false) {
            grønAfgift = grønAfgift + 1000;
        }


        return grønAfgift;
    }


}
