public class Benzinbil extends Bil{
    private int oktantal;
    private double kmPrl;

    public Benzinbil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, int _oktantal, int _kmPrl) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.oktantal = _oktantal;
        this.kmPrl = _kmPrl;
    }


    public int getOktantal() {
        return oktantal;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrl=" + kmPrl +
                ", regNr=" + getRegNr() +
                ", mærke='" + getMærke() + '\'' +
                ", model='" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }


    public double beregnGrønAfgift() {
        double grønAfgift = 0;

        if(kmPrl > 20 && kmPrl < 50){
            grønAfgift = 330;
        }
        else if(kmPrl > 15 && kmPrl < 20){
            grønAfgift = 1050;
        }
        else if(kmPrl > 10 && kmPrl < 15){
            grønAfgift = 2340;
        }
        else if(kmPrl > 5 && kmPrl < 10){
            grønAfgift = 5500;
        }
        else if(kmPrl > 0 && kmPrl < 5){
            grønAfgift = 10470;
        }
        return grønAfgift;
    }
}