package jumpsearch;

/**
 *
 * @author asim
 */
public class main {
    
    public static void main(String[] args) 
    {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        JumpSearch search=new JumpSearch();
        
        System.out.println(search.jumpSearch(array, 8));
    }
}
