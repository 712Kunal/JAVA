package JavaCollections.list.InternalImplementation;

import java.util.Objects;

public class ResizableArray {
    private Object[] arr;
    private int INITIAL_CAPACITY = 10;
    private int size;

    public ResizableArray() {
        arr = new Object[INITIAL_CAPACITY];
    }

    public ResizableArray(int capacity) {
        arr = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public Object get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negetive index passed");
        } else {
            return arr[index];
        }
    }

    public void grow() {
        Object[] temp = new Object[(int) (size * 1.5)];
        for (int i = 0; i < size; i++) {
            temp[i] = get(i);
        }

        arr = temp;
    }

    public boolean add(Object ob) {
        if (size == arr.length) {
            grow();
        }

        arr[size] = ob;
        size++;
        return true;
    }

    public int indexOf(Object ob) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(ob)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contains(Object ob) {
        return indexOf(ob) >= 0;
    }

    public boolean addAll(ResizableArray ra) {
        for (int i = 0; i < ra.size; i++) {
            add(ra.get(i));
        }

        return true;
    }

    public Object[] toArray() {
        Object[] ans = new Object[size];

        for (int i = 0; i < size; i++) {
            ans[i] = get(i);
        }

        return ans;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        arr = new Object[size];
        size = 0;
    }

    public Object remove(int index) {
        Object removed = get(index);

        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[size - 1] = null;
            size--;
            return removed;
        }

        throw new IndexOutOfBoundsException("Index not in range");
    }

    public boolean remove(Object ob) {
        int index = indexOf(ob);

        if (index >= 0) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[size - 1] = null;
            size--;
            return true;
        }

        return false;
    }

    public void add(int index, Object ob) {
        if (getSize() == arr.length) {
            Object[] temp = new Object[(int) (getSize() * 1.5)];

            for (int i = 0; i < size + 1; i++) {
                if (i < index) {
                    temp[i] = arr[i];
                } else if (i == index) {
                    temp[i] = ob;
                } else {
                    temp[i] = arr[i - 1];
                }
            }

            arr = temp;
            size++;
        } else if (index >= 0 && index <= getSize()) {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = ob;
            size++;
        } else {
            throw new IndexOutOfBoundsException("Index not in range");
        }
    }

    public void addFirst(Object ob) {
        add(0, ob);
    }

    public void addLast(Object ob) {
        add(getSize(), ob);
    }

    public Object getFirst() {
        return get(0);
    }

    public Object getLast() {
        return get(getSize() - 1);
    }

    public void addAll(int index, ResizableArray ra) {
        int j = index;
        for (int i = 0; i < ra.getSize(); i++) {
            add(j, ra.get(i));
            j++;
        }
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(getSize() - 1);
    }

    public boolean removeAll(ResizableArray ra) {
        boolean flag = false;

        for (int i = 0; i < ra.getSize(); i++) {
            if (remove(ra.get(i))) {
                flag = true;
            }
        }

        return flag;
    }

    public boolean retainAll(ResizableArray ra) {
        boolean flag = false;

        for (int i = 0; i < getSize(); ) {
            if (!ra.contains(get(i))) {
                remove(i);
                flag = true;
            } else {
                i++;
            }
        }

        return flag;
    }

    public Object set(int index, Object ob) {
        if (index >= 0 && index < getSize()) {
            Object oldVal = get(index);

            arr[index] = ob;

            return oldVal;
        }

        throw new IndexOutOfBoundsException("Index not in range");
    }

    public ResizableArray sublist(int start, int end) {
        if (start >= 0 && end < getSize() && start < end) {
            ResizableArray ans = new ResizableArray();
            for (int i = start; i <= end; i++) {
                ans.add(get(i));
            }

            return ans;
        }

        throw new IndexOutOfBoundsException("Index not in range");
    }

    public void reversed() {
        int i = 0;
        int j = getSize() - 1;

        while (i < j) {
            Object temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public boolean equals(Object ob) {
        if (ob != null && ob instanceof ResizableArray) {
            ResizableArray temp = (ResizableArray) ob;

            if (getSize() == temp.getSize()) {
                for (int i = 0; i < getSize(); i++) {
                    if (!get(i).equals(temp.get(i))) {
                        return false;
                    }
                }

                return true;
            }
        }

        return false;
    }

    public int hashCode() {
        return Objects.hash(arr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                sb.append(get(i) + ", ");
            } else {
                sb.append(get(i));
            }
        }

        sb.append("]");

        return new String(sb);
    }

}
