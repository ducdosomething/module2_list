package th1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();

        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);
        listInterger.add(6);
        int chooseElement = listInterger.get(3);

        System.out.println(listInterger);
        System.out.println(chooseElement);

    }
}
