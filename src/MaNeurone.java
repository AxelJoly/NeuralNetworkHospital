/**
 * Created by axel on 23/10/2017.
 */
public class MaNeurone {

    private Etat[] entrées;
    private String sortie;
    private double[] wi;

    public MaNeurone(Etat[] entrées, int nbwi)
    {
        this.entrées = entrées;
        this.sortie = "";

        generateWi(nbwi);
    }

    private void generateWi(int nbWi)
    {

        this.wi = new double[nbWi];
        for (int i=0; i<nbWi; i++)
        {
        this.wi[i] =  Math.random();
        }

    }

    private int seuilFunction(Etat etat)
    {
        int state = 0;


        return state;
    }

    public Etat[] getEntrées() {
        return entrées;
    }

    public void setEntrées(Etat[] entrées) {
        this.entrées = entrées;
    }

    public String getSortie() {
        return sortie;
    }

    public void setSortie(String sortie) {
        this.sortie = sortie;
    }

    public double[] getWi() {
        return wi;
    }

    public void setWi(double[] wi) {
        this.wi = wi;
    }
}
