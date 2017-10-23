public class Main {

    private int seuil;


    public static void main(String[] args) {
        System.out.println("Hello World!");
        Etat etat1 = new Etat(8,3,8,3);
        Etat[] tab = {etat1};
        MaNeurone neurone = new MaNeurone(tab, 4);


        for (int i=0; i<neurone.getWi().length; i++){
            System.out.println(neurone.getWi()[i]);
        }

    }


}
