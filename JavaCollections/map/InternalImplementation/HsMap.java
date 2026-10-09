package JavaCollections.map.InternalImplementation;

import java.util.LinkedList;

public class HsMap<K, V> {
    private LinkedList<Node<K, V>>[] arr;
    private int size;
    public int listArrayCap;
    public int initialCapacity = 16;
    private double loadFactor = 0.75;

    public HsMap() {
        arr = new LinkedList[initialCapacity];
    }

    public HsMap(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        arr = new LinkedList[this.initialCapacity];
    }

    public HsMap(int initialCapacity, double loadFactor) {
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        arr = new LinkedList[this.initialCapacity];
    }

    private int hashFunction(K key) {
        return key.hashCode() % initialCapacity;
    }

    private int indexOf(LinkedList<Node<K, V>> index, Node<K, V> ref) {
        for (int i = 0; i < index.size(); i++) {
            if (index.get(i) != null && index.get(i).equals(ref)) {
                return i;
            }
        }

        return -1;
    }

    public void put(K key, V value) {
        if (listArrayCap < (loadFactor * initialCapacity)) {
            int index = hashFunction(key);
            int listIndex = -1;
            if (arr[index] != null) {
                listIndex = indexOf(arr[index], new Node<K, V>(key, value));
            }

            if (listIndex >= 0) {
                arr[index].set(listIndex, new Node<K, V>(key, value));
            } else {
                if (arr[index] == null) {
                    arr[index] = new LinkedList<>();
                    listArrayCap++;
                }
                arr[index].add(new Node<K, V>(key, value));
                size++;
            }
        } else {
            initialCapacity *= 2;
            LinkedList<Node<K, V>>[] temp = new LinkedList[initialCapacity];
            int lsCap = 0;
            int lsSize = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    for (int j = 0; j < arr[i].size(); j++) {
                        Node<K, V> currNode = arr[i].get(j);

                        int index = hashFunction(currNode.key);

                        int listIndex = -1;
                        if (temp[index] != null) {
                            listIndex = indexOf(temp[index], currNode);
                        }

                        if (listIndex >= 0) {
                            temp[index].set(listIndex, currNode);
                        } else {
                            if (temp[index] == null) {
                                temp[index] = new LinkedList<>();
                                lsCap++;
                            }
                            temp[index].add(currNode);
                            lsSize++;
                        }
                    }
                }
            }

            arr = temp;
            listArrayCap = lsCap;
            size = lsSize;

            put(key, value);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        int check = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                for (int j = 0; j < arr[i].size(); j++) {
                    if (check < size - 1) {
                        sb.append(arr[i].get(j) + ", ");
                        check++;
                    } else {
                        sb.append(arr[i].get(j));
                    }
                }
            }
        }

        sb.append("}");

        return sb.toString();
    }
}
