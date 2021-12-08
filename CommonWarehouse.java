/**
 * Java Core. HomeWork 3
 *
 * @author Mark
 * @version 08.12.2021
 */
public class CommonWarehouse {
    public static void main(String[] args) {
        System.out.println("JC_Home work #3");
        System.out.println();
        
        Box<Apple, String> box = new Box("1: apples");
        Box<Apple, String> box1 = new Box("2: apples");
        Box<Orange, String> box2 = new Box("1: oranges");
        
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        
        box.addFruitToBox(apple1);
        box.addFruitToBox(apple2);
        box.addFruitToBox(apple3);
        
        box1.addFruitToBox(apple4);
        box1.addFruitToBox(apple5);
        
        box2.addFruitToBox(orange1);
        box2.addFruitToBox(orange2);
        box2.addFruitToBox(orange3);
        box2.addFruitToBox(orange4);
        box2.addFruitToBox(orange5);
        
        System.out.print("Box" + box.getName() + " weighs - ");
        System.out.println(box.getWeightOfBox() + " kg");
        System.out.print("Box" + box1.getName() + " weighs - ");
        System.out.println(box1.getWeightOfBox() + " kg");
        System.out.print("Box" + box2.getName() + " weighs - ");
        System.out.println(box2.getWeightOfBox() + " kg");
        
        System.out.println();
        System.out.println("The weight of boxes" + box.getName() + " and " + box1.getName() + " is the " + (box.compare(box1)? "same" : "different"));
        System.out.println("The weight of boxes" + box.getName() + " and " + box2.getName() + " is the " + (box.compare(box2)? "same" : "different"));
        System.out.println();
        try {
            System.out.println("Place all but one fruit from box" + box.getName() + " into the box" + box1.getName());
            box.shiftSingleItem(box1);
        }
        catch (BoxFruitException e) {
            e.printStackTrace();
        }
 
        System.out.print("Box" + box.getName() + " weighs - ");
        System.out.println(box.getWeightOfBox() + " kg");
        System.out.print("Box" + box1.getName() + " weighs - ");
        System.out.println(box1.getWeightOfBox() + " kg");
        System.out.print("Box" + box2.getName() + " weighs - ");
        System.out.println(box2.getWeightOfBox() + " kg");
    }
}
