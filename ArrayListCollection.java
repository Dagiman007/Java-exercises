import java.util.ArrayList;

public class ArrayListCollection{
    public static void main(String[] args) {
        // Create a new ArrayList of Strings with an initial capacity of 10
        ArrayList< String > items = new ArrayList< String >();

        items.add("Yellow");
        items.add(0, "Red");

        for(int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }
        System.out.println();

        items.remove("Yellow");
        items.remove(0);
        items.add("purple");
        items.add("indigo");

        for(String s: items){
            System.out.printf(" %s", s);
        }
        System.out.println();
        System.out.println("The list contains blue: " + items.contains("blue"));

    }

}
