import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;
  private int[] dataseq;

  public ArraySequence(int [] other){
    int[] data = other;
  }
  public ArraySequence(IntegerSequence otherseq){
    int[] dataseq = otherseq;
    reset();
  }
}
