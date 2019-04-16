package implementation.dynamicarray;

import java.util.Arrays;

public class DynamicArray<T> {
    Object[] data;
    int size;

    public DynamicArray(){
        size = 0;
        data = new Object[1];
    }

    public int getSizse(){
        return data.length;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void put(Object element){
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    public void ensureCapacity(int minCapacity){
        int oldCapacity = getSizse();
        if(minCapacity > oldCapacity){
            int newCapicity = oldCapacity*2;

            // When the elements are deleted
            if(newCapicity<minCapacity){
                newCapicity = minCapacity;
            }
            data = Arrays.copyOf(data,newCapicity);
        }

    }
}
