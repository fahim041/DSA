package datastructure;

public class DynamicArrays {
    private int capacity;
    private int length;
    private int[] arr;

    public DynamicArrays(){
        capacity = 2;
        length = 0;
        arr = new int[2];
    }

    public void push(int n){
        if(length == capacity){
            resize();
        }

        arr[length] = n;
        length++;
    }

    private void resize(){
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    public void print(){
        for(int i = 0; i < length; i++){
            System.out.println(arr[i]);
        }
    }

    public void pop(){
        if(length > 0){
            length--;
        }
    }

    public int get(int i){
        if(i < length){
            return arr[i];
        }
        return -1;
    }

    public void insert(int i, int n){
        if(i < length){
            arr[i] = n;
            return;
        };

        throw new ArrayIndexOutOfBoundsException("Out of index");
    }
}
