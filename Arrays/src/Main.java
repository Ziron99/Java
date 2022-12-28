import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        System.out.println();
        food.set(0, "sushi");
        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        System.out.println();
        food.remove(2);
        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}