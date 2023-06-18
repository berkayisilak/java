package Generic;

public class MyList <T> {
    private int capacity;
    private T[] list;
    private T[] listTemp;
    private int size;

    public MyList() {
        this.capacity = 10;
        this.size = 0;
        this.list = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.size = 1;
        this.list = (T[]) new Object[this.capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity() {
        this.capacity = this.capacity * 2;
    }

    public int getSize() {
        int count = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                count++;
            }
        }
        this.size = count;
        return this.size;
    }

    public void setSize() {
        this.size++;
    }

    public void setList() {
        this.list = (T[]) new Object[this.capacity];
    }

    public void setListByNewCapacity() {
        this.listTemp = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.list.length; i++) {
            this.listTemp[i] = this.list[i];
        }
        this.list = this.listTemp;
    }

    public T getValueByIndex(int index) {

        return this.list[index];
    }

    public void setValueByIndex(T value,int index) {
        this.list[index] = value;
    }

    public void removeValueByIndex(int index) {
        this.size--;
        this.listTemp = this.list;
        for (int i = 0; i < this.listTemp.length; i++) {
            if (index == 0) {
                this.list[i] = this.listTemp[i + 1];
            } else if (index != 0 && i < index) {
                this.list[i] = this.listTemp[i];
            } else if (index != 0 && i > index){
                this.list[i] = this.listTemp[i + 1];
            }
        }
    }

    public void add(T data) {
        if (this.size < this.capacity) {
            this.list[size] = data;
            setSize();
        } else {
            setCapacity();
            setListByNewCapacity();
            this.add(data);
        }
    }

    public String getList() {
        System.out.print("[");
        for (T i : this.list) {
            if (i != null) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("]");
        return "";
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int lastIndex = -1;
        for (int i = 0; i < this.list.length; i++){
            if (this.list[i] == data) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray(){
        Object[] tempObject = new Object[this.list.length];
        for (int i = 0; i < this.list.length; i++) {
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }

    public void clear() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> sub = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sub.add((T)this.list[i]);
        }
        return sub;
    }

    public boolean isContain(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == data) {
                return true;
            }
        }
        return false;
    }
}
