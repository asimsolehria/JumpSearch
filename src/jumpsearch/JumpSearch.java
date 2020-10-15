
package jumpsearch;

/**
 *
 * @author asim
 */
public class JumpSearch {

    public  int jumpSearch(int[] array, int element) {
    int blockSize = (int) Math.floor(Math.sqrt(array.length));

    int lastIndex = blockSize-1;
    

    while (lastIndex < array.length && element > array[lastIndex]) 
        lastIndex += blockSize;
    

    for (int index = lastIndex - blockSize + 1;
         index <= lastIndex && index < array.length; index++) {
        if (element == array[index]) {
            return index;
        }
    }
    return -1;
}
    
}
