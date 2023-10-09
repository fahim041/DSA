package datastructure;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public List<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void push(int val) {
        heap.add(val);
        int i = heap.size() - 1;

        while (i > 1 && heap.get(i) < heap.get(i / 2)) {
            int tmp = heap.get(i);
            heap.set(i, heap.get(i / 2));
            heap.set(i / 2, tmp);
            i = i / 2;
        }
    }

    public int pop(int val) {
        if (heap.size() == 1) {
            return -1;
        }

        if (heap.size() == 2) {
            return heap.remove(heap.size() - 1);
        }

        int res = heap.get(1);
        heap.set(1, heap.remove(heap.size() - 1));
        int i = 1;

        while (i * 2 < heap.size()) {
            if (2 * i + 1 < heap.size()
                    && heap.get(2 * i + 1) < heap.get(2 * i)
                    && heap.get(i) > heap.get(2 * i + 1)) {
                int tmp = heap.get(i);
                heap.set(i, heap.get(2 * i + 1));
                heap.set(2 * i + 1, tmp);
                i = 2 * i + 1;
            } else if (heap.get(i) > heap.get(2 * i)) {
                int tmp = heap.get(i);
                heap.set(i, heap.get(2 * i));
                heap.set(2 * i, tmp);
                i = 2 * i;
            } else {
                break;
            }
        }

        return res;
    }

    public void heapify(ArrayList<Integer> arr) {
        // add the first in the last index
        arr.add(arr.get(0));

        // assign the arr to heap
        heap = new ArrayList<>(arr);

        // get the index of the value which has child
        int curr = (heap.size() - 1) / 2;

        while (curr > 0) {
            int i = curr;
            while (2 * i < heap.size()) {
                if (2 * i + 1 < heap.size() &&
                        heap.get(2 * i + 1) < heap.get(2 * i) &&
                        heap.get(i) > heap.get(2 * i + 1)) {
                    int tmp = heap.get(i);
                    heap.set(i, heap.get(2 * i + 1));
                    heap.set(2 * i + 1, tmp);
                    i = 2 * i + 1;
                } else if (heap.get(i) > heap.get(2 * i)) {
                    int tmp = heap.get(i);
                    heap.set(i, heap.get(2 * i));
                    heap.set(2 * i, tmp);
                    i = 2 * i;
                } else {
                    break;
                }
            }
            curr--;
        }

    }
}
