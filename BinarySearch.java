package other_programs;

import java.util.ArrayList;
/**
 *    Performs a binary search on an array of Integers
 *
 *    @author Mr DeRuiter
 *    @author Mr Greenstein
 *    @version November 13, 2016
 */
public class BinarySearch
{
    public final int NOT_FOUND = -1;
    private int numOfSearches = 0;
    
    /**
     * Performs the standard binary search using one comparison per level.
     * Precondition: Array a must be sorted in ascending order.
     * @param a        the array of Integers to search
     * @param x        the Integer to find
     * @return        index in a where item is found, or NOT_FOUND.
     */
    public int binarySearch( ArrayList<ElementEntry> elements, String userSymbol)
    {
        numOfSearches=0;
        int low = 0;
        int high = elements.size()-1;
        int mid;
        while( low <= high )
        {
            numOfSearches++;
            mid = ( low + high ) / 2;
            int result;
            result = elements.get(mid).compareToSymbol(userSymbol.toLowerCase());
            System.out.println(low+"/"+mid+"/"+high);
            if( result < 0 ){
                low = mid + 1;
            }else if( result > 0 ){
                high = mid - 1;
            }else{
            	System.out.println(mid);
                return mid;
            }
              
        }
        return NOT_FOUND;     // NOT_FOUND = -1
    }
    /*
     * public int binarySearch( Integer [ ] a, Integer x )
    {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while( low <= high )
        {
            mid = ( low + high ) / 2;
            
            int result = a[ mid ].compareTo( x );

            if( result < 0 )
                low = mid + 1;
            else if( result > 0 )
                high = mid - 1;
            else
                return mid;
        }

        return NOT_FOUND;     // NOT_FOUND = -1
    }

     * */
    public int getNumOfSearches(){
        return numOfSearches;
    }
    /**
    public static void main( String [ ] args )
    {
        BinarySearch bs = new BinarySearch();
        int SIZE = 20;
        Integer [ ] a = new Integer [ SIZE ];
        for( int i = 0; i < SIZE; i++ )
            a[ i ] = new Integer( i * 2 );
        for( int i = 0; i < SIZE * 2; i++ )
            System.out.println( "Found " + i + " at " +
                                 bs.binarySearch( a, new Integer( i ) ) );
    }*/
}  