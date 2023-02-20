public class StaticArrayList {
    int capacity;
    int[] list;
    int size;
    //constructors------------------------------------
    public StaticArrayList(int cap){
        this.capacity = cap;
        this.size = 0;
        this.list = new int[5];
    }
    public StaticArrayList(){
        this(5);
        this.size = 0;
    }
    //-------------------------------------------------
    public boolean isFull(){
        return size==capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void pushBack(int value){
        if(!isFull()){
            this.list[size++] = value;
        }
        else{
            System.out.println("List is full");
        }
    }
    public void popBack(){
        int aux =size;
        if(!isEmpty()){
            size--;
            System.out.println("poped value: "+aux);
        }
        else{
            System.out.println("List is empty");
        }
    }

    public void printString(){
        if(this.size<=this.capacity){
            for(int i=0;i<size;i++){
                System.out.print(this.list[i]+" ");
            }
            System.out.println();
        }
    }
}
