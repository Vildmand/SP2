public abstract class Bil {
    private int regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    public Bil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre) {
        this.regNr = _regNr;
        this.mærke = _mærke;
        this.model = _model;
        this.årgang = _årgang;
        this.antalDøre = _antalDøre;
    }

    public abstract double beregnGrønAfgift();

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

}
