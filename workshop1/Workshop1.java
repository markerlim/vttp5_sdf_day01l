package workshop1;

import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class Workshop1 {

    public static List<String> cart = new ArrayList<>();

    public static void main(String[] args) {
        Console cons = System.console();
        String choices = cons.readLine("Welcome to your shopping cart\n");
        
        while (true) {
            while (choices.toLowerCase().equals("list")) {
                listItems();
                break;
            };
            while (choices.toLowerCase().startsWith("add")) {
                addItems(choices);
                break;
            };
            while (choices.toLowerCase().startsWith("delete")) {
                deleteItems(choices);
                break;
            };
            if (!(choices.toLowerCase().equals("list")) && !(choices.toLowerCase().startsWith("add")) && !(choices.toLowerCase().startsWith("delete"))) {
                System.out.println("Function does not exist");
            };
            
            if(choices.toLowerCase().equals("quit")){
                break;
            };
            choices = cons.readLine();
        }
    }

    public static void listItems() {
        if (cart.size() == 0) {
            System.out.println("Your cart is empty");
        } else {
            for (int i = 0; i < cart.size(); i++) {
                System.out.printf("%d. %s\n", i, cart.get(i));
            }
        }
    }

    public static void addItems(String choices) {
        String[] newChoice = choices.replace("add", "").trim().split(",");
        for (int i = 0; i < newChoice.length; i++) {
            Boolean duplicates;
            duplicates = false;
            for (int k = 0; k < cart.size(); k++) {
                if (newChoice[i].trim().equals(cart.get(k))) {
                    duplicates = true;
                    break;
                }
            }
            if (duplicates) {
                System.out.println("You have " + newChoice[i].trim() + " in your cart");
                continue;
            }
            cart.add(newChoice[i].trim());
            System.out.println(newChoice[i].trim() + " added to cart");
        }
    }

    public static void deleteItems(String choices) {
        String delIndex = choices.replace("delete", "").trim();
        Integer delInt = Integer.parseInt(delIndex);
        if (delInt < cart.size()) {
            System.out.println(cart.get(delInt) + " removed from cart");
            cart.remove(cart.get(delInt));
        } else {
            System.out.println("Incorrect item index");
        }
    }
}
