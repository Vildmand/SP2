public class Elbil extends Bil {

    private int batterikapacitetKWh;
    private int maxKm;
    private  double whPrKm;

    public Elbil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, int _batterikapacitetKWh, int _maxKm, double _whPrKm) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.batterikapacitetKWh = _batterikapacitetKWh;
        this.maxKm = _maxKm;
        this.whPrKm = _whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                ", regNr=" + getRegNr() +
                ", mærke='" + getMærke() + '\'' +
                ", model='" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }

    public double beregnGrønAfgift() {

        double grønAfgift = 0;
        double kmPrl = 100 / (whPrKm / 91.25);

        if (kmPrl > 20 && kmPrl <= 50) {
            grønAfgift = 330;
        } else if (kmPrl > 15 && kmPrl < 20) {
            grønAfgift = 1050;
        } else if (kmPrl > 10 && kmPrl < 15) {
            grønAfgift = 2340;
        } else if (kmPrl > 5 && kmPrl < 10) {
            grønAfgift = 5500;
        } else if (kmPrl > 0 && kmPrl < 5) {
            grønAfgift = 10470;
        }

        return grønAfgift;
    }
}

