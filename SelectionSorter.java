/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter (ArrayList<String> usersData) {
        super(usersData);
    }

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for (int i = 0; i < elements.size(); i++) {
          int lowestIndex = i;
          String lowest = elements.get(i);

          for (int n = i; n < elements.size(); n++) {
            if (elements.get(n).compareTo(lowest) < 0) {
              lowestIndex = n;
              lowest = elements.get(n);
            }
          }

          String hold = elements.get(i);
          elements.set(i,lowest);
          elements.set(lowestIndex,hold);
          System.out.println(elements);
        }
    }
}
