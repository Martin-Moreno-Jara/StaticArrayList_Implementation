public class Main {
    public static void main(String[] args) {
        StaticArrayList myArray = new StaticArrayList();
        myArray.pushBack(1);
        myArray.printString();
        myArray.pushBack(2);
        myArray.printString();
        myArray.pushBack(3);
        myArray.printString();
        myArray.pushBack(4);
        myArray.printString();
        myArray.pushBack(17);
        myArray.printString();
        myArray.popBack();
        myArray.printString();
        myArray.pushFront(12);
        myArray.printString();
        myArray.popFront();
        myArray.printString();
    }
}