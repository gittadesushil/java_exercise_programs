package CollectionExercise;

import java.util.ArrayList;
import java.util.HashMap;

public class FunCollection {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList();
        x.add("alpha");
        x.add("beta");
        x.add("gama");

        ArrayList<String> alpha = new ArrayList<>();
        alpha.add("a");
        alpha.add("A");
        alpha.add("AA");
        alpha.add("aa");

        ArrayList<String> beta = new ArrayList<>();
        beta.add("b");
        beta.add("B");

        ArrayList<String> gama = new ArrayList<>();
        gama.add("g");
        gama.add("G");

        ArrayList<ArrayList<String>> superArrayLIst = new ArrayList<>();
        superArrayLIst.add(alpha);
        superArrayLIst.add(beta);
        superArrayLIst.add(gama);

        HashMap<String,ArrayList<String>> xx= new HashMap<>();
        xx.put("alpha",alpha);

        ArrayList<ArrayList<ArrayList<String>>> zz = new ArrayList<>();

    }
}
