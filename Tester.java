public class Tester {
  public static void main (String[] args) {

    Range range = new Range(1,10);
    while(range.hasNext()) {
      System.out.print(range.next() + ",");
    }
    System.out.println("");


    int[] nums = new int[]{1,3,5,0,-1,3,9};

    ArraySequence as = new ArraySequence(nums);

    System.out.print("ArraySequence(array): ");
    System.out.print("length: " + as.length());
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println("");

    IntegerSequence r = new Range(10,20);
    IntegerSequence as2 = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as2.hasNext()){
        System.out.print(as2.next()+", ");
    }
      System.out.println();
    }
}
