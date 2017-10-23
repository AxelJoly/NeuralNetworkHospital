/**
 * Created by axel on 23/10/2017.
 */
public class Etat {

    private int bpm;
    private int glycemie;
    private int tensionArterielle;
    private int temperature;

    public Etat(int bpm, int glycemie, int tensionArterielle, int temperature) {
        this.bpm = bpm;
        this.glycemie = glycemie;
        this.tensionArterielle = tensionArterielle;
        this.temperature = temperature;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public int getGlycemie() {
        return glycemie;
    }

    public void setGlycemie(int glycemie) {
        this.glycemie = glycemie;
    }

    public int getTensionArterielle() {
        return tensionArterielle;
    }

    public void setTensionArterielle(int tensionArterielle) {
        this.tensionArterielle = tensionArterielle;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
