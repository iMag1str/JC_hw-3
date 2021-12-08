/**
 * Java Core. HomeWork 3
 *
 * @author Mark
 * @version 08.12.2021
 */
import java.util.ArrayList;

public class Box <F extends Fruit, S> {

    ArrayList<F> box;
    S name;

    public Box(S name) {
        box = new ArrayList<>();
        this.name = name;
    }
    
    public S getName(){
        return name;
    }
    
    public void addFruitToBox(F f) {
        box.add(f);
    }
    
    public void shiftSingleItem(Box<F, S> box1) throws BoxFruitException {
        if (isFruitsCompare(box1)) {
            throw new BoxFruitException("Different fruits!");
        }
            for (int i = box.size() - 2; i >= 0; i--) {
                box1.getBox().add(box.get(i));
                box.remove(i);
        }
    }
    
    public boolean compare(Box<?, ?> otherBox) {
        if (this.getWeightOfBox() == otherBox.getWeightOfBox()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public ArrayList<F> getBox() {
        return box;
    }
    
    public double getWeightOfBox() {
        return box.get(0).getWeight() * box.size();
    }
    
    public boolean isFruitsCompare(Box otherBox) {
        return (box.get(0).getClass() != otherBox.getBox().get(0).getClass());
    }
}