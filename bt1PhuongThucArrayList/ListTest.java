package bt1PhuongThucArrayList;

public class ListTest {
    public static void main(String[] args) {
        List<String> listString = new List<String>();

        listString.add("Apple");
        listString.add("Banana");
        listString.add("Orange");
        System.out.println(listString);

        System.out.println("-------------------------");

        String chosseElement = listString.get(1);
        System.out.println(chosseElement);

        System.out.println("-------------------------");
        listString.remove("Orange");
        System.out.println("ListString after removing 'Orange': " + listString);

        System.out.println("-------------------------");
        int size = listString.size();
        System.out.println("Size of the ListString: " + size);

        System.out.println("-------------------------");
        boolean containsBanana = listString.contains("Banana");
        System.out.println("Does ListString contain 'Banana'? " + containsBanana);

        System.out.println("-------------------------");
        listString.clear();
        System.out.println("ListString after clear all elements: " + listString);
    }
}
