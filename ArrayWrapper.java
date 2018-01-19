public class ArrayWrapper {

    private int[] array;

    public ArrayWrapper(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    // Returns the number at 'index'.
    public int access(int index) {
        for(int i = 0; i < array.length; i++) {
            if(i == index) {
                return array[i];
            }
        }
        return 0;

        // or return array[index];
    }

    // Returns the index of 'number' if it's in the array, otherwise -1;
    public int search(int number) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }

    // Inserts 'number' at 'index' into the array shifting elements if necessary.
    //
    // e.g. the result of inserting 42 at index 3 into [0, 1, 2, 3, 4] is [0, 1, 2, 42, 3, 4]
    public void insert(int index, int number) {
        int[] tempArray = new int[array.length + 1];
        int tempVar = 0;
        for (int i = 0; i < array.length; i++){
            if (i == index){
                tempArray[i] = number;
                tempVar++; // or tempVar = 1;
            }
            tempArray[tempVar + i] = array[i];
        }
        array = tempArray;
    }

    // Deletes the element at 'index' from the array.
    //
    //  e.g. the result of deleting index 2 from [0, 1, 2, 3, 4] is [0, 1, 3, 4]
    public void delete(int index) {
        int[] tempArray = new int[array.length - 1];
        int tempVar = 0;
        for (int i = 0; i < array.length; i++){
            if (i != index){
                tempArray[i - tempVar] = array[i];
            } else {
                tempVar++; // or tempVar = 1;
            }
        }
        array = tempArray;
    }
}
