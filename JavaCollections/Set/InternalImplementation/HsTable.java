package JavaCollections.Set.InternalImplementation;

import java.util.Arrays;
import java.util.LinkedList;

public class HsTable<V> {
    private LinkedList<V>[] arr;
    private int initialCapacity = 16;
    private double loadFactor = 0.75;
    private int linkedListCnt;
    private int size;

    public HsTable() {
        arr = new LinkedList[initialCapacity];
    }

    public HsTable(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        arr = new LinkedList[this.initialCapacity];
    }

    public HsTable(int initialCapacity, double loadFactor) {
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        arr = new LinkedList[initialCapacity];
    }

    public int hashFunction(V val) {
        return val.hashCode() % initialCapacity;
    }

    public String toString() {
        return Arrays.toString(arr);
    }

    public void add(V val) {
        if (linkedListCnt < (loadFactor * initialCapacity)) {
            int index = hashFunction(val);

            if (arr[index] == null) {
                arr[index] = new LinkedList<>();
                linkedListCnt++;
                size++;
                arr[index].add(val);
            } else {
                if (!arr[index].contains(val)) {
                    arr[index].add(val);
                    size++;
                }
            }
        } else {
            initialCapacity *= 2;
            LinkedList<V>[] temp = new LinkedList[initialCapacity];
            int lsCnt = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    for (int j = 0; j < arr[i].size(); j++) {
                        int index = hashFunction(arr[i].get(j));

                        if (temp[index] == null) {
                            temp[index] = new LinkedList<>();
                            lsCnt++;
                            temp[index].add(arr[i].get(j));
                        } else {
                            if (!temp[index].contains(arr[i].get(j))) {
                                temp[index].add(arr[i].get(j));
                            }
                        }
                    }
                }
            }

            arr = temp;
            linkedListCnt = lsCnt;
            add(val);
        }
    }
}
