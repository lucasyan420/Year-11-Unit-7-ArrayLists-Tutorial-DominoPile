import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class DominoPile {
    ArrayList<Domino> pile;

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public DominoPile(){
        pile = new ArrayList<Domino>();
    }

    public void newStack6(){
        for(int i = 0; i < 7; i++){
            for(int j = i; j < 7; j++){
                pile.add(new Domino(i,j));
            }
        }
    }

    public void shuffle(){
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            Collections.swap(pile, random.nextInt(pile.size()), random.nextInt(pile.size()));
        }
    }

}
