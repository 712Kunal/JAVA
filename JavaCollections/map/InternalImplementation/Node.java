package JavaCollections.map.InternalImplementation;

import java.security.Key;

public class Node<K, V> {
    K key;
    V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return key + "=" + value;
    }

    public boolean equals(Object o) {
        return this.key.equals(((Node) o).key);
    }
}
