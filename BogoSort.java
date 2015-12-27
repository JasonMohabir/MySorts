/*======================================
  class BogoSort -- implements BogoSort algorithm
  ======================================*/

import java.util.ArrayList;

public class BogoSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of BogoSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bogoSortV( ArrayList<Comparable> data ) {
	if (isSorted(data)){return;}
	else {shuffle(data);}
    
    }//end bogoSort -- worst case O(unbounded) and best case O(1)

    // ArrayList-returning BogoSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> BogoSort( ArrayList<Comparable> input ) {
	//declare and initialize empty ArrayList for copying
	ArrayList<Comparable> data = new ArrayList<Comparable>();

	//copy input ArrayList into working ArrayList
	for( Comparable o : input )
	    data.add( o );

	//sort working ArrayList
	bogoSortV( data );

	return data;
    }//end bogoSort -- O(unbounded)


    // Check if Array is sorted in ascnding order
    public static boolean isSorted( ArrayList<Comparable> input){
	boolean sorted = true;        
	for (int i = 1; i < input.size(); i++) {
	    if (input.get(i-1).compareTo(input.get(i)) > 0) sorted = false;
	}
	return sorted;
    }

    public static void main( String [] args ) {

	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bogoSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	/*===============for VOID methods=============
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/

	/*==========for AL-returning methods==========
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = bogoSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	      + glenSorted );
	      System.out.println( "ArrayList glen after sorting:\n" + glen );

	      ArrayList coco = populate( 10, 1, 1000 );
	      System.out.println( "ArrayList coco before sorting:\n" + coco );
	      ArrayList cocoSorted = bogoSort( coco );
	      System.out.println( "sorted version of ArrayList coco:\n" 
	          + cocoSorted );
		  System.out.println( "ArrayList coco after sorting:\n" + coco );
		  System.out.println( coco );
		  ============================================*/

    }//end main

}//end class BogoSort