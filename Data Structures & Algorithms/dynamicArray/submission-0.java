class DynamicArray {
    int[] ar;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.ar = new int[capacity];
    }

    public int get(int i) {
        return this.ar[i];
    }

    public void set(int i, int n) {
        this.ar[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            this.resize();
        }
        ar[size++] = n;
        
    }

    public int popback() {
        int temp = ar[--size];
        
       return temp;
    }

    private void resize() {
        capacity *=2;
        int[] temp = new int[capacity];
        for(int i = 0; i < size;i++){
            temp[i]=ar[i];
        }
        this.ar = temp;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
