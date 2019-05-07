/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList<String> usersData) {
        super(usersData);
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for (int index = 0; index < elements.size(); index++) {
     	 insert1(elements,index);
    	}
    }

 public void insert1 (ArrayList<String> list, int valueToInsertIndex) {

    String valueToInsert = list.remove(valueToInsertIndex);

    int insertAtIndex = valueToInsertIndex;

    for (int indexToCompare = valueToInsertIndex - 1; indexToCompare > -1; indexToCompare--) {

      if (valueToInsert.compareTo(list.get(indexToCompare)) < 0)
      insertAtIndex--;

      else
      break;
    }

    list.add(insertAtIndex,valueToInsert);
  }
}
