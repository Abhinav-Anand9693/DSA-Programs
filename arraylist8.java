import java.util.ArrayList;

public class arraylist8 {
    public static void main(String[] args) {
        // Creating outer ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Inner Lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Adding data
        for (int i = 1; i <= 3; i++) {
            list1.add(i);           // 1 2 3
            list2.add(i * 2);       // 2 4 6
            list3.add(i * 3);       // 3 6 9
        }

        // Adding inner lists to outer list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Printing 2D ArrayList
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            System.out.println("Row " + (i + 1) + ": " + currList);
        }
    }
}

    
