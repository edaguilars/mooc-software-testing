package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {4, 3, 2, 1});

        // Corner cases, for testing purposes:
        //nf.find(new int[] {});  // Passing a null
        //nf.find(new int[] {5, 5, 5, 5, 5, 5});  // Passing equal values


        System.out.println("Largest: " + nf.getLargest());
        System.out.println("Smallest: " + nf.getSmallest());
    }
}
